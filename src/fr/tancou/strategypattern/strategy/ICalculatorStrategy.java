package fr.tancou.strategypattern.strategy;

/**
 * Cette interface permet de structurer les différentes classes adaptée
 */
public interface ICalculatorStrategy {

    /**
     * @return Renvoie le nom de la classe adaptée
     */
    String getName();

    /**
     * Réalise une opération sur une valeur
     * @param value
     * @return
     */
    int operate(int value);
}
