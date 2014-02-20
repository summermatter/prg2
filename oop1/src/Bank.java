import java.util.ArrayList;

/**
 * Created by tiesums on 20.02.14.
 */
public class Bank {
    private String name;
    private ArrayList<Konto> accountList;

    public Bank(String name){
        this.name = name;
        this.accountList = new ArrayList<Konto>(0);
    }

    public void openKonto(double saldo, double rate){
        accountList.add(new Konto(saldo, rate));
    }

    public void openSpar(double saldo, double rate, double maxOut){
        accountList.add(new Spar(saldo, rate, maxOut));
    }

    public int noOfAccounts(){
        int no = accountList.size();

        return no;
    }

    public void printAccounts(){
        for(int i = 0;i < noOfAccounts();i++) {
            System.out.println(accountList.get(i));
        }

    }

    public void printFund(){
        double printSaldo = 0;
        for(int i = 0;i < noOfAccounts();i++) {
            printSaldo += accountList.get(i).getSaldo();
        }
        System.out.println(printSaldo);
    }

    public static void main (String[] args){
        Bank b1 = new Bank("Bank1");
        b1.openKonto(100.0, 1.2);
        b1.openSpar(1000.0, 1.0, 500.0);
        b1.printAccounts();
        b1.printFund();
    }
}
