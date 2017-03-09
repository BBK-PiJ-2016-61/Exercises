public class SmartPhone extends MobilePhone {

     public SmartPhone(){
     }

     public final static int X_ELEMENT = 100;
     public final static int Y_ELEMENT = 100;
     private double [][] GPSArray = new double[X_ELEMENT][Y_ELEMENT];  //generates array of doubles for the GPS coordiantes

     public void browseWeb(String webAddress){
            System.out.println("Browsing the website: "+ webAddress);
            }

     public double[] findGPSPosition(){
            double myLatitude = 51.520997;  //BBK Latitude
            double myLongitude = -0.127844;  //BBK Longitude
            System.out.println("Your latitude is :"+myLatitude+", Your Longitude is: "+myLongitude);
            
	    double[] result = {myLatitude,myLongitude};
            return result;
          
            }
  }


