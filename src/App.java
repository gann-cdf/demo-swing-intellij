import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);

        // declare, instantiate, name the frame
        JFrame app = new JFrame("Frame Title");

        // what to do when frame closes (exit the program, in this case)
        app.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // specify which view to show
        app.setContentPane(controller.getView().getPanel());

        // (re)compute the actual dimensions of the frame based on its content
        app.pack();

        // optionally center the window on screen
        app.setLocationRelativeTo(null);

        // make the window visible
        app.setVisible(true);
    }
}
