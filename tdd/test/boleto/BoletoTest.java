package boleto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;



import java.util.ArrayList;
import java.util.Date;


public class BoletoTest {
	
	ProcessadorBoleto processadorBoleto;
	Fatura fatura;
	ArrayList<Boleto> listaBoletos;


	@BeforeEach
	public void start() {
		
		processadorBoleto = new ProcessadorBoleto();
		
		fatura = new Fatura(new Date(), "Cliente1", 1500.00);
		
		listaBoletos = new ArrayList<Boleto>();
		
	}
	
	
	@DisplayName("Testar a soma dos pagamentos")
	@Test
	public void testGetSumPaymentsValue() {
		double expected = 0;
		listaBoletos.add(new Boleto("111101", new Date(), 1000.00));
		listaBoletos.add(new Boleto("111101", new Date(), 1000.00));

		for (Boleto boleto : listaBoletos) {
			expected += boleto.getValue();
		}

		ArrayList<Pagamento> paymentList = processadorBoleto.getPaymentList(listaBoletos);

		Assertions.assertEquals(expected, processadorBoleto.getSumPaymentsValue(listaBoletos));
	}
	
}
