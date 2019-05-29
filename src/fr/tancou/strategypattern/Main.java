package fr.tancou.strategypattern;

import fr.tancou.strategypattern.strategy.AsItIs;
import fr.tancou.strategypattern.strategy.CubeEverything;
import fr.tancou.strategypattern.strategy.DoubleEverything;
import fr.tancou.strategypattern.strategy.NullEverything;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Calculator> calculators =  Arrays.asList(
                new Calculator(new NullEverything()),
                new Calculator(new AsItIs()),
                new Calculator(new DoubleEverything()),
                new Calculator(new CubeEverything())
        );
        int inputValue = 3;
        calculators.forEach(c -> c.setValue(inputValue));
        calculators.forEach(Calculator::process);
        System.out.println(
                calculators.stream()
                    .map(c -> String.format("%s => %d", c.getName(), c.getValue()))
                    .collect(
                            Collectors.joining("]\n[", "Strategy Pattern \nInput value "+inputValue+"\n[", "]\n")
                    )
        );
    }
}
