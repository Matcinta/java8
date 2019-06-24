package app;

import java.util.ArrayList;
import java.util.List;

import impl.Chat;
import impl.Chien;
import impl.Lion;
import inter.Animaux;

public class Application {

	public static void main(String[] args) {
		
			List<Animaux> animaux = new ArrayList<Animaux>();
			animaux.add(new Chien("poupi"));
			animaux.add(new Chien("milo"));
			animaux.add(new Chat());
			animaux.add(new Chat());
			animaux.add(new Chien("brutus"));
			animaux.add(new Lion());
			animaux.stream().forEach(a -> a.crier());
		
		Chien chien = new Chien("youki");
		Chien toutou = new Chien ("Medor");
		
		chien.appeler();
		
		
	}

}
