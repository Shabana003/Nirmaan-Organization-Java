package Day6;

public class looptask {
	public static void main(String[] args) {
		for(int i=50;i>=1;i--) {
			System.out.println(i);
		}
		int sum=0;
		for(int i=1;i<=100;i++){
		 if(i%2==0) {
			 continue;
		 }
		 else {
			 sum=sum+i;
			 }
		 
	}
     System.out.println(sum);
     
     
     int n=0;
     for(int j=1;j<=30;j++) {
     if(j%3==0) {
    	System.out.println(j);
    	n=n+j;
     }
     }
     System.out.println(n);
     }
	
}
     