import java.util.Scanner;
public class year1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����ݣ�����2018");
		int year=input.nextInt();
		boolean year2=(year%4==0 && year%100!=0)||(year%400==0);
		/*if(year2){
			System.out.println("��������");
		}
		else{
			System.out.println("������");
		}*/
		String outcome=(year2==true)?"������":"��������";
		System.out.println(outcome);
	}
}