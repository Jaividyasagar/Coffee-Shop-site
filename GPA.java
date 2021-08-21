import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GPA extends JFrame implements ActionListener
{
    String sub1,sub2,sub3,sub4,sub5;
    float total;
    JFrame f;
    JTextField t1,t2,t3,t4,t5;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JButton b1;
    JRadioButton rb1,rb2,rb3,rb4,rb5,rb6,rb7,rb8,rb9,rb10,rb11,rb12,rb13,rb14,rb15,rb16,rb17,rb18,rb19,rb20;
    //JTextArea ta;
    GPA()
    {
        f=new JFrame("GPA Calculator");
        t1=new JTextField(5);
        t2=new JTextField(5);
        t3=new JTextField(5);
        t4=new JTextField(5);
        t5=new JTextField(5);
        //ta=new JTextArea(20,50);
        l1= new JLabel("Subject 1");
        l2= new JLabel("Subject 2");
        l3= new JLabel("Subject 3");
        l4= new JLabel("Subject 4");
        l5= new JLabel("Subject 5");
        l6= new JLabel("Choose Credit");
        l7= new JLabel("Choose Credit");
        l8= new JLabel("Choose Credit");
        l9= new JLabel("Choose Credit");
        l10= new JLabel("Choose Credit");
        l11=new JLabel("------------------------------");
        l12=new JLabel("------------------------------");
        l13=new JLabel("------------------------------");
        l14=new JLabel("------------------------------");
        l15=new JLabel("------------------------------");
        rb1= new JRadioButton("4 Credit");
        rb2= new JRadioButton("3 Credit");
        rb3= new JRadioButton("2 Credit");
        rb4= new JRadioButton("1 Credit");
        rb5= new JRadioButton("4 Credit");
        rb6= new JRadioButton("3 Credit");
        rb7= new JRadioButton("2 Credit");
        rb8= new JRadioButton("1 Credit");
        rb9= new JRadioButton("4 Credit");
        rb10=new JRadioButton("3 Credit");
        rb11=new JRadioButton("2 Credit");
        rb12=new JRadioButton("1 Credit");
        rb13=new JRadioButton("4 Credit");
        rb14=new JRadioButton("3 Credit");
        rb15=new JRadioButton("2 Credit");
        rb16=new JRadioButton("1 Credit");
        rb17=new JRadioButton("4 Credit");
        rb18=new JRadioButton("3 Credit");
        rb19=new JRadioButton("2 Credit");
        rb20=new JRadioButton("1 Credit");
        ButtonGroup bg1= new ButtonGroup();
        bg1.add(rb1);
        bg1.add(rb2);
        bg1.add(rb3);
        bg1.add(rb4);
        ButtonGroup bg2= new ButtonGroup();
        bg2.add(rb5);
        bg2.add(rb6);
        bg2.add(rb7);
        bg2.add(rb8);
        ButtonGroup bg3= new ButtonGroup();
        bg3.add(rb9);
        bg3.add(rb10);
        bg3.add(rb11);
        bg3.add(rb12);
        ButtonGroup bg4= new ButtonGroup();
        bg4.add(rb13);
        bg4.add(rb14);
        bg4.add(rb15);
        bg4.add(rb16);
        ButtonGroup bg5= new ButtonGroup();
        bg5.add(rb17);
        bg5.add(rb18);
        bg5.add(rb19);
        bg5.add(rb20);
        

        b1=new JButton("Calculate GPA");

        f.add(l1);
        f.add(t1);
        f.add(l6);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);

        f.add(l11);

        
        f.add(l2);
        f.add(t2);
        f.add(l7);
        f.add(rb5);
        f.add(rb6);
        f.add(rb7);
        f.add(rb8);

        f.add(l12);

        f.add(l3);
        f.add(t3);
        f.add(l8);
        f.add(rb9);
        f.add(rb10);
        f.add(rb11);
        f.add(rb12);

        f.add(l13);

        f.add(l4);
        f.add(t4);
        f.add(l9);
        f.add(rb13);
        f.add(rb14);
        f.add(rb15);
        f.add(rb16);

        f.add(l14);

        f.add(l5);
        f.add(t5);
        f.add(l10);
        f.add(rb17);
        f.add(rb18);
        f.add(rb19);
        f.add(rb20);

        f.add(l15);

        //f.add(ta);

        f.add(b1);

        b1.addActionListener(this);
        f.setSize(150,1000);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    void calculateGpa()
    {
        float sp1=0,sp2=0,sp3=0,sp4=0,sp5=0;

        /*sub1=Float.parseFloat(t1.getText());
        sub2=Float.parseFloat(t2.getText());
        sub3=Float.parseFloat(t3.getText());
        sub4=Float.parseFloat(t4.getText());
        sub5=Float.parseFloat(t5.getText());*/

        sub1=t1.getText();
        sub2=t2.getText();
        sub3=t3.getText();
        sub4=t4.getText();
        sub5=t5.getText();

//sub1
        if(sub1.equals("S"))
        {
            sp1=10;
        }
        if(sub1.equals("A+"))
        {
            sp1=9;
        }
        if(sub1.equals("A"))
        {
            sp1=8;
        }
        if(sub1.equals("B"))
        {
            sp1=7;
        }
        if(sub1.equals("C"))
        {
            sp1=6;
        }
        if(sub1.equals("D"))
        {
            sp1=5;
        }
        if(sub1.equals("F"))
        {
            sp1=2;
        }
//sub2
        if(sub2.equals("S"))
        {
            sp2=10;
        }
        if(sub2.equals("A+"))
        {
            sp2=9;
        }
        if(sub2.equals("A"))
        {
            sp2=8;
        }
        if(sub2.equals("B"))
        {
            sp2=7;
        }
        if(sub2.equals("C"))
        {
            sp2=6;
        }
        if(sub2.equals("D"))
        {
            sp2=5;
        }
        if(sub2.equals("F"))
        {
            sp2=2;
        }
//sub3        
        if(sub3.equals("S"))
        {
            sp3=10;
        }
        if(sub3.equals("A+"))
        {
            sp3=9;
        }
        if(sub3.equals("A"))
        {
            sp3=8;
        }
        if(sub3.equals("B"))
        {
            sp3=7;
        }
        if(sub3.equals("C"))
        {
            sp3=6;
        }
        if(sub3.equals("D"))
        {
            sp3=5;
        }
        if(sub3.equals("F"))
        {
            sp3=2;
        }
//sub4        
        if(sub4.equals("S"))
        {
            sp4=10;
        }
        if(sub4.equals("A+"))
        {
            sp4=9;
        }
        if(sub4.equals("A"))
        {
            sp4=8;
        }
        if(sub4.equals("B"))
        {
            sp4=7;
        }
        if(sub4.equals("C"))
        {
            sp4=6;
        }
        if(sub4.equals("D"))
        {
            sp4=5;
        }
        if(sub4.equals("F"))
        {
            sp4=2;
        }
//sub5
        if(sub5.equals("S"))
        {
            sp5=10;
        }
        if(sub5.equals("A+"))
        {
            sp5=9;
        }
        if(sub5.equals("A"))
        {
            sp5=8;
        }
        if(sub5.equals("B"))
        {
            sp5=7;
        }
        if(sub5.equals("C"))
        {
            sp5=6;
        }
        if(sub5.equals("D"))
        {
            sp5=5;
        }
        if(sub5.equals("F"))
        {
            sp5=2;
        }

        /*if(sub1>=91)
        {
            sp1=10;
        }
        if(sub1>=86&&sub1<=90)
        {
            sp1=9;
        }
        if(sub1>=76&&sub1<=85)
        {
            sp1=8;
        }
        if(sub1>=66&&sub1<=75)
        {
            sp1=7;
        }
        if(sub1>=56&&sub1<=65)
        {
            sp1=6;
        }
        if(sub1>=50&&sub1<=55)
        {
            sp1=5;
        }
        if(sub1<50)
        {
            sp1=2;
        }
        

        if(sub2>=91)
        {
            sp2=10;
        }
        if(sub2>=86&&sub2<=90)
        {
            sp2=9;
        }
        if(sub2>=76&&sub2<=85)
        {
            sp2=8;
        }
        if(sub2>=66&&sub2<=75)
        {
            sp2=7;
        }
        if(sub2>=56&&sub2<=65)
        {
            sp2=6;
        }
        if(sub2>=50&&sub2<=55)
        {
            sp2=5;
        }
        if(sub2<50)
        {
            sp2=2;
        }
//
        if(sub3>=91)
        {
            sp3=10;
        }
        if(sub3>=86&&sub3<=90)
        {
            sp3=9;
        }
        if(sub3>=76&&sub3<=85)
        {
            sp3=8;
        }
        if(sub3>=66&&sub3<=75)
        {
            sp3=7;
        }
        if(sub3>=56&&sub3<=65)
        {
            sp3=6;
        }
        if(sub3>=50&&sub3<=55)
        {
            sp3=5;
        }
        if(sub3<50)
        {
            sp3=2;
        }

        //

        if(sub4>=91)
        {
            sp4=10;
        }
        if(sub4>=86&&sub4<=90)
        {
            sp4=9;
        }
        if(sub4>=76&&sub4<=85)
        {
            sp4=8;
        }
        if(sub4>=66&&sub4<=75)
        {
            sp4=7;
        }
        if(sub4>=56&&sub4<=65)
        {
            sp4=6;
        }
        if(sub4>=50&&sub4<=55)
        {
            sp4=5;
        }
        if(sub4<50)
        {
            sp4=2;
        }
        //
        if(sub5>=91)
        {
            sp5=10;
        }
        if(sub5>=86&&sub5<=90)
        {
            sp5=9;
        }
        if(sub5>=76&&sub5<=85)
        {
            sp5=8;
        }
        if(sub5>=66&&sub5<=75)
        {
            sp5=7;
        }
        if(sub5>=56&&sub5<=65)
        {
            sp5=6;
        }
        if(sub5>=50&&sub5<=55)
        {
            sp5=5;
        }
        if(sub5<50)
        {
            sp5=2;
        }*/


        

        int cr1=0,cr2=0,cr3=0,cr4=0,cr5=0;
//cr1
        if(rb1.isSelected())
        {
            cr1=4;
        }
        if(rb2.isSelected())
        {
            cr1=3;
        }
        if(rb3.isSelected())
        {
            cr1=2;
        }
        if(rb4.isSelected())
        {
            cr1=1;
        }
//cr2
        if(rb5.isSelected())
        {
            cr2=4;
        }
        if(rb6.isSelected())
        {
            cr2=3;
        }
        if(rb7.isSelected())
        {
            cr2=2;
        }
        if(rb8.isSelected())
        {
            cr2=1;
        }
//cr3        


        if(rb9.isSelected())
        {
            cr3=4;
        }
        if(rb10.isSelected())
        {
            cr3=3;
        }
        if(rb11.isSelected())
        {
            cr3=2;
        }
        if(rb12.isSelected())
        {
            cr3=1;
        }
//cr4
        if(rb13.isSelected())
        {
            cr4=4;
        }
        if(rb14.isSelected())
        {
            cr4=3;
        }
        if(rb15.isSelected())
        {
            cr4=2;
        }
        if(rb16.isSelected())
        {
            cr4=1;
        }

//cr5
        if(rb17.isSelected())
        {
            cr5=4;
        }
        if(rb18.isSelected())
        {
            cr5=3;
        }
        if(rb19.isSelected())
        {
            cr5=2;
        }
        if(rb20.isSelected())
        {
            cr5=1;
        }
        

        total=((cr1*sp1)+(cr2*sp2)+(cr3*sp3)+(cr4*sp4)+(cr5*sp5))/(cr1+cr2+cr3+cr4+cr5);
        
        JOptionPane.showMessageDialog(f,total +" SGPA");
    }

    public void actionPerformed(ActionEvent e)
    {
        calculateGpa();
    }

    public static void main(String args[])
    {
        GPA obj1=new GPA();
    }

}