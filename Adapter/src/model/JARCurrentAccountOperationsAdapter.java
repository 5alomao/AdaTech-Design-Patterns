package model;

import java.math.BigDecimal;

public class JARCurrentAccountOperationsAdapter {

	private JARCurrentAccountOperations jcao;

	public JARCurrentAccountOperationsAdapter(JARCurrentAccountOperations jcao) {
		this.jcao = jcao;
	}

	public void withdraw(BigDecimal amount) {
		if (jcao.validateBalance(amount)) {
			jcao.withdraw(amount);
		} else {
			throw new IllegalArgumentException("Valor para saque não permitido.");
		}
	}

	public void deposit(BigDecimal amount) {
		jcao.deposit(amount);
	}
}
