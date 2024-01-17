public class ExemploBuilder {
        public static void main(String[] args) {
            Builder builder = new ConcreteBuilder();
            Diretor diretor = new Diretor();
    
            Produto produto = diretor.construir(builder);
    
            System.out.println(produto);
        }
    }

