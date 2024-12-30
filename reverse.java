package Day7;

public class reverse {
	public static void main(String[] args) {
		String name="shabana";
		String rs="";
		for(int i=6;i>=0;i--) {
			rs+=name.charAt(i);
		}
		System.out.println(rs);
		System.out.println(rs.toUpperCase());
		
		byte b=127;
		int i=b;
		System.out.println(i);
		
		int j=129;
		byte y=(byte) j;
		System.out.println(y);
		
		String fruits[]= {"Apple","Cherry","Orange"};
		for(int k=0;k<fruits.length;k++) {
			System.out.println(fruits[k]);
		}
		
	}
	
}
