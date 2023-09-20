class Hello{
	{
	  System.out.println("IB in Hello");
	}
	static{
	      System.out.println("SB in Hello");
	}
	Hello(){
	      System.out.println("default constructor in Hello");
	}
	Hello(Hello h){
	      System.out.println("1 param constructor in Hello");
	}
	Hello(Hello h1,Hello h2){
	      System.out.println("2 param constructor in Hello");
	}
	}
	class Jtc81{
	         public static void main(String arg[]){
			 //Hello h1=new Hello();
			 //Hello h2=new Hello();
			 Hello h3=new Hello(new Hello(new Hello(new Hello(new Hello(new Hello())))));
			 }}
			 
			 
	