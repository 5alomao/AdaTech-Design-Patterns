package model;

import java.math.BigDecimal;

public class JARClientCurrentAccountOperationsAdapter {

	private JARCurrentAccountOperationsAdapter jcaoAdapter;

	public JARClientCurrentAccountOperationsAdapter(JARCurrentAccountOperationsAdapter jcaoAdapter) {
		this.jcaoAdapter = jcaoAdapter;
	}

	public void withdraw(BigDecimal amount) {
		jcaoAdapter.withdraw(amount);
	}

	public void deposit(BigDecimal amount) {
		jcaoAdapter.deposit(amount);
	}
}
