package com.daysix_inheritance;

public class Citizen {
    protected String name;
    protected String address;
    protected long phnno;
    protected String adhaar;

    public Citizen(){
        System.out.println("Message printed from Citizen's default constructor");
    }

    public Citizen(String adhaar, String name, String address, long phnno){
        this.adhaar = adhaar;
        this.name = name;
        this.address = address;
        this.phnno = phnno;
    }

    // @Override
    // public String toString() {
    //     return "Citizen [name=" + name + ", address=" + address + ", phnno=" + phnno + ", adhaar=" + adhaar + "]";
    // }

}
