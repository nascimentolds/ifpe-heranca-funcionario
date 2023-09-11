package ifpe.ads;

public class Tecnico extends Assistente{
    private double bonusSalarial;

    public Tecnico(String nome, double salario, String matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Bonus Salarial: R$ " + bonusSalarial);
    }
}
