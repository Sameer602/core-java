class Hello{
			int a=10;
			int b=20;
			static int c=30;
			{
			System.out.println("IB1 in Hello");
			}
			static{
			      System.out.println("SB1 in Hello");
				  }
			{
			 System.out.println("IB2 in Hello");
			 }
			 /*Static{
			 System.out.println("SB2 in Hello");
			 }*/
		 }
		 class Jtc56{
						int aa=111;
						static int bb=222;
						{
						System.out.println("IB1 in Hello");
						System.out.println(aa);
						System.out.println(bb);
						}
					static{
					     System.out.println("SB1 in Jtc56");
						// System.out.println(aa);
						 System.out.println(bb);
			            }
						public static void main(String arg[]){
						System.out.println("In in Main");
						System.out.println(Hello.c);
						Hello h1=new Hello();
						Hello h2=new Hello();
						Jtc56 j56=new Jtc56();
						}
						}
			 