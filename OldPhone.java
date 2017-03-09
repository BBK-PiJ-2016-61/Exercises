public class OldPhone implements Phone {

   public OldPhone(){
   }

    @Override
    public void call(String number){
          System.out.println("Please enter a phone number");
          System.out.println("Calling"+number);
          }
}