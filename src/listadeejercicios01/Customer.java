package listadeejercicios01;

public class Customer {
    private String dni;
    private String name;
    private String surname;
    private String address;
    private int age;
    private Order[] orders = new Order[10];

    public Customer() {
    }

    public Customer(String dni, String name, String surname) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Customer{" + "dni=" + dni + ", name=" + name + ", surname=" + surname + ", address=" + address + ", age=" + age + ", orders=" + orders + '}';
    }
    
    public void getOrder(int idOrder){
        for (Order order : orders){
            if(order.getId()==idOrder){
                System.out.println(order.toString());
            }
        }
    }
    
    public void agregarOrder(Order order){
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                return;
            }
        }
        System.out.println("La lista está llena, no se pueden agregar más ordenes.");
    }
}
