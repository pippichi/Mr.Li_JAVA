class Owner{
	private String name;
	private String hobby;
	
	public Owner(){
		
		}
	public Owner(String itName,String itHobby){
		name=itName;
		hobby=itHobby;
		}
	public String getName(){
		return name;
		}
	public void setName(String newName){
		name=newName;
		}
	public void hello(Dog dog){
		System.out.println("快来，我的小狗 "+dog.getName());
		dog.bark();
		}
	public void feedDog(Dog[] dogs){
	 for(int i=0;i<dogs.length;i++)
	  System.out.println("我要喂我的小狗："+dogs[i].getName());
	}
	}