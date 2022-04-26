package givatiStage;
import javax.swing.*;

public class Window extends JFrame {
    public static final int WINDOW_WIDTH = 1000;
    public static final int WINDOW_HEIGHT = 500;
    int a;

    public Window() {
        GameScene gameScene = new GameScene(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        this.add(gameScene);
//        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        Window window = new Window();
    }
}