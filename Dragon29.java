public class Dragon29 {
    int x;
    int y;
    int width;
    int height;

    public Dragon29(int startX, int startY, int areaWidth, int areaHeight) {
        x = startX;
        y = startY;
        width = areaWidth;
        height = areaHeight;
    }

    public void moveLeft() {
        if (x > 0) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Position: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        System.out.println("Game Over");
    }
}
