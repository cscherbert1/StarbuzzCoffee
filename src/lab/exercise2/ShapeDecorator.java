package lab.exercise2;

/**
 *
 * @author cscherbert1
 */
public abstract class ShapeDecorator implements Shape{
    private Shape shapeToBeDecorated;
    
    public ShapeDecorator(Shape shapeToBeDecorated){
        setShapeToBeDecorated(shapeToBeDecorated);
    }
    
    @Override
    public String draw(){
        return shapeToBeDecorated.draw();
    }

    public Shape getShapeToBeDecorated() {
        return shapeToBeDecorated;
    }

    public void setShapeToBeDecorated(Shape shapeToBeDecorated) throws IllegalArgumentException{
        if(shapeToBeDecorated == null){
            throw new IllegalArgumentException ("A shape must be provided before it can be decorated. shapeToBeDecorated cannot be null.");
        }
        this.shapeToBeDecorated = shapeToBeDecorated;
    }
    
    
    
}
