import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
public class StartPanel extends JPanel{
	private int ImageNum;
	private JLabel[] label = new JLabel[3];
	public StartPanel(Player player){
		setLayout(new FlowLayout(FlowLayout.CENTER,350,30));
		for(int i=0;i<label.length;i++){
			label[i] = new JLabel();	
			add(label[i]);
		}
		setBorder(new TitledBorder(player.getName()+"抽到了以下三张牌"));
		setPreferredSize(new Dimension(700,250));
	}
	public String getAddress(int a){
			ImageNum = a;
			String InitialImageNum = String.valueOf(ImageNum);
			return 	"image/card/"+InitialImageNum+".png";
	}
	public void setAddress(Player player,int p){
		if(p==1){
			label[0].setIcon(new ImageIcon(getAddress(player.getPlayerCard()[0]))); 
		}
		if(p==2){
			label[1].setIcon(new ImageIcon(getAddress(player.getPlayerCard()[1]))); 
		}
		if(p==3){
			label[2].setIcon(new ImageIcon(getAddress(player.getPlayerCard()[2]))); 
		}
	}
	public void restart(){
		for(int i=0;i<label.length;i++){
			label[i].setIcon(null); 
		}	
	}
	public void start(int p){
		if(p==1){
			for(int i=0;i<label.length;i++){
				label[i].setIcon(new ImageIcon("image/card/b1fv.png"));
			}
		}
		if(p==2){
			for(int i=0;i<label.length;i++){
				label[i].setIcon(new ImageIcon("image/card/b2fv.png"));
			}	
		}
	}
}