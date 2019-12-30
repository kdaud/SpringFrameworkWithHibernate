

public class Error {
	
	public Error() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) throws Exception {
		new Error().show();
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
	
}
