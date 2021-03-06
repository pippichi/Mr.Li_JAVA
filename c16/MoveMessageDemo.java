import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

public class MoveMessageDemo extends JFrame{
  public MoveMessageDemo(){
    //再创建一个面板
    MovableMessagePanel p=new MovableMessagePanel("小脚一点，涟漪一片");
    setLayout(new BorderLayout());
    //让字符串字体变大
    p.setFont(new Font("宋体",Font.BOLD,32));
    //将面板加到窗体上
    add(p);
  }
  static class MovableMessagePanel extends JPanel{
    private String message="Study hard,day day up!";
    private int x=40;
    private int y=40;
    
    public MovableMessagePanel(String s){
      //在面板上显示的字符串
      message=s;
      addMouseMotionListener(new MouseMotionAdapter(){
        public void mouseDragged(MouseEvent e){
          x=e.getX();
          y=e.getY();
          repaint();
        }
      });
    }
  //在面板上画出字符串
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawString(message,x,y);
    }  
    }
    public static void main(String[] args){
    MoveMessageDemo frame=new MoveMessageDemo();
    frame.setTitle("MoveMessageDemo");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800,600);
    frame.setVisible(true);
  }
}