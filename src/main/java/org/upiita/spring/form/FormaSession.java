package org.upiita.spring.form;

import java.io.Serializable;


//@Scope("session")

public class FormaSession implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer itemsComprados;

	
	
	public Integer getItemsComprados() {
		return itemsComprados;
	}

	public void setItemsComprados(Integer itemsComprados) {
		this.itemsComprados = itemsComprados;
	}
	
	
}
