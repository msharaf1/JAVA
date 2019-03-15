public class Bicycle implements IBicycle {
    private int speed;
    public Bicycle(){
        speed = 0;
    };

    public static void staticMethod(){
        IBicycle.staticMethod();;
    }

    public void speedUp(int increment){
        speed += increment;
    }

    public void applyBrakes(int decrement){
        speed -= decrement;
    }

    public int getSpeed(){
        return speed;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    public int speed;
    public int brakes;
    public double price;
    public double total;

    public Bicycle(){ }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public void setTax(double total){
        // taxPercent = 0;
        // total = setPrice(total);
        total = getPrice() * 0.25;
    }
    public void setTotal(double total){
        this.total = total * 0.25;
    }
    public double getTotal(){
        return total;
    }
    public void speedUp(int incre){
        this.speed += incre;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void applyBrakes(int dec){
        // int speed = getSpeed();
        // int maxSpeed = 35;
        // if(speed < maxSpeed){
        //     this.brakes = brakes - 10;
        // }
        // else { brakes = 0; }
    }
    public int getBrakes(){
        return this.brakes;
    }
    public void setWheels(int wheels){
        wheels = 4;
    }
    // public int weight = 39;
    public static int weight = 25;
    public static int wheels = 4;
*/

}