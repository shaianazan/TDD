package boleto;

import java.util.ArrayList;
import java.util.Date;

public class ProcessadorBoleto {

	public Fatura processaPagamento(Fatura fatura, ArrayList<Boleto> boleto) {
		fatura.setListaPagamento(getListaPagamento1(boleto));

		fatura.setStatus(
				getSomaPagamentos(fatura.getListaPagamento()) >= fatura.getValorTotal() ? Status.FECHADA
						: Status.ABERTA);

		return fatura;
	}

	public ArrayList<Pagamento> getListaPagamento1(ArrayList<Boleto> listaBoletos) {
		ArrayList<Pagamento> listaPagamento = new ArrayList<Pagamento>();

		for (Boleto boleto : listaBoletos)
			listaPagamento.add(new Pagamento(boleto, new Date(), boleto.getValor()));

		return listaPagamento;
	}

	public double getSomaPagamentos(ArrayList<Pagamento> listaPagamento) {
		double valorTotal = 0;

		for (Pagamento pagamento : listaPagamento)
			valorTotal += pagamento.getValor();

		return valorTotal;
	}

	public ArrayList<Pagamento> getListaPagamento(ArrayList<Boleto> listaBoletos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
