package design_patterns.behavioral.chain;

public class DispenserAmountBy20 implements DispenserAmountChain{
    private DispenserAmountChain next;
    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() < 20) {
            next.dispenseAmount(currency);
        } else {
            System.out.println("Numar bancnote de 20: " + currency.getAmount() / 20);
            int remainingAmount = currency.getAmount() % 20;
            if (remainingAmount > 0) {
                next.dispenseAmount(new Currency(remainingAmount));
            }
        }
    }

    @Override
    public void setNextChain(DispenserAmountChain nextChain) {
        this.next = nextChain;
    }
}
