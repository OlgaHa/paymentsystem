package lv.olga.test;

import lv.olga.employee.ComissionEmployee;
import lv.olga.employee.SalaryEmployee;
import lv.olga.paysystem.PaymentSystem;

public class TestPayment {


	public static void main(String[] args) {
		
		PaymentSystem paymentSystem = new PaymentSystem(); 
		
		ComissionEmployee tom = new ComissionEmployee("Tom Jerk", 1010101, 5000.5); 
		paymentSystem.addPayee(tom);
		ComissionEmployee ieva = new ComissionEmployee("Ieva Perk", 2020202, 5600.5);
		paymentSystem.addPayee(ieva);
		
		
		SalaryEmployee math = new SalaryEmployee("Math B", 303030, 5478.5); 
		paymentSystem.addPayee(math);
		SalaryEmployee dom = new SalaryEmployee("Dom H", 4040404, 5478.0); 
		paymentSystem.addPayee(dom);
		
		
		
		
		tom.giveComission(4.0);
		tom.giveComission(50.0);
		ieva.giveComission(50.0);
		ieva.giveComission(80.0);
		tom.giveBonus(50.0);
		math.giveBonus(12.8);
		paymentSystem.processPayments();
		
		Double d = 40.446563;
		System.out.println(String.format("%1$.2f", d)); //to format to 2 integers after a coma (looks nice)
		
	}

}
