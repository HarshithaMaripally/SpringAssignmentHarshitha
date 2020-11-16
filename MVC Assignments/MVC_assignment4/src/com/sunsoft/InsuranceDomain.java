package com.sunsoft;

public class InsuranceDomain {

	private String name;
	private int policyNumber;
	private int tenure;
	private int amount;
	 
	public InsuranceDomain() {
		
	}
	
	public InsuranceDomain(String name, int policyNumber, int tenure, int amount) {
		this.name = name;
		this.policyNumber = policyNumber;
		this.tenure = tenure;
		this.amount = amount;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setPolicyNumber(int policyNumber){
		this.policyNumber = policyNumber;
	}
	public int getPolicyNumber() {
		return this.policyNumber;
	}
	
	public void setTensure(int tenure){
		this.tenure = tenure;
	}

	public int getTenure() {
		return this.tenure;
	}
	
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	public int getAmount() {
		return this.amount;
	}
		
	@Override
	public String toString() {
		return "Policy No. : "+this.getPolicyNumber()+"\tName : "+this.getName()+"\tAmount : "+this.getAmount()+"\tTenure : "+this.getTenure();
	}

}
