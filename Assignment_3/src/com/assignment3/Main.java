package com.assignment3;

public class Main {

    public static void main(String[] args) {
        
        Continent asia = new Continent("Asia", 44579000L, 4739000000L);
        Continent europe = new Continent("Europe", 10180000L, 746000000L);

        States maharashtra = new States("marathi", "Bollywood", 2000, "NDA", "Delhi", 107, "Asia", 44579000L, 4739000000L);
        Country india = new Country("NDA", "Delhi", 107, "Asia", 44579000L, 4739000000L);

        States guangdong =  new States("Putonghua", "Cantonese Cuisine", 1200, "Communist Party of China", "Beijing", 10, "Asia", 44579000L, 4739000000L);
        Country china = new Country("Communist Party of China", "Beijing", 10, "Asia", 44579000L, 4739000000L);
        

        System.out.println(asia + "\n");
        System.out.println(europe + "\n");

        System.out.println(india);
        System.out.println(maharashtra+ "\n");

        System.out.println(china);
        System.out.println(guangdong + "\n");
    }
    
}
