package fr.tancou.strategypattern.strategy;

public class DoubleEverything implements ICalculatorStrategy {
    @Override
    public String getName() {
        return "DoubleEverything";
    }

    @Override
    public int operate(int value) {
        return value * 2;
    }
}
