public class Iphone {
        public static void main(String[] args) {
            
            ReprodutorMusical reprodutor = new ReprodutorMusical();
            reprodutor.tocar();
            reprodutor.selecionarMusica("Música A");
            reprodutor.pausar();
    
            AparelhoTelefonico telefone = new AparelhoTelefonico();
            telefone.ligar();
            telefone.atender();
            telefone.iniciarCorreioDeVoz();
    
            NavegadorInternet navegador = new NavegadorInternet();
            navegador.exibirPagina("https://www.example.com");
            navegador.adicionarAba("https://www.example.com/nova-pagina");
            navegador.atualizarPagina();
        }
    }
