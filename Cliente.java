
public class Cliente {
	AdapterImagem imagem;
	private String nome;
	private int idade;
	private String cnh;
	private double salario;

	
	public Cliente(String tipo) {
		this.imagem = new AdapterImagem(tipo);
	}

	public void minhaImagem() {
		if (this.imagem == null) {
			imagem.exibirImagem();
			imagem.nomeImagem();
			imagem.informarTamanho();
		} else {
			System.out.print("Imagem Vazia");
		}
	}

	public AdapterImagem getImagem() {
		return imagem;
	}

	public void setImagem(AdapterImagem imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
