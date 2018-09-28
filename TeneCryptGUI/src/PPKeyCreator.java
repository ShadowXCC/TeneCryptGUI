import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Scanner;

public class PPKeyCreator {
	PPKeyCreator(){	}
	public static String Activate() throws IOException{
		//Public
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		Scanner FileGuts2 = new Scanner(FF);
		
		String PublicFileName = "";
		String PrivateFileName = "";
		int WantedLineCount = 6;
		int WantedLineCount1 = 7;
		for(int LineCount = 0;!(WantedLineCount == LineCount);LineCount++){
			PublicFileName = FileGuts.nextLine() + ".shde";
		}
		PublicFileName = "Data\\" + PublicFileName;
		for(int LineCount1 = 0;!(WantedLineCount1 == LineCount1);LineCount1++){
			PrivateFileName = FileGuts2.nextLine() + ".shde";
		}
		PrivateFileName = "Data\\" + PrivateFileName;
		
		int PubLength = 128;
		SecureRandom Generator = new SecureRandom();
		File PublicFile = new File(PublicFileName);
		FileWriter fw = new FileWriter(PublicFile);
		PrintWriter output = new PrintWriter(fw);
		
		for(int a = 1; a <= PubLength; a++){
			int g = Generator.nextInt(62);
			if(g == 00){
				output.print("A");
			}
			if(g == 1){
				output.print("B");
			}
			if(g == 2){
				output.print("C");
			}
			if(g == 3){
				output.print("D");
			}
			if(g == 4){
				output.print("E");
			}
			if(g == 5){
				output.print("F");
			}
			if(g == 6){
				output.print("G");
			}
			if(g == 7){
				output.print("H");
			}
			if(g == 8){
				output.print("I");
			}
			if(g == 9){
				output.print("J");
			}
			if(g == 10){
				output.print("K");
			}
			if(g == 11){
				output.print("L");
			}
			if(g == 12){
				output.print("M");
			}
			if(g == 13){
				output.print("N");
			}
			if(g == 14){
				output.print("O");
			}
			if(g == 15){
				output.print("P");
			}
			if(g == 16){
				output.print("Q");
			}
			if(g == 17){
				output.print("R");
			}
			if(g == 18){
				output.print("S");
			}
			if(g == 19){
				output.print("T");
			}
			if(g == 20){
				output.print("U");
			}
			if(g == 21){
				output.print("V");
			}
			if(g == 22){
				output.print("W");
			}
			if(g == 23){
				output.print("X");
			}
			if(g == 24){
				output.print("Y");
			}
			if(g == 25){
				output.print("Z");
			}
			if(g == 26){
				output.print("a");
			}
			if(g == 27){
				output.print("b");
			}
			if(g == 28){
				output.print("c");
			}
			if(g == 29){
				output.print("d");
			}
			if(g == 30){
				output.print("e");
			}
			if(g == 31){
				output.print("f");
			}
			if(g == 32){
				output.print("g");
			}
			if(g == 33){
				output.print("h");
			}
			if(g == 34){
				output.print("i");
			}
			if(g == 35){
				output.print("j");
			}
			if(g == 36){
				output.print("k");
			}
			if(g == 37){
				output.print("l");
			}
			if(g == 38){
				output.print("m");
			}
			if(g == 39){
				output.print("n");
			}
			if(g == 40){
				output.print("o");
			}
			if(g == 41){
				output.print("p");
			}
			if(g == 42){
				output.print("q");
			}
			if(g == 43){
				output.print("r");
			}
			if(g == 44){
				output.print("s");
			}
			if(g == 45){
				output.print("t");
			}
			if(g == 46){
				output.print("u");
			}
			if(g == 47){
				output.print("v");
			}
			if(g == 48){
				output.print("w");
			}
			if(g == 49){
				output.print("x");
			}
			if(g == 50){
				output.print("y");
			}
			if(g == 51){
				output.print("z");
			}
			if(g == 52){
				output.print("1");
			}
			if(g == 53){
				output.print("2");
			}
			if(g == 54){
				output.print("3");
			}
			if(g == 55){
				output.print("4");
			}
			if(g == 56){
				output.print("5");
			}
			if(g == 57){
				output.print("6");
			}
			if(g == 58){
				output.print("7");
			}
			if(g == 59){
				output.print("8");
			}
			if(g == 60){
				output.print("9");
			}
			if(g == 61){
				output.print("0");
			}
		}
		
		//Private
		int PriLength = 256;
		SecureRandom Generator1 = new SecureRandom();
		FileWriter fw1 = new FileWriter(PrivateFileName);
		PrintWriter output1 = new PrintWriter(fw1);
		for(int b = 1; b <= PriLength; b++){
			int g = Generator1.nextInt(62);
			if(g == 00){
				output1.print("A");
			}
			if(g == 1){
				output1.print("B");
			}
			if(g == 2){
				output1.print("C");
			}
			if(g == 3){
				output1.print("D");
			}
			if(g == 4){
				output1.print("E");
			}
			if(g == 5){
				output1.print("F");
			}
			if(g == 6){
				output1.print("G");
			}
			if(g == 7){
				output1.print("H");
			}
			if(g == 8){
				output1.print("I");
			}
			if(g == 9){
				output1.print("J");
			}
			if(g == 10){
				output1.print("K");
			}
			if(g == 11){
				output1.print("L");
			}
			if(g == 12){
				output1.print("M");
			}
			if(g == 13){
				output1.print("N");
			}
			if(g == 14){
				output1.print("O");
			}
			if(g == 15){
				output1.print("P");
			}
			if(g == 16){
				output1.print("Q");
			}
			if(g == 17){
				output1.print("R");
			}
			if(g == 18){
				output1.print("S");
			}
			if(g == 19){
				output1.print("T");
			}
			if(g == 20){
				output1.print("U");
			}
			if(g == 21){
				output1.print("V");
			}
			if(g == 22){
				output1.print("W");
			}
			if(g == 23){
				output1.print("X");
			}
			if(g == 24){
				output1.print("Y");
			}
			if(g == 25){
				output1.print("Z");
			}
			if(g == 26){
				output1.print("a");
			}
			if(g == 27){
				output1.print("b");
			}
			if(g == 28){
				output1.print("c");
			}
			if(g == 29){
				output1.print("d");
			}
			if(g == 30){
				output1.print("e");
			}
			if(g == 31){
				output1.print("f");
			}
			if(g == 32){
				output1.print("g");
			}
			if(g == 33){
				output1.print("h");
			}
			if(g == 34){
				output1.print("i");
			}
			if(g == 35){
				output1.print("j");
			}
			if(g == 36){
				output1.print("k");
			}
			if(g == 37){
				output1.print("l");
			}
			if(g == 38){
				output1.print("m");
			}
			if(g == 39){
				output1.print("n");
			}
			if(g == 40){
				output1.print("o");
			}
			if(g == 41){
				output1.print("p");
			}
			if(g == 42){
				output1.print("q");
			}
			if(g == 43){
				output1.print("r");
			}
			if(g == 44){
				output1.print("s");
			}
			if(g == 45){
				output1.print("t");
			}
			if(g == 46){
				output1.print("u");
			}
			if(g == 47){
				output1.print("v");
			}
			if(g == 48){
				output1.print("w");
			}
			if(g == 49){
				output1.print("x");
			}
			if(g == 50){
				output1.print("y");
			}
			if(g == 51){
				output1.print("z");
			}
			if(g == 52){
				output1.print("1");
			}
			if(g == 53){
				output1.print("2");
			}
			if(g == 54){
				output1.print("3");
			}
			if(g == 55){
				output1.print("4");
			}
			if(g == 56){
				output1.print("5");
			}
			if(g == 57){
				output1.print("6");
			}
			if(g == 58){
				output1.print("7");
			}
			if(g == 59){
				output1.print("8");
			}
			if(g == 60){
				output1.print("9");
			}
			if(g == 61){
				output1.print("0");
			}
		}
		output.close();
		output1.close();
		FileGuts.close();
		FileGuts2.close();
		String Activator = "";
		return Activator;
	}
}