package telefone;

import telefone.ligacao.AparelhoTelefonico;
import telefone.musica.ReprodutorMusical;
import telefone.navegador.NavegadorInternet;

public class IphoneTeste {
    public static void main(String[] args) {
        ReprodutorMusical r1 = new ReprodutorMusical();
        r1.selecionarMusica();
        r1.tocarMusica();
        r1.pararMusica();

        AparelhoTelefonico a1 = new AparelhoTelefonico();
        a1.ligar();
        a1.correioVoz();

        NavegadorInternet.exibirPagina();
        NavegadorInternet.atualizarPagina();
    }
}
