/*
Kate and Michael want to buy a pizza and share it. Depending on the price 
of the pizza, they are going to divide the costs:

    If the pizza is less than €5,- Michael invites Kate, so Michael pays 
the full price.
    Otherwise Kate will contribute 1/3 of the price, but no more 
than €10 (she's broke :-) and Michael pays the rest.

How much is Michael going to pay? Calculate the amount with two decimals, if necessary.

assertEquals(10, PizzaPayments.michaelPays(15), 0.0);
        assertEquals(4, PizzaPayments.michaelPays(4), 0.0);
        assertEquals(20, PizzaPayments.michaelPays(30), 0.0);
        assertEquals(70, PizzaPayments.michaelPays(80), 0.0);
        assertEquals(14.67, PizzaPayments.michaelPays(22), 0.0);
        assertEquals(3.95, PizzaPayments.michaelPays(5.9181), 0.0);
        assertEquals(19.19, PizzaPayments.michaelPays(28.789), 0.0);
        assertEquals(4.33, PizzaPayments.michaelPays(4.325), 0.0);    



 */
package kyu7;

/**
 *
 * @author iucosoft9
 */
public class PizzaPayments {

    public static void main(String[] args) {

        System.out.println(michaelPays(15));
        System.out.println(michaelPays(4));
        System.out.println(michaelPays(30));
        System.out.println(michaelPays(80));
        System.out.println(michaelPays(22));
        System.out.println(michaelPays(5.9181));
        System.out.println(michaelPays(28.789));
        System.out.println(michaelPays(4.325));

    }

    public static double michaelPays(double cost) {

        double pay = 0.00;
        double m = 0;
        if (cost > 5) {
            m = cost/3;
            //System.out.println("m = " + m);
            pay += cost - m;
            
            if (m > 10) {
                pay += m -10;
            }
        } else pay = cost;
    return Double.parseDouble(String.format("%.2f", pay));    
    }

}
