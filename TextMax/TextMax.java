public class TextMax{
	public static void main(String[] args){
		int i=18,j=17;
		int k=max(i,j);
		double a=18.5,b=19.1;
		double c=max(a,b);
		double x=max(i,b);
		System.out.println("两个数比较大的是："+k);
		System.out.println("两个实数比较大的是："+c);
		System.out.println("两个实数比较大的是："+x);
		}
		public static int max(int num1,int num2){
			int result;
			if(num1>num2)
			result=num1;
			else
			result=num2;
			return result;
			}
	  public static double max(double num1,double num2){
			double result;
			if(num1>num2)
			result=num1;
			else
			result=num2;
			return result;
			}
		public static int max(int num1,double num2){
			double result;
			if(num1>num2)
			result=num1;
			else
			result=num2;
			return result;
			}
	}