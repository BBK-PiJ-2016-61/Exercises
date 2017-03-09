import java.math.BigInteger;

public class Fibonacci{
    int fib(int n){
	if(n<3){
	   return 1;
	   } else {
	   return fib(n-1)+fib(n-2);
	   }
	}
	
	 public static void main(String[] args){
	  System.out.println("Please give a number");
	  // Prints "Please give a number" to the terminal
	  String str = System.console().readLine();
	   int in = Integer.parseInt(str);
	   Stopwatch timer = new Stopwatch();
	   timer.Start();
	   Fibonacci fibo = new Fibonacci();
	   System.out.println("Element "+in+" of the Fibonacci sequence is: "+fibo.fib(in));
	   timer.Stop();
	   System.out.println("Elapsed time in milliseconds: "+ timer.getElapsedMilliseconds());
	   }
	}
	
	class Stopwatch {
		 // this class adapted from that made by Carlos Quintanilla, found online
    private final long nsPerTick = 100;
    private final long nsPerMs = 1000000;

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;
    
    /**
     * Starts measuring elapsed time
     * for an interval.
     */
    public void Start() {
        this.startTime = System.nanoTime();       
        this.running = true;
    }
    
    /**
     * Stops measuring elapsed time
     * for an interval.
     */
    public void Stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }
    
    /**
     * Stops time interval measurement 
     * and resets the elapsed time to zero.
     */ 
    public void reset() {
        this.startTime = 0;
        this.stopTime = 0;
        this.running = false;
    }
    /**
     * Gets the total elapsed time measured 
     * by the current instance, in milliseconds.
     * 10000 Ticks = 1 millisecond (1000000 nanoseconds)
     */
    public long getElapsedMilliseconds() {
        long elapsed;
        if (running) {
             elapsed = (System.nanoTime() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
        return elapsed / nsPerMs;
    }
	}