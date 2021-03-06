package com.keenum.calcengine;

// Example of a custom Exception class
public class InvalidStatementException extends Exception{
	
	public InvalidStatementException(String reason, String statement){
		super("\n" + reason + ": \"" + statement + "\"");
	}
	
	public InvalidStatementException(String reason, String statement, Throwable cause){
		super("\n" + reason + ": \"" + statement + "\"", cause);
	}

}
