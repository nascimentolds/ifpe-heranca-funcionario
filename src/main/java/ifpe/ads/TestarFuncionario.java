package ifpe.ads;

public class TestarFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 5000.0, "Vendas");
        gerente.exibeDados();

        Tecnico tecnico = new Tecnico("Maria", 2500.0, "A123", 500.0);
        tecnico.exibeDados();

        Administrativo administrativo = new Administrativo("Carlos", 2200.0, "B456", "noite", 100.0);
        administrativo.exibeDados();
    }
}
