package shape;
import base.ShapeBase;

public class Circle extends ShapeBase {
	
	public Circle(String name, int radius) {
        super(name, radius, radius); // For a circle, width and height are the same (radius)
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * width * width); // Area of a circle: π * r^2
    }
}
