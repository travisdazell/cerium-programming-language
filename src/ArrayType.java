/** A symbol to represent arrays with a single element type */
public class ArrayType extends Symbol implements Type {
	Type elementType;
	
    public ArrayType(Type elementType) {
        super(elementType+"[]");
        this.elementType = elementType;
    }
    
    public int getTypeIndex() {
    	return 0; 
    }
}
