
package moveable;

public class circleMove implements intMoveable{
    
    private int radius;
    private point center;

    public circleMove(int radius, int x, int y, int xSpeed, int ySpeed ) {
        this.radius = radius;
        center = new point(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "circleMove{" + "radius=" + radius + ", center=" + center.toString() + '}';
    }
   
    @Override
    public void moveUp(){
        center.y=center.y-center.ySpeed;
    }
    @Override
    public void moveDown(){
        center.y=center.y+center.ySpeed;
    }
    @Override
    public void moveLeft(){
        center.x=center.x-center.xSpeed;
    }
    @Override
    public void moveRight(){
        center.x=center.x+center.xSpeed;
    }
    
}
