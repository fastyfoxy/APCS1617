// This program will test the methods of the U2Test class.

import java.util.Scanner;

public class U2Test
{
	public static void main(String[] args)
	{
		Averager a = new Averager();
		Averager b = new Averager(73, 8);

		Scanner in = new Scanner(System.in);
		System.out.print("Enter Integer #1:  ");
		int x1 = in.nextInt();
		System.out.print("Enter Integer #2:  ");
		int x2 = in.nextInt();
		System.out.print("Enter Integer #3:  ");
		int x3 = in.nextInt();
		System.out.print("Enter Integer #4:  ");
		int x4 = in.nextInt();

		a.addValue(x1);
		a.addValue(x2);
		a.addValue(x3);
		a.addValue(x4);
		b.addValue(x1);
		b.addValue(x2);
		b.addValue(x3);
		b.addValue(x4);

		double avg1 = a.average();
		double avg2 = b.average();
		System.out.println();
		System.out.printf("Default Constructor Average    = %-4.1f%n", avg1);
		System.out.printf("Parametric Constructor Average = %-4.1f%n", avg2);

	}
}