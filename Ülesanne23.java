package ISK20Harjutused;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ülesanne23 {

	public static void main(String[] args) {
		
		int arv1 = 0;
		int arv2 = 0;
		int arv3 = 0;
		while (arv1 < 1) {
		
			int randomNum = ThreadLocalRandom.current().nextInt(0, 99 + 1 );
			int randomNum2 = ThreadLocalRandom.current().nextInt(0, 99 + 1 );
			
			System.out.println("Arvuti veeretas: "+randomNum);
			System.out.println("Mängija veeretas: "+randomNum2);
			
			if (randomNum > randomNum2) {
				System.out.println("Arvuti võitis");
				arv2++;
				System.out.println("Arvuti on võitnud: "+arv2+" korda");
			} else if (randomNum < randomNum2) {
				System.out.println("Mängija võitis");
				arv3++;
				System.out.println("Mängija on võitnud: "+arv3+" korda");
			} else {
				System.out.println("Arvuti ja mängija jäid viiki");
			}
			
			Scanner scan = new Scanner (System.in);
			System.out.println("Mängu lõpetamiseks sisestage number 1 jätkamiseks sisestage number 0");
			arv1 = scan.nextInt();
		}
	}


}
