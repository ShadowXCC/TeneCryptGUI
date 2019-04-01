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
			output1.close();
		}
		return pubKey;
	}
}