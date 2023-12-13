package designPatterns.behavioral.chain;

public class DispenserAmountBy50 implements DispenserAmountChain{
    private DispenserAmountChain next;
    @Override
    public void dispenceAmount(Currency currency) {
        if (currency.getAmount() < 50){
           next.dispenceAmount(currency);
        } else {
            System.out.println("Numar bancnote de 50: " + currency.getAmount() / 50);
            int remainingAmount = currency.getAmount() % 50;
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
