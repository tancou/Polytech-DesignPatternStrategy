package fr.tancou.strategypattern.strategy;

public class NullEverything implements ICalculatorStrategy {
    @Override
    public String getName() {
        return "NullEverything";
    }

    @Override
    public int operate(int value) {
        return 0;
    }
}
