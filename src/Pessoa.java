package src;

public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;
    private String apelido;
    private boolean estaCadastrado;

    public Pessoa(String nome) {
        System.out.println("Uma pessao acaba de nascer!");
        this.nome = nome;
        this.idade = 23;
        this.altura = 1.45f;
        imprimirDados();
      
    }

    public void imprimirDados() {
        System.out.format(
            "Nome: %s, idade = %d e %.2fm \n",
            nome,
            idade,
            altura
        );
    }
}
