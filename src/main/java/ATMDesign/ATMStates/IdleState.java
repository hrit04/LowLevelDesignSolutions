package main.java.ATMDesign.ATMStates;

import main.java.ATMDesign.ATM;
import main.java.ATMDesign.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}


