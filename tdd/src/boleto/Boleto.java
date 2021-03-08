package boleto;

import java.util.Date;


public class Boleto {
	
	private String codigo;
	private Date dataPagamento;
	private double valor;

	public Boleto(String codigo, Date dataPagamento, double valor) {
	
		super();
		
		this.codigo = codigo;
		this.dataPagamento = dataPagamento;
		this.valor = valor;
		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
