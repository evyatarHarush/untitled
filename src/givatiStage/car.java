package givatiStage;
import java.awt.*;

class Car {

    private CustomRectangle body;
    private CustomRectangle front;

    public Car() {
        this.body = new CustomRectangle(100, 100, 200, 100, Color.BLACK);
        this.front = new CustomRectangle(300, 100 + 100 / 2, 80, 50, Color.BLUE);
    }

    public void moveRight () {
        this.body.moveRight();
        this.front.moveRight();
    }

    public void moveLeft () {
        this.body.moveLeft();
        this.front.moveLeft();
    }

    public void moveUp () {
        this.body.moveUp();
        this.front.moveUp();
    }

    public void moveDown () {
        this.body.moveDown();
        this.front.moveDown();
    }

    public void breakApart () {
        this.body.moveUp();
        this.front.moveDown();
    }

    public void paint (Graphics graphics) {
        this.body.paint(graphics);
        this.front.paint(graphics);
    }

    public CustomRectangle getBody () {
        return this.body;
    }
}
