public class JuxingShiyan{
 public static void main(String[] args){
  Juxing J1=new Juxing(4,40);
  Juxing J2=new Juxing(3.5,35.9);
  System.out.println("矩形1的宽: "+J1.getWidth()+"\n矩形1的高: "+J1.getHeight()+
  "\n矩形1的周长: "+J1.getPerimeter()+"\n矩形1的面积: "+J1.getArea());
  System.out.println();
  System.out.println("矩形2的宽: "+J2.getWidth()+"\n矩形2的高: "+J2.getHeight()+
  "\n矩形2的周长: "+J2.getPerimeter()+"\n矩形2的面积: "+J2.getArea());
 }
}