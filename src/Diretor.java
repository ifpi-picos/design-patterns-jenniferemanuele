public class Diretor {
    public Produto construir(Builder builder) {
        builder.buildComponenteA();
        builder.buildComponenteB();
        builder.buildComponenteC();
        return builder.getProduto();
    }
}
