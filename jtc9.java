class Hello{
            int a=10;
			int b=20;
			static int c=30;
			void m1(){
			      System.out.println("m1 in Hello.......instance method");
				  System.out.println(a);
				  System.out.println(b);
				  System.out.println(c);
				  }
			static void m2(){
			 System.out.print("m2 in Hello.........Static method");
			 //System.out.print(a);
			 //System.out.print(b);
			 System.out.print(c);
			 }
			}
			class Jtc59{
			       public static void main(String arg[]){
				   Hello h1=null;
				   h1.m1();
				   //h1.m1();
				   Hellom2();
				   //Hello.m1();
				   Hello h2=new Hello();
				   h2.m2();
				   h2.m1();
				 }
			}