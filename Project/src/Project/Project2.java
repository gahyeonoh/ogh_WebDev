package Project;


public class Project2 {
	
	public static void main(String[] args) {
		clacSum(4000000);
	}
	
	public static void clacSum(int limtNum) {
		int a = 1;
		int b = 1;
		int prvNum = 0;
		int sum = 0 ;
		
		do {
			
			prvNum = a + b; 
			
			if(prvNum%2 == 0){ //¦�����ϱ�
				sum += prvNum;
			}
			
	        a = b; 
	        b = prvNum ; 
	        
	        if(prvNum >= limtNum){
	        	System.out.println("���� : " + sum);
	        }
	        
		} while(b<=limtNum);
	}
}
