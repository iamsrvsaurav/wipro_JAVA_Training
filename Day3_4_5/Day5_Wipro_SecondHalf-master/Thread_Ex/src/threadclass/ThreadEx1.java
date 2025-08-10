package threadclass;
class MyThread1 extends Thread{
	
	MyThread1(){
		super("Using thread class");
		start();
	}
	
	public void run() {
		for(int i=5;i>0;i--) {
			try {
			System.out.println("Child Thread:"+getName()+":"+getPriority()+i);
			Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	
}
public class ThreadEx1 {

	public static void main(String[] args) {
		MyThread1 t = new MyThread1();
		MyThread1 t1 = new MyThread1();
		t.setName("MyThread");
		t1.setName("MyThread1");
		t.setPriority(10);
		
		

	}

}
