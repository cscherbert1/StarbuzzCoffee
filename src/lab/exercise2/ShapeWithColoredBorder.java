package lab.exercise2;

/**
 *
 * @author cscherbert1
 */
public class ShapeWithColoredBorder extends ShapeDecorator {
    private String color;
    
    public ShapeWithColoredBorder(Shape shapeToBeDecorated, String color){
        super(shapeToBeDecorated);
        setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws IllegalArgumentException{
        if(color == null || color.isEmpty()){
            throw new IllegalArgumentException("You must define a color in order to decorate a Shape. color cannot be empty or null.");
        }
        this.color = color;
    }
    
    @Override
    public String draw(){
        return super.draw() + "\nBorder Color: " + color;
    }
    
    
}
