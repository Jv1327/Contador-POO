public class Contador {
    private int valor;

    public Contador() {
        this.valor = 0;
    }

    // Método para zerar o contador
    public void zerar() {
        this.valor = 0;
    }

    // Método para incrementar o contador
    public void incrementar() {
        this.valor++;
    }

    // Método para retornar o valor do contador
    public int getValor() {
        return this.valor;
    }

    public static void main(String[] args) {
        Contador contador = new Contador();
        System.out.println("Valor inicial do contador: " + contador.getValor());

        contador.incrementar();
        System.out.println("Valor após incrementar: " + contador.getValor());

        contador.zerar();
        System.out.println("Valor após zerar: " + contador.getValor());
    }
}