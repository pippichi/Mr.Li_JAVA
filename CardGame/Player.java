import javax.swing.JOptionPane;
public class Player{
	private static int nameNum = 0;
	private String name = JOptionPane.showInputDialog("�������"+(++nameNum)+"λ��ҵ�����:");//�������
	private int winNum = 0;//Ӯ�Ĵ���
	private int loseNum = 0;//��Ĵ���
	private int[] PlayerCard = new int[3];//��������ȡ������
	private static int[] num;//���õ���
	private int temp;
	//�������
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
	//����Ӯ�Ĵ���
	public void setWin(){
		winNum += 1;	
	}
	public int getWin(){
		return winNum;	
	}
	//������Ĵ���
	public void setLose(){
		loseNum += 1;	
	}
	public int getLose(){
		return loseNum;	
	}
	//������ҵ���
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
	//�ؿ�һ��
	public void Restart(){
		for(int i=0;i<num.length;i++){
			num[i]=i+1;	
		}
	}
}