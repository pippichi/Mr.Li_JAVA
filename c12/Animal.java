public class Animal{
	String species;
	int weight;
	String backbone;
	public void eat(){
		System.out.println("脊椎动物都能吃，方式各不同!");
	}
	public void sleep(){
		System.out.println("脊椎动物都能休息，方式各不同!");
	}
	public void run(){
		System.out.println("脊椎动物都能移动，方式各不同!");
	}
	public Animal(){
		System.out.println("Animal类来创建一个动物");
	}
}