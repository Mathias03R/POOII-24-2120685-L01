package listadeejercicios01;

public class OrderDetail {
    private int id;
    private String taxStatus = "aprobado";
    private Product[] products = new Product[10];
    private double IGV = 0.18;

    public OrderDetail(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public void setTaxStatus(String taxStatus) {
        this.taxStatus = taxStatus;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }
    
    public double CalcSubTotal(){
        double subTotal = 0;
        for(Product product : products){
            subTotal += product.getPrice()*product.getQuantity();
        }
        return subTotal;
    }
    
    public double CalcWeight(){
        double pesoTotal = 0;
        for(Product product : products){
            pesoTotal += product.getWeight()*product.getQuantity();
        }
        return pesoTotal;
    }
    
    public void agregarProducto(Product product){
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("La orden está llena, no se pueden agregar más productos.");
    }
}
