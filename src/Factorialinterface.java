import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorialinterface extends JFrame{
    private JButton recursivoButton;
    private JTextField textField1;
    private JButton iterativoButton;
    private JTextField textField2;
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JTextField textField3;
    private JButton recursivoButton1;
    private JButton iterativoButton1;
    private JTextField textField4;
    private JTextField textField5;
    private JButton sumarButton;
    private JTextField textField6;
    private JTabbedPane tabbedPane2;
    private JButton sumaRecursivaButton;
    private JButton sumaImparesIButton;
    private JButton sumaImparesRButton;
    private JTextField textField7;
    private JTextField textField8;
    private JButton sumaIterativaButton;
    private JButton sumaRecursivaButton1;
    private JTextField textField9;

    public Factorialinterface()  {
        super ("Holii");
        setContentPane(panel1);
        Factorial f=new Factorial();

        iterativoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText(String.valueOf( f.FactorialIterativo(Integer.parseInt(textField1.getText()))));
            }
        });
        recursivoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textField2.setText(String.valueOf(f.FactorialRecursiva(Integer.parseInt(textField1.getText()))));
            }
        });
        iterativoButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField4.setText(String.valueOf(f.FibonacciIterativo(Integer.parseInt(textField3.getText()))));
            }
        });
        recursivoButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                textField4.setText("");

                textField4.setText(textField4.getText()+f.FibonacciRecursivo(Integer.parseInt(textField3.getText())));

            }
        });
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField6.setText(""+f.Sumasn(Integer.parseInt(textField5.getText())));
            }
        });
        sumaRecursivaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField6.setText(""+f.SumasnRecursivo(Integer.parseInt(textField5.getText())));
            }
        });
        sumaImparesIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField6.setText(""+f.SumasImpIter(Integer.parseInt(textField5.getText())));
            }
        });
        sumaImparesRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField6.setText(""+f.SumasnImpRecursivo(Integer.parseInt(textField5.getText())*2-1,Integer.parseInt(textField5.getText())));
            }
        });
        sumaIterativaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField9.setText(""+f.SumasndeAaB(Integer.parseInt(textField7.getText()),Integer.parseInt(textField8.getText())));
            }
        });
        sumaRecursivaButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField9.setText(""+f.SumasndeAaBRecur(Integer.parseInt(textField7.getText()),Integer.parseInt(textField8.getText())));
            }
        });
    }
}
