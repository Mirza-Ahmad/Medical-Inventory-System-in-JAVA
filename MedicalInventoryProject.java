package medicalinventoryproject;
import java.awt.*;
import java.awt.event.*;  
import java.awt.Font;
import static java.awt.Font.BOLD;
import static java.awt.Font.ITALIC;  
import javax.swing.*;
import javax.swing.border.Border;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger; 
/*kasay Hu USMAN JANI DA phir*/
class SignUp extends Frame
{
String data="";
Label ls1,ls2,ls3,ls4;
final JTextField ts1;
final JPasswordField ts2;
JButton bs; 
public SignUp()
{   
    FileWriter fw=null;
    try
    {
       fw=new FileWriter("D:\\project.txt");
    }
    catch(IOException e)
    {
        Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE,null, e);
    }
    final PrintWriter fp=new PrintWriter(fw);
    ls3=new Label("SIGN UP PAGE OF THE MEDICAL INVENTORY");
    ls3.setFont(new Font("sans-serif",ITALIC, 18));
    ls3.setBounds(20,30,420,30);
    ls3.setForeground(Color.white);
    Border d=BorderFactory.createLineBorder(Color.cyan);
    ls1=new Label("Enter a new user Name:");  
    ls1.setBounds(20,77,135,30);
    ls1.setForeground(Color.white);
    ts1=new JTextField(13);
    ts1.setBounds(170,83,150,20);
    ts1.setBorder(d);
    ts1.setBackground(Color.decode("#2DD7A6"));
    ts1.setForeground(Color.white);
    ls2=new Label("Enter a new password:");
    ls2.setBounds(20,100,130,30);
    ls2.setForeground(Color.white);
    ts2=new JPasswordField(13);
    ts2.setBounds(170,106,150,20);
    ts2.setBorder(d);
    ts2.setBackground(Color.decode("#2DD7A6"));
    ts2.setForeground(Color.white);
    bs=new JButton("SIGN UP");
    bs.setBounds(215,160,50,20);
    Border border=BorderFactory.createLineBorder(Color.cyan);
    bs.setForeground(Color.WHITE);
    bs.setBackground(Color.decode("#2DD7A6"));
    bs.setBorder(border);
    setBackground(Color.decode("#2DD7A6"));
    ls4=new Label("ALREADY HAVE AN ACCOUNT?");
    ls4.setBounds(151,193,180,20);
    ls4.setForeground(Color.white);
    add(ls1);  
    add(ts1);
    add(ls2);
    add(ts2);
    add(bs);
    add(ls3);
    add(ls4);
    setSize(450,300);  
    setLayout(null);  
    setVisible(true); 
    bs.addActionListener(new ActionListener()
    {
public void actionPerformed(ActionEvent e)
{ 
int passwordLength=ts2.getText().length(); 
int Textlen=ts1.getText().length(); 
String Name="";
String pass="";
try
{
  Name="Username :"+ts1.getText();
  pass="password : "+ts2.getText();
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
 um.put("OptionPane.messageForeground",Color.RED);
 Toolkit.getDefaultToolkit().beep();
 JOptionPane.showMessageDialog(null,"Please enter the passoword less than 13 ","",JOptionPane.ERROR_MESSAGE);
}
else if(Textlen>13)
{
  UIManager um=new UIManager();
  um.put("OptionPane.messageForeground",Color.RED);
  Toolkit.getDefaultToolkit().beep();
  JOptionPane.showMessageDialog(null,"Please enter the character less than 13 ","",JOptionPane.ERROR_MESSAGE);
}
else if(ts1.getText().trim().isEmpty()  || ts2.getText().trim().isEmpty())
{
  UIManager um=new UIManager();
  um.put("OptionPane.messageForeground",Color.RED);
  Toolkit.getDefaultToolkit().beep();
  JOptionPane.showMessageDialog(null,"Please fill-up this form then you will can to go the inventory","",JOptionPane.ERROR_MESSAGE); 
}
else
{
 Toolkit.getDefaultToolkit().beep();
 UIManager um=new UIManager();
 um.put("OptionPane.background",Color.LIGHT_GRAY);
 um.put("Panel.background",Color.LIGHT_GRAY);
 um.put("OptionPane.messageForeground",Color.white);
 um.put("Button.background",Color.WHITE);
 JOptionPane.showMessageDialog(null,"Sign UP SUCCESSFULLY ","",
 JOptionPane.INFORMATION_MESSAGE);
 dispose();
 new NewClass1();
}
}
catch(NumberFormatException ev)
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null, "please enter valid password and username");
}
data=Name+ " "+ pass+ " ";
fp.println(data);
fp.close();
}
});
    ls4.addMouseListener(new MouseAdapter()  
    {
    public void mouseClicked(MouseEvent e)  
    {  
      dispose();
      new NewClass1();
    }  
});
  this.addMouseListener(new MouseAdapter()  
    {
    public void mouseEntered(MouseEvent e)  
    {  
      setBackground(Color.PINK);
      ls1.setBackground(Color.PINK);
      ls2.setBackground(Color.PINK);
      Border c=BorderFactory.createLineBorder(Color.white);
      ts1.setBackground(Color.WHITE);
      ts1.setBorder(c);
      ts2.setBackground(Color.white);
      ts2.setBorder(c);
      ts1.setForeground(Color.black);
      ts2.setForeground(Color.black);
      ls3.setBackground(Color.PINK);
      ls4.setBackground(Color.PINK);
      bs.setBackground(Color.PINK);
      bs.setBorder(c);
    }
    public void mouseReleased(MouseEvent e)
    {
      setBackground(Color.decode("#2DD777"));
      ls1.setBackground(Color.decode("#2DD777"));
      ls2.setBackground(Color.decode("#2DD777"));
      Border c=BorderFactory.createLineBorder(Color.WHITE);
      ts1.setBackground(Color.WHITE);
      ts1.setBorder(c);
      ts2.setBackground(Color.white);
      ts2.setBorder(c);
      ts1.setForeground(Color.black);
      ts2.setForeground(Color.black);
      ls3.setBackground(Color.decode("#2DD777"));
      ls4.setBackground(Color.decode("#2DD777"));
      bs.setBackground(Color.decode("#2DD777"));
      bs.setBorder(c);
    }
});
}
}
public class MedicalInventoryProject extends SignUp
{
    public static void main(String[] args)
    {
       MedicalInventoryProject is=new MedicalInventoryProject();
    } 
    /*kasa dia phir*/
}