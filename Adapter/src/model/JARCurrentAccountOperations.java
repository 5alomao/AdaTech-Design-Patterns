package model;

import java.math.BigDecimal;

public class JARCurrentAccountOperations {

	public boolean validateBalance(BigDecimal amount) {
		System.out.println("Validando saldo ...");
		return true;
	}

	public void withdraw(BigDecimal amount) {
		System.out.println("Sacando ...");
	}

	public void deposit(BigDecimal amount) {
		System.out.println("Depositando ...");
	}
}
