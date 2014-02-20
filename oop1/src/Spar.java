/**
 * Created by tiesums on 20.02.14.
 */
public class Spar extends Konto {
    private double maxOut;

    public Spar(double saldo, double rate, double maxOut)
    {
        super(saldo, rate);
        this.maxOut = maxOut;
    }

    @Override
    public void payOut(double value) {
        if (getSaldo() >= value){
            setSaldo(getSaldo() - value);
        } else {
            System.out.println("Auszahlung nicht möglich. Eingabe: " + value + " ist grösser als Saldo: " + getSaldo());
        }
    }

    @Override
    public void print() {
        super.print(1);
        System.out.println(this.maxOut);
    }

    public static void main(String[] args) {
        Spar s1 = new Spar(100, 1.0, 50);
        s1.print();
        s1.payIn(50);
        s1.print();
        s1.payOut(75);
        s1.print();
    }
}
