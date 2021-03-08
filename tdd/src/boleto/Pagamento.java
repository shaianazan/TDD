package boleto;

import java.util.Date;

public class Pagamento {

	private Boleto boleto;
	private Date dataPagamento;
	private double valor;
	
	
	
	public Pagamento(Boleto boleto, Date dataPagamento, double valor) {
		
		this.boleto = boleto;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		
	}



	public Boleto getBoleto() {
		return boleto;
	}



	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}



	public Date getDataPagamento() {
		return dataPagamento;
	}



	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	
}

