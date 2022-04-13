import java.util.ArrayList;
import java.util.Collections;

public class sorteioMegaSena {
    public static void main (String[] args) {
		
		ArrayList <Integer> urna = new ArrayList <Integer>();
		
		for(int i=1; i<=60; i++) {
			urna.add(i);
		}
		
		Collections.shuffle(urna);
		
		System.out.println("SORTEIO DE 6 NÚMEROS\n");
		
		for(int i=1; i<=6; i++)
		System.out.println("Número " + (i) + ": " + urna.get(i));
		
	}
}
