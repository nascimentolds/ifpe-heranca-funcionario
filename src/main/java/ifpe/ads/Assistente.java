package ifpe.ads;

public class Assistente extends Funcionario{
    private String matricula;

    public Assistente(String nome, double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Matricula: " + matricula);
    }
}
