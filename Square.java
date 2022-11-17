
import java.io.*;

class Square {

	
	static float squareRoot(int number, int precision)
	{
		int start = 0, end = number;
		int mid;

	
		double ans = 0.0;

		
		while (start <= end) {
			mid = (start + end) / 2;

			if (mid * mid == number) {
				ans = mid;
				break;
			}

		
			if (mid * mid < number) {
				start = mid + 1;
				ans = mid;
			}

			
			else {
				end = mid - 1;
			}
		}

		
		double increment = 0.1;
		for (int i = 0; i < precision; i++) {
			while (ans * ans <= number) {
				ans += increment;
			}

			ans = ans - increment;
			increment = increment / 10;
		}
		return (float)ans;
	}

	
	public static void main(String[] args)
	{
		
		System.out.println(squareRoot(70, 3));

	}
}


