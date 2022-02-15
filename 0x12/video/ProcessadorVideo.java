
import java.util.ArrayList;

public class ProcessadorVideo {

	private ArrayList<CanalNotificacao> canais;

	public ProcessadorVideo() {
		this.canais = new ArrayList<>();
	}

	public void registrarCanal(CanalNotificacao canais) {
		this.canais.add(canais);
	}

	public void processar(Video arquivos) {
		for (CanalNotificacao canalNotificacao : canais) {
			canalNotificacao
					.notificar(new Mensagem( arquivos.getArquivo() +  " - "  + arquivos.getFormato(), TipoMensagem.LOG));
		}
	}

}
