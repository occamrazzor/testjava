package occam.java;

public class MainJava {

	public static void main(String[] args) {
		
		int result = 0;
		int a []  = {2, 5, 4, 8, 7};
		
		for (int i = 0; i < a.length; i++) {
			result += a[i];
			
			if (a[i] == 7){
				System.out.println(a[i]);
				break;
				
			}
		
		}
		System.out.println("The result of the sum of values in the array is: " + result);
		
		
	}

}
