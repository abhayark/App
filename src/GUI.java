import javax.swing.*;

public class GUI {

    private JPanel mainpanel;
    private JTextField textField1;
    private JButton a7Button;

    public  GUI() {
            JFrame frame = new JFrame();
            frame.setTitle("Calculator");
            frame.setContentPane(mainpanel);
            frame.setSize(400, 460);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            frame.setVisible(true);
        }

        public static void main(String[] args) {

            GUI mygui=new GUI();
        }

}


