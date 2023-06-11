@SuppressWarnings({"rawtypes"})
public class ArvoreB {
	private int n;
	private No raiz;
	
	public ArvoreB(int n) {
		this.n = n;
	}

	public void insere(Comparable chave, Object valor) throws ArvoreBException {
		if(raiz == null) {
			raiz = new No(n, true);
		} 
	}
	
	// se já existir um elemento com a mesma chave do 
	// elemento a ser inserido, lanca ArvoreBException
	private void insere(Elemento elemento, No no) throws ArvoreBException {
		if (no.taCheio(n)) {
			split(elemento);
		} else if (no.ehFolha) {
			no.insere(elemento);
		} else {
			insere(elemento, no.encontraFilhoParaInserir(elemento));
		}
	}
	
	// Pense nos seguintes casos:
	//    - folha (não tem filhos)
	//    - Nó interno (tem filhos)
	//    - raiz (pode ser folha ou nó interno)
	public void split(Elemento elemento) {
		
	}

	// remove o elemento cuja chave 
	// é igual (compareTo devolve 0) ao parâmetro "chave" 
	public void remove(Comparable chave) throws ArvoreBException {
		
	}
	
	// devolve o campo "valor" do elemento cuja chave 
	// é igual (compareTo devolve 0) ao parâmetro "chave" 
	public Object busca(Comparable chave) {
		return null;
	}
}
