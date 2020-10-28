public class Chicken {
        private int wingCount;
        private String color;
        public Chicken() {
        	  wingCount = 2;
        	  color = "White";
        }
        public Chicken(int a, String b) {
        	  wingCount = a;
        	  color = b;
        } 
         public int getWingCount(){
        return wingCount;
    }
    public String getColor(){
        return color;
    }
    public void setWingCount(int w){
        wingCount = w;
    }
    public void setColor(String c){
        color = c;
    }

           
}
