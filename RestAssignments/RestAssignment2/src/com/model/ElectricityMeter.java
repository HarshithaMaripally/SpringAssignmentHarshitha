
package com.model;
public class ElectricityMeter{
	

	
	private double initialReading;
	private double monthReading;
	public static final double COST_PER_UNIT = 5;
	private double totalBill;
	
	public ElectricityMeter(){
		
	}
	
	public ElectricityMeter(double initialReading, double monthReading){
		this.initialReading = initialReading;
		this.monthReading = monthReading;
	}

	public void setInitialReading(double initialReading) {
		this.initialReading = initialReading;
	}
	
	public double getInitialReading() {
		return this.initialReading;
	}
	
	public void setMonthReading(double monthReading) {
		this.monthReading = monthReading;
	}
	
	public double getMonthReading() {
		return this.monthReading;
	}
	
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public double getTotalBill() {
		return this.totalBill;
	}
	
	@Override
	public String toString() {
		return "Total Bill : "+this.getTotalBill();
	}
}
