/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wesposlab;

/**
 *
 * @author Wesley
 */
public class NoDiscountStrategy implements DiscountStrategy {
    
    private final double NODISCOUNT = 0;
    
    @Override
    public final double getDiscountInDollars(double price){
        return price * NODISCOUNT;
    }
       
   }

