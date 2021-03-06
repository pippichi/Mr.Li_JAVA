import javax.swing.JOptionPane;
public class Player{
	private static int nameNum = 0;
	private String name = JOptionPane.showInputDialog("请输入第"+(++nameNum)+"位玩家的姓名:");//玩家姓名
	private int winNum = 0;//赢的次数
	private int loseNum = 0;//输的次数
	private int[] PlayerCard = new int[3];//玩家随机抽取三张牌
	private static int[] num;//共用的牌
	private int temp;
	//定义玩家
	public Player(){
		if(name==null||name==""){
			this.name = "Player";
		}
		for(int i=0;i<PlayerCard.length;i++){
			PlayerCard[i]=(int)(Math.random()*52+1);
		}
	}
	public void setNew(){
		for(int i=0;i<PlayerCard.length;i++){
			PlayerCard[i]=(int)(Math.random()*52+1);
		}
	}
	public String getName(){
		return name;	
	}
	public void setName(String name){
		this.name = name;	
	}
	//定义赢的次数
	public void setWin(){
		winNum += 1;	
	}
	public int getWin(){
		return winNum;	
	}
	//定义输的次数
	public void setLose(){
		loseNum += 1;	
	}
	public int getLose(){
		return loseNum;	
	}
	//返回玩家的牌
	public int[] getPlayerCard(){
		return PlayerCard;
	}
	public int[] getArray(){
		for(int i=0;i<PlayerCard.length-1;i++){
			for(int j=i+1;j<PlayerCard.length;j++){
				if(PlayerCard[i]<PlayerCard[j]){
					temp = PlayerCard[i];
					PlayerCard[i] = PlayerCard[j];
					PlayerCard[j] = temp;
				}
			}	
		}
		return PlayerCard;
	}
	//重开一盘
	public void Restart(){
		for(int i=0;i<num.length;i++){
			num[i]=i+1;	
		}
	}
}