import java.util.Scanner;
public class desknumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("��һ��0-100�����֣�");
    int number=(int)(Math.random()*101);
    int realnumber,i=0;
    //���ϵز�
    while(true){
      i++;
      realnumber = input.nextInt();
      if(number == realnumber){
        System.out.println("congratulations!use "+ i +" times");
        break;
      }
      else if(number < realnumber)
        System.out.println("too big");
      else
        System.out.println("too small");
    }
  }
}