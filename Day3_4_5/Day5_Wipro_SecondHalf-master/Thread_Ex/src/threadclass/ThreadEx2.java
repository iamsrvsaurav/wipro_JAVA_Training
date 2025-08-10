package threadclass;

class CreateThread extends Thread{
	Thread t;
	String tname;
	public CreateThread(String tname) {
		this.tname = tname;
		t = new Thread(this,tname);
		System.out.println("New Thread:"+t);
		t.start();
	}
	public void run() {
		for(int i=5;i>0;i--) {
			try {
			System.out.println(tname+":"+i);
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
}
public class ThreadEx2 {

	public static void main(String[] args) {
		CreateThread t1 = new CreateThread("One");
		CreateThread t2 = new CreateThread("Two");
		
		System.out.println("Thread t1 is alive"+t1.t.isAlive());
		System.out.println("Thread t2 is alive"+t2.t.isAlive());
		
		try {
			System.out.println("Waiting thread to finish:");
			t1.t.join();
			t2.t.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		System.out.println("Thread t1 is alive"+t1.t.isAlive());
		System.out.println("Thread t2 is alive"+t2.t.isAlive());
		
		System.out.println("Main thread is exiting");

	}

}
