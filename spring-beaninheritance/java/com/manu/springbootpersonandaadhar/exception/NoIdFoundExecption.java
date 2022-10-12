package com.manu.springbootpersonandaadhar.exception;

public class NoIdFoundExecption extends RuntimeException{
			private String message = "No Id Found";

			public NoIdFoundExecption(String message) {
				super();
				this.message = message;
			}

			public String getMessage() {
				return message;
			}

}
