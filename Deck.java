package baraja;
import java.util.Collections;
import java.util.ArrayList;
import java.util.*;

public class Deck {
	
	static void Shuffle(ArrayList<Card> li) {
		Collections.shuffle(li);
		System.out.println("Se mezclo el deck.");
	}
	
	static void Head(ArrayList<Card> li) {
		System.out.println("{" + li.get(0).getPalo() + "}, {" + li.get(0).getColor() + "}, {" + li.get(0).getValor() + "}");
		li.remove(0);
		System.out.println("Quedan " + li.size() + " cartas en el deck" );
	}
	
	static void Pick(ArrayList<Card> li) {
		Random rand = new Random();
		int min=1, max=li.size();
		int n = rand.nextInt((max - min + 1) + min);
		System.out.println("{" + li.get(n).getPalo() + "}, {" + li.get(n).getColor() + "}, {" + li.get(n).getValor() + "}");
		li.remove(n);
		System.out.println("Quedan " + li.size() + " cartas en el deck" );
	}

	static void Hand(ArrayList<Card> li) {
		int n = 1;
		while(n<6) {
			System.out.println("{" + li.get(0).getPalo() + "}, {" + li.get(0).getColor() + "}, {" + li.get(0).getValor() + "}");
			li.remove(0);
			n = n+1; 
		} 
		System.out.println("Quedan " + li.size() + " cartas en el deck" );
	}
	public static void main(String[] args) {
		
		Card[] C1;
		C1 = new Card[13];
		
		for(int i =0; i < 9; i++) {
			int k = i+2;
			String K = Integer.toString(k);
			C1 [i] = new Card ("treboles", "negro", K );
		}
		C1[9] = new Card ("treboles", "negro", "J" );
		C1[10] = new Card ("treboles", "negro", "Q" );
		C1[11] = new Card ("treboles", "negro", "K" );
		C1[12] = new Card ("treboles", "negro", "A" );
		
		Card[] C2;
		C2 = new Card[13];
		
		for(int i =0; i < 9; i++) {
			int k = i+2;
			String K = Integer.toString(k);
			C2 [i] = new Card ("espadas", "negro", K );
		}
		C2 [9] = new Card ("espadas", "negro", "J" );
		C2 [10] = new Card ("espadas", "negro", "Q" );
		C2 [11] = new Card ("espadas", "negro", "K" );
		C2 [12] = new Card ("espadas", "negro", "A" );
	
		Card[] C3;
		C3 = new Card[13];
	
		for(int i =0; i < 9; i++) {
			int k = i+2;
			String K = Integer.toString(k);
			C3 [i] = new Card ("diamantes", "rojo", K );
		}
		C3 [9] = new Card ("diamantes", "rojo", "J" );
		C3 [10] = new Card ("diamantes", "rojo", "Q" );
		C3 [11] = new Card ("diamantes", "rojo", "K" );
		C3 [12] = new Card ("diamantes", "rojo", "A" );
	
		
		Card[] C4;
		C4 = new Card[13];
	
		for(int i =0; i < 9; i++) {
			int k = i+2;
			String K = Integer.toString(k);
			C4 [i] = new Card ("corazones", "rojo", K );
		}
		C4 [9] = new Card ("corazones", "rojo", "J" );
		C4 [10] = new Card ("corazones", "rojo", "Q" );
		C4 [11] = new Card ("corazones", "rojo", "K" );
		C4 [12] = new Card ("corazones", "rojo", "A" );
		
		ArrayList<Card> li = new ArrayList<>();
		for(int i =0; i < C1.length; i++) {
			li.add(C1[i]);
		}
		for(int i =0; i < C2.length; i++) {
			li.add(C2[i]);
		}
		for(int i =0; i < C3.length; i++) {
			li.add(C3[i]);
		}
		for(int i =0; i < C4.length; i++) {
			li.add(C4[i]);
		}	
		
		Shuffle(li);
		Head(li);
		Pick(li);
		Hand(li); 
	}	
}
