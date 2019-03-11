public interface IBicycle {
    public static int count = 0;
    public int wheels = 0;
    public int weight = 0;

    void setTax(double taxPercent);

    void speedUp(int increament);
    void applyBrakes(int decreament);

}