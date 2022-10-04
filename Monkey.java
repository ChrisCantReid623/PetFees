public class Monkey extends Pet{
    private double weight;
    private double fee;

    public Monkey(double weight, double fee) {
        this. weight = weight;
        this.fee = fee;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    double calcFee() {
        return (weight * fee);
    }
}
