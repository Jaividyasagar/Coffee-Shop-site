import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Photo //Photo Class
{

  int photo_id;
  String photographer_name;
  String type;
  int amountPaid;

public String toString() //toString method to display
{
  return String.format(photo_id+"-"+photographer_name+"-"+type+"-"+amountPaid+"\n");
}


Photo()
{
photo_id=0;
photographer_name=" ";
amountPaid=0;
}

}
class PhotoGrapher extends JFrame implements ActionListener //Inheriting JFrame and ActionListener
{

  JFrame f;
  JLabel l1,l2,l3,l4;
  JTextField  t1,t2,t3;
  JTextArea ta;
  JButton b1,b2,b3;
  JComboBox cb;
  ArrayList<Photo> list = new ArrayList<Photo>(); //creating arraylist

PhotoGrapher()
{
  f = new JFrame("ABC News Company"); //creating a frame
  
  l1= new JLabel ("Photo ID");
  l2 = new JLabel ("Photographer Name");
  l3 = new JLabel ("Type of the Photograph");
  l4 = new JLabel("Amount Paid for the Photo");

  t1 = new JTextField(20);
  t2 = new JTextField(20);
  t3 = new JTextField(20); 

  b1 = new JButton("Add Photos"); //creating button Add Photos
  b2 = new JButton("Search Photo"); //creating button Search Photos
  b3 = new JButton("Display Photos by Type"); //creating button Display Photos by Type
  
  ta = new JTextArea(40,20); //40 rows and 20 Columns
 
  String data[] ={"Nature","Leaders","Events","Celebrities"};
  cb = new JComboBox(data); //creating combobox for type of the photograph

  f.add(l1); //adding labels,buttons,textfields and textarea in frame
  f.add(t1);
  f.add(l2);
  f.add(t2);
  f.add(l3);
  f.add(cb);
  f.add(l4);
  f.add(t3);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(ta);

  b1.addActionListener(this); //registering the button b1 with the Listener
  b2.addActionListener(this); //registering the button b2 with the Listener
  b3.addActionListener(this); //registering the button b3 with the Listener
  
  f.setSize(400,400); //400 width and 400 height
  f.setVisible(true); //making the frame visible
  f.setLayout(new FlowLayout()); //using FlowLayout manager
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}


void search()  //search method is used to search the photographer_name
{
 
  Photo p = new Photo();
  String name = t2.getText();
  Iterator<Photo> itr = list.iterator();

while(itr.hasNext())
{

  p=itr.next();
if(name.equals(p.photographer_name))
{
  ta.setText("Photo IDs of the respective Photographers:"+p.photo_id);
}
else
{
  ta.setText("No Photos were shot by the given photographer");
}
}
}

void display(String s)  //display method 
{
  Photo p = new Photo();
  Iterator<Photo>itr2 = list.iterator();

while(itr2.hasNext())
{
  p = itr2.next();
if(s.equals(p.type))
{
  ta.setText("Photo IDs:"+p.photo_id);
}
}
}

void concatenate()  //concatenate method to display the stored contents of arraylist
{
  Photo p = new Photo();
  String s1 = new String();
  Iterator<Photo>itr3 = list.iterator();
while(itr3.hasNext())
{
  s1+=itr3.next();
}
  ta.setText(s1);
}


public void actionPerformed(ActionEvent e)//when button is pressed
{
  
  Photo p = new Photo();

if(e.getSource()==b1) //if Add Photos  button is pressed
{
  p.photo_id = Integer.parseInt(t1.getText());
  
  try
  {
    if(p.photo_id == 0)
    throw new ArithmeticException("Photo ID should not be zero"); //raising exception if we enter photo_id = 0
  }
    catch(Exception e1)
  {
    System.out.println(e1);
  }
  p.photographer_name = t2.getText();
  p.amountPaid = Integer.parseInt(t3.getText());
  p.type = " "+cb.getItemAt(cb.getSelectedIndex());

  list.add(p);  //adding object of Photo Class in arraylist
  ta.setText("Details stored"); //prints the data is stored
}


if(e.getSource()==b2) //if Search Photos is pressed
{
  search();
}


if(e.getSource()==b3) //if Display Photos by type is pressed
{
  String t;
  t = " "+cb.getItemAt(cb.getSelectedIndex());
  display(t);  //calling display method
  concatenate();  //calling concatenate method
}
}

public static void main(String [] args)  //main method
{
  PhotoGrapher s1 = new PhotoGrapher();  //creating an object for Swing class
}
}



