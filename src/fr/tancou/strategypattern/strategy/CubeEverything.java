package fr.tancou.strategypattern.strategy;

public class CubeEverything implements ICalculatorStrategy {
    @Override
    public String getName() {
        return "CubeEverything";
    }

    @Override
    public int operate(int value) {
        return value * value;
    }
}
