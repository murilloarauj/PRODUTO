class Pessoa {// Classe que representa uma pessoa

    // Atributos necessários da pessoa
    String nome;
    String sobrenome;
    int altura; // altura em centímetros
    String datanascimento;

    Pessoa(String nome, String sobrenome, int altura, String datanasc) { // Construtor para inicializar os atributos da pessoa
        this.nome = nome; // O 'this.' refere-se ao atributo da classe
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.datanascimento = datanascimento;
    }
    String descricao() {// Método que retorna a descrição formatada da pessoa
        String nomesemEspaco = this.nome.replace(" ", "").toLowerCase(); // Remove espaços em branco e transforma o nome em minúsculas para formatar o email
        String sobrenomesemEspaco = this.sobrenome.replace(" ", "").toLowerCase(); // Faz o mesmo para o sobrenome
        return nomesemEspaco + "." + sobrenomesemEspaco + "@dominio.com";// Retorna o email formatado     
    }
}
public class Produto {// Classe que representa um produto
	
    // Atributos do produto
    String nome;
    String marca;
    int custo;
    int venda;

    Produto(String nome, String marca, int custo, int venda) {// Construtor para inicializar os atributos do produto
        this.nome = nome; // O 'this.' refere-se ao atributo da classe
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
    }
    
    int calcularLucro() {    // Método que calcula o lucro do produto
        return venda - custo;
    }
    String descricao() {    // Método que retorna a descrição do produto
        return
            "Nome: " + this.nome + "\n" +
            "Marca: " + this.marca + "\n" +
            "Custo: " + this.custo + "\n" +
            "Valor de venda: " + this.venda + "\n" +
            "Lucro do produto: " + calcularLucro();
    }
    public static void main(String[] args) {
        Produto p1 = new Produto("Air Max 95 Corteiz", "Nike", 350, 1000);// Criação de um novo objeto Produto com suas características
        Pessoa pe1 = new Pessoa(" Murillo Araujo ", " Santana Lucas ", 178, "06/12/2005");// Criação de um novo objeto Pessoa com suas características
        
        System.out.println(p1.descricao());// Exibe a descrição do produto

        System.out.println(pe1.descricao());// Exibe a descrição da pessoa

    }
}