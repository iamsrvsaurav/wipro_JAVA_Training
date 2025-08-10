package runnableex;
class PrintNameRunnable implements Runnable{
	String name;
	
	public PrintNameRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(name);
		}
		
	}
	
}
public class RunnableEx1 {

	public static void main(String[] args) {
		PrintNameRunnable p1 = new PrintNameRunnable("Ha");
		PrintNameRunnable p2 = new PrintNameRunnable("Thums up!");
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		t1.setPriority(8);
		t2.setPriority(10);
		
		t1.start();
		t2.start();

	}

}
