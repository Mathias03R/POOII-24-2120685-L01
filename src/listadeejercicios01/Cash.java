package listadeejercicios01;

public class Cash extends Payment{
    private double cashAmount;
    private double deduction;

    public Cash(double cashAmount, double deduction, float amount) {
        super(amount);
        this.cashAmount = cashAmount;
        this.deduction = deduction;
    }

    public double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    @Override
    void calculateTotalAmount() {
        System.out.println("Estoy pagando con efectivo");
    }

    @Override
    public String toString() {
        return "Cash{" + "cashAmount=" + cashAmount + ", deduction=" + deduction + '}';
    }
    
    
}
