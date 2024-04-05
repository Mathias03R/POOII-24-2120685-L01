package listadeejercicios01;

import java.util.Date;

public class Order {
    private int id;
    private Date date = new Date();
    private String status;
    private OrderDetail[] details = new OrderDetail[10];

    public Order(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OrderDetail[] getDetails() {
        return details;
    }

    public void setDetails(OrderDetail[] details) {
        this.details = details;
    }
    
    public double CalcSubTotalOrder(){
        double subTotal = 0;
        for(OrderDetail od : details){
            subTotal += od.CalcSubTotal();
        }
        return subTotal;
    }
    
    public double CalcTax(){
        double tax = 0;
        for(OrderDetail od : details){
            tax += od.CalcSubTotal()*od.getIGV();
        }
        return tax;
    }
    
    public double CalcTotal(){
        return CalcSubTotalOrder()+CalcTax();
    }
    public double CalcTotalWeight(){
        double weight = 0;
        for(OrderDetail od : details){
            weight += od.CalcWeight();
        }
        return weight;
    }
}
