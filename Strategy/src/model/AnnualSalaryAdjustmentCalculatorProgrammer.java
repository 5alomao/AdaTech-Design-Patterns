package model;

import java.math.BigDecimal;

public class AnnualSalaryAdjustmentCalculatorProgrammer implements AnnualSalaryAdjustmentCalculator {

	@Override
	public void calculateAnnualSalaryAdjustment(Employee objEmployee) {
		BigDecimal salary = objEmployee.getSalary();
		objEmployee.setSalary(salary.add(salary.multiply(new BigDecimal(0.10))));
	}

}
