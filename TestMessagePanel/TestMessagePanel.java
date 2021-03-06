import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.FontMetrics;

public class TestMessagePanel extends JFrame{
	public TestMessagePanel(){
		MessagePanel messagePanel1=new MessagePanel("Welcome to java");
		MessagePanel messagePanel2=new MessagePanel("Java is fun");
		MessagePanel messagePanel3=new MessagePanel("Java is cool");
		MessagePanel messagePanel4=new MessagePanel("I love Java");
		messagePanel1.setFont(new Font("SansSerif",Font.ITALIC,30));
		messagePanel1.setBackground(Color.RED);
		messagePanel2.setFont(new Font("Courier",Font.BOLD,30));
		messagePanel2.setBackground(Color.BLUE);
		messagePanel3.setFont(new Font("Californian FB",Font.PLAIN,30));
		messagePanel3.setBackground(Color.CYAN);
		messagePanel4.setFont(new Font("Times",Font.ITALIC,30));
		messagePanel4.setBackground(Color.GREEN);
		messagePanel1.setCentered(true);
		
		setLayout(new GridLayout(2,2));
		add(messagePanel1);
		add(messagePanel2);
		add(messagePanel3);
		add(messagePanel4);
		}
		
		public static void main(String[] args){
			TestMessagePanel frame=new TestMessagePanel();
			frame.setSize(600,300);
			frame.setTitle("TestMessagePanel");
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			}
	}
	
class MessagePanel extends JPanel{
		private String message;
		private boolean centered;
		private int xCoordinate=20;
		private int yCoordinate=60;
		public MessagePanel(){}
		public MessagePanel(String message){
		this.message=message;
		}
		public void setCentered(boolean centered){
			this.centered=centered;
			repaint();
			}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		FontMetrics fm=g.getFontMetrics();
		int stringWidth=fm.stringWidth(message);
		int stringAscent=fm.getAscent();
		if(centered){
		  xCoordinate=getWidth()/2-stringWidth/2;
		  yCoordinate=getHeight()/2+stringAscent/2;
		  g.drawString(message,xCoordinate,yCoordinate);
	  }
	  else{
	  	g.drawString(message,xCoordinate,yCoordinate);
	  	}
		g.fill3DRect(getWidth()/2,getWidth()/2,getHeight()/2,getHeight()/2,true);
		}
	}