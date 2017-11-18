package com.konst007;

class CalculationImpl implements Calculation{

    public boolean isPossibleMove(Dancer dancer, int[] sequence, int distance) {

        if((distance%2==0)&&(dancer.getPosition()+distance>sequence.length-1))
            return false;
        if((distance%2!=0)&&(dancer.getPosition()-distance<0))
            return false;
        return true;

    }

    public int calculateSteps(int... sequence) {

        Dancer dancer = new Dancer();
        int sum=0;
        int distance = sequence[dancer.getPosition()];
        int[] flag = new int[sequence.length];
        while (isPossibleMove(dancer, sequence, distance)){

            if(flag[dancer.getPosition()]!=1) {
                flag[dancer.getPosition()]=1;
                sum += distance;
                dancer.move(distance);
                distance = sequence[dancer.getPosition()];
            }else
                return -1;

        }
        sum+=dancer.getPosition();
        return sum;

    }

}
