import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        Frame f = new Frame("mini AWT calculator");

        Label l1 = new Label("enter first number");
        Label l2 = new Label("choose operation");
        Label l3 = new Label("enter second number");
        Label l4 = new Label("");
        Label l5 = new Label("result is");
        Label l6 = new Label("");

        TextField t1 = new TextField();
        TextField t2 = new TextField();

        Choice c1 = new Choice();
        c1.add("+");
        c1.add("*");
        c1.add("*");
        c1.add("/");

        Button b1 = new Button("calculate");

        t1.setBackground(Color.lightGray);
        t2.setBackground(Color.lightGray);
        l5.setBackground(Color.pink);
        c1.setBackground(Color.pink);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(c1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(b1);
        f.add(l5);
        f.add(l6);

        f.setLayout(new GridLayout(5, 5));
        f.setSize(500, 250);
        f.setVisible(true);
        f.setLayout(null);

        b1.addActionListener(e -> {

            int n1 = Integer.parseInt((t1.getText()));
            int n2 = Integer.parseInt((t2.getText()));

            String s = c1.getSelectedItem();

            if (e.getSource() == b1 && s.equals("+")) {
                l6.setText(String.valueOf(n1 + n2));
            }

            if (e.getSource() == b1 && s.equals("-")) {
                l6.setText(String.valueOf(n1 - n2));
            }

            if (e.getSource() == b1 && s.equals("*")) {
                l6.setText(String.valueOf(n1 * n2));
            }

            if (e.getSource() == b1 && s.equals("/")) {
                if (n2 == 0 || n1 == 0) {
                    l6.setText("Cannot divide by 0!");
                }
                else {
                    l6.setText(String.valueOf(n1 / n2));
                }




            }






        });

    }
}
