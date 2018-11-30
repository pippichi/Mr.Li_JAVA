import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class ShowBorderLayout extends JFrame{
	public ShowBorderLayout(){
		
		setLayout(new BorderLayout(10,10));
		add(new JButton("东"),BorderLayout.EAST);
		add(new JButton("南"),BorderLayout.SOUTH);
		add(new JButton("西"),BorderLayout.WEST);
		add(new JButton("北"),BorderLayout.NORTH);
		add(new JButton("中"),BorderLayout.CENTER);
		}
		public static void main(String[] args){
		 ShowBorderLayout frame=new ShowBorderLayout();
		 //frame.add(jbtOK);
		 //把按钮加到窗体上
		 frame.setTitle("学习第一个窗体");
		 frame.setSize(800,600);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		}
	}