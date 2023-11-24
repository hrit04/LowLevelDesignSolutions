package main.java.DesignSplitwise.Expenses;

import main.java.DesignSplitwise.Expenses.Split.EqualExpenseSplit;
import main.java.DesignSplitwise.Expenses.Split.ExpenseSplit;
import main.java.DesignSplitwise.Expenses.Split.PercentageExpenseSplit;
import main.java.DesignSplitwise.Expenses.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}

