package medicalinventoryproject;
import java.awt.*;  
import static java.awt.Font.ITALIC;
import java.awt.event.*;  
import javax.swing.*;
import javax.swing.border.Border;
public class NewClass1 extends Frame 
{
Label l1,l2,l3,l4;
final JTextField t1;
final JPasswordField t2;
JButton b; 
public NewClass1()
{
    l3=new Label("LOGIN PAGE OF THE MEDICAL INVENTORY");
    l3.setBounds(100,30,270,30);
    l3.setForeground(Color.white);
    l3.setFont(new Font("sans-serif",ITALIC, 18));
    l3.setBounds(20,30,420,30);
    l3.setAlignment(Label.CENTER);
    Border d=BorderFactory.createLineBorder(Color.green);
    l1=new Label("Enter Employee Name:");  
    l1.setBounds(20,77,130,30);
    l1.setForeground(Color.white);
    t1=new JTextField(13);
    t1.setBounds(170,83,150,20);
    t1.setBorder(d);
    t1.setBackground(Color.decode("#2DD777"));
    t1.setForeground(Color.white);
    l2=new Label("Enter a password:");
    l2.setBounds(20,100,130,30);
    l2.setForeground(Color.white);
    t2=new JPasswordField(13);
    t2.setBounds(170,106,150,20);
    t2.setBorder(d);
    t2.setBackground(Color.decode("#2DD777"));
    t2.setForeground(Color.white);
    b=new JButton("LOGIN");
    b.setBounds(215,160,50,20);
    Border border=BorderFactory.createLineBorder(Color.GREEN);
    b.setForeground(Color.white);
    b.setBackground(Color.decode("#2DD777"));
    b.setBorder(border);
    setBackground(Color.decode("#2DD777"));
    l4=new Label("CREATE AN ACCOUNT?");
    l4.setBounds(172,200,140,20);
    l4.setForeground(Color.white);
    add(l1);  
    add(t1);
    add(l2);
    add(t2);
    add(b);
    add(l3);
    add(l4);
    b.addActionListener(new ActionListener()
   {
public void actionPerformed(ActionEvent e)
{  
int passwordLength=t2.getText().length(); 
int Textlen=t1.getText().length(); 
String v=t1.getText();
String h=t2.getText();
if((passwordLength>13 && Textlen>13))
{
 UIManager um=new UIManager();
 um.put("OptionPane.messageForeground",Color.RED);
 Toolkit.getDefaultToolkit().beep();
 JOptionPane.showMessageDialog(null,"Please enter the input less than 13 ","",JOptionPane.ERROR_MESSAGE);
}
else if(passwordLength>13)
{
 UIManager um=new UIManager();
 Toolkit.getDefaultToolkit().beep();
 um.put("OptionPane.messageForeground",Color.RED);
 JOptionPane.showMessageDialog(null,"Please enter the passoword less than 13 ","",JOptionPane.ERROR_MESSAGE);
}
else if(Textlen>13)
{
  UIManager um=new UIManager();
  Toolkit.getDefaultToolkit().beep();
  um.put("OptionPane.messageForeground",Color.RED);
  JOptionPane.showMessageDialog(null,"Please enter the character less than 13 ","",JOptionPane.ERROR_MESSAGE);
}
else if(t1.getText().trim().isEmpty()  || t2.getText().trim().isEmpty())
{
  Toolkit.getDefaultToolkit().beep();
  UIManager um=new UIManager();
  um.put("OptionPane.messageForeground",Color.RED);
  JOptionPane.showMessageDialog(null,"Please fill-up this form then you will can to go the inventory","",JOptionPane.ERROR_MESSAGE); 
}
else
{
 if(v.equals("Ahmad") && h.equals("mirza"))
 {
 Toolkit.getDefaultToolkit().beep();
 UIManager um=new UIManager();
 um.put("OptionPane.background",Color.LIGHT_GRAY);
 um.put("Panel.background",Color.LIGHT_GRAY);
 um.put("OptionPane.messageForeground",Color.white);
 um.put("Button.background",Color.WHITE);
 JOptionPane.showMessageDialog(null,"WELCOME YOU HAVE LOGIN SUCCESSFULLY ","",
 JOptionPane.INFORMATION_MESSAGE);
 dispose();
 new NewClass2();
}
else
 {
  Toolkit.getDefaultToolkit().beep();
  JOptionPane.showMessageDialog(null,"Incorrect login or password Please valid login details","",
   JOptionPane.ERROR_MESSAGE);
 }
}
}
});
l4.addMouseListener(new MouseAdapter()  
    {
    public void mouseClicked(MouseEvent e)  
    {  
      dispose();
      new MedicalInventoryProject();
    }  
});
setSize(450,300);  
setLayout(null);  
setVisible(true); 
}
}