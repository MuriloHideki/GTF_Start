
public class CamaroteSuperior extends VIP{
	private double valorAdicional;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	public void valorDoIngresso(){
		System.out.println(getValorTotal()+valorAdicional);
	}
}
