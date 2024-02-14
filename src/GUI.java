import javax.swing.*;
import java.awt.event.*;

public class GUI {

    int numone,numtwo, result;
    char operator;

    private JPanel mainpanel;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton add;
    private JButton sub;
    private JButton div;
    private JButton mul;
    private JButton ans;
    private JButton Clearall;
    private JButton future;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel answer;

    public GUI() {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setContentPane(mainpanel);
        frame.setSize(400, 460);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        zero.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "0");
            }
        });
        one.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "1");
            }
        });
        future.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "00");
            }
        });
        two.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "2");
            }
        });
        three.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "3");
            }
        });
        four.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "4");
            }
        });
        five.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "5");
            }
        });
        six.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "6");
            }
        });
        seven.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "7");
            }
        });
        eight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "8");
            }
        });
        nine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText(textField1.getText() + "9");
            }
        });
        add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numone = Integer.parseInt(textField1.getText());
                textField1.setText("");
                operator = '+';
            }
        });
        sub.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numone = Integer.parseInt(textField1.getText());
                textField1.setText("");
                operator = '-';
            }
        });
        div.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numone = Integer.parseInt(textField1.getText());
                textField1.setText("");
                operator = '/';
            }
        });
        mul.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                numone = Integer.parseInt(textField1.getText());
                textField1.setText("");
                operator = '*';
            }
        });
        ans.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (operator=='+'){
                    numtwo = Integer.parseInt(textField1.getText());
                    result = numone + numtwo;
                    textField2.setText(Integer.toString(result));
                    textField1.setText("");
                } else if (operator=='-') {
                    numtwo = Integer.parseInt(textField1.getText());
                    result = numone - numtwo;
                    textField2.setText(Integer.toString(result));
                    textField1.setText("");
                } else if (operator=='*') {
                    numtwo = Integer.parseInt(textField1.getText());
                    result = numone * numtwo;
                    textField2.setText(Integer.toString(result));
                    textField1.setText("");
                }else if (operator=='/') {
                    numtwo = Integer.parseInt(textField1.getText());
                    result = numone / numtwo;
                    textField2.setText(Integer.toString(result));
                    textField1.setText("");
                }
            }
        });
        Clearall.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                textField1.setText("");
            }
        });
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        new GUI();
    }

}


