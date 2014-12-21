/** A symbol to represent the built-in primitive types */

public class BuiltInTypeSymbol extends Symbol implements Type {
    int typeIndex;
    
    public BuiltInTypeSymbol(String name, int typeIndex) {
        super(name);
        this.typeIndex = typeIndex;
    }
    
    public int getTypeIndex() {
    	return typeIndex;
    }
    
    public String toString() {
    	return getName();
    }  
}