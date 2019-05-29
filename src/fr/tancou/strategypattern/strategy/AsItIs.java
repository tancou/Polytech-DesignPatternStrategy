package fr.tancou.strategypattern.strategy;

public class AsItIs implements ICalculatorStrategy {
    @Override
    public String getName() {
        return "AsItIs";
    }

    @Override
    public int operate(int value) {
        return value;
    }
}
