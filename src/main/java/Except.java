import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Except {
	
	public Except() {
	}
	
	public static void main(String[] args) throws IOException {
		new Except().myName();
	}
	
	public void calculate() {
		
		try {
			
			int[] aa = null;
			aa[7] = 9;
			
			int y = 9 / 0;
			System.out.println(y);
			

		System.out.println("Array at index 5 is " + aa[4]);
		
			
		}
		catch (ArithmeticException e) {
			System.err.println("Do not divide by zero");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Stay in your limit");
		}
		catch (Exception e) {
			System.err.println("Something is wrong");
		}
		
		finally {
			System.out.println("Google Code-in Mentor-2019");
		}
		
	}
	
	public void myName() throws IOException {
		int j =0;
		BufferedReader br = null;
		try {
			System.out.println("Enter you age");
			br = new BufferedReader(new InputStreamReader(System.in));
			j = Integer.parseInt(br.readLine());

		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			br.close();
		}
		System.out.println(j);
		

	}
}
