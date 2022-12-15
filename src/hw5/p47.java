package hw5;

public class p47 {
	public static void main(String[] args) {
		Car4 car1 = new Car4("1號車");
		car1.start();
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("正在進行main()的工作");
			} catch(InterruptedException e) {
				
			}
		}
	}
}
class Car4 extends Thread{
	private String name;
	public Car4(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("正在進行"+name+"的處理工作");
		}
	}
}
