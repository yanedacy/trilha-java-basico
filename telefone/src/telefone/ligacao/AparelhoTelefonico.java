package telefone.ligacao;
public class AparelhoTelefonico {
    
    String numero = "64984577921";

    public void ligar() {
        System.out.println("Ligando para o número " + numero);
    }
    public void atender() {
        System.out.println("Ligação atendida");
    }
    public void correioVoz() {
        System.out.println("Correio de voz iniciado");
    }
}
