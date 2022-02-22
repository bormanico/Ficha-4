package ficha4;

public abstract class Fruta {
	private String nome;
	private double precoBase;

	public Fruta(String aNome, double aPrecoBase) {
		this.nome = aNome;
		this.precoBase = aPrecoBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public abstract double pagar();

}
