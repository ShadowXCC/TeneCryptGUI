import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;

public class PPKeyCreator {
	PPKeyCreator(){	}
	public static String Activate() throws IOException{
		//Public
		
		int lineNumber = 6;
		String PublicFileName = ReturnFileName.Activate(lineNumber);
		PublicFileName = "Data\\" + PublicFileName;
		
		int lineNumber1 = 7;
		String PrivateFileName = ReturnFileName.Activate(lineNumber1);
		PrivateFileName = "Data\\" + PrivateFileName;
		
		String pubKey = "";
		int PubLength = 128;
		SecureRandom Generator = new SecureRandom();
		File PublicFile = new File(PublicFileName);
		if(!PublicFile.exists()){
			FileWriter fw = new FileWriter(PublicFile);
			PrintWriter output = new PrintWriter(fw);
			
			for(int a = 1; a <= PubLength; a++){
				int g = Generator.nextInt(62);
				if(g == 00){
					pubKey = pubKey + "A";
					output.print("A");
				}
				if(g == 1){
					pubKey = pubKey + "B";
					output.print("B");
				}
				if(g == 2){
					pubKey = pubKey + "C";
					output.print("C");
				}
				if(g == 3){
					pubKey = pubKey + "D";
					output.print("D");
				}
				if(g == 4){
					pubKey = pubKey + "E";
					output.print("E");
				}
				if(g == 5){
					pubKey = pubKey + "F";
					output.print("F");
				}
				if(g == 6){
					pubKey = pubKey + "G";
					output.print("G");
				}
				if(g == 7){
					pubKey = pubKey + "H";
					output.print("H");
				}
				if(g == 8){
					pubKey = pubKey + "I";
					output.print("I");
				}
				if(g == 9){
					pubKey = pubKey + "J";
					output.print("J");
				}
				if(g == 10){
					pubKey = pubKey + "K";
					output.print("K");
				}
				if(g == 11){
					pubKey = pubKey + "L";
					output.print("L");
				}
				if(g == 12){
					pubKey = pubKey + "M";
					output.print("M");
				}
				if(g == 13){
					pubKey = pubKey + "N";
					output.print("N");
				}
				if(g == 14){
					pubKey = pubKey + "O";
					output.print("O");
				}
				if(g == 15){
					pubKey = pubKey + "P";
					output.print("P");
				}
				if(g == 16){
					pubKey = pubKey + "Q";
					output.print("Q");
				}
				if(g == 17){
					pubKey = pubKey + "R";
					output.print("R");
				}
				if(g == 18){
					pubKey = pubKey + "S";
					output.print("S");
				}
				if(g == 19){
					pubKey = pubKey + "T";
					output.print("T");
				}
				if(g == 20){
					pubKey = pubKey + "U";
					output.print("U");
				}
				if(g == 21){
					pubKey = pubKey + "V";
					output.print("V");
				}
				if(g == 22){
					pubKey = pubKey + "W";
					output.print("W");
				}
				if(g == 23){
					pubKey = pubKey + "X";
					output.print("X");
				}
				if(g == 24){
					pubKey = pubKey + "Y";
					output.print("Y");
				}
				if(g == 25){
					pubKey = pubKey + "Z";
					output.print("Z");
				}
				if(g == 26){
					pubKey = pubKey + "a";
					output.print("a");
				}
				if(g == 27){
					pubKey = pubKey + "b";
					output.print("b");
				}
				if(g == 28){
					pubKey = pubKey + "c";
					output.print("c");
				}
				if(g == 29){
					pubKey = pubKey + "d";
					output.print("d");
				}
				if(g == 30){
					pubKey = pubKey + "e";
					output.print("e");
				}
				if(g == 31){
					pubKey = pubKey + "f";
					output.print("f");
				}
				if(g == 32){
					pubKey = pubKey + "g";
					output.print("g");
				}
				if(g == 33){
					pubKey = pubKey + "h";
					output.print("h");
				}
				if(g == 34){
					pubKey = pubKey + "i";
					output.print("i");
				}
				if(g == 35){
					pubKey = pubKey + "j";
					output.print("j");
				}
				if(g == 36){
					pubKey = pubKey + "k";
					output.print("k");
				}
				if(g == 37){
					pubKey = pubKey + "l";
					output.print("l");
				}
				if(g == 38){
					pubKey = pubKey + "m";
					output.print("m");
				}
				if(g == 39){
					pubKey = pubKey + "n";
					output.print("n");
				}
				if(g == 40){
					pubKey = pubKey + "o";
					output.print("o");
				}
				if(g == 41){
					pubKey = pubKey + "p";
					output.print("p");
				}
				if(g == 42){
					pubKey = pubKey + "q";
					output.print("q");
				}
				if(g == 43){
					pubKey = pubKey + "r";
					output.print("r");
				}
				if(g == 44){
					pubKey = pubKey + "s";
					output.print("s");
				}
				if(g == 45){
					pubKey = pubKey + "t";
					output.print("t");
				}
				if(g == 46){
					pubKey = pubKey + "u";
					output.print("u");
				}
				if(g == 47){
					pubKey = pubKey + "v";
					output.print("v");
				}
				if(g == 48){
					pubKey = pubKey + "w";
					output.print("w");
				}
				if(g == 49){
					pubKey = pubKey + "x";
					output.print("x");
				}
				if(g == 50){
					pubKey = pubKey + "y";
					output.print("y");
				}
				if(g == 51){
					pubKey = pubKey + "z";
					output.print("z");
				}
				if(g == 52){
					pubKey = pubKey + "1";
					output.print("1");
				}
				if(g == 53){
					pubKey = pubKey + "2";
					output.print("2");
				}
				if(g == 54){
					pubKey = pubKey + "3";
					output.print("3");
				}
				if(g == 55){
					pubKey = pubKey + "4";
					output.print("4");
				}
				if(g == 56){
					pubKey = pubKey + "5";
					output.print("5");
				}
				if(g == 57){
					pubKey = pubKey + "6";
					output.print("6");
				}
				if(g == 58){
					pubKey = pubKey + "7";
					output.print("7");
				}
				if(g == 59){
					pubKey = pubKey + "8";
					output.print("8");
				}
				if(g == 60){
					pubKey = pubKey + "9";
					output.print("9");
				}
				if(g == 61){
					pubKey = pubKey + "0";
					output.print("0");
				}
			}
			output.close();
		}
		
		//Private
		int PriLength = 256;
		SecureRandom Generator1 = new SecureRandom();
		File PrivateFile = new File(PublicFileName);
		if(!PrivateFile.exists()){
			FileWriter fw = new FileWriter(PrivateFileName);
			PrintWriter output = new PrintWriter(fw);
			for(int b = 1; b <= PriLength; b++){
				int g = Generator1.nextInt(62);
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
			output.close();
		}
		return pubKey;
	}
}