public class ShippingPolicyFactory
{

    public static ShippingStrategy getStrategy(String policy)
    {
        if (policy.equals("Flat Rate")) {
            return new FlatRateStrategy();
        } else if (policy.equals("Weight-Based")) {
            return new WeightBasedStrategy();
        } else if (policy.equals("Distance-Based")) {
            return new DistanceBasedStrategy();
        } else if (policy.equals("Carrier-Specific")) {
            return new CarrierSpecificStrategy();
        }
        return null;
    }

}
