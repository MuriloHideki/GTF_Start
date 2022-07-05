
public class VIP extends Ingresso{
	private double valorAdicional;
	private double valorTotal = valorAdicional+getValor();
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public void imprimeValor() {
		System.out.println("Valor "+valorTotal);
	}
}
