package view;

import java.math.BigDecimal;

import model.AnnualSalaryAdjustmentCalculatorAnalyst;
import model.AnnualSalaryAdjustmentCalculatorDesigner;
import model.AnnualSalaryAdjustmentCalculatorProgrammer;
import model.AnnualSalaryAdjustmentStrategy;
import model.Employee;
import model.PositionType;

public class Main {

	public static void main(String[] args) {

		AnnualSalaryAdjustmentStrategy asas = new AnnualSalaryAdjustmentStrategy();

		Employee designer = new Employee("José", new BigDecimal(5000), PositionType.DESIGNER);
		Employee analyst = new Employee("João", new BigDecimal(10000), PositionType.ANALYST);
		Employee programmer = new Employee("Salomão", new BigDecimal(15000), PositionType.PROGRAMMER);

		System.out.println(designer);
		System.out.println(analyst);
		System.out.println(programmer);

		asas.calculateAnnualSalaryAdjustment(designer, new AnnualSalaryAdjustmentCalculatorDesigner());
		asas.calculateAnnualSalaryAdjustment(analyst, new AnnualSalaryAdjustmentCalculatorAnalyst());
		asas.calculateAnnualSalaryAdjustment(programmer, new AnnualSalaryAdjustmentCalculatorProgrammer());

		System.out.println(designer);
		System.out.println(analyst);
		System.out.println(programmer);
	}

}
