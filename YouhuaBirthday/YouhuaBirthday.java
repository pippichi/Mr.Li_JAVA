import java.util.Scanner;
public class YouhuaBirthday{
    public static void main(String[] args){
        String Str1 = "1 3 5 7 \n" + "9 11 13 15\n" + "17 19 21 23\n" + "25 27 29 31\n";
        String Str2 = "2 3 6 7 \n" + "10 11 14 15\n" + "18 19 22 23\n" + "26 27 30 31\n";
        String Str3 = "4 5 6 7\n" + "12 13 14 15\n" + "20 21 22 23\n" + "28 29 30 31\n";
        String Str4 = "8 9 10 11\n" + "12 13 14 15\n" + "24 25 26 27\n" + "28 29 30 31\n";
        String Str5 = "16 17 18 19\n" + "20 21 22 23\n" + "24 25 26 27\n" + "28 29 30 31\n";
        int day = 0;
        Scanner input = new Scanner(System.in);
        for()
        System.out.println("你的生日在以下数字之中吗？");
        System.out.println(Str1);
        System.out.println("如果是请按1，不是请按0"); 
        int answer=input.nextInt();
        if (answer == 1)
        day += 1;
        System.out.println("你的生日在以下数字之中吗？");
        System.out.println(Str2);
        System.out.println("如果是请按1，不是请按0");
        answer = input.nextInt();
        if (answer == 1)
        day += 2;
        System.out.println("你的生日在以下数字之中吗？");
        System.out.println(Str3);
        System.out.println("如果是请按1，不是请按0");
        answer = input.nextInt();
        if (answer == 1)
        day += 4;
        System.out.print("你的生日在以下数字之中吗？");
        System.out.print(Str4);
        System.out.print("如果是请按1，不是请按0");
        answer = input.nextInt();
        if (answer == 1)
        day += 8;
        System.out.print("你的生日在以下数字之中吗？");
        System.out.print(Str5);
        System.out.print("如果是请按1，不是请按0");
        answer = input.nextInt();
        if (answer == 1)
        day += 16;
        System.out.println("你的生日是" + day + "号!");
        }
      }