/**
 * Created by tiesums on 20.02.14.
 */
public class Konto {
    private static int count = 0;
    private int no;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private double saldo;
    private double rate;

    public Konto()
    {
        no = count;
        count++;
        saldo = 0.0;
        rate = 0.0;
    }

    public Konto(double saldo, double rate){
        no = count;
        count++;
        this.saldo = saldo;
        this.rate = rate;
    }

    public void payIn(double value)
    {
        if (value > 0.0) {
            saldo = saldo + value;
        }
    }

    public void payOut(double value) {
        saldo = saldo - value;
    }

    public void print() // print() ohne Parameter
    {
        System.out.println("Saldo: " + saldo);
    }

    public void print(int space) // print() mit anderer Signatur!
    {
        System.out.print("Saldo:");
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println(saldo);
    }
}
