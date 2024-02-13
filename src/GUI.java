import javax.swing.*;
import java.awt.event.*;

public class GUI {

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
        private JButton del;
        private JTextField textField1;
        private JButton clearall;
        private JButton future;

    public  GUI() {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setContentPane(mainpanel);
        frame.setSize(400, 460);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        int numone,numtwo;
        char operatorl;

        {
            zero.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    textField1.setText(textField1.getText() +"0");
                }
            });
            one.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    textField1.setText(textField1.getText() +"1");
                }
            });
            two.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            three.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            four.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            five.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            six.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            seven.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            eight.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            nine.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            add.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            sub.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            div.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            mul.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            ans.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            del.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                }
            });
            frame.setVisible(true);

        }
    }
        public static void main(String[] args) {

            new GUI();
        }

}


