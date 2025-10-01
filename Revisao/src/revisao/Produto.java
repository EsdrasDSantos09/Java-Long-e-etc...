package revisao;
public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double novoPreco) {
        if(novoPreco >= 0){
            this.preco = preco;
        }else{
            System.out.println("O preço é inválido!");
        }
    }
    
    public void exibirInfo(){
        System.out.println("Produto: " + nome + " | R$ " + preco);
    }
}
