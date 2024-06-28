
package com.assignment3;

public class Continent {
    
    protected String name;
    protected long area;  //square kilometres
    protected long population;

    public Continent(String name, long area, long population){
        this.name = name;
        this.area = area;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Continent [Continent name=" + name + ",Continent area=" + area + ",Continent population=" + population + "]";
    }

    
    
}
