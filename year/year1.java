import java.util.Scanner;
public class year1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个年份：比如2018");
		int year=input.nextInt();
		boolean year2=(year%4==0 && year%100!=0)||(year%400==0);
		/*if(year2){
			System.out.println("不是闰年");
		}
		else{
			System.out.println("是闰年");
		}*/
		String outcome=(year2==true)?"是闰年":"不是闰年";
		System.out.println(outcome);
	}
}