package fr.tancou.strategypattern;

import fr.tancou.strategypattern.strategy.ICalculatorStrategy;

public class Calculator {

    /**
     * Classe adaptée pour effectuer les traitements.
     */
    private ICalculatorStrategy adaptee;
    /**
     * Valeur du calculateur en cours
     */
    private int value;

    /**
     * Constructeur prenant en considération l'adaptation
     * @param adaptee
     */
    Calculator(ICalculatorStrategy adaptee){
        this.adaptee = adaptee;
    }

    /**
     * @return Nom du calculateur
     */
    public String getName() {
        return adaptee.getName();
    }

    /**
     * @param value Définit la valeur en cours du calculateur
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return Retourne la veuleur du calculateur
     */
    public int getValue() {
        return value;
    }

    /**
     * Réalise un traitement sur la valeur du calculateur.
     * Ne retourne rien.
     */
    public void process() {
        value = adaptee.operate(value);
    }
}
