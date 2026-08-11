package entities;

public class OrderItem {

    private Integer quantify;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantify, Double price, Product product) {
        this.quantify = quantify;
        this.price = price;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantify() {
        return quantify;
    }

    public void setQuantify(Integer quantify) {
        this.quantify = quantify;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double subTotal(){
        return price * quantify;
    }

    @Override
    public String toString() {
        return product.getName()+", R$"+price+", Quantity: "+quantify+", "+subTotal();
    }
}
