package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			Scanner input1 = new Scanner(System.in);
			System.out.print("Hva er poengsummen du vil konvertere til karakter(A til F)? ");
			String input1s = input1.nextLine();
			
			int input = parseInt(input1s);
			
				//Først lager vi alle casene for karakterer. Vi passer på å legge et tak og en bunn
			if ((input>=90) && (input<=100)){
				System.out.println("Gratulerer! Du har fått A!");
			}
			
			else if(input>=80 && input<90){
				System.out.println("Du har fått B");
			}
			
			else if(input>=60 && input<80) {
				System.out.println("Du har fått C");
			}
				
			else if(input>=50 && input<60) {
				System.out.println("Du har fått D");
			}
			else if(input>=40 && input<50){
				System.out.println("Du har fått E");
			}
			
			else if(input>=0 && input<40) {
				System.out.println("Dessverre har du fått F");
			}
				
			//Deretter kan vi sette inn en else som er utenfor karakterpoeng. Vi får også programmet til å kjøre en ekstra gang ved å legge på 1 på i. 
			else {
				i = i-1;
				System.out.println("Du har tastet inn et tall som ikke er en mulig poengsum!");
			}
			
			}
	}

}
