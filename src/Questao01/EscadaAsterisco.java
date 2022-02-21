package Questao01;

public class EscadaAsterisco {
	
	private int i, j, k = 0, aux = 0;
	
	public void escada(int n) {
		for (i = n; i > 0; i--) {
			while (k < n) {
				System.out.print(" ");
				k++;
			}
			for (j = 0; j <= n - i; j++) {
				System.out.print("*");
			}

			System.out.println();
			aux++;
			k = aux;
		}
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getAux() {
		return aux;
	}

	public void setAux(int aux) {
		this.aux = aux;
	}

}