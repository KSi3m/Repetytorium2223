

public class Odcinek {
    Punkt punkt1;
    Punkt punkt2;
    double dlugosc;

    public Odcinek(Punkt punkt1, Punkt punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
        setDlugosc(this.punkt1,this.punkt2);
    }
    public Odcinek(double x1, double y1, double x2, double y2)
    {
        this.punkt1 = new Punkt(x1,y1);
        this.punkt2 = new Punkt(x2,y2);
        setDlugosc(this.punkt1,this.punkt2);
    }

    public Punkt getPunkt1() {
        return punkt1;
    }

    public Punkt getPunkt2() {
        return punkt2;
    }

    public double getDlugosc() {
        setDlugosc(this.punkt1,this.punkt2);
        return dlugosc;
    }

    public void setPunkt1(Punkt punkt1) {
        this.punkt1 = punkt1;
        setDlugosc(this.punkt1,this.punkt2);
    }

    public void setPunkt2(Punkt punkt2) {
        this.punkt2 = punkt2;
        setDlugosc(this.punkt1,this.punkt2);
    }

    private void setDlugosc(Punkt p1, Punkt p2) {
        this.dlugosc = Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+Math.pow(p2.getY()-p1.getY(),2) );
    }
    public void printOdcinekOnScreen(){
        System.out.println("Punkt 1 ("+punkt1.getX()+","+punkt1.getY()+") Punkt2 ("+punkt2.getX()+","+punkt2.getY()+")");
        System.out.println("Dlugosc wynosi "+getDlugosc());
    }
    public static Punkt punktPrzeciecia(Odcinek o1, Odcinek o2)
    {


        /*x=((Bx-Ax)*(Dx*Cy-Dy*Cx)-(Dx-Cx)*(Bx*Ay-By*Ax))/((By-Ay)*(Dx-Cx)-(Dy-Cy)*(Bx-Ax));

        y=((Dy-Cy)*(Bx*Ay-By*Ax)-(By-Ay)*(Dx*Cy-Dy*Cx))/((Dy-Cy)*(Bx-Ax)-(By-Ay)*(Dx-Cx));

        //o1 = A,B
        //o2 = C,D
        Ax= o1.getPunkt1().getX()
        Ay = o1.getPunkt1().getY()
        Bx = o1.getPunkt2().getX()
        By = o1.getPunkt2().getY()

        Cx= o2.getPunkt1().getX()
        Cy = o2.getPunkt1().getY()
        Dx = o2.getPunkt2().getX()
        Dy = o2.getPunkt2().getY()*/

        double x = ((o1.getPunkt2().getX()-o1.getPunkt1().getX())*(o2.getPunkt2().getX()*o2.getPunkt1().getY() -o2.getPunkt2().getY()*o2.getPunkt1().getX())-(o2.getPunkt2().getX()-o2.getPunkt1().getX())*(o1.getPunkt2().getX()*o1.getPunkt1().getY() -o1.getPunkt2().getY()*o1.getPunkt1().getX()))/((o1.getPunkt2().getY()-o1.getPunkt1().getY() )*(o2.getPunkt2().getX()-o2.getPunkt1().getX())-(o2.getPunkt2().getY()-o2.getPunkt1().getY()  )*(o1.getPunkt2().getX()-o1.getPunkt1().getX()));
        double y=
                ((o2.getPunkt2().getY()-o2.getPunkt1().getY() )*
                        (o1.getPunkt2().getX()*o1.getPunkt1().getY()  -o1.getPunkt2().getY()*o1.getPunkt1().getX())-
                        (o1.getPunkt2().getY()-o1.getPunkt1().getY()  )*(o2.getPunkt2().getX()*o2.getPunkt1().getY()  -o2.getPunkt2().getY()*o2.getPunkt1().getX()))
                        /
                        ((o2.getPunkt2().getY()-o2.getPunkt1().getY()  )*(o1.getPunkt2().getX()-o1.getPunkt1().getX())- (o1.getPunkt2().getY()-o1.getPunkt1().getY())*(o2.getPunkt2().getX()-o2.getPunkt1().getX()));


        return new Punkt(x,y);
    }

    public String toString()
    {
        return "P1 "+punkt1.toString()+" P2 "+punkt2.toString()+" Dlugosc "+dlugosc;
    }
}