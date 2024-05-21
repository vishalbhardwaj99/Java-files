import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FlappyBird extends JFrame implements ActionListener, KeyListener {
    private Timer timer;
    private int birdY, velocity, gravity;
    private boolean gameOver;
    private int gap;
    private int[] wallX, wallY, wallWidth, wallHeight;
    private int score;
    private final int WIDTH = 800, HEIGHT = 600;
    private final int BIRD_WIDTH = 50, BIRD_HEIGHT = 40;
    private final int WALL_WIDTH = 50;
    private final int WALL_HEIGHT_MIN = 50;
    private final int WALL_HEIGHT_MAX = 400;

    public FlappyBird() {
        setTitle("Flappy Bird");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        addKeyListener(this);

        birdY = HEIGHT / 2 - BIRD_HEIGHT / 2;
        velocity = 0;
        gravity = 1;
        gameOver = false;
        gap = 200;
        score = 0;

        wallX = new int[3];
        wallY = new int[3];
        wallWidth = new int[3];
        wallHeight = new int[3];

        for (int i = 0; i < 3; i++) {
            wallX[i] = WIDTH + i * 300;
            wallY[i] = (int) (Math.random() * (HEIGHT - gap - WALL_HEIGHT_MAX)) + WALL_HEIGHT_MIN;
            wallWidth[i] = WALL_WIDTH;
            wallHeight[i] = HEIGHT - wallY[i];
        }

        timer = new Timer(20, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.cyan);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        g.setColor(Color.green);
        for (int i = 0; i < 3; i++) {
            g.fillRect(wallX[i], 0, wallWidth[i], wallY[i]);
            g.fillRect(wallX[i], wallY[i] + gap, wallWidth[i], wallHeight[i]);
        }

        g.setColor(Color.red);
        g.fillRect(WIDTH / 2 - BIRD_WIDTH / 2, birdY, BIRD_WIDTH, BIRD_HEIGHT);

        g.setColor(Color.black);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString("Score: " + score, 10, 30);

        if (gameOver) {
            g.drawString("Game Over!", WIDTH / 2 - 100, HEIGHT / 2 - 15);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            for (int i = 0; i < 3; i++) {
                wallX[i] -= 3;

                if (wallX[i] + wallWidth[i] < 0) {
                    wallX[i] = WIDTH;
                    wallY[i] = (int) (Math.random() * (HEIGHT - gap - WALL_HEIGHT_MAX)) + WALL_HEIGHT_MIN;
                    wallHeight[i] = HEIGHT - wallY[i];
                }

                if (wallX[i] == WIDTH / 2 - BIRD_WIDTH / 2) {
                    score++;
                }

                if (birdY + BIRD_HEIGHT > wallY[i] && birdY < wallY[i] + wallHeight[i] && (WIDTH / 2 > wallX[i] && WIDTH / 2 < wallX[i] + wallWidth[i])) {
                    gameOver = true;
                
            }
            
                
            }

            if (birdY > 0 && birdY + BIRD_HEIGHT < HEIGHT) {
                velocity += gravity;
                birdY += velocity;
            } else {
                gameOver = true;
            }
        }
        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !gameOver) {
            velocity = -12;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE && gameOver) {
            restartGame();
        }
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    private void restartGame() {
        birdY = HEIGHT / 2 - BIRD_HEIGHT / 2;
        velocity = 0;
        gameOver = false;
        score = 0;

        for (int i = 0; i < 3; i++) {
            wallX[i] = WIDTH + i * 300;
            wallY[i] = (int) (Math.random() * (HEIGHT - gap - WALL_HEIGHT_MAX)) + WALL_HEIGHT_MIN;
            wallHeight[i] = HEIGHT - wallY[i];
        }
    }

    public static void main(String[] args) {
        new FlappyBird();
    } 
   
}

