package bg.unwe;

public class TV extends Electronics {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getSalePrice() {
        return getPrice()*0.85;
    }
    
    
}
