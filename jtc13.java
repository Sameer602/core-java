class Hai{
       void m1(){
	        System.out.pintln("m1 in Hello");
			}
		}
		class Hello{
		   static Hai hai=new hai();
		   static Hai getHai(){
		      System.out.println("getHai() in Hello");
			  return hai;
			  }
			 }
		class Jtc63{
		        public static void main(String arg[]){
				Hai hai=Hello.getHai();
				Hai hai1=Hello.getHai();
				System.out.println(hai.hashCode());
				System.out.println(hai1.hashCode());
				}
			}
				