package br.com.softblue.bluefood.application.service;

@SuppressWarnings("serial")
public class ValidationExpeception  extends Exception{
  
	public ValidationExpeception(String message) {
		super(message);
	}
}
