import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class ShowBorderLayout extends JFrame{
	public ShowBorderLayout(){
		
		setLayout(new BorderLayout(10,10));
		add(new JButton("��"),BorderLayout.EAST);
		add(new JButton("��"),BorderLayout.SOUTH);
		add(new JButton("��"),BorderLayout.WEST);
		add(new JButton("��"),BorderLayout.NORTH);
		add(new JButton("��"),BorderLayout.CENTER);
		}
		public static void main(String[] args){
		 ShowBorderLayout frame=new ShowBorderLayout();
		 //frame.add(jbtOK);
		 //�Ѱ�ť�ӵ�������
		 frame.setTitle("ѧϰ��һ������");
		 frame.setSize(800,600);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		}
	}