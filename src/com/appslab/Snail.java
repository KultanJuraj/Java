package com.appslab;

public class Snail {
    public static void main(String[] args){
        double HeightS = 0.5;
        double WideS= 0.4;
        double TowerH = 150;
        double TotalDistance;
        double NumberOfStairs =TowerH/HeightS;
        TotalDistance = NumberOfStairs * (WideS+HeightS);
        System.out.println("Total distance snail must travel is:\t"+TotalDistance);
    }
}
