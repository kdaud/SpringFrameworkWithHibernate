

public class Except {
	
	public Except() {
	}
	
	public static void main(String[] args) {
		new Except().calculate();
	}
	
	public void calculate() {
		try {
			int y = 9 / 0;
		System.out.println(y);
			
		}
		catch (Exception e) {
			System.err.println("Error occured");
			
		}
		finally {
			System.out.println("Google Code-in Mentor-2019");
		}
		
	}
}
