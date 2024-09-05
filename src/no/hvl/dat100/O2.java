package no.hvl.dat100;

import static java.lang.Integer.parseInt;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input1 = new Scanner(System.in);
		System.out.print("Hva er lønnen din? ");
		String inputs = input1.nextLine();
		
		double lonn = parseInt(inputs);
		
		if(lonn<=208050) {
			System.out.println("Du har for lav inntekt for å betale trinnskatt. Du har derfor ingen trinnskatt");
		}
		else if(lonn>=208051 && lonn<=292850){
			System.out.println("Du er på trinnskattnivå 1, som er 1.7%. Dette blir for deg: " + lonn*0.017 + " kroner");	
		}
		
		else if(lonn>208051 && lonn<=670000) {
			System.out.println("Du er på trinnskattnivå 2, som er 4%. Dette blir for deg: " + lonn*0.04 + " kroner");
		}
		
		else if(lonn>670000 && lonn<=937900) {
			System.out.println("Du er på trinnskattnivå 3, som er 13,6%. Dette blir for deg: " + lonn*0.136 + " kroner");
		}
		
		else if(lonn>937900 && lonn<=1350000) {
			System.out.println("Du er på trinnskattnivå 4, som er 16,6%. Dette blir for deg: " + lonn*0.166 + " kroner");
		}
		
		else{
			System.out.println("Du er på trinnskattnivå 5, som er 17,6%. Dette blir for deg: " + lonn*0.176 + " kroner");
		}
	
	}

}
