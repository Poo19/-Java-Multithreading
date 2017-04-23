package demo4

 ;

import java.util.Scanner;

class Processor extends Thread{
	
	private boolean running = true;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(running){
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public void shutdown(){
		running = false;
	}
	
}
public class App {
	
	public static void main( String[] argrs ){
		
		Processor proc1 = new Processor();
		proc1.start();
		
		Scanner Scanner = new Scanner(System.in);
		Scanner.nextLine();
		
		proc1.shutdown();
		
		
		
	
	}

}