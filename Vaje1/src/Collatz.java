import java.util.ArrayList;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int k = dolzina(6);
		//ArrayList<Integer> z = cleni(6);
		//for (Integer p : z) {
		String n = poudari("helen");
		System.out.print(n);
		}
		
		
	}
private static int naslednji (int n) {
	if (n % 2 == 0) {
		n = n/2;
	} else {
		n = n*3 +1;
	}
	return n;
}
	
private static int dolzina (int n) {
	int k = 1;
	while (n > 1) {
		n = naslednji(n);
		k ++;
	}
	return k;
}
private static int najvecji (int n) {
	int m = n;
	while (n > 1) {
		n = naslednji(n);
		if (m < n) {
			m = n;
		}
	}
	return m;
}
private static ArrayList<Integer> cleni (int n){
	ArrayList<Integer> zaporedje = new ArrayList<Integer>();
	while (n > 1) {
		zaporedje.add(n);
		n = naslednji(n);
	}
	zaporedje.add(1);
	return zaporedje;
}
}
