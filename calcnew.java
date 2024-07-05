import java.awt.*;
import java.awt.event.*;

public class calcnew extends Frame implements ActionListener {
    TextField t1, t2, res;
    Label lb1, lb2, lb3;
    Button add, mul, div, sub;

    calcnew() {
        setLayout(new GridLayout(6,5,2,2));
        t1 = new TextField(10);
        t2 = new TextField(10);
        res = new TextField(10);
        lb1 = new Label("Enter first number:");
        lb2 = new Label("Enter second number:");
        lb3 = new Label("Result:");
        add = new Button("+");
        sub = new Button("-");
        div = new Button("/");
        mul = new Button("*");
        add(lb1);
        add(t1);
        add(lb2);
        add(t2);
        add(add);
        add(sub);
        add(div);
        add(mul);
        add(lb3);
        add(res);
        t1.setText(" ");
        add.addActionListener(this);
        sub.addActionListener(this);
        div.addActionListener(this);
        mul.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        double a1, b1;
        a1 = Double.parseDouble(t1.getText());
        b1 = Double.parseDouble(t2.getText());
        if (ae.getSource() == add) {
            res.setText("" + (a1 + b1));
        } else if (ae.getSource() == sub) {
            res.setText("" + (a1 - b1));
        } else if (ae.getSource() == mul) {
            res.setText("" + (a1 * b1));
        } else if (ae.getSource() == div) {
            if (b1 > 0) {
                res.setText("" + (a1 / b1));
            } else {
                res.setText("ERROR");
            }
        }
    }

    public static void main(String args[]) {
        calcnew cal = new calcnew();
        cal.setSize(200, 300);
        cal.setVisible(true);
    }
}
