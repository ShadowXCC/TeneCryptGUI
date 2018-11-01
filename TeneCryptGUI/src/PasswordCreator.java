import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordCreator {
	PasswordCreator(){	}
	public static String Activate() throws IOException{
		String finalPassword = "";
		
		String FP = "Data\\\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		
		String PassFilePath = null;
		int WantedLineCount = 3;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			PassFilePath = FileGuts.nextLine() + ".shde";
		}
		PassFilePath = "Data\\" + PassFilePath;
		File PassFile = new File(PassFilePath);
		if(!PassFile.exists()){
			FileWriter fw = new FileWriter(PassFile);
			SecureRandom PassGenerator = new SecureRandom();
			PrintWriter output = new PrintWriter(fw);
			int length = 20;
			for(int a = 0;a < length; a++){
				int g = PassGenerator.nextInt(62);
				if(g == 00){
					finalPassword = finalPassword + "A";
					output.print("A");
				}
				if(g == 1){
					finalPassword = finalPassword + "B";
					output.print("B");
				}
				if(g == 2){
					finalPassword = finalPassword + "C";
					output.print("C");
				}
				if(g == 3){
					finalPassword = finalPassword + "D";
					output.print("D");
				}
				if(g == 4){
					finalPassword = finalPassword + "E";
					output.print("E");
				}
				if(g == 5){
					finalPassword = finalPassword + "F";
					output.print("F");
				}
				if(g == 6){
					finalPassword = finalPassword + "G";
					output.print("G");
				}
				if(g == 7){
					finalPassword = finalPassword + "H";
					output.print("H");
				}
				if(g == 8){
					finalPassword = finalPassword + "I";
					output.print("I");
				}
				if(g == 9){
					finalPassword = finalPassword + "J";
					output.print("J");
				}
				if(g == 10){
					finalPassword = finalPassword + "K";
					output.print("K");
				}
				if(g == 11){
					finalPassword = finalPassword + "L";
					output.print("L");
				}
				if(g == 12){
					finalPassword = finalPassword + "M";
					output.print("M");
				}
				if(g == 13){
					finalPassword = finalPassword + "N";
					output.print("N");
				}
				if(g == 14){
					finalPassword = finalPassword + "O";
					output.print("O");
				}
				if(g == 15){
					finalPassword = finalPassword + "P";
					output.print("P");
				}
				if(g == 16){
					finalPassword = finalPassword + "Q";
					output.print("Q");
				}
				if(g == 17){
					finalPassword = finalPassword + "R";
					output.print("R");
				}
				if(g == 18){
					finalPassword = finalPassword + "S";
					output.print("S");
				}
				if(g == 19){
					finalPassword = finalPassword + "T";
					output.print("T");
				}
				if(g == 20){
					finalPassword = finalPassword + "U";
					output.print("U");
				}
				if(g == 21){
					finalPassword = finalPassword + "V";
					output.print("V");
				}
				if(g == 22){
					finalPassword = finalPassword + "W";
					output.print("W");
				}
				if(g == 23){
					finalPassword = finalPassword + "X";
					output.print("X");
				}
				if(g == 24){
					finalPassword = finalPassword + "Y";
					output.print("Y");
				}
				if(g == 25){
					finalPassword = finalPassword + "Z";
					output.print("Z");
				}
				if(g == 26){
					finalPassword = finalPassword + "a";
					output.print("a");
				}
				if(g == 27){
					finalPassword = finalPassword + "b";
					output.print("b");
				}
				if(g == 28){
					finalPassword = finalPassword + "c";
					output.print("c");
				}
				if(g == 29){
					finalPassword = finalPassword + "d";
					output.print("d");
				}
				if(g == 30){
					finalPassword = finalPassword + "e";
					output.print("e");
				}
				if(g == 31){
					finalPassword = finalPassword + "f";
					output.print("f");
				}
				if(g == 32){
					finalPassword = finalPassword + "g";
					output.print("g");
				}
				if(g == 33){
					finalPassword = finalPassword + "h";
					output.print("h");
				}
				if(g == 34){
					finalPassword = finalPassword + "i";
					output.print("i");
				}
				if(g == 35){
					finalPassword = finalPassword + "j";
					output.print("j");
				}
				if(g == 36){
					finalPassword = finalPassword + "k";
					output.print("k");
				}
				if(g == 37){
					finalPassword = finalPassword + "l";
					output.print("l");
				}
				if(g == 38){
					finalPassword = finalPassword + "m";
					output.print("m");
				}
				if(g == 39){
					finalPassword = finalPassword + "n";
					output.print("n");
				}
				if(g == 40){
					finalPassword = finalPassword + "o";
					output.print("o");
				}
				if(g == 41){
					finalPassword = finalPassword + "p";
					output.print("p");
				}
				if(g == 42){
					finalPassword = finalPassword + "q";
					output.print("q");
				}
				if(g == 43){
					finalPassword = finalPassword + "r";
					output.print("r");
				}
				if(g == 44){
					finalPassword = finalPassword + "s";
					output.print("s");
				}
				if(g == 45){
					finalPassword = finalPassword + "t";
					output.print("t");
				}
				if(g == 46){
					finalPassword = finalPassword + "u";
					output.print("u");
				}
				if(g == 47){
					finalPassword = finalPassword + "v";
					output.print("v");
				}
				if(g == 48){
					finalPassword = finalPassword + "w";
					output.print("w");
				}
				if(g == 49){
					finalPassword = finalPassword + "x";
					output.print("x");
				}
				if(g == 50){
					finalPassword = finalPassword + "y";
					output.print("y");
				}
				if(g == 51){
					finalPassword = finalPassword + "z";
					output.print("z");
				}
				if(g == 52){
					finalPassword = finalPassword + "1";
					output.print("1");
				}
				if(g == 53){
					finalPassword = finalPassword + "2";
					output.print("2");
				}
				if(g == 54){
					finalPassword = finalPassword + "3";
					output.print("3");
				}
				if(g == 55){
					finalPassword = finalPassword + "4";
					output.print("4");
				}
				if(g == 56){
					finalPassword = finalPassword + "5";
					output.print("5");
				}
				if(g == 57){
					finalPassword = finalPassword + "6";
					output.print("6");
				}
				if(g == 58){
					finalPassword = finalPassword + "7";
					output.print("7");
				}
				if(g == 59){
					finalPassword = finalPassword + "8";
					output.print("8");
				}
				if(g == 60){
					finalPassword = finalPassword + "9";
					output.print("9");
				}
				if(g == 6){
					finalPassword = finalPassword + "0";
					output.print("0");
				}
			}
			output.close();
		}
		FileGuts.close();
		return finalPassword;
	}
}
