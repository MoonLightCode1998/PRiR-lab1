public class M_prostokatow extends Thread {
    private double ai;
    private double bi;
    private double pole;

    public M_prostokatow(double ai, double bi) {
        this.ai = ai;
        this.bi = bi;
    }
    private double function(double x, double b){

        return Math.pow(x,2)*x+b;

    }

    public double getAi() {
        return ai;
    }

    public void setAi(double ai) {
        this.ai = ai;
    }

    public double getBi() {
        return bi;
    }

    public void setBi(double bi) {
        this.bi = bi;
    }

    public double getPole() {
        return pole;
    }

    public void setPole(double pole) {
        this.pole = pole;
    }

    @Override
    public void run() {
        this.pole=(bi-ai)*function(ai,5);
    }
}
