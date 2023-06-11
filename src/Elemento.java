
@SuppressWarnings({"unchecked", "rawtypes"})
public class Elemento {
	Comparable chave;
	Object valor;
	
	// Estamos acostumados a manter apenas números 
	// inteiros nas EDs que estudamos. Porém, na prática
	// surgem situacões em que há a necessidade de 
	// armazenar objetos quaisquer e associar uma
	// chave primária a cada objeto armazenado
	// Um "Elemento" representa um par (chave, valor),
	// sendo que o campo "chave" representa a chave 
	// primária, que precisa ser "comparável" às outras
	// chaves, e o campo "valor" representa o objeto
	// a ser armazenado, que pode ser qualquer coisa.
	public Elemento(Comparable chave, Object valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}

	// um elemento "a" é menor que um elemento "b" 
	// se e só se a.chave < b.chave. Utilizamos o 
	// método "compareTo" para saber se uma chave
	// é ou não menor do que outra.
	public boolean ehMenor(Elemento elemento) {
		return chave.compareTo(elemento.chave) < 0;
	}
}
