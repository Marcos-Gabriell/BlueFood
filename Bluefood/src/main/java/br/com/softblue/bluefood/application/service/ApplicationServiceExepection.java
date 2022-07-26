package br.com.softblue.bluefood.application.service;

@SuppressWarnings("serial")
public class ApplicationServiceExepection extends RuntimeException {
	public ApplicationServiceExepection(String message, Throwable cause) {
		super(message, cause);
		
	}

	public ApplicationServiceExepection(String message) {
		super(message);
	
	}

	public ApplicationServiceExepection(Throwable cause) {
		super(cause);
		
	}


}
