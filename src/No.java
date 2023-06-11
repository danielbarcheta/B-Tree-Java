
public class No {
	Elemento[] elementos;
	No[] filhos;
	int nChaves;
	boolean ehFolha;

	No(int n, boolean ehFolha) {
		this.ehFolha = ehFolha;

		if (!ehFolha) {
			filhos = new No[2 * n + 2];
		}

		elementos = new Elemento[2 * n + 1];
	}
	
	boolean taCheio(int n) {
		return nChaves == 2*n+1;
	}
	
	void insere(Elemento elemento) {
		int i;
		for (i = nChaves - 1; i >= 0; i--) {
			if (elementos[i].ehMenor(elemento)) {
				break;
			}
			elementos[i + 1] = elementos[i];
		}
		elementos[i + 1] = elemento;
		nChaves++;
	}
	
	No encontraFilhoParaInserir(Elemento elemento) {
		int i;
		
		for (i = nChaves - 1; i >= 0; i--) {
			if (elementos[i].ehMenor(elemento)) {
				break;
			}
		}
		
		return filhos[i + 1];
	}
	
	void imprime() {
		
	}
}
