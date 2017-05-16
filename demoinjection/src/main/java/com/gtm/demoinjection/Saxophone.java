package com.gtm.demoinjection;

public class Saxophone implements Instrument {

	@Override
	public void jouer() {
		System.out.println("SAXOPHONE");
	}

	@Override
	public String toString() {
		return "Saxophone";
	}

	
	
}
