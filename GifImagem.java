import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GifImagem implements Imagem {
	private JLabel label1, label2;
	private ImageIcon imagem;

	@Override
	public void exibirImagem() {
		imagem = new ImageIcon("diretório da imagem");
		imagem.getImage();

	}

	@Override
	public void informarTamanho() {
		imagem.getImageLoadStatus();

	}

	@Override
	public void nomeImagem() {
		imagem.getImageObserver().getClass();

	}

}
