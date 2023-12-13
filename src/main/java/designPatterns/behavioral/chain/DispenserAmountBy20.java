package designPatterns.behavioral.chain;

public class DispenserAmountBy20 implements DispenserAmountChain{
    private DispenserAmountChain next;
    @Override
    public void dispenceAmount(Currency currency) {
        if (currency.getAmount() < 20) {
            next.dispenceAmount(currency);
        } else {
            System.out.println("Numar bancnote de 50: " + currency.getAmount() / 20);
            int remainingAmount = currency.getAmount() % 20;
            if (remainingAmount > 0) {
                next.dispenceAmount(new Currency(remainingAmount));
            }
        }
    }

    @Override
    public void setNextChain(DispenserAmountChain nextChain) {
        this.next = nextChain;
    }
}
