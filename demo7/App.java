package demo7;

interface Executable {
	void execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("executing code block  :");
	}
}

public class App {

	public static void main(String[] args) {

		Runner runner = new Runner();
		runner.run(new Executable() {
			public void execute() {
			System.out.println("Hello here");
			}
		});
		
		System.out.println("---------------------------");
		runner.run(() -> System.out.println("hello There"));
	}
	
	

}
