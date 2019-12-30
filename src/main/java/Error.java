import java.math.BigDecimal;
import java.math.RoundingMode;

public class Error {
	
	public Error() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception {
		new Error().show();
		new Error().myVoid();
	}
	
	public void show() throws Exception {
		int j = 9;
		int f = 12;
		try {
			int k = j / f;
			if (k == 0) {
				throw new DaudException("This is not possible");
			}
		}
		catch (ArithmeticException e) {
			System.err.println("Error");
		}
		catch (DaudException e) {
			System.err.println("Some error " + e.getMessage());
		}
		
	}
	public void myVoid() {
		BigDecimal bf= BigDecimal.valueOf(1);
		BigDecimal vf = BigDecimal.valueOf(3);
		try {
			System.out.println(bf.divide(vf, 4, RoundingMode.UP));
		}
		catch (Exception e) {
			System.out.println("Error " + e);
		}
		
		}
	
}
