import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Calculator
{
      public static void main(String...args)
      {
      JFrame box=new JFrame();
      box.setTitle("CALCULATOR");

      JLabel label1=new JLabel();
      label1.setText("ENTER THE FIRST NUMBER :");
      label1.setBounds(10,10,200,50);
      label1.setVisible(true);


      JLabel label2=new JLabel();
      label2.setText("ENTER THE SECOND NUMBER :");
      label2.setBounds(10,60,230,50);
      label2.setVisible(true);


      JLabel label3=new JLabel();
      label3.setText("RESULT : ");
      label3.setBounds(10,110,200,50);
      label3.setVisible(true);

      JTextField textfield1=new JTextField();
      textfield1.setBounds(230,25,100,20);
      textfield1.setVisible(true);

      JTextField textfield2=new JTextField();
      textfield2.setBounds(230,75,100,20);
      textfield2.setVisible(true);

      JTextField textfield3=new JTextField();
      textfield3.setBounds(230,125,100,20);
      textfield3.setVisible(true);

      JButton button1=new JButton("ADD ");
      button1.setBounds(10,150,80,30);//x-axis,y-axis,width,height
      button1.setVisible(true);
      button1.setBackground(Color.BLACK);
      button1.setForeground(Color.WHITE);


      JButton button2=new JButton("SUB ");
      button2.setBounds(110,150,80,30);//x-axis,y-axis,width,height
      button2.setVisible(true);     
      button2.setBackground(Color.BLACK);
      button2.setForeground(Color.WHITE);



      JButton button3=new JButton("MULT");
      button3.setBounds(210,150,80,30);//x-axis,y-axis,width,height
      button3.setVisible(true);     
      button3.setBackground(Color.BLACK);
      button3.setForeground(Color.WHITE);



      JButton button4=new JButton("DIV");
      button4.setBounds(310,150,80,30);//x-axis,y-axis,width,height
      button4.setVisible(true);     
      button4.setBackground(Color.BLACK);
      button4.setForeground(Color.WHITE);



      
      JButton button5=new JButton("REM");
      button5.setBounds(410,150,80,30);//x-axis,y-axis,width,height
      button5.setVisible(true);     
      button5.setBackground(Color.BLACK);
      button5.setForeground(Color.WHITE);


      button1.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent obj){
                  int num1=Integer.parseInt(textfield1.getText());
                  int num2=Integer.parseInt(textfield2.getText());
                  int result=num1+num2;
                  textfield3.setText(""+(result));
            }
      });

      button2.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent obj){
                  int num1=Integer.parseInt(textfield1.getText());
                  int num2=Integer.parseInt(textfield2.getText());
                  int result=num1-num2;
                  textfield3.setText(""+(result));
            }
      });


      button3.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent obj){
                  int num1=Integer.parseInt(textfield1.getText());
                  int num2=Integer.parseInt(textfield2.getText());
                  int result=num1*num2;
                  textfield3.setText(""+(result));
            }
      });


      button4.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent obj){
                  int num1=Integer.parseInt(textfield1.getText());
                  int num2=Integer.parseInt(textfield2.getText());
                  int result=num1/num2;
                  textfield3.setText(""+(result));
            }
      });

      button5.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent obj){
                  int num1=Integer.parseInt(textfield1.getText());
                  int num2=Integer.parseInt(textfield2.getText());
                  int result=num1%num2;
                  textfield3.setText(""+(result));
            }
      });



      box.setSize(500,500);
      box.setLayout(null);
      box.add(label1);
      box.add(label2);
      box.add(label3);

      box.add(textfield1);
      box.add(textfield2);
      box.add(textfield3);

      box.add(button1);
      box.add(button2);
      box.add(button3);
      box.add(button4);
      box.add(button5);

      box.setVisible(true);
      box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
}