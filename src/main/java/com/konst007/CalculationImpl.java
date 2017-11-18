package com.konst007;

public class CalculationImpl implements Calculation{

    public boolean isPossibleMove(Dancer dancer, int[] sequence, int distance) {

        if((distance%2==0)&&(dancer.getPosition()+distance>sequence.length-1))
            return false;
        if((distance%2!=0)&&(dancer.getPosition()-distance<0))
            return false;
        return true;

    }

    public int calculateSteps(int... sequence) {

        return 0;

    }

}
