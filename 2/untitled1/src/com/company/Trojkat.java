package com.company;

public class Trojkat {

    private Odcinek o1;
    private Odcinek o2;
    private Odcinek o3;
    private double pole;
    private double obwod;

    public Trojkat(Odcinek o1, Odcinek o2, Odcinek o3) {
            this.o1 = o1;
            this.o2 = o2;
            this.o3 = o3;
    }

    public Odcinek getO1() {
        return o1;
    }

    public Odcinek getO2() {
        return o2;
    }

    public Odcinek getO3() {
        return o3;
    }

    public double getPole() {
        setPole();
        return pole;
    }

    public double getObwod() {
        setObwod();
        return obwod;
    }

    public void setO1(Odcinek o1) {

            this.o1 = o1;
            setPole();
            setObwod();

    }

    public void setO2(Odcinek o2) {

            this.o2 = o2;
            setPole();
            setObwod();

    }

    public void setO3(Odcinek o3) {

            this.o3 = o3;
            setPole();
            setObwod();
    }

    private void setPole() {
        double p = (o1.getDlugosc()+o2.getDlugosc()+o3.getDlugosc())/2;
        this.pole = Math.sqrt(p*(p-o1.getDlugosc())*(p-o2.getDlugosc())*(p-o3.getDlugosc()));
    }

    private void setObwod() {
        this.obwod = o1.getDlugosc()+o2.getDlugosc()+o3.getDlugosc();
    }

}
