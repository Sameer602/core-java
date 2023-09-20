class Hello{
        {
		  System.out.println("IB in Hello");
		{
		 System.out.println("local block in IB");
		 }
		}
		static{
		      System.out.println("SB1 in Hello");
			  {
			   System.out.println("local block in SB");
			  }
			 /*static{
					 System.out.println("local in SB1");
					 }*/
				}}
				class Jtc58{
							public static void main(Stron arg[])throws Exception{
							Hello h1=(Hello)Class.forName("Hello").newInstance();
				}}
					 
		