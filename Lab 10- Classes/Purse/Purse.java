public class Purse {
    private int numOfNickels;
    private int numOfDimes;
    private int numOfQuarters;
    public Purse(){
        numOfDimes = 0;
        numOfNickels = 0;
        
        numOfQuarters = 0;
    }
    public Purse(int n, int d, int q){
        numOfDimes = d;
        numOfNickels = n;
        
        numOfQuarters = q;
    }
    public double getTotal(){
        double fullAmount;
        
        fullAmount = ((numOfDimes * 10) + (numOfNickels * 5) + (numOfQuarters * 25));
        fullAmount /= 100;
        return fullAmount;
    }
    public void addNickels(int n){
        numOfNickels += n;
    }
    public void addQuarters(int q){
        numOfQuarters += q;
        
    }
    public void addDimes(int d){
        numOfDimes += d;
    }
    public int getNickels(){
        return numOfNickels;
    }
    public int getDimes(){
        return numOfDimes;
    }
    public int getQuarters(){
        return numOfQuarters;
    }
}
