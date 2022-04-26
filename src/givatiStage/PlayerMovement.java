package givatiStage;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerMovement implements KeyListener {

    private Car player;

    public PlayerMovement (Car player) {
        this.player = player;
    }

    public void keyTyped(KeyEvent e) {
    }


    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_UP:
                this.player.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                this.player.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                this.player.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                this.player.moveRight();
                break;

        }
    }

    public void keyReleased(KeyEvent e) {

    }
}
