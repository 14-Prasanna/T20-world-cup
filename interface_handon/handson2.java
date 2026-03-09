package interface_handon;



interface Movable {
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
}

class MovablePoint implements Movable{
	int x, y, xSpeed, ySpeed;

	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

    @Override
	public void moveUp() { y -= ySpeed; }
    @Override
    public void moveDown() { y += ySpeed; }
    @Override
    public void moveLeft() { x -= xSpeed; }
    @Override
    public void moveRight() { x += xSpeed; }
	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + "]";
	}
}

class MovableCircle implements Movable {
	int radius;
	MovablePoint center;
	
	MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
		center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	@Override
    public void moveUp() { center.moveUp(); }
    @Override
    public void moveDown() { center.moveDown(); }
    @Override
    public void moveLeft() { center.moveLeft(); }
    @Override
    public void moveRight() { center.moveRight(); }
	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}
}
public class handson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovablePoint p = new MovablePoint(0, 0, 2, 2);
        System.out.println(p);
        p.moveRight();
        p.moveUp();
        System.out.println("After moving: " + p);

        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println(c);
        c.moveLeft();
        c.moveDown();
        System.out.println("After moving: " + c);
       
	}

}