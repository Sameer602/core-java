class Hello{
        void m1(byte b1){
		             System.out.println("m1(byte b1) in Hello");
		}
		void m1(short s){
		              System.out.println("m1(short s) in Hello");
					  return;//Empty Return Statement
		}
		void m1(int i){
		          System.out.println("m1(int i) in Hello");
		}
		/*m1(){
				error:invalid method declaration,return type required.
		*/
		void m1(long l){
		            System.out.println("m1(long l) in Hello");
		}
		void m1(char ch){
		              System.out.println("m1(char ch) in Hello");
	     }
		}
		class Jtc71{
		        public static void main(String arg[]){
				Hello h1=new Hello();
				h1.m1(111);
				h1.m1(65);
				h1.m1((byte)111);
				h1.m1((short)111);
			}
		}
			