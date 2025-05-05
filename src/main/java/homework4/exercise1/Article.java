package homework4.exercise1;

public abstract class Article {
    protected int discountThresold;
    protected int householdLimit;

    public abstract int getBulkDiscount();

    public abstract boolean showWarning();
}
