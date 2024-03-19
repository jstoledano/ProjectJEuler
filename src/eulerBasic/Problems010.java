package eulerBasic;

public class Problems010 {
	public void HelloWorld() {
		int x = 1;
		System.out.println("¡Hola Mundo!");
		System.out.println("Before the loop");
		while (x < 4) {
			System.out.println("In the loop");
			System.out.println("Value of x is " +x);
			x = x + 1;
		}
		System.out.println("This is after the loop");
	}
	
	public Integer MultiplesOf3or5(int limit) {
		/* Multiples of 3 or 5
		 * Problem 001
		 * 
		 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
		 * we get 3, 5, 6, and 9. The sum of these multiples is 23.
		 * 
		 * Find the sum of all the multiples of 3 or 5 below 1000.
		 * 
		 */
		
		Integer suma = 0;
		
		for (int i=0; i<limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) suma += i;
		}
		
		return suma;
	}
}
 