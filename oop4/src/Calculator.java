import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Shawn Summermatter on 24/03/14.
 */
public class Calculator extends Frame implements ActionListener, WindowListener {

    Button seven = new Button("7");
    Button eight = new Button("8");
    Button nine = new Button("9");
    Button div = new Button("/");

    Button four = new Button("4");
    Button five = new Button("5");
    Button six = new Button("6");
    Button mul = new Button("*");

    Button one = new Button("1");
    Button two = new Button("2");
    Button three = new Button("3");
    Button min = new Button("-");

    Button zero = new Button("0");
    Button S = new Button("S");
    Button equals = new Button("=");
    Button plus = new Button("+");

    Button C = new Button("C");

    TextField input = new TextField("0");

    int operand1;
    int operand2;
    int result;
    int operator;

    public Calculator(){
        setSize(250, 200);
        setResizable(false);

        setLayout(new BorderLayout());

        Panel p = new Panel(new GridLayout(5,4,0,0));

        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(div);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(mul);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(min);
        p.add(zero);
        p.add(S);
        p.add(equals);
        p.add(plus);
        p.add(C);

        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        plus.addActionListener(this);
        min.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        C.addActionListener(this);
        S.addActionListener(this);

        input.setEditable(false);
        input.setBackground(Color.GREEN);
        add(input, BorderLayout.NORTH);
        add(p,BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        addWindowListener(this);

        setVisible(true);
    }

    public static void main (String args[]){
        Calculator c = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        char ch = (e.getActionCommand()).charAt(0);
        String x = "0";
        String y = "0";

        switch (ch){
            case '+':
                operand1 = Integer.parseInt(input.getText());

                operator = 1;
                break;
            case '-':
                operand1 = Integer.parseInt(input.getText());

                operator = 2;
                break;
            case '*':
                operand1 = Integer.parseInt(input.getText());

                operator = 3;
                break;
            case '/':
                operand1 = Integer.parseInt(input.getText());

                operator = 4;
                break;
            case '=':
                operand2 = Integer.parseInt(input.getText());

                switch (operator){
                    case 1:
                        result = operand1 + operand2;
                        break;
                    case 2:
                        result = operand1 - operand2;
                        break;
                    case 3:
                        result = operand1 * operand2;
                        break;
                    case 4:
                        result = operand1 / operand2;
                        break;
                }

                input.setText(String.valueOf(result));

                operator = 0;
                break;
            case 'C':
                input.setText("0");
                operand1 = 0;
                operand2 = 0;
                operator = 0;
                break;
            case 'S':
                int i = Integer.parseInt(input.getText());

                i = i*(-1);

                input.setText(String.valueOf(i));

                break;
            default:
                x = input.getText();
                y = String.valueOf(ch);

                if(x.startsWith("0") || operator > 0){
                    x = y;
                } else {
                    x = x + y;
                }

                input.setText(x);


        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(1);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
