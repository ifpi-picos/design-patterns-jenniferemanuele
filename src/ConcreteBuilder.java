// ConcreteBuilder
public class ConcreteBuilder implements Builder {
    private Produto produto = new Produto();

    @Override
    public void buildComponenteA() {
        produto.setComponenteA("Componente A");
    }

    @Override
    public void buildComponenteB() {
        produto.setComponenteB("Componente B");
    }

    @Override
    public void buildComponenteC() {
        produto.setComponenteC("Componente C");
    }

    @Override
    public Produto getProduto() {
        return produto;
    }
}
