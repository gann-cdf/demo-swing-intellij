import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View {
    private JButton redButton;
    private JPanel panel;
    private JLabel aLabel;
    private JButton blueButton;
    private JLabel bLabel;

    public View(Controller controller) {
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.handleRedCondition();
            }
        });
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.handleBlueCondition();
            }
        });
    }

    public void setA(int a) {
        aLabel.setText(String.valueOf(a));
    }

    public void setB(int b) {
        bLabel.setText(String.valueOf(b));
    }

    public JPanel getPanel() {
        return panel;
    }
}
