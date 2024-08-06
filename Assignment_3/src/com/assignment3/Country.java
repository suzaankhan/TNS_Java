
package com.assignment3;

public class Country extends Continent{
    
    protected String rulingParty;
    protected int hungerIndex;
    protected String capital;

    public Country(String rulingParty, String capital, int hungerIndex, String name, long area,long population){
        super(name, area, population);
        this.rulingParty = rulingParty;
        this.hungerIndex = hungerIndex;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country [Continent name=" + name + ",Continent population=" + population + ",Continent area=" + area +  ", rulingParty=" + rulingParty  + ", hungerIndex=" + hungerIndex  + ", capital=" + capital + "]";
    }

    
   
}
