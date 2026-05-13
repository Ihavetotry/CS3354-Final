abstract class ShippingDecorator implements ShippingStrategy {
    private ShippingStrategy wrappedStrategy;
    public ShippingDecorator(ShippingStrategy wrappedStrategy) {
        this.wrappedStrategy = wrappedStrategy;
    }
    protected ShippingStrategy getWrappedStrategy() {
        return wrappedStrategy;
    }
}
