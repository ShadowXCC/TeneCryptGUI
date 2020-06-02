import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.math.BigInteger;

public class Converter{
	Converter()throws IOException{	}
	
	public static String Activate(String toConvert) throws IOException{		
		SecureRandom generator = new SecureRandom();
		int RandomNumber = generator.nextInt(2) + 1;
				
		int lineNumber = 1;
		String WorkspaceFileName = ReturnFileName.Activate(lineNumber);
		WorkspaceFileName = "Temp\\" + WorkspaceFileName;
		
		FileWriter fw = new FileWriter(WorkspaceFileName);
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
		String euroSign = "\u20AC";
		String poundSign = "\u00A3";
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
		String newLine = "\n";
		
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
		BigInteger NewLineNum= new BigInteger("431");
		
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
		BigInteger NewLineNum1= new BigInteger("111");
		// VARIABLE AREA END
		
		PrintWriter output = new PrintWriter(fw);
		int ToEncryptLength = toConvert.length();
		if(RandomNumber == 1) {
			for(int placeValue = 0;placeValue < ToEncryptLength;placeValue++){
				String character = toConvert.substring(placeValue, placeValue + 1);
				//char character = toConvert.charAt(placeValue);
				if(character.equals(A)){
					output.print(CapANum);
				}
				else if(character.equals(B)){
					output.print(CapBNum);
				}
				else if(character.equals(C)){
					output.print(CapCNum);
				}
				else if(character.equals(D)){
					output.print(CapDNum);
				}
				else if(character.equals(E)){
					output.print(CapENum);
				}
				else if(character.equals(F)){
					output.print(CapFNum);
				}
				else if(character.equals(G)){
					output.print(CapGNum);
				}
				else if(character.equals(H)){
					output.print(CapHNum);
				}
				else if(character.equals(I)){
					output.print(CapINum);
				}
				else if(character.equals(J)){
					output.print(CapJNum);
				}
				else if(character.equals(K)){
					output.print(CapKNum);
				}
				else if(character.equals(L)){
					output.print(CapLNum);
				}
				else if(character.equals(M)){
					output.print(CapMNum);
				}
				else if(character.equals(N)){
					output.print(CapNNum);
				}
				else if(character.equals(O)){
					output.print(CapONum);
				}
				else if(character.equals(P)){
					output.print(CapPNum);
				}
				else if(character.equals(Q)){
					output.print(CapQNum);
				}
				else if(character.equals(R)){
					output.print(CapRNum);
				}
				else if(character.equals(S)){
					output.print(CapSNum);
				}
				else if(character.equals(T)){
					output.print(CapTNum);
				}
				else if(character.equals(U)){
					output.print(CapUNum);
				}
				else if(character.equals(V)){
					output.print(CapVNum);
				}
				else if(character.equals(W)){
					output.print(CapWNum);
				}
				else if(character.equals(X)){
					output.print(CapXNum);
				}
				else if(character.equals(Y)){
					output.print(CapYNum);
				}
				else if(character.equals(Z)){
					output.print(CapZNum);
				}
				else if(character.equals(a)){
					output.print(aNum);
				}
				else if(character.equals(b)){
					output.print(bNum);
				}
				else if(character.equals(c)){
					output.print(cNum);
				}
				else if(character.equals(d)){
					output.print(dNum);
				}
				else if(character.equals(e)){
					output.print(eNum);
				}
				else if(character.equals(f)){
					output.print(fNum);
				}
				else if(character.equals(g)){
					output.print(gNum);
				}
				else if(character.equals(h)){
					output.print(hNum);
				}
				else if(character.equals(i)){
					output.print(iNum);
				}
				else if(character.equals(j)){
					output.print(jNum);
				}
				else if(character.equals(k)){
					output.print(kNum);
				}
				else if(character.equals(l)){
					output.print(lNum);
				}
				else if(character.equals(m)){
					output.print(mNum);
				}
				else if(character.equals(n)){
					output.print(nNum);
				}
				else if(character.equals(o)){
					output.print(oNum);
				}
				else if(character.equals(p)){
					output.print(pNum);
				}
				else if(character.equals(q)){
					output.print(qNum);
				}
				else if(character.equals(r)){
					output.print(rNum);
				}
				else if(character.equals(s)){
					output.print(sNum);
				}
				else if(character.equals(t)){
					output.print(tNum);
				}
				else if(character.equals(u)){
					output.print(uNum);
				}
				else if(character.equals(v)){
					output.print(vNum);
				}
				else if(character.equals(w)){
					output.print(wNum);
				}
				else if(character.equals(x)){
					output.print(xNum);
				}
				else if(character.equals(y)){
					output.print(yNum);
				}
				else if(character.equals(z)){
					output.print(zNum);
				}
				else if(character.equals(one)){
					output.print(oneNum);
				}
				else if(character.equals(two)){
					output.print(twoNum);
				}
				else if(character.equals(three)){
					output.print(threeNum);
				}
				else if(character.equals(four)){
					output.print(fourNum);
				}
				else if(character.equals(five)){
					output.print(fiveNum);
				}
				else if(character.equals(six)){
					output.print(sixNum);
				}
				else if(character.equals(seven)){
					output.print(sevenNum);
				}
				else if(character.equals(eight)){
					output.print(eightNum);
				}
				else if(character.equals(nine)){
					output.print(nineNum);
				}
				else if(character.equals(zero)){
					output.print(zeroNum);
				}
				else if(character.equals(period)){
					output.print(periodNum);
				}
				else if(character.equals(exclamation)){
					output.print(exclamationNum);
				}
				else if(character.equals(question)){
					output.print(questionNum);
				}
				else if(character.equals(apostrophe)){
					output.print(apostropheNum);
				}
				else if(character.equals(comma)){
					output.print(commaNum);
				}
				else if(character.equals(space)){
					output.print(spaceNum);
				}
				else if(character.equals(dash)){
					output.print(dashNum);
				}
				else if(character.equals(colon)){
					output.print(colonNum);
				}
				else if(character.equals(semicolon)){
					output.print(semicolonNum);
				}
				else if(character.equals(dollarSign)){
					output.print(dollarSignNum);
				}
				else if(character.equals(euroSign)){
					output.print(euroSignNum);
				}
				else if(character.equals(poundSign)){
					output.print(poundSignNum);
				}
				else if(character.equals(at)){
					output.print(atNum);
				}
				else if(character.equals(ampersand)){
					output.print(ampersandNum);
				}
				else if(character.equals(slash)){
					output.print(slashNum);
				}
				else if(character.equals(tilde)){
					output.print(tildeNum);
				}
				else if(character.equals(openParen)){
					output.print(openParenNum);
				}
				else if(character.equals(closeParen)){
					output.print(closeParenNum);
				}
				else if(character.equals(times)){
					output.print(timesNum);
				}
				else if(character.equals(plus)){
					output.print(plusNum);
				}
				else if(character.equals(Hash)){
					output.print(HashNum);
				}
				else if(character.equals(Percent)){
					output.print(PercentNum);
				}
				else if(character.equals(Caret)){
					output.print(CaretNum);
				}
				else if(character.equals(OpenBracket)){
					output.print(OpenBracketNum);
				}
				else if(character.equals(ClosedBracket)){
					output.print(ClosedBracketNum);
				}
				else if(character.equals(LessThan)){
					output.print(LessThanNum);
				}
				else if(character.equals(GreaterThan)){
					output.print(GreaterThanNum);
				}
				else if(character.equals(Quotation)){
					output.print(QuotationNum);
				}
				else if(character.equals(BackSlash)){
					output.print(BackSlashNum);
				}
				else if(character.equals(Underscore)){
					output.print(UnderscoreNum);
				}
				else if(character.equals(OpenCurlyBracket)){
					output.print(OpenCurlyBracketNum);
				}
				else if(character.equals(ClosedCurlyBracket)){
					output.print(ClosedCurlyBracketNum);
				}
				else if(character.equals(VerticalBar)){
					output.print(VerticalBarNum);
				}
				else if(character.equals(EqualsSign)){
					output.print(EqualsSignNum);
				}
				else if(character.equals(newLine)){
					output.print(NewLineNum);
				}
				else {
					output.print(questionNum);
				}
			}
		}
		if(RandomNumber == 2) {
			for(int placeValue = 0;placeValue < ToEncryptLength;placeValue++){
				String character = toConvert.substring(placeValue, placeValue + 1);
				if(character.equals(A)){
					output.print(CapANum1);
				}
				else if(character.equals(B)){
					output.print(CapBNum1);
				}
				else if(character.equals(C)){
					output.print(CapCNum1);
				}
				else if(character.equals(D)){
					output.print(CapDNum1);
				}
				else if(character.equals(E)){
					output.print(CapENum1);
				}
				else if(character.equals(F)){
					output.print(CapFNum1);
				}
				else if(character.equals(G)){
					output.print(CapGNum1);
				}
				else if(character.equals(H)){
					output.print(CapHNum1);
				}
				else if(character.equals(I)){
					output.print(CapINum1);
				}
				else if(character.equals(J)){
					output.print(CapJNum1);
				}
				else if(character.equals(K)){
					output.print(CapKNum1);
				}
				else if(character.equals(L)){
					output.print(CapLNum1);
				}
				else if(character.equals(M)){
					output.print(CapMNum1);
				}
				else if(character.equals(N)){
					output.print(CapNNum1);
				}
				else if(character.equals(O)){
					output.print(CapONum1);
				}
				else if(character.equals(P)){
					output.print(CapPNum1);
				}
				else if(character.equals(Q)){
					output.print(CapQNum1);
				}
				else if(character.equals(R)){
					output.print(CapRNum1);
				}
				else if(character.equals(S)){
					output.print(CapSNum1);
				}
				else if(character.equals(T)){
					output.print(CapTNum1);
				}
				else if(character.equals(U)){
					output.print(CapUNum1);
				}
				else if(character.equals(V)){
					output.print(CapVNum1);
				}
				else if(character.equals(W)){
					output.print(CapWNum1);
				}
				else if(character.equals(X)){
					output.print(CapXNum1);
				}
				else if(character.equals(Y)){
					output.print(CapYNum1);
				}
				else if(character.equals(Z)){
					output.print(CapZNum1);
				}
				else if(character.equals(a)){
					output.print(aNum1);
				}
				else if(character.equals(b)){
					output.print(bNum1);
				}
				else if(character.equals(c)){
					output.print(cNum1);
				}
				else if(character.equals(d)){
					output.print(dNum1);
				}
				else if(character.equals(e)){
					output.print(eNum1);
				}
				else if(character.equals(f)){
					output.print(fNum1);
				}
				else if(character.equals(g)){
					output.print(gNum1);
				}
				else if(character.equals(h)){
					output.print(hNum1);
				}
				else if(character.equals(i)){
					output.print(iNum1);
				}
				else if(character.equals(j)){
					output.print(jNum1);
				}
				else if(character.equals(k)){
					output.print(kNum1);
				}
				else if(character.equals(l)){
					output.print(lNum1);
				}
				else if(character.equals(m)){
					output.print(mNum1);
				}
				else if(character.equals(n)){
					output.print(nNum1);
				}
				else if(character.equals(o)){
					output.print(oNum1);
				}
				else if(character.equals(p)){
					output.print(pNum1);
				}
				else if(character.equals(q)){
					output.print(qNum1);
				}
				else if(character.equals(r)){
					output.print(rNum1);
				}
				else if(character.equals(s)){
					output.print(sNum1);
				}
				else if(character.equals(t)){
					output.print(tNum1);
				}
				else if(character.equals(u)){
					output.print(uNum1);
				}
				else if(character.equals(v)){
					output.print(vNum1);
				}
				else if(character.equals(w)){
					output.print(wNum1);
				}
				else if(character.equals(x)){
					output.print(xNum1);
				}
				else if(character.equals(y)){
					output.print(yNum1);
				}
				else if(character.equals(z)){
					output.print(zNum1);
				}
				else if(character.equals(one)){
					output.print(oneNum1);
				}
				else if(character.equals(two)){
					output.print(twoNum1);
				}
				else if(character.equals(three)){
					output.print(threeNum1);
				}
				else if(character.equals(four)){
					output.print(fourNum1);
				}
				else if(character.equals(five)){
					output.print(fiveNum1);
				}
				else if(character.equals(six)){
					output.print(sixNum1);
				}
				else if(character.equals(seven)){
					output.print(sevenNum1);
				}
				else if(character.equals(eight)){
					output.print(eightNum1);
				}
				else if(character.equals(nine)){
					output.print(nineNum1);
				}
				else if(character.equals(zero)){
					output.print(zeroNum1);
				}
				else if(character.equals(period)){
					output.print(periodNum1);
				}
				else if(character.equals(exclamation)){
					output.print(exclamationNum1);
				}
				else if(character.equals(question)){
					output.print(questionNum1);
				}
				else if(character.equals(apostrophe)){
					output.print(apostropheNum1);
				}
				else if(character.equals(comma)){
					output.print(commaNum1);
				}
				else if(character.equals(space)){
					output.print(spaceNum1);
				}
				else if(character.equals(dash)){
					output.print(dashNum1);
				}
				else if(character.equals(colon)){
					output.print(colonNum1);
				}
				else if(character.equals(semicolon)){
					output.print(semicolonNum1);
				}
				else if(character.equals(dollarSign)){
					output.print(dollarSignNum1);
				}
				else if(character.equals(euroSign)){
					output.print(euroSignNum1);
				}
				else if(character.equals(poundSign)){
					output.print(poundSignNum1);
				}
				else if(character.equals(at)){
					output.print(atNum1);
				}
				else if(character.equals(ampersand)){
					output.print(ampersandNum1);
				}
				else if(character.equals(slash)){
					output.print(slashNum1);
				}
				else if(character.equals(tilde)){
					output.print(tildeNum1);
				}
				else if(character.equals(openParen)){
					output.print(openParenNum1);
				}
				else if(character.equals(closeParen)){
					output.print(closeParenNum1);
				}
				else if(character.equals(times)){
					output.print(timesNum1);
				}
				else if(character.equals(plus)){
					output.print(plusNum1);
				}
				else if(character.equals(Hash)){
					output.print(HashNum1);
				}
				else if(character.equals(Percent)){
					output.print(PercentNum1);
				}
				else if(character.equals(Caret)){
					output.print(CaretNum1);
				}
				else if(character.equals(OpenBracket)){
					output.print(OpenBracketNum1);
				}
				else if(character.equals(ClosedBracket)){
					output.print(ClosedBracketNum1);
				}
				else if(character.equals(LessThan)){
					output.print(LessThanNum1);
				}
				else if(character.equals(GreaterThan)){
					output.print(GreaterThanNum1);
				}
				else if(character.equals(Quotation)){
					output.print(QuotationNum1);
				}
				else if(character.equals(BackSlash)){
					output.print(BackSlashNum1);
				}
				else if(character.equals(Underscore)){
					output.print(UnderscoreNum1);
				}
				else if(character.equals(OpenCurlyBracket)){
					output.print(OpenCurlyBracketNum1);
				}
				else if(character.equals(ClosedCurlyBracket)){
					output.print(ClosedCurlyBracketNum1);
				}
				else if(character.equals(VerticalBar)){
					output.print(VerticalBarNum1);
				}
				else if(character.equals(EqualsSign)){
					output.print(EqualsSignNum1);
				}
				else if(character.equals(newLine)){
					output.print(NewLineNum1);
				}
				else {
					output.print(questionNum);
				}
			}
		}
		output.print(RandomNumber);
		output.print(RandomNumber);
		output.close();
		fw.close();
		return "";
	}
}