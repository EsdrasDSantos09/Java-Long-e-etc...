package revisao;

public class ProdutoPerecivel extends Produto{
    private Long dataValidade;

    public ProdutoPerecivel(String nome, double preco, Long dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }
    
    public Long getDataValidade(){
        return dataValidade;
    }
    
    public void setDataValidade(Long dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public boolean estaVencido(){
        long agora = System.currentTimeMillis();
        if(agora > dataValidade){
            return true;
        } else{
            return false;
        }
    }
    
    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Está vencido? " + estaVencido());
    }
}
