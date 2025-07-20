
public class FirstClass {
	
	public static void main(String argsp[]) {
		// Printing text
		System.out.println("Test123");
		int a;
		int b;
		int c;
		a = 10;
		b = 20;
		c = a + b;
		System.out.println("The value of c is: " + c);
		System.out.println("The value of a is: " + a);
		System.out.println("The value of b is: " + b);
		System.out.println("The sum of a and b is: " + (a + b));
		System.out.println("The sum of a and b is: " + c);
		System.out.println("The sum of a and b is: " + (a + b));
		System.out.println("The sum of a and b is: " + (a + b));
		int d;
		byte e= 5;
		short f= 10;
		long g= 15;
		double i= 25.5;
		char j= 'A';
		boolean k= true;
		d = 230000;
		e=(byte) d;
		float h= 20.5f;
		d = (int) h;
		d+=10;
		d++;
		++d;
		System.out.println("The value of d is: " + d);
		boolean l = a > b;
		boolean m = (a < b) || (a == b);
		System.out.println("The value of l is: " + l);
		System.out.println("The value of m is: " + m);
		System.out.println("The value of e is: " + e);
		System.out.println("The value of f is: " + f);
		System.out.println("The value of g is: " + g);
		System.out.println("The value of h is: " + h);
		System.out.println("The value of i is: " + i);
		System.out.println("The value of j is: " + j);
		System.out.println("The value of k is: " + k);
		boolean n = a == b;
		boolean o = a != b;
		System.out.println("Is a greater than b? " + l);
		System.out.println("Is a less than b? " + m);
		System.out.println("Is a equal to b? " + n);
		System.out.println("Is a not equal to b? " + !o);
		if (a > b) {
			System.out.println("a is greater than b");
		} else if (a < b) {
			System.out.println("a is less than b");
		} else {
			System.out.println("a is equal to b");
		}
		int d1 = 10;
		int d2 = 20;
		int d3 = d1< d2 ? d1 : d2;
		System.out.println("Text " + d3);
		switch (d1) {
			case 10:
				System.out.println("d1 is 10");
				break;
			case 20:
				System.out.println("d1 is 20");
				break;
			default:
				System.out.println("d1 is neither 10 nor 20");
				break;
		}
		int x = 0;
		for (; x < 5;) {
			System.out.println("Value of x: " + x);
			 x++;
		}
		int y = 0;
		while (y < 5) {
			System.out.println("Value of y: " + y);
			y++;
		}
		do {
			System.out.println("Value of y in do-while: " + y);
			y++;
		} while (y < 10);


		int num[] = {1, 2, 3, 4, 5};
		System.out.println("Array elements are:");
		for (int c1 = 0; c1 < num.length; c1++) {
			System.out.println(num[c1]);
		}

		int num3[] = new int[5];
		for (int c1 = 0; c1 < num3.length; c1++) {
			num3[c1] = c1 + 1;
		}
		System.out.println("Array elements are:");
		for (int c1 = 0; c1 < num3.length; c1++) {
			System.out.println(num3[c1]);
		}
	}
}