package com.appslab;

public class Triangle {
    public static void main (String[] args){
        double SiteA = 2;
        double SiteB = 3;
        double SiteC = 4;
        if (SiteA<=(SiteB+SiteC)&&(SiteA+SiteB)>=SiteC&&SiteB<=(SiteA+SiteB)){
            boolean triangle = true;
            System.out.println(triangle);
        }
        else {
          boolean triangle = false;
          System.out.println(triangle);
        }
    }
}
