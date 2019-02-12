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
				}
				if(g == 1){
					finalPassword = finalPassword + "B";
				}
				if(g == 2){
					finalPassword = finalPassword + "C";
				}
				if(g == 3){
					finalPassword = finalPassword + "D";
				}
				if(g == 4){
					finalPassword = finalPassword + "E";
				}
				if(g == 5){
					finalPassword = finalPassword + "F";
				}
				if(g == 6){
					finalPassword = finalPassword + "G";
				}
				if(g == 7){
					finalPassword = finalPassword + "H";
				}
				if(g == 8){
					finalPassword = finalPassword + "I";
				}
				if(g == 9){
					finalPassword = finalPassword + "J";
				}
				if(g == 10){
					finalPassword = finalPassword + "K";
				}
				if(g == 11){
					finalPassword = finalPassword + "L";
				}
				if(g == 12){
					finalPassword = finalPassword + "M";
				}
				if(g == 13){
					finalPassword = finalPassword + "N";
				}
				if(g == 14){
					finalPassword = finalPassword + "O";
				}
				if(g == 15){
					finalPassword = finalPassword + "P";
				}
				if(g == 16){
					finalPassword = finalPassword + "Q";
				}
				if(g == 17){
					finalPassword = finalPassword + "R";
				}
				if(g == 18){
					finalPassword = finalPassword + "S";
				}
				if(g == 19){
					finalPassword = finalPassword + "T";
				}
				if(g == 20){
					finalPassword = finalPassword + "U";
				}
				if(g == 21){
					finalPassword = finalPassword + "V";
				}
				if(g == 22){
					finalPassword = finalPassword + "W";
				}
				if(g == 23){
					finalPassword = finalPassword + "X";
				}
				if(g == 24){
					finalPassword = finalPassword + "Y";
				}
				if(g == 25){
					finalPassword = finalPassword + "Z";
				}
				if(g == 26){
					finalPassword = finalPassword + "a";
				}
				if(g == 27){
					finalPassword = finalPassword + "b";
				}
				if(g == 28){
					finalPassword = finalPassword + "c";
				}
				if(g == 29){
					finalPassword = finalPassword + "d";
				}
				if(g == 30){
					finalPassword = finalPassword + "e";
				}
				if(g == 31){
					finalPassword = finalPassword + "f";
				}
				if(g == 32){
					finalPassword = finalPassword + "g";
				}
				if(g == 33){
					finalPassword = finalPassword + "h";
				}
				if(g == 34){
					finalPassword = finalPassword + "i";
				}
				if(g == 35){
					finalPassword = finalPassword + "j";
				}
				if(g == 36){
					finalPassword = finalPassword + "k";
				}
				if(g == 37){
					finalPassword = finalPassword + "l";
				}
				if(g == 38){
					finalPassword = finalPassword + "m";
				}
				if(g == 39){
					finalPassword = finalPassword + "n";
				}
				if(g == 40){
					finalPassword = finalPassword + "o";
				}
				if(g == 41){
					finalPassword = finalPassword + "p";
				}
				if(g == 42){
					finalPassword = finalPassword + "q";
				}
				if(g == 43){
					finalPassword = finalPassword + "r";
				}
				if(g == 44){
					finalPassword = finalPassword + "s";
				}
				if(g == 45){
					finalPassword = finalPassword + "t";
				}
				if(g == 46){
					finalPassword = finalPassword + "u";
				}
				if(g == 47){
					finalPassword = finalPassword + "v";
				}
				if(g == 48){
					finalPassword = finalPassword + "w";
				}
				if(g == 49){
					finalPassword = finalPassword + "x";
				}
				if(g == 50){
					finalPassword = finalPassword + "y";
				}
				if(g == 51){
					finalPassword = finalPassword + "z";
				}
				if(g == 52){
					finalPassword = finalPassword + "1";
				}
				if(g == 53){
					finalPassword = finalPassword + "2";
				}
				if(g == 54){
					finalPassword = finalPassword + "3";
				}
				if(g == 55){
					finalPassword = finalPassword + "4";
				}
				if(g == 56){
					finalPassword = finalPassword + "5";
				}
				if(g == 57){
					finalPassword = finalPassword + "6";
				}
				if(g == 58){
					finalPassword = finalPassword + "7";
				}
				if(g == 59){
					finalPassword = finalPassword + "8";
				}
				if(g == 60){
					finalPassword = finalPassword + "9";
				}
				if(g == 6){
					finalPassword = finalPassword + "0";
				}
			}
			output.println(hasher.Activate(finalPassword));
			output.close();
		}
		FileGuts.close();
		return finalPassword;
	}
}
