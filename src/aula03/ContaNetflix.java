package aula03;

public class ContaNetflix {
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar(){
        //Pegar informações de idioma do usuário
        buscarPreferenciasDoUsuario();
        //Pegar a resolução da tela
        identificarResolucao();
    }

    public void buscarPreferenciasDoUsuario(){
       idiomaPreferencial = "Pt-BR";
    }

    private void identificarResolucao(){
        resolucaoTela = "Full HD";
    }

    void assistirFilme(String nomeFilme){
        System.out.println("Iniciando o filme: " + nomeFilme);
        System.out.println("Carregando o filme na resolução: " + resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme(){
        if(idiomaPreferencial=="Pt-BR" || idiomaPreferencial=="En-US"){
            System.out.println("Carregando o áudio em: " + idiomaPreferencial); 
    }else {
        System.out.println("Carregando o áudio em En-US.");
    }
}  
}