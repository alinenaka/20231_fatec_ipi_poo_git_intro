public class Empregado{
    //variável de instância (objeto) 
    private String nome; //somente essa classe pode acessar. Variável encapsulada
    //variável de instância (objeto)
    private int idade;

    public String getNome(){ // método para obter o nome 
        return nome;
    } 

    public void setNome(String nome){
        this.nome = nome; //"this" operador de autoreferencia de instância 
    /*  variável  variável
           de       local
        instância*/   
    }

    public int getIdade () {
        return idade;
    }

    public void setIdade (int idade) {
        this.idade = idade;
    }
}