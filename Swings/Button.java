package Swings;
import javax.swing.*;  

public class Button {
    Button(){
    JFrame frame = new JFrame("Button Example");
        

    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    JButton button = new JButton("Click Me");
    JButton button2=new JButton("Push Me");
    button.setBounds(100, 100, 15, 30);
    
    
    
    frame.add(button);
    frame.add(button2);
   //frame.setLayout(gr);
    

    frame.setVisible(true);
    }
    
}
