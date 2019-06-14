
public class FactoryImagem {
	public Imagem obterImagem(String tipo) {
		Imagem imagem = null;
		switch (tipo) {
		case "Gif":
			imagem = new GifImagem();
			break;

		case "Jpg":
			imagem = new JpgImagem();

			break;

		case "Png":
			imagem = new PngImagem();

			break;

		default:
			System.err.print("Opção nao encontrada.Em falta no caso");
		}
		return imagem;

	}

}
