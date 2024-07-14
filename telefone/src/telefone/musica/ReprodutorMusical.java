package telefone.musica;
public class ReprodutorMusical {
    
   String musicaNome = "Gosta de Rua";

    public void tocarMusica() {
        System.out.printf("\nMúsica %s está tocando", musicaNome);
    }
    public void pararMusica() {
        System.out.println("\nA música parou de tocar");
    }
    public void selecionarMusica() {
        System.out.printf("\nMúsica %s selecionada", musicaNome);
    }
}