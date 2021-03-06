public class Circle extends GeometricObject implements Cloneable,Comparable{
  private double radius;
  
  public Circle(){    
  }
  
  public Circle(double radius){
    this.radius=radius;
  }
  public Circle(double radius,String color,boolean filled){
    this.radius=radius;
    setColor(color);
    setFilled(filled);
  }
  public double getRadius(){
    return radius;
  }
  public void setRadius(double radius){
    this.radius=radius;
  }
  public double getArea(){
    return radius * radius * Math.PI;
  }
  public double getDiameter(){
    return radius * 2;
  }
  public double getPerimeter(){
    return getDiameter() * Math.PI;
  }
  public void printCircle(){
    System.out.println("The circle is created "+getDateCreated()+
    " and the radius is "+radius);
  }
  public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
  public int compareTo(Object o){
		if(getRadius()>((Circle)o).getRadius()){
			return 1;
			}
		else if(getRadius()<((Circle)o).getRadius()){
			return -1;
			}
		else{
			return 0;
			}
		}
  
  public String equals(Circle o){
  	if(getRadius()==o.getRadius()){
  		return "两个圆相同";
  		}
  	else{
  		return "两个圆不同";
  		}
  	}
}