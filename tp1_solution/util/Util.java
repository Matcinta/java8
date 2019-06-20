package util;

import java.util.Arrays;
import java.util.List;

import bo.ClientJ7;
import bo.ClientJ8;
import factory.ClientFactory;

public abstract class Util {
	private final static ClientJ7[] clientsJ7 = new ClientJ7[] {
		ClientFactory.createClientJ7("Dupont", "Francois", 2005, 11, 1),
		ClientFactory.createClientJ7("Dupont", "Clement", 2012, 3, 6),
		ClientFactory.createClientJ7("Dupont", "Antoine", 1988, 5, 22),
		ClientFactory.createClientJ7("Dupont", "Claire", 2001, 1, 20),
		ClientFactory.createClientJ7("Gerard", "Laurent", 2010, 12, 31),
		ClientFactory.createClientJ7("Bouleau", "Lea", 1956, 1, 1),
		ClientFactory.createClientJ7("Bouleau", "Etienne", 1996, 9, 28),
		ClientFactory.createClientJ7("Bernard", "Francois", 1988, 3, 15),
		ClientFactory.createClientJ7("Le Leydour", "Romain", 1975, 8, 22),
		ClientFactory.createClientJ7("Conan", "Guillaume", 2016, 6, 3)
	};
	
	private final static ClientJ8[] clientsJ8 = new ClientJ8[] {
			ClientFactory.createClientJ8("Dupont", "Francois", 2005, 11, 1),
			ClientFactory.createClientJ8("Dupont", "Clement", 2012, 3, 6),
			ClientFactory.createClientJ8("Dupont", "Antoine", 1988, 5, 22),
			ClientFactory.createClientJ8("Dupont", "Claire", 2001, 1, 20),
			ClientFactory.createClientJ8("Gerard", "Laurent", 2010, 12, 31),
			ClientFactory.createClientJ8("Bouleau", "Lea", 1956, 1, 1),
			ClientFactory.createClientJ8("Bouleau", "Etienne", 1996, 9, 28),
			ClientFactory.createClientJ8("Bernard", "Francois", 1988, 3, 15),
			ClientFactory.createClientJ8("Le Leydour", "Romain", 1975, 8, 22),
			ClientFactory.createClientJ8("Conan", "Guillaume", 2016, 6, 3)
		};
	
	public static List<ClientJ7> get10ClientJ7() {
		return Arrays.asList(clientsJ7);
	}
	
	public static List<ClientJ8> get10ClientJ8() {
		return Arrays.asList(clientsJ8);
	}
}
