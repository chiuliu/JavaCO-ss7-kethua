package ex3;

public class MoveablePont extends  Point {
    private float xSpeed;
    private float ySpeed;

    public MoveablePont(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePont(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
}

public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
}

public MoveablePont move(){
        super.setX(super.getX()+ this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
}

    @Override
    public String toString() {
        return super.toString() +  " Speed : (" + this.getxSpeed() + " , " + this.getySpeed() + " )";
    }
}
