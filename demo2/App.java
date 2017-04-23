package demo2;



class Runner extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++)
			System.out.println(" Hello " + i);
		 	try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
public class App {
	
	public static void main( String[] argrs ){
		
		Thread runner1 = new Thread(new Runner());
		runner1.start();
		
		Thread runner2 = new Thread(new Runner());
		runner2.start();
	}

}