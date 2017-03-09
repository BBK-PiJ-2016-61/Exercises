public class SmartPhoneLauncher{

       public static void main(String[] args){
             SmartPhoneLauncher launcher = new SmartPhoneLauncher();
             launcher.smartLaunch();
       }

       public void smartLaunch(){

              SmartPhone phone1 = new SmartPhone();
              String webAddress1 = "http://www.moodle.bbk.ac.uk/";   
              phone1.browseWeb(webAddress1);
			  phone1.findGPSPosition();
       }
}


