package com.gtm.demoinjection;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("maGuitare")
//@Service("guitare")
public class Guitare implements Instrument {

	public void jouer() {
		System.out.println("GUITARE dit: do re mi fa sol");
	}

	@Override
	public String toString() {
		return "Guitare";
	}

}
