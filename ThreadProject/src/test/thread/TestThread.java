package test.thread;
/** Thread
 * 가벼운 프로세스
 *  (프로그램:SSD에 있는 것, 프로세스 : RAM에 있는 것, 프로세싱 : CPU에서 실행 중인 것)
 * 프로세스 : cpu,      code, 					data
 * 클래스  :  Thread, Runnable.run(){}		Object
 * 
 * @author Anyware
 *
 */
public class TestThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String data = "hello";
		// Interface class
		Runnable code = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread() + " :: " + data);
			}
		};
		Thread cpu = new Thread(code);
		cpu.start();
		// 양보하기
		Thread.yield();
		// 잠깐 불러 세우기
		Thread.sleep(1000);
		System.out.println(Thread.currentThread() + " :: " + "Main method");
	}

}




