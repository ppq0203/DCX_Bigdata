package test.thread;

public class TestCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Count data = new Count();
		Code code1 = new Code(data);
		Code code2 = new Code(data);
		Code code3 = new Code(data);
		Thread cpu1 = new Thread(code1);
		Thread cpu2 = new Thread(code2);
		Thread cpu3 = new Thread(code3);
		cpu1.start();
		cpu2.start();
		cpu3.start();
		cpu1.join(100);		//채권-채무관계 join한것이 종료할때까지 현재Thread 실행불가
		cpu2.join(100);
		cpu3.join(100);
		System.out.println(Thread.currentThread() + "::" + data.count);
	}

}

class Count
{
	int count=0;
	synchronized void inc()
	{
		count++;
	}
}

class Code implements Runnable
{
	Count data;

	public Code(Count data) {
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100000000; i++) {
			data.inc();
		}
		System.out.println(Thread.currentThread() + "::" + data.count);
	}
	
}