public class Rectangle1 extends GeometricObject1{
  private double width;
  private double height;
  
  public Rectangle1(){
  }
  public Rectangle1(double width, double height){
    this.width = width;
    this.height = height;
  }
  public Rectangle1(double width, double height, String color,
      boolean filled){
    this(width,height);
    setColor(color);
    setFilled(filled);
  }
  public double getWidth(){
    return width;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public double height(){
    return height;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public double getArea(){
    return width * height;
  }
  public double getPerimeter(){
    return 2 * (height + width);
  }
}