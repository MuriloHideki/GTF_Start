package Entities;

public class carro {
	private double precoFinal;
	private double valor;
	
	public carro(double valor) {
		this.valor = valor;
		setPrecoFinal(valor, 0);
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getPrecoFinal() {
		return precoFinal;
	}
	public void setPrecoFinal(double precoFinal, int qtdParcelas) {
		this.precoFinal = valor + calculaParcela(qtdParcelas);
	}
	
	public double calculaParcela (int qtdParcelas) {
		if(qtdParcelas == 00) {
			return valor*0.80;
		}else if(qtdParcelas == 6) {
			return valor*1.03;
		}else if(qtdParcelas == 12) {
			return valor*1.06;
		}else if(qtdParcelas == 18) {
			return valor*1.09;
		}else if(qtdParcelas == 24) {
			return valor*1.12;
		}else {
			return valor*1.15;
		}
	}
	
	public void valores (int qtdParcelas) {
		setPrecoFinal(valor, qtdParcelas);
		calculaParcela (qtdParcelas);
		System.out.println("Peço final: " + precoFinal + ", quantidade de parcelas: "
							+ qtdParcelas + ", valor da parcela: " + (calculaParcela(qtdParcelas)-valor)+".");

	}
}
