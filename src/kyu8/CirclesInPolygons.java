/*
You are the owner of a box making company.

Your company can produce any equal sided polygon box, but plenty 
of your customers want to transport circular objects in these boxes.
Circles are a very common shape in the consumer industry. Tin cans,
glasses, tyres and CD's are a few examples of these.

As a result you decide to add this information on your boxes: 
The largest (diameter) circular object that can fit into a given box.

 */
package kyu8;

/**
 *
 * @author iucosoft9
 */
public class CirclesInPolygons {

    public static void main(String[] args) {

        System.out.println(circleDiameter(4,5));

    }

    public static float circleDiameter(int sides, int sideLength) {

        // nu am facut problema 
        
        
        
        
        
       // este foarte dificit de gasit formulele ... 
       
       
       
       
       
        if(sides == 4) {
            String results = String.format("%.3f", ((sideLength*sideLength) - (Math.PI * sideLength)));
            return Float.parseFloat(results);
        }
        
        
        return (float) 05.20;
    }

}
