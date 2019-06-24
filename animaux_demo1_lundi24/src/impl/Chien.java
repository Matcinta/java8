package impl;

import inter.Animaux;

public class Chien implements Animaux {

	private String name;
	
	@Override
	public void crier() {
		System.out.println("Ouaf!");
		
	}

	public Chien(String name) {
		super();
		this.name = name;
	}
	
	public void appeler() {
		System.out.println("Au pied " + name);
	}

	public String getName() {
		return name;
	}
}
