package view;

import java.math.BigDecimal;
import model.JARClientCurrentAccountOperationsAdapter;
import model.JARCurrentAccountOperations;
import model.JARCurrentAccountOperationsAdapter;

public class Main {

	public static void main(String[] args) {

		JARCurrentAccountOperations jcao = new JARCurrentAccountOperations();
		JARCurrentAccountOperationsAdapter jca = new JARCurrentAccountOperationsAdapter(jcao);
		JARClientCurrentAccountOperationsAdapter client = new JARClientCurrentAccountOperationsAdapter(jca);

		BigDecimal amount = new BigDecimal(1000);

		client.withdraw(amount);
		client.deposit(new BigDecimal(500));
	}
}
