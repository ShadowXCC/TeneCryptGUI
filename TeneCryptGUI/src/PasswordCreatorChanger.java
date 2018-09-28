import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordCreatorChanger{
	PasswordCreatorChanger(){	}
	
	public static String Activate() throws IOException{
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		
		String PassFilePath = null;
		int WantedLineCount = 3;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			PassFilePath = FileGuts.nextLine() + ".shde";
		}
		PassFilePath = "Data\\" + PassFilePath;
		
		File PassFile = new File(PassFilePath);
		FileWriter fw = new FileWriter(PassFile);
		SecureRandom PassGenerator = new SecureRandom();
		PrintWriter output = new PrintWriter(fw);
		System.out.println("Your new randomized password for this program is:");
		int length = 20;
		for(int a = 0;a < length; a++){
			int g = PassGenerator.nextInt(62);
			if(g == 00){
				System.out.print("A");
				output.print("A");
			}
			if(g == 1){
				System.out.print("B");
				output.print("B");
			}
			if(g == 2){
				System.out.print("C");
				output.print("C");
			}
			if(g == 3){
				System.out.print("D");
				output.print("D");
			}
			if(g == 4){
				System.out.print("E");
				output.print("E");
			}
			if(g == 5){
				System.out.print("F");
				output.print("F");
			}
			if(g == 6){
				System.out.print("G");
				output.print("G");
			}
			if(g == 7){
				System.out.print("H");
				output.print("H");
			}
			if(g == 8){
				System.out.print("I");
				output.print("I");
			}
			if(g == 9){
				System.out.print("J");
				output.print("J");
			}
			if(g == 10){
				System.out.print("K");
				output.print("K");
			}
			if(g == 11){
				System.out.print("L");
				output.print("L");
			}
			if(g == 12){
				System.out.print("M");
				output.print("M");
			}
			if(g == 13){
				System.out.print("N");
				output.print("N");
			}
			if(g == 14){
				System.out.print("O");
				output.print("O");
			}
			if(g == 15){
				System.out.print("P");
				output.print("P");
			}
			if(g == 16){
				System.out.print("Q");
				output.print("Q");
			}
			if(g == 17){
				System.out.print("R");
				output.print("R");
			}
			if(g == 18){
				System.out.print("S");
				output.print("S");
			}
			if(g == 19){
				System.out.print("T");
				output.print("T");
			}
			if(g == 20){
				System.out.print("U");
				output.print("U");
			}
			if(g == 21){
				System.out.print("V");
				output.print("V");
			}
			if(g == 22){
				System.out.print("W");
				output.print("W");
			}
			if(g == 23){
				System.out.print("X");
				output.print("X");
			}
			if(g == 24){
				System.out.print("Y");
				output.print("Y");
			}
			if(g == 25){
				System.out.print("Z");
				output.print("Z");
			}
			if(g == 26){
				System.out.print("a");
				output.print("a");
			}
			if(g == 27){
				System.out.print("b");
				output.print("b");
			}
			if(g == 28){
				System.out.print("c");
				output.print("c");
			}
			if(g == 29){
				System.out.print("d");
				output.print("d");
			}
			if(g == 30){
				System.out.print("e");
				output.print("e");
			}
			if(g == 31){
				System.out.print("f");
				output.print("f");
			}
			if(g == 32){
				System.out.print("g");
				output.print("g");
			}
			if(g == 33){
				System.out.print("h");
				output.print("h");
			}
			if(g == 34){
				System.out.print("i");
				output.print("i");
			}
			if(g == 35){
				System.out.print("j");
				output.print("j");
			}
			if(g == 36){
				System.out.print("k");
				output.print("k");
			}
			if(g == 37){
				System.out.print("l");
				output.print("l");
			}
			if(g == 38){
				System.out.print("m");
				output.print("m");
			}
			if(g == 39){
				System.out.print("n");
				output.print("n");
			}
			if(g == 40){
				System.out.print("o");
				output.print("o");
			}
			if(g == 41){
				System.out.print("p");
				output.print("p");
			}
			if(g == 42){
				System.out.print("q");
				output.print("q");
			}
			if(g == 43){
				System.out.print("r");
				output.print("r");
			}
			if(g == 44){
				System.out.print("s");
				output.print("s");
			}
			if(g == 45){
				System.out.print("t");
				output.print("t");
			}
			if(g == 46){
				System.out.print("u");
				output.print("u");
			}
			if(g == 47){
				System.out.print("v");
				output.print("v");
			}
			if(g == 48){
				System.out.print("w");
				output.print("w");
			}
			if(g == 49){
				System.out.print("x");
				output.print("x");
			}
			if(g == 50){
				System.out.print("y");
				output.print("y");
			}
			if(g == 51){
				System.out.print("z");
				output.print("z");
			}
			if(g == 52){
				System.out.print("1");
				output.print("1");
			}
			if(g == 53){
				System.out.print("2");
				output.print("2");
			}
			if(g == 54){
				System.out.print("3");
				output.print("3");
			}
			if(g == 55){
				System.out.print("4");
				output.print("4");
			}
			if(g == 56){
				System.out.print("5");
				output.print("5");
			}
			if(g == 57){
				System.out.print("6");
				output.print("6");
			}
			if(g == 58){
				System.out.print("7");
				output.print("7");
			}
			if(g == 59){
				System.out.print("8");
				output.print("8");
			}
			if(g == 60){
				System.out.print("9");
				output.print("9");
			}
			if(g == 61){
				System.out.print("0");
				output.print("0");
			}
		}
		output.close();
		FileGuts.close();
		String Activator = "";
		return Activator;
	}
}