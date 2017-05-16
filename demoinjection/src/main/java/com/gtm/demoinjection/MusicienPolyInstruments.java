package com.gtm.demoinjection;

import java.util.Collection;

public class MusicienPolyInstruments implements Performeur {

	public MusicienPolyInstruments() {
		super();
	}
	
	public void performe() throws PerformanceException {
		for(Instrument instrument : instruments) {
		instrument.jouer();
		}
	}
	
	private Collection<Instrument> instruments;
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
		}

	@Override
	public String toString() {
		return "MusicienPolyInstruments [instruments=" + instruments + "]";
	}
	
	
}
