import javax.swing.JFrame;
public class BounceBallApp extends JFrame{
	public BounceBallApp(){
		BallControl ballControl = new BallControl();
		add(ballControl);	
	}	
	public static void main(String[] args){
		JFrame frame = new BounceBallApp()	;
		frame.setTitle("��");
		frame.setSize(800,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}