public class Ball {
    private final int SPEED;
    private int position;
    private final int HEIGHT;

    public Ball(int height, int speed) {
        this.SPEED = speed;
        this.position = 0;
        this.HEIGHT = height;
    }

    public void updatePosition() {
        position += SPEED;
    }

    public int getPosition() {
        return position;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }

}
