package ISK20Harjutused;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class �lesanne23 {

	public static void main(String[] args) {
		
		int arv1 = 0;
		int arv2 = 0;
		int arv3 = 0;
		while (arv1 < 1) {
		
			int randomNum = ThreadLocalRandom.current().nextInt(0, 99 + 1 );
			int randomNum2 = ThreadLocalRandom.current().nextInt(0, 99 + 1 );
			
			System.out.println("Arvuti veeretas: "+randomNum);
			System.out.println("M�ngija veeretas: "+randomNum2);
			
			if (randomNum > randomNum2) {
				System.out.println("Arvuti v�itis");
				arv2++;
				System.out.println("Arvuti on v�itnud: "+arv2+" korda");
			} else if (randomNum < randomNum2) {
				System.out.println("M�ngija v�itis");
				arv3++;
				System.out.println("M�ngija on v�itnud: "+arv3+" korda");
			} else {
				System.out.println("Arvuti ja m�ngija j�id viiki");
			}
			
			Scanner scan = new Scanner (System.in);
			System.out.println("M�ngu l�petamiseks sisestage number 1 j�tkamiseks sisestage number 0");
			arv1 = scan.nextInt();
		}
	}


}
