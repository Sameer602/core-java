class Hello{
		int a;
		final Hello(int a1){
		System.out.println("1 param constructor in Hello");
		a=a1;
	}
	void m1(){
	      System.out.println("m1 in Hello");
		  System.out.println(a);
		 }
		}
		class Jtc79{
				public static void main(String arg[]){
				Hello h1=new Hello(111);
				h1.m1();
				Hello h2=new Hello(222);
				h2.m1();
			}
		}