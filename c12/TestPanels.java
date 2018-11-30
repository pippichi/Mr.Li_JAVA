import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;

public class TestPanels extends JFrame{
  public TestPanels(){
    JPanel p1=new JPanel();
    p1.setLayout(new GridLayout(3,4,5,5));
    
    for(int i = 1;i <= 9;i++){
      p1.add(new JButton(""+i));
    }
    p1.add(new JButton(""+0));
    p1.add(new JButton("Start"));
    p1.add(new JButton("Stop"));
    
    //JTextField jfTime=new JTextField("Time to be displayed here");
    
    JPanel p2=new JPanel(new BorderLayout());
    p2.add(p1,BorderLayout.CENTER);
    p2.add(new JTextField("Time to be displayed here"),BorderLayout.NORTH);
    
    //p2.add(jfTime,BorderLayout.NORTH);
    
    add(p2,BorderLayout.EAST);
    add(new JButton("Food is to placed here"),BorderLayout.CENTER);
  }
  public static void main(String[] args){
    JFrame frame=new TestPanels();
    
    frame.setTitle("The Front View of a Microwave Oven");
    frame.setSize(400,250);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}