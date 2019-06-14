
public class AdapterImagem implements ImagemTaget {

	Imagem imagem;

	public AdapterImagem(String tipo) {

		FactoryImagem imagem = new FactoryImagem();

		if (!(imagem.obterImagem(tipo) == null)) {
			System.out.print("IMAGEM NAO CRIADA");
		} else {
			this.imagem = imagem.obterImagem(tipo);
		}

	}

	@Override
	public void exibirImagem() {

	}

	@Override
	public void informarTamanho() {

		this.imagem.informarTamanho();

	}

	@Override
	public void nomeImagem() {

		this.imagem.nomeImagem();

	}

}
