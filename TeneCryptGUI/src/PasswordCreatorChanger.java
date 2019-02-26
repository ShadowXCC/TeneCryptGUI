import java.security.SecureRandom;

public class PasswordCreatorChanger{
	PasswordCreatorChanger(){	}
	
	public static String Activate(){
		SecureRandom PassGenerator = new SecureRandom();
		
		String newPassword = "";
		int length = 20;
		for(int a = 0; a < length; a++){
			int g = PassGenerator.nextInt(62);
			if(g == 00){
				newPassword = newPassword + "A";
			}
			if(g == 1){
				newPassword = newPassword + "B";
			} 
			if(g == 2){
				newPassword = newPassword + "C";
			}
			if(g == 3){
				newPassword = newPassword + "D";
			}
			if(g == 4){
				newPassword = newPassword + "E";
			}
			if(g == 5){
				newPassword = newPassword + "F";
			}
			if(g == 6){
				newPassword = newPassword + "G";
			}
			if(g == 7){
				newPassword = newPassword + "H";
			}
			if(g == 8){
				newPassword = newPassword + "I";
			}
			if(g == 9){
				newPassword = newPassword + "J";
			}
			if(g == 10){
				newPassword = newPassword + "K";
			}
			if(g == 11){
				newPassword = newPassword + "L";
			}
			if(g == 12){
				newPassword = newPassword + "M";
			}
			if(g == 13){
				newPassword = newPassword + "N";
			}
			if(g == 14){
				newPassword = newPassword + "O";
			}
			if(g == 15){
				newPassword = newPassword + "P";
			}
			if(g == 16){
				newPassword = newPassword + "Q";
			}
			if(g == 17){
				newPassword = newPassword + "R";
			}
			if(g == 18){
				newPassword = newPassword + "S";
			}
			if(g == 19){
				newPassword = newPassword + "T";
			}
			if(g == 20){
				newPassword = newPassword + "U";
			}
			if(g == 21){
				newPassword = newPassword + "V";
			}
			if(g == 22){
				newPassword = newPassword + "W";
			}
			if(g == 23){
				newPassword = newPassword + "X";
			}
			if(g == 24){
				newPassword = newPassword + "Y";
			}
			if(g == 25){
				newPassword = newPassword + "Z";
			}
			if(g == 26){
				newPassword = newPassword + "a";
			}
			if(g == 27){
				newPassword = newPassword + "b";
			}
			if(g == 28){
				newPassword = newPassword + "c";
			}
			if(g == 29){
				newPassword = newPassword + "d";
			}
			if(g == 30){
				newPassword = newPassword + "e";
			}
			if(g == 31){
				newPassword = newPassword + "f";
			}
			if(g == 32){
				newPassword = newPassword + "g";
			}
			if(g == 33){
				newPassword = newPassword + "h";
			}
			if(g == 34){
				newPassword = newPassword + "i";
			}
			if(g == 35){
				newPassword = newPassword + "j";
			}
			if(g == 36){
				newPassword = newPassword + "k";
			}
			if(g == 37){
				newPassword = newPassword + "l";
			}
			if(g == 38){
				newPassword = newPassword + "m";
			}
			if(g == 39){
				newPassword = newPassword + "n";
			}
			if(g == 40){
				newPassword = newPassword + "o";
			}
			if(g == 41){
				newPassword = newPassword + "p";
			}
			if(g == 42){
				newPassword = newPassword + "q";
			}
			if(g == 43){
				newPassword = newPassword + "r";
			}
			if(g == 44){
				newPassword = newPassword + "s";
			}
			if(g == 45){
				newPassword = newPassword + "t";
			}
			if(g == 46){
				newPassword = newPassword + "u";
			}
			if(g == 47){
				newPassword = newPassword + "v";
			}
			if(g == 48){
				newPassword = newPassword + "w";
			}
			if(g == 49){
				newPassword = newPassword + "x";
			}
			if(g == 50){
				newPassword = newPassword + "y";
			}
			if(g == 51){
				newPassword = newPassword + "z";
			}
			if(g == 52){
				newPassword = newPassword + "1";
			}
			if(g == 53){
				newPassword = newPassword + "2";
			}
			if(g == 54){
				newPassword = newPassword + "3";
			}
			if(g == 55){
				newPassword = newPassword + "4";
			}
			if(g == 56){
				newPassword = newPassword + "5";
			}
			if(g == 57){
				newPassword = newPassword + "6";
			}
			if(g == 58){
				newPassword = newPassword + "7";
			}
			if(g == 59){
				newPassword = newPassword + "8";
			}
			if(g == 60){
				newPassword = newPassword + "9";
			}
			if(g == 61){
				newPassword = newPassword + "0";
			}
		}
		return newPassword;
	}
}