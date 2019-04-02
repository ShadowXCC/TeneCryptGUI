import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;;

public class ConfigMaker {
	ConfigMaker(){	}
	public static String Activate() throws IOException{
		SecureRandom G = new SecureRandom();
		String FileName = "Config.shde";
		FileName = "Data\\" + FileName;
		
		int NumOfFiles = 7;
		int NameLength = 75;
		
		boolean DoesItExist = new File(FileName).isFile();
		
		File DataFolder = new File("/Data");
		boolean DoesDataFolderExist = DataFolder.isDirectory();
		
		if(DoesItExist == false && DoesDataFolderExist == false){
			FileWriter fw = new FileWriter(FileName);
			PrintWriter output = new PrintWriter(fw);
			for(int b = 1; b <= NumOfFiles; b++){
				for(int a = 0;a < NameLength; a++){
					int g = G.nextInt(62);
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
				output.println();
			}
			output.close();
		}
		String Activator = "";
		return Activator;
	}
}