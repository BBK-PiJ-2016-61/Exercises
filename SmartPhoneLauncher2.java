public class SmartPhoneLauncher2{

       public static void main(String[] args){
             SmartPhoneLauncher2 launcher = new SmartPhoneLauncher2();
             launcher.smartLaunch();
       }

       public void smartLaunch(){

              MobilePhone phone2 = new SmartPhone();
              String webAddress1 = "http://www.moodle.bbk.ac.uk/"; 
              (SmartPhone)phone2.browseWeb(webAddress1);
			  (SmartPhone)phone2.findGPSPosition();
       }
}


