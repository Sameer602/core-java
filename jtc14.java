class Hello{
           int m1(){
		   System.out.println("M1 in Hello");
		   return 10;
	    }
		static int m2(){
		       System.out.println("M2 in Hello");
			   return 20;
			}
		//static int i1=m1();
		static int i2=m2();
		int i3=m1();
		int i4=m2();
		static int m3(){
		     System.out.println("M3 in Hello");
			 return 100;
		}
		static void m4(int a){
		System.out.println(m4(int a) in Hello);
		System.out.println(a);
		}
	}
	class Jtc64{
	          public static void main(String arg[]){
			  //Hello h1=new Hello();
			  Hello.m2();
			  Hello.m4(Hello.m3());
			  }
			  }
		