package iphone;

import iphone.aparelhotelefonico.AparelhoTelefonico;
import  iphone.navegacaointernet.NavegadorInternet;
import iphone.reproduzirmusica.ReprodutorMusical;

public  class FuncoesIphone  implements  AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    //Reprodutor Musical
    public  void tocar(){
        System.out.println("Tocando música.");
    }
    public  void selecionarMusica(){
        System.out.println("Selecionando música.");

    }

    //Navegar na Internet
    public  void exibirPagina(){
        System.out.println("Exibindo página na internet.");

    }
    public  void novaAba(){
        System.out.println("Abrindo nova aba no navegador.");

    }
    public  void fecharAba(){
        System.out.println("Fechando aba.");

    }
    public  void atualizarAba(){
        System.out.println("Atualizando aba.");

    }

    //Ações do aparelho telefônico
    public void ligar(){
        System.out.println("Ligando iPhone.");

    }
    public void  atender(){
        System.out.println("Atendendo ligação.");

    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");

    }

}