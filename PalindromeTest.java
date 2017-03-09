import java.util.Scanner;

public class PalindromeTest{

   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Guess a Palindrome: ");
   String palindromeGuess = input.nextLine();
   
   PalindromeTest palindrome = new PalindromeTest();
   
 
   
    if(Palindrome==true){
		  System.out.println(palindromeGuess+" is a Palindrome");
	  }else{
	  System.out.println(palindromeGuess+" is not a Palindrome");
      }
    }
	
   boolean Palindrome(String input){
      if(input.length()<=1){
	      return true;
      }else if (input.charAt(input.length()-1)=input.charAt(0)){
	      return Palindrome(input.substring(1, input.length()-1));
      }else {
	      return false;
      }
	

   }
}




// see live coding exercise!!!!