package revisao;

import java.util.ArrayList;
import java.util.List;

public class Revisao {

    public static void main(String[] args) {
        
        List<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Produto("Caderno", 15.50));
        
        //Produtos perecíveis...
        produtos.add(new ProdutoPerecivel("Leite", 5.50, System.currentTimeMillis() - 10000));
        produtos.add(new ProdutoPerecivel("Iogurte", 6.00, System.currentTimeMillis() + 10000));
        
        for(Produto p : produtos){
            p.exibirInfo();
            System.out.println("---------------");
        }
        
        /*List<FormaGeometrica> formas = new ArrayList<>();
        
        formas.add(new Circulo(5));
        formas.add(new Retangulo(4,6));
        
        for(FormaGeometrica forma:formas){
            System.out.println("Área: " + String.format("%.2f", forma.calcularArea()));
        }
        System.out.println("-----------------------------------------------");
        List<Funcionario> funcionarios = new ArrayList<>();
        
        funcionarios.add(new Vendedor("Flockzin", 2500));
        funcionarios.add(new Estagiario("Suguro", 1200));
        
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario.getNome() + " recebe: R$ " + funcionario.calcularSalario());
        }*/
    }
}
