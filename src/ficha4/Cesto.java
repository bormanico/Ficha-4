package ficha4;

import java.util.ArrayList;
import java.util.List;

public class Cesto {
	private int totalItems;
	private final int limite = 100;
	private List<Fruta> listaCesto;

	public Cesto() {
		totalItems = 0;
		listaCesto = new ArrayList<Fruta>(limite);
	}

	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public void addFruta(Fruta aFruta) {
		if (listaCesto.size() < limite) {
			listaCesto.add(aFruta);
			totalItems++;
		}
	}

	public double valorCesto() {
		double somaValorCesto = 0;
		for (Fruta fru : listaCesto) {

			somaValorCesto += fru.pagar();
		}
		return somaValorCesto;
	}

	public int contaTipo(String tipo) {
		int contagem = 0;
		for (Fruta fru : listaCesto) {
			if (fru.getClass().getSimpleName().equals(tipo)) {
				contagem++;
			}
		}
		return contagem;
	}

	public double valorPorTipo(String tipo) {
		int valor = 0;
		for (Fruta fru : listaCesto) {
			if (fru.getClass().getSimpleName().equals(tipo)) {
				valor += fru.pagar();
			}
		}
		return valor;
	}

}
