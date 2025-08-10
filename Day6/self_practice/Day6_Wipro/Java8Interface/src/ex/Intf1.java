package ex;

public interface Intf1 {
	
	public default void newEnhancement() {
		System.out.println("New Enhancement in system");
	}
	
	public void disp();

}
