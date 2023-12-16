package design_patterns.behavioral.chain;

public interface DispenserAmountChain {
    void dispenseAmount(Currency currency);
    void setNextChain(DispenserAmountChain nextChain);
}
