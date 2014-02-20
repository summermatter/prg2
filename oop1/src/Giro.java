/**
 * Created by tiesums on 20.02.14.
 */
public class Giro extends Konto {
    private double creditLimit;
    private double creditRate;

    public Giro()
    {
        super();
        creditLimit = -1000.0;
        creditRate = 10.0;
    }

    @Override
    public void print()
    {
        System.out.println("Kreditlimite: " + creditLimit);
        super.print(); // Muss NICHT 1. Anweisung sein!
    }

}
