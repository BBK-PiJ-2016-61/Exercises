public class MobilePhone extends OldPhone{
  
     public MobilePhone(){
     }

     private final static int last10Numbers=10;
     private String[] lastNumber = new String[last10Numbers];
     private int index = 0;
     
     @Override
     public void call(String number){
           super.call(number);
           System.out.println("Updating last ten numbers called");
           
           if(index<last10Numbers){
                  index++;
                  lastNumber[index]= number;

		  // lastNumber[++index]= number;
                  }
           else {
               System.arraycopy(lastNumber, 1, lastNumber, 0, last10Numbers - 1);
               lastNumber[last10Numbers - 1] = number;
                    }
 
           System.out.println("Phone numbers saved to memory = "+ index);
               }
     
     public void ringAlarm(String alarm){
           System.out.println("Alarm is ringing: "+ alarm);
           }

     public void playGame(String game){
           System.out.println("Playing game: "+game);
           }
     
     public void printLastNumbers(){
           System.out.println("Last "+index+" numbers");

                 for(int i = 0; i < index; i++){
                       System.out.println(lastNumber[i]);
                     }
             }
     }

            
   
