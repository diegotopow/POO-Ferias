package aula01;

// cria uma classe chamada "Animal"
public class Animal {
    // cria uma variável de instância chamada "nome"
    private String nome = "Biu";
  
    // cria um construtor que recebe o nome do animal como parâmetro
    public Animal(String nome) {
      // atribui o valor do parâmetro à variável de instância
      this.nome = nome;
    }
  
    // cria um método chamado "falar" que retorna um texto com o nome do animal
    public String falar() {
      return "Oi, eu sou um " + nome;
    }
  }
  
  // cria uma classe chamada "Cachorro" que herda da classe "Animal"
  public class Cachorro extends Animal {
    // cria um construtor que recebe o nome do cachorro como parâmetro
    // e chama o construtor da classe pai (Animal) passando o nome como parâmetro
    public Cachorro(String nome) {
      super(nome);
    }
  
    // sobrescreve o método "falar" herdado da classe pai (Animal)
    // para retornar um texto diferente
    @Override
    public String falar() {
      return "Au au, eu sou o " + nome;
    }
  }
  
  // cria uma classe chamada "Programa"
  public class Programa {
    // cria o método principal (ponto de entrada do programa)
    public static void main(String[] args) {
      // cria um objeto da classe "Cachorro" chamado "buddy"
      Cachorro buddy = new Cachorro("Buddy");
  
      // imprime o resultado do método "falar" do objeto "buddy"
      System.out.println(buddy.falar());
    }
  }
  