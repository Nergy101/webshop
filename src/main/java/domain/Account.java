package domain;

import java.util.Set;

public class Account {
	private String openDatum;
	private String factuurAdres;
	private int iD;
	private boolean isActief;
	private Set<Bestelling> bestelling;
	private Adres adres;
	private Klant klant;

}
