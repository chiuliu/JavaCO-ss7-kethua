package ex2;

public class Point3D extends Point2D {
    private  float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
float[] xyz = new float[3];
xyz[0] = super.getX();
xyz[1] =super.getY();
xyz[2] = z;
return new float[]{super.getX(),super.getY(),z};
    }

    @Override
    public String toString() {
        return "(" + super.getX()+ "," + super.getY() + "," + this.z + ")";
    }
}
