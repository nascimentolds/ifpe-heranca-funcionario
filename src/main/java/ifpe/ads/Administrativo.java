package ifpe.ads;

public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);
        System.out.println("Adicional Noturno: R$ " + adicionalNoturno);
    }
}
