public class M_trapezow extends  Thread {
    private double ai;
    private double bi;
    private double pole;
    public M_trapezow(double x, double y){
        this.ai=x;
        this.bi=y;
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

        this.pole= ((function(bi,5))+function(ai,5))*((bi-ai)/2);
    }
}
