package com.group0931.triagephase2;

/**
 * An Exception thrown when a patient has no visits but visits are requested.
 * If patient has visits but none are loaded into memory, a different exception
 * ({@code VisitsNotLoadedException} is thrown.
 * @author Christina Chung, Angel You, Asher Minden Webb.
 * @see VisitsNotLoadedException
 *
 */
public class NoVisitsException extends Exception {

	private static final long serialVersionUID = 1L;

}
