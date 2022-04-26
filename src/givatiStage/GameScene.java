package givatiStage;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameScene extends JPanel {

    private Car player;
    private ImageIcon jet;
    private int x;
    private CustomRectangle[] obstacles;

    public GameScene (int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        this.player = new Car();
        this.jet = new ImageIcon("jet.jpg");
        this.mainGameLoop();
        this.obstacles = new CustomRectangle[100];
        Random random = new Random();
        for (int i = 0; i < this.obstacles.length; i++) {
            CustomRectangle obstacle = null;
            do {
                obstacle = new CustomRectangle(
                        random.nextInt(width),
                        random.nextInt(height),
                        20,
                        20,
                        Color.GREEN);


            } while (false);
            this.obstacles[i] = obstacle;
        }

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.player.paint(g);
//        this.jet.paintIcon(this, g, this.x, 0);

        for (int i = 0; i < this.obstacles.length; i++) {
            this.obstacles[i].paint(g);
        }
    }

    public void mainGameLoop () {
        new Thread(() -> {
            PlayerMovement playerMovement = new PlayerMovement(this.player);
            this.setFocusable(true);
            this.requestFocus();
            this.addKeyListener(playerMovement);
            while (true) {
                try {
                    this.x++;
//                    this.player.breakApart();
                    repaint();
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();



    }
}
