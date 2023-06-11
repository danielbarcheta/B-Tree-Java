
public class Main {

	public static void main(String[] args) throws ArvoreBException {
		ArvoreB ab = new ArvoreB(2);
		ab.insere(1, new Festa("CRUSP", "25/04/2022", 100, true, "Recepcão de Calouros I"));
		ab.insere(2, new Festa("CRUSP", "26/04/2022", 100, true, "Recepcão de Calouros II"));
		ab.insere(3, new Festa("CRUSP", "27/04/2022", 100, true, "Recepcão de Calouros III"));
	}
}
