import java.util.Scanner;
public class desknumber{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("猜一个0-100的数字：");
    int number=(int)(Math.random()*101);
    int realnumber,i=0;
    //不断地猜
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