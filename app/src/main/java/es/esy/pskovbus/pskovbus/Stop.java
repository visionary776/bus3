package es.esy.pskovbus.pskovbus;

/**
 * Created by root on 31.10.16.
 */

public  class Stop {

    String name;
    int id;
   double [] geo;
    int [] routeHere;

    public Stop(String name, int id, double[] geo, int[] routeHere) {
        this.name = name;
        this.id = id;
        this.geo = geo;
        this.routeHere = routeHere;
    }
}