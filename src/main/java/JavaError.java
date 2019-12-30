

public class JavaError {
	public void something() {
		
		int[] marks = { 10, 20, 30, 40, 50, 60, 70, 80 };
		for(int ss: marks) {
			System.out.print(ss + " ");
		}
		System.out.println("\n-----------------------");
		for (int i = marks.length - 1; i >= 0; i--) {
			System.out.print(marks[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		JavaError obj = new JavaError();
		obj.something();
	}
	
	
}
