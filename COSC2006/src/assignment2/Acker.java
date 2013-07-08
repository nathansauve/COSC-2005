package assignment2;

public class Acker {
	public static void main(String[] args) {
		int m = 2, n = 1;
		System.out.println("Acker of m = " + m + " and n = " + n + " = " + Ackerman(m, n));
	}
	
	public static int Ackerman(int m, int n) {
		System.out.println("Enter Ackerman. m[" + m + "], n[" + n + "]");
		if (m == 0) {
			int ans = n + 1;
			System.out.println("Return: " + ans);
			return ans;
		}
		if (n == 0) {
			int ans = Ackerman(m - 1, 1);
			//return Ackerman(m - 1, 1);
			System.out.println("Return: " + ans);
			return ans;
		}
		int ans = Ackerman(m - 1, Ackerman(m, n - 1));
		System.out.println("Leave Ackerman. m[" + m + "], n[" + n + "] value: " + ans); 
		return ans;
		
	}
}
