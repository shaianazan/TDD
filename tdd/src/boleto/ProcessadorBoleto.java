package boleto;

import java.util.ArrayList;
import java.util.Date;

public class ProcessadorBoleto {

	public fatura processaPagamento(Fatura fatura, ArrayList<Boleto> boleto) {
		fatura.setListaPagamento(getListaPagamento(boleto));

		fatura.setStatus(
				getSomaPagamentos(fatura.getListaPagamento()) >= fatura.getValorTotal() ? FaturaStatus.CLOSED
						: FaturaStatus.OPEN);

		return fatura;
	}

	public ArrayList<Pagamento> getListaPagamento(ArrayList<Boleto> listaBoletos) {
		ArrayList<Pagamento> listaPagamento = new ArrayList<Pagamento>();

		for (Boleto boleto : listaBoletos)
			listaPagamento.add(new Pagamento(boleto, new Date(), boleto.getValor()));

		return listaPagamento;
	}

	public double getSomaPagamentos(ArrayList<Pagamento> listaPagamento) {
		double valorTotal = 0;

		for (Pagamento pagamento : listaPagamento)
			valorTotal += pagamento.getValorPago();

		return valorTotal;
	}

	public ArrayList<Pagamento> getListaPagamento(ArrayList<Boleto> listaBoletos) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
