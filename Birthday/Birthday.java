import javax.swing.JOptionPane;
public class Birthday{
	public static void main(String[] args){
		String Str1=" 1 3 5 7\n "+
		            " 9 11 13 15\n "+
		            " 17 19 21 23\n "+
		            " 25 27 29 31\n ";
	  String Str2=" 2 3 6 7\n "+
                " 10 11 14 15\n "+
                " 18 19 22 23\n "+
                " 26 27 30 31\n ";
    String Str3=" 4 5 6 7\n "+
                " 12 13 14 15\n "+
                " 20 21 22 23\n "+
                " 28 29 30 31\n ";
    String Str4=" 8 9 10 11\n "+
                " 12 13 14 15\n "+
                " 24 25 26 27\n "+
                " 28 29 30 31\n ";
    String Str5=" 16 17 18 19\n "+
                " 20 21 22 23\n "+
                " 24 25 26 27\n "+
                " 28 29 30 31\n ";
    int day=0;
    String answer=JOptionPane.showInputDialog(null,"你的生日在以下数字之中吗？(是写“1”；不是写“0”)\n"+Str1);
    Double Answer=Double.parseDouble(answer);
    if(Answer==1){
    	day=day+1;
    }
    answer=JOptionPane.showInputDialog(null,"你的生日在以下数字之中吗？\n"+Str2);
    Answer=Double.parseDouble(answer);
		if(Answer==1){
			day=day+2;
			}
		answer=JOptionPane.showInputDialog(null,"你的生日在以下数字之中吗？\n"+Str3);	  
		Answer=Double.parseDouble(answer);
		if(Answer==1){
			day=day+4;
		}
		answer=JOptionPane.showInputDialog(null,"你的生日在以下数字之中吗？\n"+Str4);
		Answer=Double.parseDouble(answer);
		if(Answer==1){
			day=day+8;
			}
		answer=JOptionPane.showInputDialog(null,"你的生日在以下数字之中吗？\n"+Str5);
		Answer=Double.parseDouble(answer);
		if(Answer==1){
			day=day+16;
		}
		JOptionPane.showMessageDialog(null,"您的生日是"+day+"号","结果",JOptionPane.INFORMATION_MESSAGE);
		}
}