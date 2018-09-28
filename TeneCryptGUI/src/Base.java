import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;
import java.security.SecureRandom;
import java.util.Calendar;
import java.math.BigInteger;

public class Base {
	Base()throws IOException{	}
	
	public static String Activate() throws IOException{
		@SuppressWarnings("unused")
		String Key = KeyReader.Activate();//This grabs the key from the key storage file to be used in the encryption
		
		SecureRandom generator = new SecureRandom();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		int RandomNumber = generator.nextInt(2) + 1;
		
		String FP = "Data\\Config.shde";
		File FF = new File(FP);
		Scanner FileGuts = new Scanner(FF);
		String WorkspaceFileName = null;
		int WantedLineCount = 1;
		for(int LineCount = 0;!(WantedLineCount==LineCount);LineCount++){
			WorkspaceFileName = FileGuts.nextLine() + ".shde";
		}
		WorkspaceFileName = "Temp\\" + WorkspaceFileName;
		File WorkspaceFile = new File(WorkspaceFileName);
		FileWriter fw = new FileWriter(WorkspaceFileName);
		String EKey = "E";
		String DKey = "D";
		String EKeyLower = "e";
		String DKeyLower = "d";
		String MainMenuKey = "X";
		String ToEncrypt = "";
		int Second = cal.get(Calendar.SECOND) + 1;
		BigInteger SecondNum = new BigInteger(Integer.toString(Second));
		
		String A = "A";
		String B = "B";
		String C = "C";
		String D = "D";
		String E = "E";
		String F = "F";
		String G = "G";
		String H = "H";
		String I = "I";
		String J = "J";
		String K = "K";
		String L = "L";
		String M = "M";
		String N = "N";
		String O = "O";
		String P = "P";
		String Q = "Q";
		String R = "R";
		String S = "S";
		String T = "T";
		String U = "U";
		String V = "V";
		String W = "W";
		String X = "X";
		String Y = "Y";
		String Z = "Z";
		String a = "a";
		String b = "b";
		String c = "c";
		String d = "d";
		String e = "e";
		String f = "f";
		String g = "g";
		String h = "h";
		String i = "i";
		String j = "j";
		String k = "k";
		String l = "l";
		String m = "m";
		String n = "n";
		String o = "o";
		String p = "p";
		String q = "q";
		String r = "r";
		String s = "s";
		String t = "t";
		String u = "u";
		String v = "v";
		String w = "w";
		String x = "x";
		String y = "y";
		String z = "z";
		String one = "1";
		String two = "2";
		String three = "3";
		String four = "4";
		String five = "5";
		String six = "6";
		String seven = "7";
		String eight = "8";
		String nine = "9";
		String zero = "0";
		String period = ".";
		String exclamation = "!";
		String question = "?";
		String apostrophe = "'";
		String comma = ",";
		String space = " ";
		String dash = "-";
		String colon = ":";
		String semicolon  = ";";
		String dollarSign = "$";
		String euroSign = "�";
		String poundSign = "�";
		String at = "@";
		String ampersand = "&";
		String slash = "/";
		String tilde = "~";
		String openParen = "(";
		String closeParen= ")";
		String times = "*";
		String plus = "+";
		String Hash = "#";
		String Percent = "%";
		String Caret = "^";
		String OpenBracket = "[";
		String ClosedBracket = "]";
		String LessThan = "<";
		String GreaterThan = ">";
		String Quotation = "\"";
		String BackSlash = "\\";
		String Underscore = "_";
		String OpenCurlyBracket = "{";
		String ClosedCurlyBracket = "}";
		String VerticalBar= "|";
		String EqualsSign= "=";
		
		BigInteger CapANum = new BigInteger("437");
		BigInteger CapBNum = new BigInteger("160");
		BigInteger CapCNum = new BigInteger("742");
		BigInteger CapDNum = new BigInteger("370");
		BigInteger CapENum = new BigInteger("180");
		BigInteger CapFNum = new BigInteger("299");
		BigInteger CapGNum = new BigInteger("563");
		BigInteger CapHNum = new BigInteger("920");
		BigInteger CapINum = new BigInteger("593");
		BigInteger CapJNum = new BigInteger("948");
		BigInteger CapKNum = new BigInteger("365");
		BigInteger CapLNum = new BigInteger("881");
		BigInteger CapMNum = new BigInteger("168");
		BigInteger CapNNum = new BigInteger("812");
		BigInteger CapONum = new BigInteger("969");
		BigInteger CapPNum = new BigInteger("190");
		BigInteger CapQNum = new BigInteger("497");
		BigInteger CapRNum = new BigInteger("353");
		BigInteger CapSNum = new BigInteger("772");
		BigInteger CapTNum = new BigInteger("688");
		BigInteger CapUNum = new BigInteger("285");
		BigInteger CapVNum = new BigInteger("334");
		BigInteger CapWNum = new BigInteger("193");
		BigInteger CapXNum = new BigInteger("757");
		BigInteger CapYNum = new BigInteger("722");
		BigInteger CapZNum = new BigInteger("502");
		BigInteger aNum = new BigInteger("522");
		BigInteger bNum = new BigInteger("101");
		BigInteger cNum = new BigInteger("796");
		BigInteger dNum = new BigInteger("511");
		BigInteger eNum = new BigInteger("489");
		BigInteger fNum = new BigInteger("546");
		BigInteger gNum = new BigInteger("313");
		BigInteger hNum = new BigInteger("513");
		BigInteger iNum = new BigInteger("156");
		BigInteger jNum = new BigInteger("249");
		BigInteger kNum = new BigInteger("641");
		BigInteger lNum = new BigInteger("803");
		BigInteger mNum = new BigInteger("356");
		BigInteger nNum = new BigInteger("372");
		BigInteger oNum = new BigInteger("210");
		BigInteger pNum = new BigInteger("872");
		BigInteger qNum = new BigInteger("244");
		BigInteger rNum = new BigInteger("624");
		BigInteger sNum = new BigInteger("183");
		BigInteger tNum = new BigInteger("328");
		BigInteger uNum = new BigInteger("658");
		BigInteger vNum = new BigInteger("831");
		BigInteger wNum = new BigInteger("906");
		BigInteger xNum = new BigInteger("275");
		BigInteger yNum = new BigInteger("300");
		BigInteger zNum = new BigInteger("420");
		BigInteger oneNum = new BigInteger("587");
		BigInteger twoNum = new BigInteger("608");
		BigInteger threeNum = new BigInteger("711");
		BigInteger fourNum = new BigInteger("771");
		BigInteger fiveNum = new BigInteger("789");
		BigInteger sixNum = new BigInteger("569");
		BigInteger sevenNum = new BigInteger("219");
		BigInteger eightNum = new BigInteger("739");
		BigInteger nineNum = new BigInteger("853");
		BigInteger zeroNum = new BigInteger("950");
		BigInteger periodNum = new BigInteger("754");
		BigInteger exclamationNum = new BigInteger("917");
		BigInteger questionNum = new BigInteger("237");
		BigInteger apostropheNum = new BigInteger("859");
		BigInteger commaNum = new BigInteger("666");
		BigInteger spaceNum = new BigInteger("704");
		BigInteger dashNum = new BigInteger("116");
		BigInteger colonNum = new BigInteger("543");
		BigInteger semicolonNum = new BigInteger("762");
		BigInteger dollarSignNum = new BigInteger("345");
		BigInteger euroSignNum = new BigInteger("549");
		BigInteger poundSignNum = new BigInteger("925");
		BigInteger atNum = new BigInteger("211");
		BigInteger ampersandNum = new BigInteger("974");
		BigInteger slashNum = new BigInteger("125");
		BigInteger tildeNum = new BigInteger("238");
		BigInteger openParenNum = new BigInteger("500");
		BigInteger closeParenNum = new BigInteger("788");
		BigInteger timesNum = new BigInteger("828");
		BigInteger plusNum = new BigInteger("381");
		BigInteger HashNum = new BigInteger("274");
		BigInteger PercentNum = new BigInteger("720");
		BigInteger CaretNum = new BigInteger("926");
		BigInteger OpenBracketNum = new BigInteger("111");
		BigInteger ClosedBracketNum = new BigInteger("452");
		BigInteger LessThanNum = new BigInteger("978");
		BigInteger GreaterThanNum = new BigInteger("695");
		BigInteger QuotationNum = new BigInteger("453");
		BigInteger BackSlashNum= new BigInteger("724");
		BigInteger UnderscoreNum = new BigInteger("175");
		BigInteger OpenCurlyBracketNum = new BigInteger("545");
		BigInteger ClosedCurlyBracketNum = new BigInteger("909");
		BigInteger VerticalBarNum = new BigInteger("930");
		BigInteger EqualsSignNum= new BigInteger("573");
		
		BigInteger CapANum1 = new BigInteger("832");
		BigInteger CapBNum1 = new BigInteger("162");
		BigInteger CapCNum1 = new BigInteger("621");
		BigInteger CapDNum1 = new BigInteger("251");
		BigInteger CapENum1 = new BigInteger("125");
		BigInteger CapFNum1 = new BigInteger("763");
		BigInteger CapGNum1 = new BigInteger("927");
		BigInteger CapHNum1 = new BigInteger("653");
		BigInteger CapINum1 = new BigInteger("432");
		BigInteger CapJNum1 = new BigInteger("883");
		BigInteger CapKNum1 = new BigInteger("129");
		BigInteger CapLNum1 = new BigInteger("657");
		BigInteger CapMNum1 = new BigInteger("359");
		BigInteger CapNNum1 = new BigInteger("597");
		BigInteger CapONum1 = new BigInteger("327");
		BigInteger CapPNum1 = new BigInteger("273");
		BigInteger CapQNum1 = new BigInteger("962");
		BigInteger CapRNum1 = new BigInteger("298");
		BigInteger CapSNum1 = new BigInteger("217");
		BigInteger CapTNum1 = new BigInteger("468");
		BigInteger CapUNum1 = new BigInteger("724");
		BigInteger CapVNum1 = new BigInteger("474");
		BigInteger CapWNum1 = new BigInteger("856");
		BigInteger CapXNum1 = new BigInteger("374");
		BigInteger CapYNum1 = new BigInteger("105");
		BigInteger CapZNum1 = new BigInteger("394");
		BigInteger aNum1 = new BigInteger("764");
		BigInteger bNum1 = new BigInteger("835");
		BigInteger cNum1 = new BigInteger("904");
		BigInteger dNum1 = new BigInteger("363");
		BigInteger eNum1 = new BigInteger("867");
		BigInteger fNum1 = new BigInteger("523");
		BigInteger gNum1 = new BigInteger("590");
		BigInteger hNum1 = new BigInteger("386");
		BigInteger iNum1 = new BigInteger("951");
		BigInteger jNum1 = new BigInteger("711");
		BigInteger kNum1 = new BigInteger("407");
		BigInteger lNum1 = new BigInteger("189");
		BigInteger mNum1 = new BigInteger("122");
		BigInteger nNum1 = new BigInteger("860");
		BigInteger oNum1 = new BigInteger("540");
		BigInteger pNum1 = new BigInteger("581");
		BigInteger qNum1 = new BigInteger("668");
		BigInteger rNum1 = new BigInteger("989");
		BigInteger sNum1 = new BigInteger("943");
		BigInteger tNum1 = new BigInteger("684");
		BigInteger uNum1 = new BigInteger("516");
		BigInteger vNum1 = new BigInteger("185");
		BigInteger wNum1 = new BigInteger("855");
		BigInteger xNum1 = new BigInteger("694");
		BigInteger yNum1 = new BigInteger("222");
		BigInteger zNum1 = new BigInteger("367");
		BigInteger oneNum1 = new BigInteger("398");
		BigInteger twoNum1 = new BigInteger("500");
		BigInteger threeNum1 = new BigInteger("543");
		BigInteger fourNum1 = new BigInteger("103");
		BigInteger fiveNum1 = new BigInteger("192");
		BigInteger sixNum1 = new BigInteger("123");
		BigInteger sevenNum1 = new BigInteger("314");
		BigInteger eightNum1 = new BigInteger("723");
		BigInteger nineNum1 = new BigInteger("691");
		BigInteger zeroNum1 = new BigInteger("501");
		BigInteger periodNum1 = new BigInteger("442");
		BigInteger exclamationNum1 = new BigInteger("207");
		BigInteger questionNum1 = new BigInteger("139");
		BigInteger apostropheNum1 = new BigInteger("896");
		BigInteger commaNum1 = new BigInteger("281");
		BigInteger spaceNum1 = new BigInteger("549");
		BigInteger dashNum1 = new BigInteger("669");
		BigInteger colonNum1 = new BigInteger("594");
		BigInteger semicolonNum1 = new BigInteger("710");
		BigInteger dollarSignNum1 = new BigInteger("745");
		BigInteger euroSignNum1 = new BigInteger("629");
		BigInteger poundSignNum1 = new BigInteger("920");
		BigInteger atNum1 = new BigInteger("742");
		BigInteger ampersandNum1 = new BigInteger("950");
		BigInteger slashNum1 = new BigInteger("223");
		BigInteger tildeNum1 = new BigInteger("566");
		BigInteger openParenNum1 = new BigInteger("582");
		BigInteger closeParenNum1 = new BigInteger("891");
		BigInteger timesNum1 = new BigInteger("899");
		BigInteger plusNum1 = new BigInteger("102");
		BigInteger HashNum1 = new BigInteger("156");
		BigInteger PercentNum1 = new BigInteger("419");
		BigInteger CaretNum1 = new BigInteger("746");
		BigInteger OpenBracketNum1 = new BigInteger("821");
		BigInteger ClosedBracketNum1 = new BigInteger("699");
		BigInteger LessThanNum1 = new BigInteger("320");
		BigInteger GreaterThanNum1 = new BigInteger("957");
		BigInteger QuotationNum1 = new BigInteger("996");
		BigInteger BackSlashNum1= new BigInteger("888");
		BigInteger UnderscoreNum1 = new BigInteger("731");
		BigInteger OpenCurlyBracketNum1 = new BigInteger("633");
		BigInteger ClosedCurlyBracketNum1 = new BigInteger("809");
		BigInteger VerticalBarNum1 = new BigInteger("371");
		BigInteger EqualsSignNum1= new BigInteger("159");
		
		BigInteger SBONUMBER = new BigInteger("5647983335");
		// VARIABLE AREA END
		
			for(;;){
			System.out.println();
			System.out.println("Please type " + EKey + "/" + EKeyLower + " for encrypting, or type " + DKey + "/" +DKeyLower + " for decrypting. Press "+ MainMenuKey +" to return to the main menu.");
			String EOrD = input.nextLine();
			if(EOrD.equals(EKey) || EOrD.equals(EKeyLower)){
			PrintWriter output = new PrintWriter(fw);
			System.out.println();
			System.out.println("Please Enter Message to Be Encrypted:");
			ToEncrypt = input.nextLine();
			int ToEncryptLength = ToEncrypt.length();
			System.out.println("\nEncrypted Message:");
			if(RandomNumber == 1)
				for(int placeValue = 0;placeValue < ToEncryptLength;placeValue++){
					String character = ToEncrypt.substring(placeValue, placeValue + 1);
					if(character.equals(A)){
					output.print(CapANum);
					}
					if(character.equals(B)){
					output.print(CapBNum);
					}
					if(character.equals(C)){
					output.print(CapCNum);
					}
					if(character.equals(D)){
					output.print(CapDNum);
					}
					if(character.equals(E)){
					output.print(CapENum);
					}
					if(character.equals(F)){
					output.print(CapFNum);
					}
					if(character.equals(G)){
					output.print(CapGNum);
					}
					if(character.equals(H)){
					output.print(CapHNum);
					}
					if(character.equals(I)){
					output.print(CapINum);
					}
					if(character.equals(J)){
					output.print(CapJNum);
					}
					if(character.equals(K)){
					output.print(CapKNum);
					}
					if(character.equals(L)){
					output.print(CapLNum);
					}
					if(character.equals(M)){
					output.print(CapMNum);
					}
					if(character.equals(N)){
					output.print(CapNNum);
					}
					if(character.equals(O)){
					output.print(CapONum);
					}
					if(character.equals(P)){
					output.print(CapPNum);
					}
					if(character.equals(Q)){
					output.print(CapQNum);
					}
					if(character.equals(R)){
					output.print(CapRNum);
					}
					if(character.equals(S)){
					output.print(CapSNum);
					}
					if(character.equals(T)){
					output.print(CapTNum);
					}
					if(character.equals(U)){
					output.print(CapUNum);
					}
					if(character.equals(V)){
					output.print(CapVNum);
					}
					if(character.equals(W)){
					output.print(CapWNum);
					}
					if(character.equals(X)){
					output.print(CapXNum);
					}
					if(character.equals(Y)){
					output.print(CapYNum);
					}
					if(character.equals(Z)){
					output.print(CapZNum);
					}
					if(character.equals(a)){
					output.print(aNum);
					}
					if(character.equals(b)){
					output.print(bNum);
					}
					if(character.equals(c)){
					output.print(cNum);
					}
					if(character.equals(d)){
					output.print(dNum);
					}
					if(character.equals(e)){
					output.print(eNum);
					}
					if(character.equals(f)){
					output.print(fNum);
					}
					if(character.equals(g)){
					output.print(gNum);
					}
					if(character.equals(h)){
					output.print(hNum);
					}
					if(character.equals(i)){
					output.print(iNum);
					}
					if(character.equals(j)){
					output.print(jNum);
					}
					if(character.equals(k)){
					output.print(kNum);
					}
					if(character.equals(l)){
					output.print(lNum);
					}
					if(character.equals(m)){
					output.print(mNum);
					}
					if(character.equals(n)){
					output.print(nNum);
					}
					if(character.equals(o)){
					output.print(oNum);
					}
					if(character.equals(p)){
					output.print(pNum);
					}
					if(character.equals(q)){
					output.print(qNum);
					}
					if(character.equals(r)){
					output.print(rNum);
					}
					if(character.equals(s)){
					output.print(sNum);
					}
					if(character.equals(t)){
					output.print(tNum);
					}
					if(character.equals(u)){
					output.print(uNum);
					}
					if(character.equals(v)){
					output.print(vNum);
					}
					if(character.equals(w)){
					output.print(wNum);
					}
					if(character.equals(x)){
					output.print(xNum);
					}
					if(character.equals(y)){
					output.print(yNum);
					}
					if(character.equals(z)){
					output.print(zNum);
					}
					if(character.equals(one)){
					output.print(oneNum);
					}
					if(character.equals(two)){
					output.print(twoNum);
					}
					if(character.equals(three)){
					output.print(threeNum);
					}
					if(character.equals(four)){
					output.print(fourNum);
					}
					if(character.equals(five)){
					output.print(fiveNum);
					}
					if(character.equals(six)){
					output.print(sixNum);
					}
					if(character.equals(seven)){
					output.print(sevenNum);
					}
					if(character.equals(eight)){
					output.print(eightNum);
					}
					if(character.equals(nine)){
					output.print(nineNum);
					}
					if(character.equals(zero)){
					output.print(zeroNum);
					}
					if(character.equals(period)){
					output.print(periodNum);
					}
					if(character.equals(exclamation)){
					output.print(exclamationNum);
					}
					if(character.equals(question)){
					output.print(questionNum);
					}
					if(character.equals(apostrophe)){
					output.print(apostropheNum);
					}
					if(character.equals(comma)){
					output.print(commaNum);
					}
					if(character.equals(space)){
					output.print(spaceNum);
					}
					if(character.equals(dash)){
					output.print(dashNum);
					}
					if(character.equals(colon)){
					output.print(colonNum);
					}
					if(character.equals(semicolon)){
					output.print(semicolonNum);
					}
					if(character.equals(dollarSign)){
					output.print(dollarSignNum);
					}
					if(character.equals(euroSign)){
					output.print(euroSignNum);
					}
					if(character.equals(poundSign)){
					output.print(poundSignNum);
					}
					if(character.equals(at)){
					output.print(atNum);
					}
					if(character.equals(ampersand)){
					output.print(ampersandNum);
					}
					if(character.equals(slash)){
					output.print(slashNum);
					}
					if(character.equals(tilde)){
					output.print(tildeNum);
					}
					if(character.equals(openParen)){
					output.print(openParenNum);
					}
					if(character.equals(closeParen)){
					output.print(closeParenNum);
					}
					if(character.equals(times)){
					output.print(timesNum);
					}
					if(character.equals(plus)){
					output.print(plusNum);
					}
					if(character.equals(Hash)){
						output.print(HashNum);
					}
					if(character.equals(Percent)){
						output.print(PercentNum);
					}
					if(character.equals(Caret)){
						output.print(CaretNum);
					}
					if(character.equals(OpenBracket)){
						output.print(OpenBracketNum);
					}
					if(character.equals(ClosedBracket)){
						output.print(ClosedBracketNum);
					}
					if(character.equals(LessThan)){
						output.print(LessThanNum);
					}
					if(character.equals(GreaterThan)){
						output.print(GreaterThanNum);
					}
					if(character.equals(Quotation)){
						output.print(QuotationNum);
					}
					if(character.equals(BackSlash)){
						output.print(BackSlashNum);
					}
					if(character.equals(Underscore)){
						output.print(UnderscoreNum);
					}
					if(character.equals(OpenCurlyBracket)){
						output.print(OpenCurlyBracketNum);
					}
					if(character.equals(ClosedCurlyBracket)){
						output.print(ClosedCurlyBracketNum);
					}
					if(character.equals(VerticalBar)){
						output.print(VerticalBarNum);
					}
					if(character.equals(EqualsSign)){
						output.print(EqualsSignNum);
					}
				}
				if(RandomNumber == 2)
				for(int placeValue = 0;placeValue < ToEncryptLength;placeValue++){
					String character = ToEncrypt.substring(placeValue, placeValue + 1);
					if(character.equals(A)){
						output.print(CapANum1);
					}
					if(character.equals(B)){
						output.print(CapBNum1);
					}
					if(character.equals(C)){
						output.print(CapCNum1);
					}
					if(character.equals(D)){
						output.print(CapDNum1);
					}
					if(character.equals(E)){
						output.print(CapENum1);
					}
					if(character.equals(F)){
						output.print(CapFNum1);
					}
					if(character.equals(G)){
						output.print(CapGNum1);
					}
					if(character.equals(H)){
						output.print(CapHNum1);
					}
					if(character.equals(I)){
						output.print(CapINum1);
					}
					if(character.equals(J)){
						output.print(CapJNum1);
					}
					if(character.equals(K)){
						output.print(CapJNum1);
					}
					if(character.equals(L)){
						output.print(CapLNum1);
					}
					if(character.equals(M)){
						output.print(CapMNum1);
					}
					if(character.equals(N)){
						output.print(CapNNum1);
					}
					if(character.equals(O)){
						output.print(CapONum1);
					}
					if(character.equals(P)){
						output.print(CapPNum1);
					}
					if(character.equals(Q)){
						output.print(CapQNum1);
					}
					if(character.equals(R)){
						output.print(CapRNum1);
					}
					if(character.equals(S)){
						output.print(CapSNum1);
					}
					if(character.equals(T)){
						output.print(CapTNum1);
					}
					if(character.equals(U)){
						output.print(CapUNum1);
					}
					if(character.equals(V)){
						output.print(CapVNum1);
					}
					if(character.equals(W)){
						output.print(CapWNum1);
					}
					if(character.equals(X)){
						output.print(CapXNum1);
					}
					if(character.equals(Y)){
						output.print(CapYNum1);
					}
					if(character.equals(Z)){
						output.print(CapZNum1);
					}
					if(character.equals(a)){
						output.print(aNum1);
					}
					if(character.equals(b)){
						output.print(bNum1);
					}
					if(character.equals(c)){
						output.print(cNum1);
					}
					if(character.equals(d)){
						output.print(dNum1);
					}
					if(character.equals(e)){
						output.print(eNum1);
					}
					if(character.equals(f)){
						output.print(fNum1);
					}
					if(character.equals(g)){
						output.print(gNum1);
					}
					if(character.equals(h)){
						output.print(hNum1);
					}
					if(character.equals(i)){
						output.print(iNum1);
					}
					if(character.equals(j)){
						output.print(jNum1);
					}
					if(character.equals(k)){
						output.print(kNum1);
					}
					if(character.equals(l)){
						output.print(lNum1);
					}
					if(character.equals(m)){
						output.print(mNum1);
					}
					if(character.equals(n)){
						output.print(nNum1);
					}
					if(character.equals(o)){
						output.print(oNum1);
					}
					if(character.equals(p)){
						output.print(pNum1);
					}
					if(character.equals(q)){
						output.print(qNum1);
					}
					if(character.equals(r)){
						output.print(rNum1);
					}
					if(character.equals(s)){
						output.print(sNum1);
					}
					if(character.equals(t)){
						output.print(tNum1);
					}
					if(character.equals(u)){
						output.print(uNum1);
					}
					if(character.equals(v)){
						output.print(vNum1);
					}
					if(character.equals(w)){
						output.print(wNum1);
					}
					if(character.equals(x)){
						output.print(xNum1);
					}
					if(character.equals(y)){
						output.print(yNum1);
					}
					if(character.equals(z)){
						output.print(zNum1);
					}
					if(character.equals(one)){
						output.print(oneNum1);
					}
					if(character.equals(two)){
						output.print(twoNum1);
					}
					if(character.equals(three)){
						output.print(threeNum1);
					}
					if(character.equals(four)){
						output.print(fourNum1);
					}
					if(character.equals(five)){
						output.print(fiveNum1);
					}
					if(character.equals(six)){
						output.print(sixNum1);
					}
					if(character.equals(seven)){
						output.print(sevenNum1);
					}
					if(character.equals(eight)){
						output.print(eightNum1);
					}
					if(character.equals(nine)){
						output.print(nineNum1);
					}
					if(character.equals(zero)){
						output.print(zeroNum1);
					}
					if(character.equals(period)){
						output.print(periodNum1);
					}
					if(character.equals(exclamation)){
						output.print(exclamationNum1);
					}
					if(character.equals(question)){
						output.print(questionNum1);
					}
					if(character.equals(apostrophe)){
						output.print(apostropheNum1);
					}
					if(character.equals(comma)){
						output.print(commaNum1);
					}
					if(character.equals(space)){
						output.print(spaceNum1);
					}
					if(character.equals(dash)){
						output.print(dashNum1);
					}
					if(character.equals(colon)){
						output.print(colonNum1);
					}
					if(character.equals(semicolon)){
						output.print(semicolonNum1);
					}
					if(character.equals(dollarSign)){
						output.print(dollarSignNum1);
					}
					if(character.equals(euroSign)){
						output.print(euroSignNum1);
					}
					if(character.equals(poundSign)){
						output.print(poundSignNum1);
					}
					if(character.equals(at)){
						output.print(atNum1);
					}
					if(character.equals(ampersand)){
						output.print(ampersandNum1);
					}
					if(character.equals(slash)){
						output.print(slashNum1);
					}
					if(character.equals(tilde)){
						output.print(tildeNum1);
					}
					if(character.equals(openParen)){
						output.print(openParenNum1);
					}
					if(character.equals(closeParen)){
						output.print(closeParenNum1);
					}
					if(character.equals(times)){
						output.print(timesNum1);
					}
					if(character.equals(plus)){
						output.print(plusNum1);
					}
					if(character.equals(Hash)){
						output.print(HashNum1);
					}
					if(character.equals(Percent)){
						output.print(PercentNum1);
					}
					if(character.equals(Caret)){
						output.print(CaretNum1);
					}
					if(character.equals(OpenBracket)){
						output.print(OpenBracketNum1);
					}
					if(character.equals(ClosedBracket)){
						output.print(ClosedBracketNum1);
					}
					if(character.equals(LessThan)){
						output.print(LessThanNum1);
					}
					if(character.equals(GreaterThan)){
						output.print(GreaterThanNum1);
					}
					if(character.equals(Quotation)){
						output.print(QuotationNum1);
					}
					if(character.equals(BackSlash)){
						output.print(BackSlashNum1);
					}
					if(character.equals(Underscore)){
						output.print(UnderscoreNum1);
					}
					if(character.equals(OpenCurlyBracket)){
						output.print(OpenCurlyBracketNum1);
					}
					if(character.equals(ClosedCurlyBracket)){
						output.print(ClosedCurlyBracketNum1);
					}
					if(character.equals(VerticalBar)){
						output.print(VerticalBarNum1);
					}
					if(character.equals(EqualsSign)){
						output.print(EqualsSignNum1);
					}
				}
				output.print(RandomNumber);
				output.print(RandomNumber);
				fw.close();
				System.out.println();
				
				Scanner sf = new Scanner(WorkspaceFile);
				BigInteger fileguts;
				fileguts = new BigInteger(sf.nextLine());
				sf.close();//if not closed, nothing prints out when trying to decrypt
				
				BigInteger finalnumbers = fileguts.multiply(SecondNum);
				
				BigInteger finalfinalnumbers = finalnumbers.multiply(SBONUMBER);
				
				System.out.println(SecondNum + "" + finalfinalnumbers);
				
				FileWriter fw2 = new FileWriter(WorkspaceFileName);
				PrintWriter output2 = new PrintWriter(fw2);
				output2.print("");
				fw2.close();
			}
			if(EOrD.equals(DKey) || EOrD.equals(DKeyLower)){
				System.out.println();
				System.out.println("Please Enter Message to Be Decrypted:");
				String OriginalToDecrypt = input.nextLine();
				BigInteger OriginalToDecryptNum = new BigInteger(OriginalToDecrypt.substring(2));
				BigInteger LeadingDecryptDigits = new BigInteger(OriginalToDecrypt.substring(0, 2));
				BigInteger UndividedNum = OriginalToDecryptNum.divide(LeadingDecryptDigits);
				BigInteger UndividedUndividedNum = UndividedNum.divide(SBONUMBER);
				String UndividedString = UndividedUndividedNum.toString();
				int UndividedLength = UndividedString.length();
				String FinalDecryptDigits = UndividedString.substring(UndividedLength - 2,UndividedLength);
				String AfterToDecrypt = UndividedString.substring( 0, UndividedLength - 2);
				int AfterToDecryptLength = AfterToDecrypt.length();
				System.out.println("\nDecrypted Message:");
				System.out.print("\"");
				if(FinalDecryptDigits.equals("11")){
					for(int placeValue = 0;placeValue < AfterToDecryptLength;placeValue++){
					String digits = AfterToDecrypt.substring(placeValue, placeValue + 3);
					BigInteger digitsNumberForm = new BigInteger(digits);
					if(digitsNumberForm.equals(CapANum)){
						System.out.print(A);
					}
					if(digitsNumberForm.equals(CapBNum)){
						System.out.print(B);
					}
					if(digitsNumberForm.equals(CapCNum)){
						System.out.print(C);
					}
					if(digitsNumberForm.equals(CapDNum)){
						System.out.print(D);
					}
					if(digitsNumberForm.equals(CapENum)){
						System.out.print(E);
					}
					if(digitsNumberForm.equals(CapFNum)){
						System.out.print(F);
					}
					if(digitsNumberForm.equals(CapGNum)){
						System.out.print(G);
					}
					if(digitsNumberForm.equals(CapHNum)){
						System.out.print(H);
					}
					if(digitsNumberForm.equals(CapINum)){
						System.out.print(I);
					}
					if(digitsNumberForm.equals(CapJNum)){
						System.out.print(J);
					}
					if(digitsNumberForm.equals(CapKNum)){
						System.out.print(K);
					}
					if(digitsNumberForm.equals(CapLNum)){
						System.out.print(L);
					}
					if(digitsNumberForm.equals(CapMNum)){
						System.out.print(M);
					}
					if(digitsNumberForm.equals(CapNNum)){
						System.out.print(N);
					}
					if(digitsNumberForm.equals(CapONum)){
						System.out.print(O);
					}
					if(digitsNumberForm.equals(CapPNum)){
						System.out.print(P);
					}
					if(digitsNumberForm.equals(CapQNum)){
						System.out.print(Q);
					}
					if(digitsNumberForm.equals(CapRNum)){
						System.out.print(R);
					}
					if(digitsNumberForm.equals(CapSNum)){
						System.out.print(S);
					}
					if(digitsNumberForm.equals(CapTNum)){
						System.out.print(T);
					}
					if(digitsNumberForm.equals(CapUNum)){
						System.out.print(U);
					}
					if(digitsNumberForm.equals(CapVNum)){
						System.out.print(V);
					}
					if(digitsNumberForm.equals(CapWNum)){
						System.out.print(W);
					}
					if(digitsNumberForm.equals(CapXNum)){
						System.out.print(X);
					}
					if(digitsNumberForm.equals(CapYNum)){
						System.out.print(Y);
					}
					if(digitsNumberForm.equals(CapZNum)){
						System.out.print(Z);
					}
					if(digitsNumberForm.equals(aNum)){
						System.out.print(a);
					}
					if(digitsNumberForm.equals(bNum)){
						System.out.print(b);
					}
					if(digitsNumberForm.equals(cNum)){
						System.out.print(c);
					}
					if(digitsNumberForm.equals(dNum)){
						System.out.print(d);
					}
					if(digitsNumberForm.equals(eNum)){
						System.out.print(e);
					}
					if(digitsNumberForm.equals(fNum)){
						System.out.print(f);
					}
					if(digitsNumberForm.equals(gNum)){
						System.out.print(g);
					}
					if(digitsNumberForm.equals(hNum)){
						System.out.print(h);
					}
					if(digitsNumberForm.equals(iNum)){
						System.out.print(i);
					}
					if(digitsNumberForm.equals(jNum)){
						System.out.print(j);
					}
					if(digitsNumberForm.equals(kNum)){
						System.out.print(k);
					}
					if(digitsNumberForm.equals(lNum)){
						System.out.print(l);
					}
					if(digitsNumberForm.equals(mNum)){
						System.out.print(m);
					}
					if(digitsNumberForm.equals(nNum)){
						System.out.print(n);
					}
					if(digitsNumberForm.equals(oNum)){
						System.out.print(o);
					}
					if(digitsNumberForm.equals(pNum)){
						System.out.print(p);
					} 
					if(digitsNumberForm.equals(qNum)){
						System.out.print(q);
					}
					if(digitsNumberForm.equals(rNum)){
						System.out.print(r);
					}
					if(digitsNumberForm.equals(sNum)){
						System.out.print(s);
					}
					if(digitsNumberForm.equals(tNum)){
						System.out.print(t);
					}
					if(digitsNumberForm.equals(uNum)){
						System.out.print(u);
					}
					if(digitsNumberForm.equals(vNum)){
						System.out.print(v);
					}
					if(digitsNumberForm.equals(wNum)){
						System.out.print(w);
					}
					if(digitsNumberForm.equals(xNum)){
						System.out.print(x);
					}
					if(digitsNumberForm.equals(yNum)){
						System.out.print(y);
					}
					if(digitsNumberForm.equals(zNum)){
						System.out.print(z);
					}
					if(digitsNumberForm.equals(oneNum)){
						System.out.print(one);
					}
					if(digitsNumberForm.equals(twoNum)){
						System.out.print(two);
					}
					if(digitsNumberForm.equals(threeNum)){
						System.out.print(three);
					}
					if(digitsNumberForm.equals(fourNum)){
						System.out.print(four);
					}
					if(digitsNumberForm.equals(fiveNum)){
						System.out.print(five);
					}
					if(digitsNumberForm.equals(sixNum)){
						System.out.print(six);
					}
					if(digitsNumberForm.equals(sevenNum)){
						System.out.print(seven);
					}
					if(digitsNumberForm.equals(eightNum)){
						System.out.print(eight);
					}
					if(digitsNumberForm.equals(nineNum)){
						System.out.print(nine);
					}
					if(digitsNumberForm.equals(zeroNum)){
						System.out.print(zero);
					}
					if(digitsNumberForm.equals(periodNum)){
						System.out.print(period);
					}
					if(digitsNumberForm.equals(exclamationNum)){
						System.out.print(exclamation);
					}
					if(digitsNumberForm.equals(questionNum)){
						System.out.print(question);
					}
					if(digitsNumberForm.equals(apostropheNum)){
						System.out.print(apostrophe);
					}
					if(digitsNumberForm.equals(commaNum)){
						System.out.print(comma);
					}
					if(digitsNumberForm.equals(spaceNum)){
						System.out.print(space);
					}
					if(digitsNumberForm.equals(dashNum)){
						System.out.print(dash);
					}
					if(digitsNumberForm.equals(colonNum)){
						System.out.print(colon);
					}
					if(digitsNumberForm.equals(semicolonNum)){
						System.out.print(semicolon);
					}
					if(digitsNumberForm.equals(dollarSignNum)){
						System.out.print(dollarSign);
					}
					if(digitsNumberForm.equals(euroSignNum)){
						System.out.print(euroSign);
					}
					if(digitsNumberForm.equals(poundSignNum)){
						System.out.print(poundSign);
					}
					if(digitsNumberForm.equals(atNum)){
						System.out.print(at);
					}
					if(digitsNumberForm.equals(ampersandNum)){
						System.out.print(ampersand);
					}
					if(digitsNumberForm.equals(slashNum)){
						System.out.print(slash);
					}
					if(digitsNumberForm.equals(tildeNum)){
						System.out.print(tilde);
					}
					if(digitsNumberForm.equals(openParenNum)){
						System.out.print(openParen);
					}
					if(digitsNumberForm.equals(closeParenNum)){
						System.out.print(closeParen);
					}
					if(digitsNumberForm.equals(timesNum)){
						System.out.print(times);
					}
					if(digitsNumberForm.equals(plusNum)){
						System.out.print(plus);
					}
					if(digitsNumberForm.equals(HashNum)){
						System.out.print(Hash);
					}
					if(digitsNumberForm.equals(PercentNum)){
						System.out.print(Percent);
					}
					if(digitsNumberForm.equals(CaretNum)){
						System.out.print(Caret);
					}
					if(digitsNumberForm.equals(OpenBracketNum)){
						System.out.print(OpenBracket);
					}
					if(digitsNumberForm.equals(ClosedBracketNum)){
						System.out.print(ClosedBracket);
					}
					if(digitsNumberForm.equals(LessThanNum)){
						System.out.print(LessThan);
					}
					if(digitsNumberForm.equals(GreaterThanNum)){
						System.out.print(GreaterThan);
					}
					if(digitsNumberForm.equals(QuotationNum)){
						System.out.print(Quotation);
					}
					if(digitsNumberForm.equals(BackSlashNum)){
						System.out.print(BackSlash);
					}
					if(digitsNumberForm.equals(UnderscoreNum)){
						System.out.print(Underscore);
					}
					if(digitsNumberForm.equals(OpenCurlyBracketNum)){
						System.out.print(OpenCurlyBracket);
					}
					if(digitsNumberForm.equals(ClosedCurlyBracketNum)){
						System.out.print(ClosedCurlyBracket);
					}
					if(digitsNumberForm.equals(VerticalBarNum)){
						System.out.print(VerticalBar);
					}
					if(digitsNumberForm.equals(EqualsSignNum)){
						System.out.print(EqualsSign);
					}
					placeValue++;
					placeValue++;
					}
				}
				if(FinalDecryptDigits.equals("22")){
					for(int placeValue = 0;placeValue < AfterToDecryptLength;placeValue++){
					String digits = AfterToDecrypt.substring(placeValue, placeValue + 3);
					BigInteger digitsNumberForm = new BigInteger(digits);
					if(digitsNumberForm.equals(CapANum1)){
						System.out.print(A);
					}
					if(digitsNumberForm.equals(CapBNum1)){
						System.out.print(B);
					}
					if(digitsNumberForm.equals(CapCNum1)){
						System.out.print(C);
					}
					if(digitsNumberForm.equals(CapDNum1)){
						System.out.print(D);
					}
					if(digitsNumberForm.equals(CapENum1)){
						System.out.print(E);
					}
					if(digitsNumberForm.equals(CapFNum1)){
						System.out.print(F);
					}
					if(digitsNumberForm.equals(CapGNum1)){
						System.out.print(G);
					}
					if(digitsNumberForm.equals(CapHNum1)){
						System.out.print(H);
					}
					if(digitsNumberForm.equals(CapINum1)){
						System.out.print(I);
					}
					if(digitsNumberForm.equals(CapJNum1)){
						System.out.print(J);
					}
					if(digitsNumberForm.equals(CapKNum1)){
						System.out.print(K);
					}
					if(digitsNumberForm.equals(CapLNum1)){
						System.out.print(L);
					}
					if(digitsNumberForm.equals(CapMNum1)){
						System.out.print(M);
					}
					if(digitsNumberForm.equals(CapNNum1)){
						System.out.print(N);
					}
					if(digitsNumberForm.equals(CapONum1)){
						System.out.print(O);
					}
					if(digitsNumberForm.equals(CapPNum1)){
						System.out.print(P);
					}
					if(digitsNumberForm.equals(CapQNum1)){
						System.out.print(Q);
					}
					if(digitsNumberForm.equals(CapRNum1)){
						System.out.print(R);
					}
					if(digitsNumberForm.equals(CapSNum1)){
						System.out.print(S);
					}
					if(digitsNumberForm.equals(CapTNum1)){
						System.out.print(T);
					}
					if(digitsNumberForm.equals(CapUNum1)){
						System.out.print(U);
					}
					if(digitsNumberForm.equals(CapVNum1)){
						System.out.print(V);
					}
					if(digitsNumberForm.equals(CapWNum1)){
						System.out.print(W);
					}
					if(digitsNumberForm.equals(CapXNum1)){
						System.out.print(X);
					}
					if(digitsNumberForm.equals(CapYNum1)){
						System.out.print(Y); 
					}
					if(digitsNumberForm.equals(CapZNum1)){
						System.out.print(Z);
					}
					if(digitsNumberForm.equals(aNum1)){
						System.out.print(a);
					}
					if(digitsNumberForm.equals(bNum1)){
						System.out.print(b);
					}
					if(digitsNumberForm.equals(cNum1)){
						System.out.print(c);
					}
					if(digitsNumberForm.equals(dNum1)){
						System.out.print(d);
					}
					if(digitsNumberForm.equals(eNum1)){
						System.out.print(e);
					}
					if(digitsNumberForm.equals(fNum1)){
						System.out.print(f);
					}
					if(digitsNumberForm.equals(gNum1)){
						System.out.print(g);
					}
					if(digitsNumberForm.equals(hNum1)){
						System.out.print(h);
					}
					if(digitsNumberForm.equals(iNum1)){
						System.out.print(i);
					}
					if(digitsNumberForm.equals(jNum1)){
						System.out.print(j);
					}
					if(digitsNumberForm.equals(kNum1)){
						System.out.print(k);
					}
					if(digitsNumberForm.equals(lNum1)){
						System.out.print(l);
					}
					if(digitsNumberForm.equals(mNum1)){
						System.out.print(m);
					}
					if(digitsNumberForm.equals(nNum1)){
						System.out.print(n);
					}
					if(digitsNumberForm.equals(oNum1)){
						System.out.print(o);
					}
					if(digitsNumberForm.equals(pNum1)){
						System.out.print(p);
					}
					if(digitsNumberForm.equals(qNum1)){
						System.out.print(q);
					}
					if(digitsNumberForm.equals(rNum1)){
						System.out.print(r);
					}
					if(digitsNumberForm.equals(sNum1)){
						System.out.print(s);
					}
					if(digitsNumberForm.equals(tNum1)){
						System.out.print(t);
					}
					if(digitsNumberForm.equals(uNum1)){
						System.out.print(u);
					}
					if(digitsNumberForm.equals(vNum1)){
						System.out.print(v);
					}
					if(digitsNumberForm.equals(wNum1)){
						System.out.print(w);
					}
					if(digitsNumberForm.equals(xNum1)){
						System.out.print(x);
					}
					if(digitsNumberForm.equals(yNum1)){
						System.out.print(y);
					}
					if(digitsNumberForm.equals(zNum1)){
						System.out.print(z);
					}
					if(digitsNumberForm.equals(oneNum1)){
						System.out.print(one);
					}
					if(digitsNumberForm.equals(twoNum1)){
						System.out.print(two);
					}
					if(digitsNumberForm.equals(threeNum1)){
						System.out.print(three);
					}
					if(digitsNumberForm.equals(fourNum1)){
						System.out.print(four);
					}
					if(digitsNumberForm.equals(fiveNum1)){
						System.out.print(five);
					}
					if(digitsNumberForm.equals(sixNum1)){
						System.out.print(six);
					}
					if(digitsNumberForm.equals(sevenNum1)){
						System.out.print(seven);
					}
					if(digitsNumberForm.equals(eightNum1)){
						System.out.print(eight);
					}
					if(digitsNumberForm.equals(nineNum1)){
						System.out.print(nine);
					}
					if(digitsNumberForm.equals(zeroNum1)){
						System.out.print(zero);
					}
					if(digitsNumberForm.equals(periodNum1)){
						System.out.print(period);
					}
					if(digitsNumberForm.equals(exclamationNum1)){
						System.out.print(exclamation);
					}
					if(digitsNumberForm.equals(questionNum1)){
						System.out.print(question);
					}
					if(digitsNumberForm.equals(apostropheNum1)){
						System.out.print(apostrophe);
					}
					if(digitsNumberForm.equals(commaNum1)){
						System.out.print(comma);
					}
					if(digitsNumberForm.equals(spaceNum1)){
						System.out.print(space);
					}
					if(digitsNumberForm.equals(dashNum1)){
						System.out.print(dash);
					}
					if(digitsNumberForm.equals(colonNum1)){
						System.out.print(colon);
					}
					if(digitsNumberForm.equals(semicolonNum1)){
						System.out.print(semicolon);
					}
					if(digitsNumberForm.equals(dollarSignNum1)){
						System.out.print(dollarSign);
					}
					if(digitsNumberForm.equals(euroSignNum1)){
						System.out.print(euroSign);
					}
					if(digitsNumberForm.equals(poundSignNum1)){
						System.out.print(poundSign);
					}
					if(digitsNumberForm.equals(atNum1)){
						System.out.print(at);
					}
					if(digitsNumberForm.equals(ampersandNum1)){
						System.out.print(ampersand);
					}
					if(digitsNumberForm.equals(slashNum1)){
						System.out.print(slash);
					}
					if(digitsNumberForm.equals(tildeNum1)){
						System.out.print(tilde);
					}
					if(digitsNumberForm.equals(openParenNum1)){
						System.out.print(openParen);
					}
					if(digitsNumberForm.equals(closeParenNum1)){
						System.out.print(closeParen);
					}
					if(digitsNumberForm.equals(timesNum1)){
						System.out.print(times);
					}
					if(digitsNumberForm.equals(plusNum1)){
						System.out.print(plus);
					}
					if(digitsNumberForm.equals(HashNum1)){
						System.out.print(Hash);
					}
					if(digitsNumberForm.equals(PercentNum1)){
						System.out.print(Percent);
					}
					if(digitsNumberForm.equals(CaretNum1)){
						System.out.print(Caret);
					}
					if(digitsNumberForm.equals(OpenBracketNum1)){
						System.out.print(OpenBracket);
					}
					if(digitsNumberForm.equals(ClosedBracketNum1)){
						System.out.print(ClosedBracket);
					}
					if(digitsNumberForm.equals(LessThanNum1)){
						System.out.print(LessThan);
					}
					if(digitsNumberForm.equals(GreaterThanNum1)){
						System.out.print(GreaterThan);
					}
					if(digitsNumberForm.equals(QuotationNum1)){
						System.out.print(Quotation);
					}
					if(digitsNumberForm.equals(BackSlashNum1)){
						System.out.print(BackSlash);
					}
					if(digitsNumberForm.equals(UnderscoreNum1)){
						System.out.print(Underscore);
					}
					if(digitsNumberForm.equals(OpenCurlyBracketNum1)){
						System.out.print(OpenCurlyBracket);
					}
					if(digitsNumberForm.equals(ClosedCurlyBracketNum1)){
						System.out.print(ClosedCurlyBracket);
					}
					if(digitsNumberForm.equals(VerticalBarNum1)){
						System.out.print(VerticalBar);
					}
					if(digitsNumberForm.equals(EqualsSignNum1)){
						System.out.print(EqualsSign);
					}

					placeValue++;
					placeValue++;
					}
				}
				System.out.println("\"");
			}
			if(EOrD.equalsIgnoreCase(MainMenuKey)){
				System.out.println();
				fw.close();
				FileGuts.close();
				String Activator = "";
				return Activator;
			}
		}
	}
}