package com.gtm.demoinjection;

public class Saxophone implements Instrument {

	@Override
	public void jouer() {
		System.out.println("SAXOPHONE dit: do re mi fa sol");
	}

	@Override
	public String toString() {
		return "Saxophone";
	}

	
	
}
