/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wesposlab;

/**
 *
 * @author Wesley
 */
public class Product {

    String prodId;
    double productPrice;
    int productQuantity;
    String productDiscription;
    DiscountStrategy discountStrategy;

    public Product(String prodId, String productDiscription, double productPrice, DiscountStrategy discountStrategy) {
        this.prodId = prodId;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productDiscription = productDiscription;
        this.discountStrategy = discountStrategy;
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy ds) {
        discountStrategy = ds;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String productid) {
        this.prodId = productid;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductDiscription() {
        return productDiscription;
    }

    public void setProductDiscription(String productDiscription) {
        this.productDiscription = productDiscription;
    }

    private void prodId() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
