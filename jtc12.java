class Hai{
         void m1(){
		 System.out.println("m1 in Hai");
		 }
		 static void m2(){
		 System.out.println("m2 in Hello");
		 }
		 }
		 class Hello{
		        int m11(){
				  System.out.println("m11 in Hello");
				   return 10;
			}
			Hai m12(){
			     System.out.println("M22 in Hello");
				 return new hai();
				}
				Hai m12(Hai hai){
				System.out.println(M13(hai hai)in Hello);
				//hai.m1();
				hai.m2();
				return m12();
			}
			Object m14(){
			        System.out.println("m14 in Hello");
					return 11;
			}
			Object m15(){
			          System.out.println("m15 in Hello");
					  return new Hai();
			}
			static Hai m16(){
			   System.out.println(m16() in hello);
			   return new Hai;
			   }
			   }
			   class Jtc62{
			            public static void main(String arg[]){
						Hello h1=new Hello();
						int i=h1.m11();
						System.out.println(i);
						Hai hai=h1.m12();
						hai.m1();
						Hai hai1=h1.m13(null);
						System.out.println(hai.hashCode());
						System.out.println(hai1.hashCode());
						Hai hai2=Hello.m16();
						Hai hai3=Hello.m16();
						System.out.println(hai2.hashCode());
						System.out.println(hai3.hashCode());
						}
				}
			
		 