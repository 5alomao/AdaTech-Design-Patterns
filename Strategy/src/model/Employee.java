package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Employee {

	private String name;
	private BigDecimal salary;
	private PositionType position;

	public Employee(String name, BigDecimal salary, PositionType position) {
		this.name = name;
		this.salary = salary;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public PositionType getPosition() {
		return position;
	}

	public void setPosition(PositionType position) {
		this.position = position;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + name + "\nSalário: " + salary.setScale(2, RoundingMode.HALF_EVEN) + "\nCargo: " + position
				+ "\n";
	}

}
