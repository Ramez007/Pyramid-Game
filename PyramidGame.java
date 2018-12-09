/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramid;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.security.SecureRandom;
import javax.swing.*;
import javax.swing.border.LineBorder;
import sun.java2d.loops.DrawRect;

/**
 *
 * @author Ramez
 */
public class PyramidGame extends JFrame 
{
    int counter =27;
    int counter2 =0;
    Card crs [] = new Card[52];
    String Path = "E:\\Ramez 007\\Downloads\\PNG";
    JLabel XCor=new JLabel("XCor");
    JLabel YCor=new JLabel("YCor");
    JButton Dealbtn = new JButton("DEAL");
    private int ScoreVal =0;
    JLabel Scorelbl = new JLabel("Score : " + ScoreVal);
    private Random randomgenerator;
    private ArrayList<Integer> rannums = new ArrayList <Integer> ();
    
    
    public PyramidGame() 
    {
        randomgenerator = new Random();
        setTitle("Pyramid Ver 1");
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        setSize(env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
        
        Container cp = getContentPane();
        cp.setLayout(null);
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(0, 0, env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
        p.setBackground(Color.LIGHT_GRAY);
        XCor.setBounds(10,840,120,30);
        YCor.setBounds(130,840,120,30);
        Scorelbl.setBounds(150, 70, 115, 60);
        Dealbtn.setBounds(646, 557, 75, 72);
        
        
        p.add(Dealbtn);
        p.add(Scorelbl);
        p.add(XCor);
        p.add(YCor);
        cp.add(p);
        
        

        // counters to set values of cards
        int ctr1=1;
        int ctr2=1;
        int ctr3=1;
        int ctr4=1;
        
        // loop to object all cards
        for (int i =0; i <52;i++)
        {
          crs[i] = new Card();
          
        }
        
        
//=====================================================================================================        
        // 4 for loops to set the value and address of all 52 cards
        
        for (int i = 0 ; i <13; i++)
        {
           crs[i].Value = ctr1;
           ctr1++;
           crs[i].ImageName = Path+"\\"+"("+i+")"+".png";
        }
        
        for (int i = 13 ; i <26; i++)
        {
           crs[i].Value = ctr2;
           ctr2++;
           crs[i].ImageName = Path+"\\"+"("+i+")"+".png";
        }
        
        for (int i = 26 ; i <39; i++)
        {
           crs[i].Value = ctr3;
           ctr3++;
           crs[i].ImageName = Path+"\\"+"("+i+")"+".png";
        }
        
        for (int i = 39 ; i <52; i++)
        {
           crs[i].Value = ctr4;
           ctr4++;
           crs[i].ImageName = Path+"\\"+"("+i+")"+".png";
        }
        
        for (int i =0; i<52;i++)
        {
           crs[i].Holder =new JLabel();
           crs[i].Holder.setIcon(new ImageIcon(new ImageIcon(crs[i].ImageName).getImage().getScaledInstance(90, 120, Image.SCALE_DEFAULT)));
        }
//=================================================================================================================        
        

       
          //generating random numbers and putting them in an arraylist
        while (rannums.size()<52)
        {
           int random = randomgenerator.nextInt(52);
           if (!rannums.contains(random))
           {
               rannums.add(random);
           }
        }
        
//        //testing if no duplicates
//        for (int i =0; i<rannums.size();i++)
//        {
//        System.out.print(rannums.get(i) + "  ");
//        }

        // constructing the pyramid
        crs[(rannums.get(0))].Holder.setBounds(635,50, 90, 120);        
        crs[(rannums.get(1))].Holder.setBounds(565,110, 90, 120);
        crs[(rannums.get(2))].Holder.setBounds(700,110, 90, 120);
        crs[(rannums.get(3))].Holder.setBounds(507,170, 90, 120);
        crs[(rannums.get(4))].Holder.setBounds(636,170, 90, 120);
        crs[(rannums.get(5))].Holder.setBounds(766,170, 90, 120);
        crs[(rannums.get(6))].Holder.setBounds(442,220, 90, 120);
        crs[(rannums.get(7))].Holder.setBounds(577,220, 90, 120);
        crs[(rannums.get(8))].Holder.setBounds(707,220, 90, 120);
        crs[(rannums.get(9))].Holder.setBounds(834,220, 90, 120);
        crs[(rannums.get(10))].Holder.setBounds(387,270, 90, 120);
        crs[(rannums.get(11))].Holder.setBounds(512,270, 90, 120);
        crs[(rannums.get(12))].Holder.setBounds(646,270, 90, 120);
        crs[(rannums.get(13))].Holder.setBounds(774,270, 90, 120);
        crs[(rannums.get(14))].Holder.setBounds(900,270, 90, 120);
        crs[(rannums.get(15))].Holder.setBounds(321,320, 90, 120);
        crs[(rannums.get(16))].Holder.setBounds(449,320, 90, 120);
        crs[(rannums.get(17))].Holder.setBounds(593,320, 90, 120);
        crs[(rannums.get(18))].Holder.setBounds(726,320, 90, 120);
        crs[(rannums.get(19))].Holder.setBounds(846,320, 90, 120);
        crs[(rannums.get(20))].Holder.setBounds(972,320, 90, 120);
        crs[(rannums.get(21))].Holder.setBounds(265,390, 90, 120);
        crs[(rannums.get(22))].Holder.setBounds(387,390, 90, 120);
        crs[(rannums.get(23))].Holder.setBounds(522,390, 90, 120);
        crs[(rannums.get(24))].Holder.setBounds(662,390, 90, 120);
        crs[(rannums.get(25))].Holder.setBounds(801,390, 90, 120);
        crs[(rannums.get(26))].Holder.setBounds(916,390, 90, 120);
        crs[(rannums.get(27))].Holder.setBounds(1050,390, 90, 120);

         //adding to screen
        for (int u =27; u >= 0;u--)
        {
           p.add(crs [(rannums.get(u))].Holder);
        }
        
        
        for (int o = 51; o >27;o--)
        {
             crs[(rannums.get(o))].Holder.setBounds(552,553, 90, 120);
             p.add(crs [(rannums.get(o))].Holder);
        }
        
//        System.out.println(crs [(rannums.get(51))].Value);
//        System.out.println(crs [(rannums.get(28))].Value);
//        System.out.println(crs [(rannums.get(29))].Value);
//        //testing
//        System.out.println(crs[38].Value);
//        System.out.println(crs[38].ImageName);
//        System.out.println(env.getMaximumWindowBounds().width);
//        System.out.println(env.getMaximumWindowBounds().height);
            Dealbtn.addActionListener(new myhandler3());
            for (int i =21 ; i<51;i++)
            {
                crs[(rannums.get(i))].Holder.addMouseListener(new myhandler1());
            }
                       
            for (int i =21 ; i<28;i++)
            {
                crs[(rannums.get(i))].Holder.addMouseListener(new myhandler2());
            }
//           crs[(rannums.get(21))].Holder.addMouseListener(new myhandler2());
//           crs[(rannums.get(22))].Holder.addMouseListener(new myhandler2());
//           crs[(rannums.get(23))].Holder.addMouseListener(new myhandler2());
//           crs[(rannums.get(24))].Holder.addMouseListener(new myhandler2());
//           crs[(rannums.get(25))].Holder.addMouseListener(new myhandler2());
//           crs[(rannums.get(26))].Holder.addMouseListener(new myhandler2());
//           crs[(rannums.get(27))].Holder.addMouseListener(new myhandler2());

    }
    
    
    
    public void paint (Graphics g)
        {
          super.paint(g);
          g.drawRect(740, 585, 90, 120);
        }
    
    public class myhandler2 implements MouseListener
    {

        @Override
        public void mouseClicked(MouseEvent me) 
        {
            
             Object JerryClicked = me.getSource();
             
             for (int i =21 ; i<28;i++)
            {
               if (JerryClicked.equals(crs[(rannums.get(i))].Holder))
               {
                 crs[(rannums.get(i))].Holder.setBorder(BorderFactory.createLineBorder(Color.RED));
   
               }
            }
             
             for (int i =21 ; i<28;i++)
            {
               if (((LineBorder)crs[(rannums.get(i))].Holder.getBorder()).getLineColor() == Color.RED && (crs[(rannums.get(i))].Value + crs[(rannums.get(i+1))].Value == 13))
               {
                 crs[(rannums.get(i))].Holder.setVisible(false);
                 crs[(rannums.get(i+1))].Holder.setVisible(false);
                 ScoreVal = ScoreVal+5;
               }
            }
       
            
        }

        @Override
        public void mousePressed(MouseEvent me) 
        {}

        @Override
        public void mouseReleased(MouseEvent me) {}

        @Override
        public void mouseEntered(MouseEvent me) {}

        @Override
        public void mouseExited(MouseEvent me) {}

    }

    public class myhandler1 implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent me) 
        {
            
               Object ratclicked = me.getSource();
               if (ratclicked.equals(crs[(rannums.get(21))].Holder) && crs[(rannums.get(21))].Value == 13)
              {
                crs[(rannums.get(21))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               
              else if (ratclicked.equals(crs[(rannums.get(22))].Holder) &&crs[(rannums.get(22))].Value == 13)
              {
                crs[(rannums.get(22))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
              else if (ratclicked.equals(crs[(rannums.get(23))].Holder) &&crs[(rannums.get(23))].Value == 13)
              {
                crs[(rannums.get(23))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
              else if (ratclicked.equals(crs[(rannums.get(24))].Holder) &&crs[(rannums.get(24))].Value == 13)
              {
                crs[(rannums.get(24))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
              else if (ratclicked.equals(crs[(rannums.get(25))].Holder) &&crs[(rannums.get(25))].Value == 13)
              {
                crs[(rannums.get(25))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(26))].Holder) &&crs[(rannums.get(26))].Value == 13)
              {
                crs[(rannums.get(26))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
              else if (ratclicked.equals(crs[(rannums.get(27))].Holder) &&crs[(rannums.get(27))].Value == 13)
              {
                crs[(rannums.get(27))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(51))].Holder) &&crs[(rannums.get(51))].Value == 13)
              {
                crs[(rannums.get(51))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(28))].Holder) &&crs[(rannums.get(28))].Value == 13)
              {
                crs[(rannums.get(28))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(29))].Holder) &&crs[(rannums.get(29))].Value == 13)
              {
                crs[(rannums.get(29))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(30))].Holder) &&crs[(rannums.get(30))].Value == 13)
              {
                crs[(rannums.get(30))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(31))].Holder) &&crs[(rannums.get(31))].Value == 13)
              {
                crs[(rannums.get(31))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(32))].Holder) &&crs[(rannums.get(32))].Value == 13)
              {
                crs[(rannums.get(32))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(33))].Holder) &&crs[(rannums.get(33))].Value == 13)
              {
                crs[(rannums.get(33))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(34))].Holder) &&crs[(rannums.get(34))].Value == 13)
              {
                crs[(rannums.get(34))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(35))].Holder) &&crs[(rannums.get(35))].Value == 13)
              {
                crs[(rannums.get(35))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(36))].Holder) &&crs[(rannums.get(36))].Value == 13)
              {
                crs[(rannums.get(36))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(37))].Holder) &&crs[(rannums.get(37))].Value == 13)
              {
                crs[(rannums.get(37))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(38))].Holder) &&crs[(rannums.get(38))].Value == 13)
              {
                crs[(rannums.get(38))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(39))].Holder) &&crs[(rannums.get(39))].Value == 13)
              {
                crs[(rannums.get(39))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(40))].Holder) &&crs[(rannums.get(40))].Value == 13)
              {
                crs[(rannums.get(40))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(41))].Holder) &&crs[(rannums.get(41))].Value == 13)
              {
                crs[(rannums.get(41))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(42))].Holder) &&crs[(rannums.get(42))].Value == 13)
              {
                crs[(rannums.get(42))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(43))].Holder) &&crs[(rannums.get(43))].Value == 13)
              {
                crs[(rannums.get(43))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(44))].Holder) &&crs[(rannums.get(44))].Value == 13)
              {
                crs[(rannums.get(44))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(45))].Holder) &&crs[(rannums.get(45))].Value == 13)
              {
                crs[(rannums.get(45))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(46))].Holder) &&crs[(rannums.get(46))].Value == 13)
              {
                crs[(rannums.get(46))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(47))].Holder) &&crs[(rannums.get(47))].Value == 13)
              {
                crs[(rannums.get(47))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(48))].Holder) &&crs[(rannums.get(48))].Value == 13)
              {
                crs[(rannums.get(48))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(49))].Holder) &&crs[(rannums.get(49))].Value == 13)
              {
                crs[(rannums.get(49))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
               else if (ratclicked.equals(crs[(rannums.get(50))].Holder) &&crs[(rannums.get(50))].Value == 13)
              {
                crs[(rannums.get(50))].Holder.setVisible(false);
                ScoreVal = ScoreVal+5;
                Scorelbl.setText("Score : " + ScoreVal);
              }
            
        }

        @Override
        public void mousePressed(MouseEvent me) {}

        @Override
        public void mouseReleased(MouseEvent me) {}

        @Override
        public void mouseEntered(MouseEvent me) {}

        @Override
        public void mouseExited(MouseEvent me) {}
       
    }
    
    public class myhandler3 implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) 
        {
             
                 try
                 {      
                     if (counter <52)
                     {
                        counter++;
                        crs[(rannums.get(counter))].Holder.setBounds(740, 560, 90, 120); 
                     }
                 }
                 catch (IndexOutOfBoundsException e)
                 {
                      System.out.println(e);
                 }
                   
                   
                      if (counter >= 52)
                     {
                          for (int q =28;q<52; q++)
                          {
                            crs[(rannums.get(q))].Holder.setBounds(552,553, 90, 120);
                          }
                          counter = 27;
                     }
        }
    }
}
