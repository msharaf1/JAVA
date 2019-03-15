public interface IBicycle {

    double myConstant = 3.0;
    default void sayHello(){
        System.out.println("Hello World");
    }

    static void staticMethod(){
        System.out.println("Hello from the static method of the interface");
    }
    void speedUp(int increament);
    void applyBrakes(int decreament);













/*
    public static int count = 0;
    public int wheels = 0;
    public int weight = 0;

    void setTax(double taxPercent);
*/
}