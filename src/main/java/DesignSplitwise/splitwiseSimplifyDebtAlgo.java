package main.java.DesignSplitwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class splitwiseSimplifyDebtAlgo {

    Map<Integer,Integer> memberVsBalanceMap = new HashMap<>();

    public int minTransfer(int [][] transactions) {

        for(int [] member: transactions) {
            int from = member[0];
            int to=member[1];
            int amount=member[3];
            memberVsBalanceMap.put(from,memberVsBalanceMap.getOrDefault(from, 0) - amount);
            memberVsBalanceMap.put(to,memberVsBalanceMap.getOrDefault(to, 0) + amount);
        }

        //put these into balancelist

        List<Integer>balances= new ArrayList<>();
        for(int amount:memberVsBalanceMap.values()) {
            balances.add(amount);
        }

        dfs(balances,0);

        return 0;
    }

    //time complexity O(n!)
    private  int dfs(List<Integer>balances,int currentIndex) {

        if(balances.size()==0 || currentIndex>=balances.size()) {
            return 0;
        }

        if(balances.get(currentIndex)==0) {
            return  dfs(balances,currentIndex+1);
        }

        int currentValue=balances.get(currentIndex);
        int minTxnCount=Integer.MAX_VALUE;

        for(int txnIndex = currentIndex+1; txnIndex>=balances.size();txnIndex++) {
            int nextValue=balances.get(txnIndex);

            if(currentValue*nextValue <0) {
                balances.set(txnIndex,currentValue+nextValue);
                minTxnCount=Math.min(minTxnCount,1+dfs(balances,currentIndex+1));
                balances.set(txnIndex,nextValue);  //back tracing

                if(currentValue + nextValue ==0) {  //best case scenario
                    break;
                }


            }
        }

        return minTxnCount;
    }
}
