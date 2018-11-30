import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

public class MoveMessageDemo extends JFrame{
  public MoveMessageDemo(){
    //�ٴ���һ�����
    MovableMessagePanel p=new MovableMessagePanel("С��һ�㣬����һƬ");
    setLayout(new BorderLayout());
    //���ַ���������
    p.setFont(new Font("����",Font.BOLD,32));
    //�����ӵ�������
    add(p);
  }
  static class MovableMessagePanel extends JPanel{
    private String message="Study hard,day day up!";
    private int x=40;
    private int y=40;
    
    public MovableMessagePanel(String s){
      //���������ʾ���ַ���
      message=s;
      addMouseMotionListener(new MouseMotionAdapter(){
        public void mouseDragged(MouseEvent e){
          x=e.getX();
          y=e.getY();
          repaint();
        }
      });
    }
  //������ϻ����ַ���
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