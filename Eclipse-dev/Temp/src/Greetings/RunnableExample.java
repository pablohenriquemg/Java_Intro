package Greetings;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Printed inside Runnable");	
			}
		});
		
		myThread.start();
		
		Thread myLambdaThread = new Thread(() -> 
		System.out.print("Printed inside lambda runnable"));

		myLambdaThread.start();
	}

}
