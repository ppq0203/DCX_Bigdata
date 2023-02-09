package test.speedTest;

public class ForSpeed {

	public static void main(String[] args) {
		int result=0;
		long beforeTime,afterTime,secDiffTime;
		
		beforeTime = System.currentTimeMillis();
        

		for (int i = 0; i < 100000; i++)
		    for (int j = 0; j < 100000; j++)
		    	for (int k =0; k < 10; k++) {}
		    		
		System.out.println(result);
		
		afterTime = System.currentTimeMillis(); 
		secDiffTime = (afterTime - beforeTime);
		System.out.println("for time : "+secDiffTime);

	}

}
