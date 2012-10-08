/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wesposlab;

/**
 *
 * @author Wesley
 */
public class CashRegister {

    Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new XmasDiscountStrategy()),
        new Product("B205", "Men's Dress Shirt", 35.50, new XmasDiscountStrategy()),
        new Product("C222", "Women's Socks", 9.50, new NoDiscountStrategy())
    };

    public void addUpTotal() {
    }

    public void addItemToSale(String prodId, int qty) {
        Product product = null;
        for (Product p : products) {
            if (prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }

        // if found, add the lineItem to the receipt
        if (product != null) {
            Receipt.addLineItem(product, qty);
        }


    }

    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for (LineItem item : lineItems) {
            grandTotal += item.getOrigPriceSubtotal();
        }
        return grandTotal;
    }
}
