package lv.olga.employee;

import lv.olga.paysystem.Payee;

public class SalaryEmployee extends Employee {
	

	public SalaryEmployee(String name, Integer bankAccount, Double grossWage) {
		super (name, bankAccount, grossWage);
	}

	@Override
	public Double grossPayment() {
		return grossWage + doCurrentBonus() ;
	}

	@Override
	public void giveBonus(Double percentage) {
		currentBonus += grossWage * (grossWage/100.0);
		
	}

}
