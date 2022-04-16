import java.util.ArrayList;
import java.util.Collections;

public class sorteio {

	public static void main(String[] args) {

		ArrayList<Integer> urna = new ArrayList<Integer>();

		for (int i = 1; i <= 13; i++)
			urna.add(i);

		Collections.shuffle(urna);
		Collections.shuffle(urna);
		Collections.shuffle(urna);

		System.out.println("1o dia: ");
		for (int i = 0; i <= 3; i++)
			System.out.println(urna.get(i) + "\t");

		System.out.println("\n2o dia: ");
		for (int i = 4; i <= 7; i++)
			System.out.println(urna.get(i) + "\t");

		System.out.println("\n3o dia: ");
		for (int i = 8; i <= 12; i++)
			System.out.println(urna.get(i) + "\t");
	}

}