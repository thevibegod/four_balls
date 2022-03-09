import processing.core.PApplet;

public class ProcessingApplication extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALL_SIZE = 10;
    public static final int BALL_1_SPEED = 1;
    public static final int BALL_2_SPEED = 2;
    public static final int BALL_3_SPEED = 3;
    public static final int BALL_4_SPEED = 4;
    int ball1Position = 0;
    int ball2Position = 0;
    int ball3Position = 0;
    int ball4Position = 0;

    public static void main(String[] args) {
        PApplet.main("ProcessingApplication", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void draw() {
        drawBalls();
        changeBallPositions();
    }

    private void changeBallPositions() {
        ball1Position += BALL_1_SPEED;
        ball2Position += BALL_2_SPEED;
        ball3Position += BALL_3_SPEED;
        ball4Position += BALL_4_SPEED;
    }

    private void drawBalls() {
        drawBall(HEIGHT / 5, ball1Position);
        drawBall(2 * HEIGHT / 5, ball2Position);
        drawBall(3 * HEIGHT / 5, ball3Position);
        drawBall(4 * HEIGHT / 5, ball4Position);
    }

    private void drawBall(int height, int position) {
        ellipse(position, height, BALL_SIZE, BALL_SIZE);
    }
}
