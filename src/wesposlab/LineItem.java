/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wesposlab;


public class LineItem {
    
    
     LineItem item = new LineItem(product, qty);
        addToArray(item);
        
         private void addToArray(LineItem item) {
             
             
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
    }

