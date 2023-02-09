package test.speedTest;

public class IfSpeed {

	public static void main(String[] args) {
		int result=0;
		long beforeTime,afterTime,secDiffTime;
		
		beforeTime = System.currentTimeMillis();
        

		for (int i = 0; i < 100000; i++) {
		    for (int j = 0; j < 20000; j++) {
		    	for (int k =0; k < 10; k++) {
			    	if(i>j)
			    		result = i;
			    	else
			    		result = j;
		    	}
		    }
		}
		System.out.println(result);
		
		afterTime = System.currentTimeMillis(); 
		secDiffTime = (afterTime - beforeTime);
		System.out.println("if time : "+secDiffTime);

	}

}
