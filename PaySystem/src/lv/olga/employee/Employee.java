package lv.olga.employee;

import lv.olga.paysystem.Payee;

public abstract class Employee implements Payee {
	private String name;
	private Integer bankAccount; 
	
	protected Double currentBonus;
	protected Double grossWage;
	
	public Employee(String name, Integer bankAccount, Double grossWage) {
		this.name = name;
		this.bankAccount = bankAccount;
		this.grossWage = grossWage;
		currentBonus = 0.0; 
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public Integer bankAccount() {
		return bankAccount;
	} 
	
	protected Double doCurrentBonus() {
		Double bonus = currentBonus;
		currentBonus = 0.0; 
		return bonus; 
	}
	
	public abstract void giveBonus(Double percentage);
	
}
