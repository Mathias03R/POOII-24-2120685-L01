package listadeejercicios01;

public class Check extends Payment{
    private String name;
    private String bankID;
    private boolean authorized;

    public Check( String name, String bankID, boolean authorizedn, float amount) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
        this.authorized = authorized;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankID() {
        return bankID;
    }

    public void setBankID(String bankID) {
        this.bankID = bankID;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }
    
    @Override
    void calculateTotalAmount() {
        System.out.println("Estoy pagando con cheque");
    }

    @Override
    public String toString() {
        return "Check{" + "name=" + name + ", bankID=" + bankID + ", authorized=" + authorized + '}';
    }

}
