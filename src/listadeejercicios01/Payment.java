package listadeejercicios01;

abstract class Payment {
    private float amount;
    
    abstract void calculateTotalAmount();

    public Payment(float amount) {
        this.amount = amount;
    }
}
