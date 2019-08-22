package Question6;
/*6.	Write  a  program  to  assign  the  current  thread  to  t1.  
  Change  the  name  of  the  thread  to  MyThread.  Display  the  changed  name 
  of  the  thread.  Also  it  should  display  the  current  time.  
   Put  the  thread  to  sleep  for  10  seconds  and  display  the  time  again.
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramOnThread {

	public static void main(String[] args) {
		Thread t1 = new ThreadName("MyThread");
		System.out.println("The new name of the thread is:"+t1.getName());
		t1.run();
	}
}
class ThreadName extends Thread{
	ThreadName(String tname){
	super(tname);
	}
	public void run() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   System.out.println("Thread t1 running:"+dtf.format(LocalDateTime.now()));  
		   
		   try{
			   System.out.println("Thread is in sleep mode for 10 seconds");
			   Thread.sleep(10000);
		   }
		   catch(InterruptedException e)
		   {
			   System.out.println(e);
			   }  
		    System.out.println("Thread t1 running Again:"+dtf.format(LocalDateTime.now()));  
	        
	}  

	}
	

