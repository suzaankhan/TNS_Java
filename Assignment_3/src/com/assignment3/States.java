
package com.assignment3;

public class States extends Country{
    
    protected String language;
    protected String famousFor;
    protected int no_of_hospitals;

    public States(String language, String famousFor, int no_of_hospitals, 
    String rulingParty, String capital, int hungerIndex, 
    String name, long area,long population ){
        super( rulingParty,  capital,  hungerIndex,  name,  area, population);
        this.language = language;
        this.famousFor = famousFor;
        this.no_of_hospitals = no_of_hospitals;
    }

    @Override
    public String toString() {
        return "States [Continent name=" + name + ",Continent area=" + area + "sq kms" + ", population of continent=" + population + ", rulingParty=" + rulingParty + ", hungerIndex=" + hungerIndex + ", capital=" + capital + 
        ", language=" + language +  ", famousFor=" + famousFor + ", no_of_hospitals=" + no_of_hospitals + "]";
                 
    }


}
