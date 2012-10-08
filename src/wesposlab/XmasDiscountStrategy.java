/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wesposlab;

/**
 *
 * @author Wesley
 */
public class XmasDiscountStrategy implements DiscountStrategy {

    private final double CHRISTMASDISCOUNT = .50;

    @Override
    public double getDiscountAmt(double price) {
        return price * CHRISTMASDISCOUNT;
    }
}
