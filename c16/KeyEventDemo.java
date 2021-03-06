import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
//显示某个按键字符的窗体
public class KeyEventDemo extends JFrame{
  private KeyboardPanel keyboardPanel=new KeyboardPanel();
  
  public KeyEventDemo(){
    keyboardPanel.setFont(new Font("宋体",Font.BOLD,64));
    add(keyboardPanel);
    keyboardPanel.setFocusable(true);
  }
  public static void main(String[] args){
    KeyEventDemo frame=new KeyEventDemo();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("KeyEventDemo");
    frame.setSize(800,600);
    frame.setVisible(true);
  }
  //显示按键字符的面板
  static class KeyboardPanel extends JPanel{
  //字符显示位置的坐标
    private char keyChar='C';
    private int x=100;
    private int y=100;
    public KeyboardPanel(){
      addKeyListener(new KeyAdapter(){
        public void keyPressed(KeyEvent e){
          switch(e.getKeyCode()){
            case KeyEvent.VK_DOWN:y+=10;break;
            case KeyEvent.VK_UP:y-=10;break;
            case KeyEvent.VK_LEFT:x-=10;break;
            case KeyEvent.VK_RIGHT:x+=10;break;
            //keyChar只接受字符按键，其他功能键不接收
            default:keyChar=e.getKeyChar();         
          }
          repaint();
        }
      });
    }
    protected void paintComponent(Graphics g){
      super.paintComponent(g);
      g.drawString(String.valueOf(keyChar),x,y);
    }
  }
}