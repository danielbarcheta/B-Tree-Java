
public class Festa {
	private String local;
	private String data;
	private int nMaxPessoas;
	private boolean ehOpenBar;
	private String nome;

	public Festa(String local, String data, int nMaxPessoas, boolean ehOpenBar, String nome) {
		super();
		this.local = local;
		this.data = data;
		this.nMaxPessoas = nMaxPessoas;
		this.ehOpenBar = ehOpenBar;
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getnMaxPessoas() {
		return nMaxPessoas;
	}

	public void setnMaxPessoas(int nMaxPessoas) {
		this.nMaxPessoas = nMaxPessoas;
	}

	public boolean isEhOpenBar() {
		return ehOpenBar;
	}

	public void setEhOpenBar(boolean ehOpenBar) {
		this.ehOpenBar = ehOpenBar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
