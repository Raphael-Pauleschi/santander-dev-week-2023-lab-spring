package me.dio.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class ItemCannotBeCreatedException extends Exception {
	
	private static final long serialVersionUID = 1L;

public ItemCannotBeCreatedException(String itemName) {
	super(String.format(itemName + "can't be created"))
;}
}
