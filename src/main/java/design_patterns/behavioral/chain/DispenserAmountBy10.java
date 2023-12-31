package design_patterns.behavioral.chain;

public class DispenserAmountBy10 implements DispenserAmountChain{
    private DispenserAmountChain next;
    @Override
    public void dispenseAmount(Currency currency) {
        if (currency.getAmount() < 10){
            next.dispenseAmount(currency);
        } else {
            System.out.println("Numar bancnote de 10: " + currency.getAmount() / 10);
            int remainingAmount = currency.getAmount() % 10;
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
