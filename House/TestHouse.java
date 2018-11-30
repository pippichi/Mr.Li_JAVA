public class TestHouse{
	public static void main(String[] args)throws Exception{
		 House h1=new House(10,100);
		 House h2=(House)h1.clone();
		 House h3=h1;
		 try{
		 	h1.clone();
		 	}
		 catch(Exception e){
		 	System.out.println("wrong");
		 	}
		 	System.out.println("ok");
		 	System.out.println(h1.compareTo(h2)+"\n"+h1.compareTo(h3));
		 	System.out.println(h1.equals(h2));
		 	System.out.println(h1.equals(h3));
		 	System.out.println(h1==h3);
		 	System.out.println(h1==h2);
		}
	}