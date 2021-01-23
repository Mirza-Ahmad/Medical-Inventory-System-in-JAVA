package medicalinventoryproject;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class NewClass2 
{
      public NewClass2()
      {
      final JFrame f=new JFrame();
      JPanel p=new JPanel();
      JLabel l=new JLabel("Enter the medicene name:");
      l.setBounds(21,40,150,20);
      JButton b;
      final JTextField t=new JTextField(30);
      t.setBounds(200,90,100,20);
      final String data[][]=
                     {
                     {"AB001","Disprin","300","2"},
                     {"AB002","Panadol","140","2"},
                     {"AB003","Nabil","220","5"},
                     {"AB004","Fabrol","309","22"},
                     {"AB005","zolofit","400","14"},
                     {"AB006","AMCLAV","400","10"},
                     {"AB007","zithromax","200","10"},
                     {"AB008","zoton","100","23"},
                     {"AB009","zoladex","120","22"},
                     {"AB0010","zocor","140","21"},
                     {"AB0011","zinacef","135","19"},
                     {"AB0012","zestril","185","12"},
                     {"AB0013","paracetamol","229","10"},
                     {"AB0014","prozac","190","22"},
                     {"AB0015","Nexavar","245","20"},
                     {"AB0016","glizabit","270","25"},
                     {"AB0017","ponstone","292","31"},
                     {"AB0018","valtec","332","27"},
                     {"AB0019","prozac","390","26"},
                     {"AB0020","requip","409","25"},
                     {"AB0021","nexavar","420","32"},
                     {"AB0022","Nims","425","10"},
                     {"AB0023","Tecfidera","456","12"},
                     {"AB0024","medria","431","11"},
                     {"AB0025","Acifile","423","18"},
                     {"AB0026","primoult","420","10"},
                     {"AB0027","Loprin","421","20"},
                     {"AB0028","Ris","430","10"},
                     {"AB0029","Ferozsons","420","21"},
                     {"AB0030","Espercil Gel","344","100"}
                     };
      final String column[]={"Prduct id", "Stock Name","Stock quantity","One Tablet price"};
      final JTable tw=new  JTable(data,column);    
      JScrollPane sc = new JScrollPane(tw);   
      b=new JButton("Check");
      b.setBounds(50,50,60,30);
      l.setForeground(Color.white);
      JMenuBar mb=new JMenuBar();
      JMenu m =new JMenu("Inventory Dashboard");
      JMenuItem f1=new JMenuItem("Sign-up");
      JMenuItem f2=new JMenuItem("Login-in");
      JMenuItem f3=new JMenuItem("Logout");
      m.add(f1);
      m.add(f2);
      m.add(f3);
      mb.add(m);
      p.add(l);
      p.add(t);
      p.add(sc);
      p.add(b);
      p.add(mb);
      p.setBackground(Color.decode("#330505"));
      tw.setBackground(Color.decode("#330505"));
      sc.setBackground(Color.decode("#330505"));
      b.setBackground(Color.decode("#871c1c"));
      b.setForeground(Color.white);
      tw.setForeground(Color.white);
      mb.setBackground(Color.decode("#871c1c"));
      m.setForeground(Color.white);
      f1.setBackground(Color.decode("#871c1c"));
      f2.setBackground(Color.decode("#871c1c"));
      f3.setBackground(Color.decode("#871c1c"));
      f1.setForeground(Color.white);
      f2.setForeground(Color.white);
      f3.setForeground(Color.white);
      f.add(p);
      tw.setEnabled(false);
      f.setSize(487,545);
      JFrame.setDefaultLookAndFeelDecorated(true);
      f.setBackground(Color.LIGHT_GRAY);
      f.setVisible(true);
      f1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
           f.dispose();
           new SignUp();  
         }
      });
      f2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
           f.dispose();
           new NewClass1();  
         }
      });
      f3.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
           f.dispose();
         }
      });
      b.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
         String s=t.getText();
         String ms;
         int po;
         int c=0;
         if(s.equals("Disprin"))
         {
           JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
           ms=JOptionPane.showInputDialog(f,"How many disprine you want to take?");
           po=Integer.parseInt(ms);
           if(po<=300)
           {
           int r=po*2;
           JOptionPane.showMessageDialog(f, "The Total amount of the medicine is = " + r );
           }
           else
           {
            JOptionPane.showMessageDialog(f, "Sorry! The stock pf this medicine is not available");
           }
         }
         else if(s.equals("Panadol"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             int dk;
             String hk;
             hk=JOptionPane.showInputDialog(f,"How many panadol you want to take?");
             dk=Integer.parseInt(hk);
             if(dk<=140)
             {
              int q=dk*2;
              JOptionPane.showMessageDialog(f, "The Total amount of the medicine is" + q);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );
             }
         }
         else if(s.equals("Nabil"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String pk;
             int yk;
             pk=JOptionPane.showInputDialog(f,"How many Nabil you want to take?");
             yk=Integer.parseInt(pk);
             if(yk<=220)
             {
               int az=yk*5;
               JOptionPane.showMessageDialog(f, "The Total amount of the medicine is " + az);  
             }
             else
             {
               JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );
             }
         }
         else if(s.equals("Fabrol"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String qk;
             int vk;
             qk=JOptionPane.showInputDialog(f,"How many Fabrol you want to take?");
             vk=Integer.parseInt(qk);
             if(vk<=309)
             {
              int qo=vk*22;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +qo);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );  
             }
         }
         else if(s.equals("zolofit"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String lk;
             int mk;
             lk=JOptionPane.showInputDialog(f,"How many zolofit you want to take?");
             mk=Integer.parseInt(lk);
             if(mk<=400)
             {
              int xc=mk*14;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +xc);   
             }
             else 
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );    
             }
         }
         else if(s.equals("AMCLAV"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String bk;
             int rtk;
             bk=JOptionPane.showInputDialog(f,"How many AMCLAV you want to take?");
             rtk=Integer.parseInt(bk);
             if(rtk<=400)
             {
              int wq=rtk*10;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +wq);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
             }
         }
         else if(s.equals("zithromax"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String pi;
             int um;
             pi=JOptionPane.showInputDialog(f,"How many zithromax you want to take?");
             um=Integer.parseInt(pi);
             if(um<=200)
             {
              int asd=um*10;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +asd);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
             }
         }
         else if(s.equals("zoton"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String gl;
             int qa;
             gl=JOptionPane.showInputDialog(f,"How many zoton you want to take?");
             qa=Integer.parseInt(gl);
             if(qa<=100)
             {
              int asf=qa*23;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +asf);  
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
             }
         }
         else if(s.equals("zoladex"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String glm;
             int qad;
             glm=JOptionPane.showInputDialog(f,"How many zoladex you want to take?");
             qad=Integer.parseInt(glm);
             if(qad<=120)
             {
              int aig=qad*22;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aig);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
             }
         }
         else if(s.equals("zocor"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String lkp;
             int yn;
             lkp=JOptionPane.showInputDialog(f,"How many zocor you want to take?");
             yn=Integer.parseInt(lkp);
             if(yn<=140)
             {
              int aigs=yn*21;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aigs);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
             }
         }
         else if(s.equals("zinacef"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String hj;
             int lc;
             hj=JOptionPane.showInputDialog(f,"How many zocor you want to take?");
             lc=Integer.parseInt(hj);
             if(lc<=135)
             {
              int aigsh=lc*19;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aigsh);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );    
             }
         }
         else if(s.equals("zestril"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String qm;
             int yv;
             qm=JOptionPane.showInputDialog(f,"How many zocor you want to take?");
             yv=Integer.parseInt(qm);
             if(yv<=185)
             {
              int aim=yv*12;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aim);
             }
             else
             {
               JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );  
             }
         }
         else if(s.equals("paracetamol"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String miu;
             int zm;
             miu=JOptionPane.showInputDialog(f,"How many paracetamol you want to take?");
             zm=Integer.parseInt(miu);
             if(zm<=229)
             {
               int aimw=zm*10;
               JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aimw);   
             }
             else
             {
               JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );  
             }
         }
         else if(s.equals("prozac"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String mnm;
             int iu;
             mnm=JOptionPane.showInputDialog(f,"How many prozac you want to take?");
             iu=Integer.parseInt(mnm);
             if(iu<=390)
             {
              int aimwq=iu*26;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is = " +aimwq);   
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );  
             }
         }
         else if(s.equals("Nexavar"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String mnmh;
             int iuy;
             mnmh=JOptionPane.showInputDialog(f,"How many Nexavar you want to take?");
             iuy=Integer.parseInt(mnmh);
             if(iuy<=245)
             {
              int aima=iuy*20;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aima);   
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );    
             }
         }
         else if(s.equals("glizabit"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String nb;
             int cm;
             nb=JOptionPane.showInputDialog(f,"How many glizabit you want to take?");
             cm=Integer.parseInt(nb);
             if(cm<=270)
             {
              int aimas=cm*25;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aimas);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" ); 
             }
         }
         else if(s.equals("ponstone"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String nbs;
             int cmn;
             nbs=JOptionPane.showInputDialog(f,"How many ponstone you want to take?");
             cmn=Integer.parseInt(nbs);
             if(cmn<=292)
             {
               int aikj=cmn*32;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aikj);  
             }
             else
             {
               JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
             }
         }
         else if(s.equals("valtec"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String hj;
             int re;
             hj=JOptionPane.showInputDialog(f,"How many ponstone you want to take?");
             re=Integer.parseInt(hj);
             if(re<=332)
             {
              int aqt=re*27;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aqt);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );  
             }
         }
         else if(s.equals("requip"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many requip you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=409)
             {
              int aqal=ls*25;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aqal);   
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );    
             }    
         }
         else if(s.equals("nexavar"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many nexavar you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=420)
             {
              int aqali=ls*32;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +aqali);
             }
             else
             {
               JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
             }
         }
         else if(s.equals("Nims"))
         {
               JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
               String yp;
               int ls;
               yp=JOptionPane.showInputDialog(f,"How many nims you want to take?");
               ls=Integer.parseInt(yp);
               if(ls<=425)
               {
                   int ahma=ls*10;
                   JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +ahma);
               }
               else
               {
                JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );    
               }
         }
         else if(s.equals("Tecfidera"))
         {
               JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
               String yp;
               int ls;
               yp=JOptionPane.showInputDialog(f,"How many tecfidera you want to take?");
               ls=Integer.parseInt(yp);
               if(ls<=456)
               {
                   int ahmaw=ls*12;
                   JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +ahmaw);
               }
               else
               {
                   JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" ); 
               }
         }
         else if(s.equals("medria"))
         {
               JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
               String yp;
               int ls;
               yp=JOptionPane.showInputDialog(f,"How many medria you want to take?");
               ls=Integer.parseInt(yp);
               if(ls<=431)
               {
              int ahmrt=ls*11;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +ahmrt);
               }
               else
               {
                JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );   
               }
         }
         else if(s.equals("Acifile"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many Acifile you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=423)
             {
              int ahmrm=ls*18;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +ahmrm);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );
             }
         }
         else if(s.equals("primoult"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many primoult you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=420)
             {
              int qwet=ls*10;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +qwet);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );
             }
         }
         else if(s.equals("Loprin"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many loprin you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=421)
             {
              int qwebv=ls*20;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +qwebv);
             }
             else
             {
               JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" ); 
             }
         }
         else if(s.equals("Ris"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many Ris you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=430)
             {
              int qwuv=ls*10;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +qwuv);
             }
             else
             {
               JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );  
             }
         }
          else if(s.equals("Ferozsons"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many ferozans gel you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=420)
             {
              int zxb=ls*21;
              JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +zxb);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );     
             }
         }
         else if(s.equals("Espercil Gel"))
         {
             JOptionPane.showMessageDialog(f,"This Medicien is available in the inventory");
             String yp;
             int ls;
             yp=JOptionPane.showInputDialog(f,"How many Espercil gel you want to take?");
             ls=Integer.parseInt(yp);
             if(ls<=344)
             {
             int zxbi=ls*10;
             JOptionPane.showMessageDialog(f, "The total amount of this medicine is " +zxbi);
             }
             else
             {
              JOptionPane.showMessageDialog(f, "Sorry! The stock of this medicine is not available" );     
             }
         }
         else if(s.isEmpty())
         {
              JOptionPane.showMessageDialog(f,"Sorry! null checking is not allowed");
         }
         else
         {
              JOptionPane.showMessageDialog(f,"Sorry! This medicene is not available in the inventory");
         }
        }
      });
}
}