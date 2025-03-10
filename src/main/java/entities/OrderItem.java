package entities;

public class OrderItem {
    private Integer quantity;
    private double price;

    private Product product;

    public OrderItem(){
    }

    public OrderItem(Integer quantity, double prince, Product product) {
        this.quantity = quantity;
        this.price = prince;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrince() {
        return price;
    }

    public void setPrince(double prince) {
        this.price = prince;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f",getProduct().getPrice())
                + ", Quantity: "
                + quantity
                + ", Subtotal: "
                +String.format("%.2f", subTotal());
    }
}
