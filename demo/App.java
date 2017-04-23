package demo;

class Runner extends Thread{
volatile Integer counter = 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("Hello" + counter++ );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
public class App {
	
	public static void main( String[] argrs ){
		
		Runner runner1 = new Runner();
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
	}

}