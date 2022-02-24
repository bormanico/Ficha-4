package ficha4;

public class FrutaVolume extends Fruta implements Descontavel {

	private double volume;
	private double percentagemDesconto;

	public FrutaVolume(String aNome, double aPrecoBase, double aVolume) {
		super(aNome, aPrecoBase);
		volume = aVolume;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPercentagemDesconto() {
		return percentagemDesconto;
	}

	public void setPercentagemDesconto(double percentagemDesconto) {
		this.percentagemDesconto = percentagemDesconto;
	}

	public double pagar() {
		double preco = volume * getPrecoBase() - descontar();
		return preco;
	}

	@Override
	public double descontar() {
		return getPrecoBase() * volume * percentagemDesconto;
	}
}
