import java.util.Scanner; //import skenera

public class main {

	public static void main(String[] args) {
		Scanner sken = new Scanner(System.in); //nacitanie skenera
		int sustava;
		int sustavapremenna;
		int cislo;
		String cisloo;
		System.out.println("Ahoj, vita ta prevodnik cisel.");
		System.out.println("V akej sustave chces mat cislo ? \n1. Bin (1)\n2. Dec (2)\n3. Hex (3)");
		sustava = sken.nextInt();
		switch(sustava) { //switch na zvolenie jednotky pre zadanie (bin,...)
		case 1:{
			System.out.println("Zadaj cislo: ");
			cisloo = sken.next();
			System.out.println("Zadaj do akej sustavy chces previest cislo (10,16):");
			sustavapremenna = sken.nextInt();
			if(sustavapremenna == 10) {
				bintodec(cisloo);
			}
			else if(sustavapremenna == 16){
				cislo = Integer.parseInt(cisloo, 2);
				bintohex(cislo);
			}
			else{
				System.out.println("Zle zadana sustava premeny");
				}
			break;
		}
		case 2:{
			System.out.println("Zadaj cislo: ");
			cislo = sken.nextInt();
			System.out.println("Zadaj do akej sustavy previest cislo (2,16):");
			sustavapremenna = sken.nextInt();
			
			if(sustavapremenna == 2) {
				decitobin(cislo);
			}
			else if(sustavapremenna == 16){
				decitohexa(cislo);
			}
			else{
				System.out.println("Zle zadan� s�stava premeny");
				}
			break;
			}
		case 3:{
			System.out.println("Zadaj cislo: ");
			cisloo = sken.next(); //Zapis do stringu
			cislo = Integer.parseInt(cisloo, 16); //Premenenie string na int
			System.out.println("Zadaj do akej sustavy previest cislo (2,10):");
			sustavapremenna = sken.nextInt();
			
			if(sustavapremenna == 2) {
				hextobin(cislo);
			}
			else if(sustavapremenna == 10){
				hextodec(cisloo);
			}
			else{
				System.out.println("Zle zadana sustava premeny");
				}
			}
			break;
		default:{
			System.out.println("Zle zadana sustava");
			break;
			}
		}
	}
	//Funkcie na premenu podla jednotiek a zvolenych vysledkov
	static void decitobin(int cislo) {
		System.out.println("Bin cislo je: " + Integer.toBinaryString(cislo));
	}
	static void decitohexa(int cislo) {
		System.out.println("Hex cislo je: " +Integer.toHexString(cislo));
	}
	static void bintodec(String cisloo) {
		System.out.println("Dec cislo je: " + Integer.parseInt(cisloo,2));
	}
	static void bintohex(int cislo) {
		System.out.println("Hex cislo je: " + Integer.toHexString(cislo));
	}
	static void hextobin(int cislo) {
		System.out.println("Bin cislo je: " + Integer.toBinaryString(cislo));
	}
	static void hextodec(String cisloo) {
		System.out.println("Dec cislo je: " +Integer.parseInt(cisloo,16));
	}
}
