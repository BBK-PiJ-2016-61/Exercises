public class FactorialTest{

      public static void main(String[] args){
	  System.out.println("Please give a positive integer below 39");
	  // Prints "Please give a number" to the terminal
	  String str = System.console().readLine();
	  long n = Integer.parseInt(str);
	  FactorialTest fact = new FactorialTest();
	  
	  if (n>=39){
		  System.out.println(n+" is not a number below 39");
	  }else{
	  System.out.println("The factorial of "+n+" is iteratively "+fact.factorial(n));
	  }
	  if (n==1){
		  System.out.println(1);
	  } else{
		  long x=2;
		  long y=1;
		  while(x<=n){
			  y=y*x;
			  x++;
		  }
		  System.out.println("The factorial of "+n+" is recursively "+y);	  
	  }
}

long factorial (long n){
	if(n==1){
		return 1;
	} else{
		return n*factorial(n-1);
		
	}
}

}

