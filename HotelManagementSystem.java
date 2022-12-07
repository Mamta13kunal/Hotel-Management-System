
package hotel.management.sytem;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;


public class HotelManagementSystem extends JFrame implements ActionListener{
    HotelManagementSystem(){ 
    setSize(1300,565);
    setLocation(2,100);
    
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
    JLabel image =new JLabel(i1);
    image.setBounds(0,0,1300,565);
   add(image);
   
   JLabel text=new JLabel("HOTEL MANAGEMENT SYSTEM");
   text.setBounds(20,430,1000,90);
   text.setForeground(Color.WHITE);
   text.setFont(new Font("serif",Font.PLAIN,50));
    image.add(text);

    
    JButton next=new JButton("Next");
   next.setBounds(1100,450,150,50);
   next.setBackground(Color.WHITE);
      next.setForeground(Color.MAGENTA);
      next.addActionListener(this);
   next.setFont(new Font("serif",Font.PLAIN,24));
    image.add(next);
    
    
    setVisible(true);
    
    while(true){
        text.setVisible(false);
        try{
            Thread.sleep(500);
        }catch(Exception e){
        e.printStackTrace();
    }
       text.setVisible(true);
        try{
            Thread.sleep(500);
        }catch(Exception e){
        e.printStackTrace();
    }
    }
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new HotelManagementSystem();
    }
    
}
