
public class ThreadDemo extends Thread {
	
	
	@Override
	public void run() {
		System.out.println("manoj is gandu");
		super.run();
	}

	public static void main(String[] args) {
		
		ThreadDemo thread=new ThreadDemo();
		thread.start();
		System.out.println(thread.currentThread().getName());
		thread.getPriority();
		
		
	}
}
