//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//classe produto
public class Produto {
    private String nome;
    private String codigo;
    private double preco;
    private boolean aprovadoQualidade;
    }

//classe linha de produçao
public class LinhaDeProducao {
    private String id;
    private String descriçao;
}

//classe operario
public class Operario{
    private String nome ;
    private String id;
    private  LinhaDeProducao LinhaDeProduçao
}

//classe serviço de controle de qualidade
public class ServicoControleQualidade{
    //nesta classe não havera atributos privados, pois ela não é um serviço
}

//classe serviço de planejamento de produçao
public class RepositorioProdutos{
    private List<produto> produtos;
}

//classe repositorio de produtos
public class RepositorioLinhasDeProducao{
    private List<LinhaDeProduçao>   Linhas;
}
