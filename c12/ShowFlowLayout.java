import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
public class ShowFlowLayout extends JFrame{
	public ShowFlowLayout(String title){
		super(title);
		setLayout(new FlowLayout(FlowLayout.LEFT,20,100));
		JButton[] buttons=new JButton[10];
		for(int i=0;i<buttons.length;i++){
			buttons[i]=new JButton("��ť"+(i+1));
			add(buttons[i]);
			}
		}
		public static void main(String[] args){
		 ShowFlowLayout frame=new ShowFlowLayout("��һ������");
		 //frame.add(jbtOK);.............
		 //�Ѱ�ť�ӵ�������
		 //frame.setTitle("ѧϰ��һ������");
		 frame.setSize(800,600);
		 frame.setLocationRelativeTo(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		}
	}