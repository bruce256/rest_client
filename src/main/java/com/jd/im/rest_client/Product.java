package com.jd.im.rest_client;

import java.io.Serializable;

public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long	serialVersionUID	= 4577791124638009422L;
	
	private int							id;

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}
}
