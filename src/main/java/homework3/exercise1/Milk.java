package homework3.exercise1;

public class Milk extends PopularGrocery{
    public Milk (int quantity, int discountThresold, int popularityLevel){
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThresold = discountThresold;
        this.householdLimit = 20;
    }

    @Override
    public int getBulkDiscount() {
        if(quantity >= discountThresold){
            return 12;
        }
        return 0;
    }
}
