package com.jurandir.cursojava.aula52.labs;

public class AgendaCheiaExeption extends Exception {

	@Override
	public String getMessage() {
		return "Agenda j� est� cheia";
	}

}
