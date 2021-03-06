import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GameFrame extends JFrame{
	private Message message = new Message("游戏还未开始");
	private int clickNum = 0;
	private JButton jbtPlay = new JButton("翻牌");
	private JButton jbtStart = new JButton("开始发牌");
	private JButton jbtRestart = new JButton("重新开始");
	private Player player1 = new Player();
	private Player player2 = new Player();
	private StartPanel p1 = new StartPanel(player1);
	private StartPanel p2 = new StartPanel(player2);
	private Judge judge = new Judge();
	public GameFrame(){
		Font font=new Font("楷体",Font.BOLD,18);
		JTextField text1 = new JTextField(player1.getName()+"赢了"+player1.getWin()+"次，输了"+player1.getLose()+"次");
		JTextField text2 = new JTextField(player2.getName()+"赢了"+player2.getWin()+"次，输了"+player2.getLose()+"次");
		text1.setFont(font);
		text2.setFont(font);
		text1.setBackground(Color.red);
		text1.setForeground(Color.white);
		text2.setBackground(Color.red);
		text2.setForeground(Color.white);
		message.setFont(new Font("楷体",Font.BOLD,30));
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER,72,110));
		jbtStart.setPreferredSize(new Dimension(150,50));
		jbtPlay.setPreferredSize(new Dimension(150,50));
		jbtRestart.setPreferredSize(new Dimension(150,50));
		p3.add(text1);
		p3.add(jbtStart);
		p3.add(jbtPlay);
		p3.add(jbtRestart);
		p3.add(text2);
		jbtPlay.setToolTipText("小赌怡情，大赌伤身");
		jbtStart.setToolTipText("小赌怡情，大赌伤身");
		jbtRestart.setToolTipText("小赌怡情，大赌伤身");
		setLayout(new GridLayout(4,1,5,5));
		add(p1);
		add(p2);
		add(p3);
		add(message);
		jbtStart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				message.setMessage("游戏正在进行中。。");
				message.getMessage();
				p1.start(1);
				p2.start(2);
			}
		});
		jbtPlay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clickNum+=1;
				if(clickNum==1){
					p1.setAddress(player1,1);
					p2.setAddress(player2,1);
				}
				if(clickNum==2){
					p1.setAddress(player1,2);
					p2.setAddress(player2,2);
				}
				if(clickNum==3){
					p1.setAddress(player1,3);
					p2.setAddress(player2,3);
					judge.compare(player1,player2);
					text1.setText(player1.getName()+"赢了"+player1.getWin()+"次，输了"+player1.getLose()+"次");
					text2.setText(player2.getName()+"赢了"+player2.getWin()+"次，输了"+player2.getLose()+"次");
					message.setMessage(judge.getSituation());
					message.setForeground(Color.RED);
					message.getMessage();
				}
			}
		});
		jbtRestart.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				clickNum = 0;
				player1.setNew();
				player2.setNew();
				p1.restart();
				p2.restart();
				message.setForeground(Color.BLACK);
				message.setMessage("游戏还未开始");
				message.getMessage();
			}
		});
	}
	public static void main(String[] args){
		GameFrame frame = new GameFrame();
		frame.setTitle("炸金花");
		frame.setSize(1300,800);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}
