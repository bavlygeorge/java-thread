package thread;

public class SimpleRunThread implements Runnable{
	String name;

	public SimpleRunThread(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(i + " " + name);
		}
		System.out.println("Done " + name);
	}
	
	

}
