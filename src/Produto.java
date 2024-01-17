public class Produto {
    private String componenteA;
    private String componenteB;
    private String componenteC;

    public void setComponenteA(String componenteA) {
        this.componenteA = componenteA;
    }

    public void setComponenteB(String componenteB) {
        this.componenteB = componenteB;
    }

    public void setComponenteC(String componenteC) {
        this.componenteC = componenteC;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "componenteA='" + componenteA + '\'' +
                ", componenteB='" + componenteB + '\'' +
                ", componenteC='" + componenteC + '\'' +
                '}';
    }
}

