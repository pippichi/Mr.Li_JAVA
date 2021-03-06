import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.BorderLayout;

public class MoveMessageDemo extends JFrame{
	public MoveMessageDemo(){
		MoveMessagePanel p = new MoveMessagePanel("Welcome to java.");	
		setLayout(new BorderLayout());
		add(p);
	}
	static class MoveMessagePanel extends JPanel{
			private String message = "Welcome to java.";
			private int x = 20;
			private int y = 20;
			
			public MoveMessagePanel(String s){
				message = s;
				addMouseMotionListener(new MouseMotionAdapter(){
					public void mouseDragged(MouseEvent e){
						x = e.getX();
						y = e.getY();
						repaint();	
					}	
				});	
			}
			
			public void paintComponent(Graphics g){
				super.paintComponent(g);
				g.drawString(message,x,y);
				//repaint();	
			}
		}
			public static void main(String[] args){
				MoveMessageDemo frame = new MoveMessageDemo();
				frame.setTitle("MoveMessageDemo");
				frame.setSize(800,600);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
}