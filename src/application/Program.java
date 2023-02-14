package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("Name: ");
		st.name = sc.nextLine();
		System.out.print("Note 1: ");
		st.n1 = sc.nextDouble();
		System.out.print("Note 2: ");
		st.n2 = sc.nextDouble();
		System.out.print("Note 3: ");
		st.n3 = sc.nextDouble();
		System.out.printf("\nFinal grade: %.2f%n", st.media());
		
		if(st.media() < 60) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", st.missingPoints());
		}
		else {
			System.out.println("PASS");
		}
		sc.close();
	}

}
