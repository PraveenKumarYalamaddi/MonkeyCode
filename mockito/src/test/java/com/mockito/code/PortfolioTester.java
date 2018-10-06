package com.mockito.code;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

public class PortfolioTester {
	Portfolio portfolio;
	StockService stockService;
	
	public static void main(String[] args) {
		PortfolioTester pt = new PortfolioTester();
		pt.setUp();
		System.out.println(pt.testGetMarketValue()?"Pass":"Fail");
		
	}
	
	public void setUp() {
		portfolio = new Portfolio();
		stockService = mock(StockService.class);
		portfolio.setStockService(stockService);
	}
	
	public boolean testGetMarketValue() {
		List<Stock> stocks = new ArrayList<Stock>();
		Stock googleStock = new Stock("1", "Google", 10);
		Stock facebookStock = new Stock("2", "Facebook", 100);
		stocks.add(googleStock);
		stocks.add(facebookStock);
		portfolio.setStocks(stocks);
		
		when(stockService.getPrice(googleStock)).thenReturn(50.00);
		when(stockService.getPrice(facebookStock)).thenReturn(1000.00);
		double marketValue = portfolio.getMatketValue();
		return marketValue == 100500.00;
	}

}
