package designPatterns.behavioral.chain;

public interface DispenserAmountChain {
    void dispenceAmount(Currency currency);
    void setNextChain(DispenserAmountChain nextChain);
}
