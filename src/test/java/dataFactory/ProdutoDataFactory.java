package dataFactory;

import pojo.ComponentePojo;
import pojo.ProdutoPojo;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo criarProdutoComumComOValorIgualA(double valor){
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("PlayStation 2");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");

        produto.setProdutoCores(cores);

        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo primeiroComponente = new ComponentePojo();
        primeiroComponente.setComponenteNome("Controle");
        primeiroComponente.setComponenteQuantidade(2);
        componentes.add(primeiroComponente);

        ComponentePojo segundoComponente = new ComponentePojo();
        segundoComponente.setComponenteNome("Memory Card");
        segundoComponente.setComponenteQuantidade(2);
        componentes.add(segundoComponente);

        produto.setComponentes(componentes);

        return produto;
    }
}
