
public class Poudarjanje {

public static String poudari(String niz) {
	String nov = "";
	for (int i = 0; i < niz.length(); i ++ ) {
		char c = niz.charAt(i);
		char velikiC = Character.toUpperCase(c);
		nov += velikiC;
		if (i < niz.length()-1) {
			nov += ' ';
		}
	}
	return nov;
}
}
