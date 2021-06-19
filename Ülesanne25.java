package ISK20Harjutused;
import java.io.*;
import java.util.Scanner;

public class Ülesanne25 {

	public static void main(String[] args) {
		 File minuFail = new File("students.csv");
		 try {
		 Scanner in = new Scanner(minuFail);
		 String contents = in.nextLine();
		 while(in.hasNextLine()){
		 contents = contents+"\n"+in.nextLine();
		 }
		 System.out.println(contents);
		 } catch (FileNotFoundException e) {
		 e.printStackTrace();
		 }

	}

}
