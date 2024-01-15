package shape;
import base.ShapeBase;

public class Oval extends ShapeBase {
	
	public Oval(String name, int semiMajorAxis, int semiMinorAxis) {
        super(name, semiMajorAxis, semiMinorAxis);
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * width * height); // Area of an oval: π * a * b
    }
}
