package test.speedTest;

public class Test {

	public static void main(String[] args) {
		int result=0;
		long beforeTime,afterTime,secDiffTime;
		
		beforeTime = System.currentTimeMillis();
        

		for (int i = 0; i < 1000000; i++) {
		    for (int j = 0; j < 200000; j++) {
		    	if(i>j)
		    		result = i;
		    	else
		    		result = j;
		    }
		}
		System.out.println(result);
		
		afterTime = System.currentTimeMillis(); 
		secDiffTime = (afterTime - beforeTime);
		System.out.println("if 시간차이 : "+secDiffTime);
		
		beforeTime = System.currentTimeMillis();
        

		for (int i = 0; i < 1000000; i++) {
		    for (int j = 0; j < 100000; j++) {
		    	result = (i>j)?i:j ;
		    }
		}
		System.out.println(result);
		    
		afterTime = System.currentTimeMillis(); 
		secDiffTime = (afterTime - beforeTime);
		System.out.println("3항 시간차이 : "+secDiffTime);
		
	}

}
