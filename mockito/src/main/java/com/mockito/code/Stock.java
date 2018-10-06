package com.mockito.code;

public class Stock {
	
	private String stockId;
	private String name;
	private int quantity;
	
	public Stock(String stockId,String name, int quantity) {
		this.stockId = stockId;
		this.name = name;
		this.quantity = quantity;
	}

	public String getStockID() {
	return stockId;
	}
	
	public void setStockID(String stockId) {
		this.stockId = stockId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
