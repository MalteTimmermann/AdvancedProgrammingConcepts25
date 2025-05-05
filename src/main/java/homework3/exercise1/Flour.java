package homework3.exercise1;

public class Flour extends PopularGrocery {
    public Flour(int quantity, int discountThresold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThresold = discountThresold;
        this.householdLimit = 15;
    }

    @Override
    public int getBulkDiscount() {
        if (quantity >= discountThresold) {
            return 5;
        }
        return 0;
    }
}
