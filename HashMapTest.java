package com.qa.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main(String[] args) {
        Map<String, String> leagueAndCountry = new HashMap<>();
        
        leagueAndCountry.put("Ligue 1 ", " France");
        leagueAndCountry.put("Premier League ", " England");
        leagueAndCountry.put("Seria A ", " Italy");
        leagueAndCountry.put("Icons ", " Neutral");
        
        System.out.println(leagueAndCountry);
        
    }

}
