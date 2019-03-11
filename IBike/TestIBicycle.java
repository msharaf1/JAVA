public class TestIBicycle {
    public static void main(String[] args){
        Bicycle jBike = new Bicycle();
        // jBike.weight = 39;
        // jBike.speed = 25;
        jBike.applyBrakes(10);
        jBike.speedUp(45);
        jBike.speedUp(15);
        jBike.setPrice(1500);
        jBike.setTax(10);
        jBike.setTotal(100);
        jBike.setTotal(125);
        
        
        
        System.out.println(
            "Brakes: "+jBike.getBrakes() +" , " + 
            "Price: "+ jBike.getPrice() +", "+
            "Speed: mpg " +jBike.getSpeed()+", "+ 
            "Total Amount: $" +jBike.getTotal()
        );
        


    }
}