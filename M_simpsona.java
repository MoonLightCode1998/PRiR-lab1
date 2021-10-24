public class M_simpsona extends Thread {
    private double ai;
    private double bi;
    private double pole;

    public M_simpsona(double ai, double bi) {
        this.ai = ai;
        this.bi = bi;
    }
    private double function(double x){

        return Math.pow(x,2)*x+5;

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
        this.pole= ((2*(function(bi)+function(ai))*((bi-ai)/2))+4*function((bi-ai)/2))*((bi-ai)/3);
    }
}
