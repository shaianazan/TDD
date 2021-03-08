package boleto;


import java.util.ArrayList;
import java.util.Date;


public class Fatura {

	private Date data;
	private String nome;
	private double valorTotal;
	private Status status;
	private ArrayList<Pagamento> listaPagamento;
	
	
	public Fatura(Date data, double valorTotal, String nome) {
		
		super();
		this.valorTotal = valorTotal;
		this.data = data;
		this.nome = nome;
		this.listaPagamento = new ArrayList<Pagamento>();
		this.status = Status.OPEN;
	}

	public Fatura(Date data, double valorTotal, String nome, ArrayList<Pagamento> listaPagamento,
			Status status) {
		
		super();
		this.data = data;
		this.valorTotal = valorTotal;
		this.nome = nome;
		this.listaPagamento = listaPagamento;
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ArrayList<Pagamento> getListaPagamento() {
		return listaPagamento;
	}

	public void setListaPagamento(ArrayList<Pagamento> listaPagamento) {
		this.listaPagamento = listaPagamento;
	}
	
	
	
}