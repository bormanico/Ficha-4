package ficha4;

public class FrutaPeso extends Fruta implements Descontavel {
	private double peso;
	private double percentagemDesconto;

	public FrutaPeso(String aNome, double aPrecoBase, double aPeso) {
		super(aNome, aPrecoBase);
		peso = aPeso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPercentagemDesconto() {
		return percentagemDesconto;
	}

	public void setPercentagemDesconto(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

	public double pagar() {
		double preco = peso * getPrecoBase() - descontar();
		return preco;
	}

	@Override
	public double descontar() {

		return getPrecoBase() * peso * percentagemDesconto;
	}
}
