	import java.util.Scanner;
	public class Birthday2{
	public static void main(String[] args){
		int day=0,answer;
		int[][][] dates={
			{{1,3,5,7},
			 {9,11,13,15},
			 {17,19,21,23},
			 {25,27,29,31}},
			{{2,3,6,7},
			 {10,11,14,15},
			 {18,19,22,23},
			 {26,27,30,31}},
			{{4,5,6,7},
			 {12,13,14,15},
			 {20,21,22,23},
			 {28,29,30,31}},
			{{8,9,10,11},
			 {12,13,14,15},
			 {24,25,26,27},
			 {28,29,30,31}},
			{{16,17,18,19},
			 {20,21,22,23},
			 {24,25,26,27},
			 {28,29,30,31}}};
		Scanner input=new Scanner(System.in);	
		for(int i=0;i<5;i++){
			System.out.println("第"+i+"组数字里有你的生日日期吗");
			for(int j=0;j<4;j++){
				for(int k=0;k<4;k++){
					System.out.print(dates[i][j][k]);
					System.out.print(",");
				}
			System.out.println();
			}
			System.out.println("\n如果有请输入1没有请输入0：\n");
			answer=input.nextInt();
			if(answer==1)
			  day+=dates[i][0][0];
			}
			System.out.println("你的生日是："+day+"号！");
		}
	}