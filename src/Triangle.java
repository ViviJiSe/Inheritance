import java.lang.Math;

public class Triangle extends GeometricFigure{

    protected double side;

    /**
     *
     * @param side
     */

    public Triangle(final double side){
        this.side =side;
        this.area = this.computeAreaOfTriangle();
    }

   // public double

    /**
     *
     * @return
     */
    private double computeAreaOfTriangle(){
        return (Math.sqrt(3)/4)*(Math.pow(this.side, 2));
    }

}
