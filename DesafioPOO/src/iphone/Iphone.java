package iphone;

public class Iphone extends FuncoesIphone  {
    public static void main(String[] args) throws Exception {
        Iphone  iphone11 = new Iphone();

        iphone11.tocar();
        iphone11.selecionarMusica();

        iphone11.exibirPagina();
        iphone11.novaAba();
        iphone11.fecharAba();
        iphone11.atualizarAba();

        iphone11.ligar();
        iphone11.atender();
        iphone11.iniciarCorreioVoz();

    }
}

