package day05;

public class ProductWithPeace {
    private Type type;
    private int count;

    public ProductWithPeace(Type type, int count) {
        this.type = type;
        this.count = count;
    }

    public Type getType() {
        return type;
    }

    public int getCount() {
        return count;
    }

    public void increaseCount(){
        count++;
    }
}
