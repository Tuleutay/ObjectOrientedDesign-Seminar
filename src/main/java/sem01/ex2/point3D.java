package sem01.ex2;

public class point3D {
    double x;
    double y;
    double z;

    public point3D() {
    }

    public point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     *
     * @return длину вектора
     */
    public double distance() {
        return Math.sqrt(x * x + y * y + z * z);

    }

    public double sqalarMultiply(point3D point){
        return this.x * point.x + this.y * point.y + this.z * point.z;
    }
    public point3D multy (point3D pointIn){
        return new point3D(y* pointIn.z - z* pointIn.y,
                z*pointIn.x - x*pointIn.z, x*pointIn.y - y*pointIn.x);
    }

    public double cornerCosinus (point3D pointb){
        return sqalarMultiply(pointb)/(distance() * pointb.distance());
    }


}
