public class TestComparableRectangle{
	public static void main(String[] args){
		ComparableRectangle c1=new ComparableRectangle(1,2);
		ComparableRectangle c2=new ComparableRectangle(2,3);
		System.out.println(c1.compareTo(c2));
		}
	}