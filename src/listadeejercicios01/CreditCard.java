package listadeejercicios01;

public class CreditCard extends Payment{
    private String name;
    private String type;
    private String expDate;
    private boolean authorized;

    public CreditCard(String name, String type, String expDate, boolean authorized, float amount) {
        super(amount);
        this.name = name;
        this.type = type;
        this.expDate = expDate;
        this.authorized = authorized;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = authorized;
    }

    @Override
    void calculateTotalAmount() {
        System.out.println("Estoy pagando con tarjeta de crédito");
    }

    @Override
    public String toString() {
        return "CreditCard{" + "name=" + name + ", type=" + type + ", expDate=" + expDate + ", authorized=" + authorized + '}';
    }
    
    
}
