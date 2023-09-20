class Hello{
			int m1(){
			System.out.println("m1 in Hello");
			return 10;
		}
		int m2(){
		System.out.println("m2 in Hello");
		return 20;
		}
		void m3(){
		System.out.println("m3 in Hello");
		}
		}
		class Jtc65{
		       public static void main(String arg[]){
			   Hello h1=new Hello();
			   System.out.println(h1.m1());
			   System.out.println(h1.m2());
			   //System.out.println(h1.m3());
			   System.out.println(h1.m()+""+h1.m2());
			   }
	}
			   
		