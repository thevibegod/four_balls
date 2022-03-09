import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class ProcessingApplication extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int BALL_SIZE = 10;
    public static final int BALL_1_SPEED = 1;
    public static final int BALL_2_SPEED = 2;
    public static final int BALL_3_SPEED = 3;
    public static final int BALL_4_SPEED = 4;
    public List<Ball> balls = new ArrayList<>();

    public static void main(String[] args) {
        PApplet.main("ProcessingApplication", args);
    }

    @Override
    public void setup() {
        super.setup();
        balls.add(new Ball(HEIGHT / 5, BALL_1_SPEED));
        balls.add(new Ball(2 * HEIGHT / 5, BALL_2_SPEED));
        balls.add(new Ball(3 * HEIGHT / 5, BALL_3_SPEED));
        balls.add(new Ball(4 * HEIGHT / 5, BALL_4_SPEED));
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
        for (Ball ball : balls) {
            ball.updatePosition();
        }
    }

    private void drawBalls() {
        for (Ball ball : balls) {
            drawBall(ball.getHEIGHT(), ball.getPosition());
        }
    }

    private void drawBall(int height, int position) {
        ellipse(position, height, BALL_SIZE, BALL_SIZE);
    }
}
