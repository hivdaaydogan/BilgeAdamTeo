package com.hivdaadydogan;

public class Arzum implements ITermometre, INemOlcer, ITarihSaatGoster {

	@Override
	public String tarihGoster() {
		return "17 Kasım 2022";
	}

	@Override
	public String saatGoster() {
		return "14:48";
	}

	@Override
	public double nemOlc() {
		return 30.5;
	}

	@Override
	public int sicakligiOlc() {
		return 22;
	}

}
