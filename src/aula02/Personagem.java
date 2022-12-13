import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;
    String alvo;

    //void significa que não retorna nenhuma informação
    void mostrarStatus(){
        System.out.format("Personagem %s (lv. %d) com %d de força.\n", nome, nivel, forca);
    }

    int calcularDano(){
        Random gerador = new Random();
        // 1...20
        // nextInt(): 0...limite desejado
        int dado20Faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20Faces;
        return dano;
    }

    String gerarNome(){
        String nome = "Neno";
        return nome;
    }

    //Método de retorno vazio, e recebe um parâmetro 'alvo' do tipo String
    void atacar(String alvo, String habilidade){
        //"" o tamanho (.lenght) é igual a 0
        int danoCausado = calcularDano();
        if(habilidade.length()==0){
            System.out.format("%s atacou %s e causou %d de dano.\n", nome, alvo, danoCausado);
        }else {
            System.out.format("%s usou '%s' contra %s e causou %d de dano.\n", nome, habilidade, alvo, danoCausado);
        }

    }
}
