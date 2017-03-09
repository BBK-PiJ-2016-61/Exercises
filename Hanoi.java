import java.math.BigInteger;
public class Hanoi{
   public static void main(String[] args){
       Hanoi han = new Hanoi();
	   for (int n=1; n<=264; n++){
	   System.out.println("Number of moves needed for "+n+" disks is: "+Hanoi.hanoi(n));
	   }
   }

   static BigInteger hanoi(int n){
     BigInteger result = new BigInteger("0");
     if(n>0){
		 result=new BigInteger("2").multiply(hanoi(n-1));
     }
     return result.add(BigInteger.ONE);
   }
}   


// note long exceeded for 64 disks so BigInteger function required