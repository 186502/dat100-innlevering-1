package no.hvl.dat100;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Vennligst tast inn et positivt heltall(n) som beregner n! ");
		String inputs = input.nextLine();
		
		int n = parseInt(inputs);
		int f = 1;
		if(n>0) {
			
			for (int i = 1; i <= n; i++) {
				f = f*i;
				}
		
				System.out.println(n + " != " + f);
			}
		
			else {
				System.out.println("Dette er et negativt tall, så vi kan ikke regne fakulteten!");
			}
	}

}
