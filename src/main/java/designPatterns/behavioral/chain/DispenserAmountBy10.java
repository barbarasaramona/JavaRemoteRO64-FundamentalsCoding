package designPatterns.behavioral.chain;

public class DispenserAmountBy10 implements DispenserAmountChain{
    private DispenserAmountChain next;
    @Override
    public void dispenceAmount(Currency currency) {
        if (currency.getAmount() < 10){
            next.dispenceAmount(currency);
        } else {
            System.out.println("Numar bancnote de 50: " + currency.getAmount() / 10);
            int remainingAmount = currency.getAmount() % 10;
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
