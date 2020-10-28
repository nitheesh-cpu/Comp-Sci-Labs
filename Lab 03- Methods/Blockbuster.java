public class Blockbuster{
    private String movie;
    private double cost;
    private int tickets;
    private double price;
    private double grossed;
    private double net;
    public Blockbuster(String m, double c){
        movie = m;
        cost = c;

    }

    public void setBoxOffice(int t, double p){
        tickets = t;
        price = p;
        grossed = (tickets*price);

    }
    public double getCost() {
        return cost;
    }
    public double getPrice() {
        return price;
    }
    public double getGrossed() {
        return grossed;
    }

    public double getNet(){
        net = grossed-cost;
        return net;
    }
    public String getTitle(){
        return movie;
    }
    public double diff(Object obj){
        Blockbuster obj1 = (Blockbuster)obj;
        double grossed2 = Math.abs(obj1.getGrossed());
        return Math.abs(grossed2) - Math.abs(grossed);

    }

}
