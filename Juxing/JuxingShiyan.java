public class JuxingShiyan{
 public static void main(String[] args){
  Juxing J1=new Juxing(4,40);
  Juxing J2=new Juxing(3.5,35.9);
  System.out.println("����1�Ŀ�: "+J1.getWidth()+"\n����1�ĸ�: "+J1.getHeight()+
  "\n����1���ܳ�: "+J1.getPerimeter()+"\n����1�����: "+J1.getArea());
  System.out.println();
  System.out.println("����2�Ŀ�: "+J2.getWidth()+"\n����2�ĸ�: "+J2.getHeight()+
  "\n����2���ܳ�: "+J2.getPerimeter()+"\n����2�����: "+J2.getArea());
 }
}