package bai2;

import java.sql.Date;

public class Car {
	private String name;
	private String engine;
	private int seats;
	private String productiondate;
	public Car(String name, String engine,int seats, String string) {
		super();
		this.name = name;
		this.engine = engine;
		this.productiondate = string;
	}
	public Car() {
		super();
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getProductiondate() {
		return productiondate;
	}
	public void setProductiondate(String productiondate) {
		this.productiondate = productiondate;
	}

	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "Car@[name=" + (String) name + ", engine= " + engine + ", seats= " + seats +", productiondate= " + productiondate ;
		
	}
	

}
