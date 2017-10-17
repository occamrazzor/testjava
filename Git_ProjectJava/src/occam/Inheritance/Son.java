package occam.Inheritance;



public class Son extends Grandfather {

	public static void main(String[] args) {
		
		Son s = new Son();
		s.city();
		s.country();
		System.out.println(s.i);
	}
	
	public void sonActivites(){
		
		System.out.println("Son Activites from son's class");
	}
		
	
}
