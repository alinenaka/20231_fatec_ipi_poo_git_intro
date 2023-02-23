public class Empregado{
    private int tipo;
    //variável de instância (objeto) 
    private String nome; //somente essa classe pode acessar. Variável encapsulada
    //variável de instância (objeto)
    private int idade;
    private double salario;
    private double comissao;
    private double bonus;



    public double calcularSalario () {
        if (tipo == 0) {
            return salario;
        }
        if (tipo == 1) {
            return salario + salario * bonus;
        }
        if (tipo == 2) {
            return salario + bonus;
        }
        return 0;
    }

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
    public int getTipo() {
        return tipo;
    }

    public void setTipo (int tipo) {
        this.tipo = tipo;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getBonus() {
        return bonus;
    }
    public double getComissao() {
        return comissao;
    }
    public double getSalario() {
        return salario;
    }
}
