
package moveable;

public class point implements intMoveable{
    int x, y, xSpeed, ySpeed;

    public point(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "point{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    
    @Override
    public void moveUp(){
        y = y-ySpeed;
    }
    @Override
    public void moveDown(){
        y = y+ySpeed;
    }
    @Override
    public void moveLeft(){
        x=x-xSpeed;
    }
    @Override
    public void moveRight(){
        x=x+xSpeed;
    }
}
