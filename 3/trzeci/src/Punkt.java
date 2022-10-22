

public class Punkt {

    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void printPointOnScreen(){
        System.out.println("("+x+","+y+")");
    }
    public String toString()
    {
        return ("("+x+","+y+")");
    }
}