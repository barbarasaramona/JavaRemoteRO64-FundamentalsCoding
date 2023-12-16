package advanced_coding;

public class ClientOffer implements  Offer{
    @Override
    public int getDiscount(Car car) {
        return 5;
    }
}
