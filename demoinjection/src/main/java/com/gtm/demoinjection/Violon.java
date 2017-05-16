package com.gtm.demoinjection;

public class Violon implements Instrument {

	@Override
	public void jouer() {
		System.out.println("VIOLON");
	}

	@Override
	public String toString() {
		return "Violon";
	}
	
	
}
