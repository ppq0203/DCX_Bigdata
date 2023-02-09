package test.speedTest;

public class WhileSpeed {
	
	public static void main(String[] args) {
		int result=0;
		long beforeTime,afterTime,secDiffTime;
		
		beforeTime = System.currentTimeMillis();
        
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < 100000) {
		    j=0;
		    while (j < 100000) {
		    	k=0;
		    	while(k < 10)
		    	{
		    		k++;
		    	}
		    	j++;
		    }
		    i++;
		}
		System.out.println(result);
		
		afterTime = System.currentTimeMillis(); 
		secDiffTime = (afterTime - beforeTime);
		System.out.println("while time : "+secDiffTime);

	}
	
}
