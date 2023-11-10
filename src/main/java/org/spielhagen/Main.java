package org.spielhagen;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Schlüssel1", "1");
        hashMap.put("Schlüssel2", "2");

        String wert1 = hashMap.get("Schlüssel1");
        System.out.println("Wert für Schlüssel1: " + wert1);

        hashMap.remove("Schlüssel2");

        for (Map.Entry<String, String> stringEntry : hashMap.entrySet()) {
            String key = stringEntry.getKey();
            String wert = stringEntry.getValue();
            System.out.println("Schlüssel: " + key + ", Wert: " + wert);
        }

        int sized = hashMap.size();
        System.out.println("Größe der HashMap: " + sized);
    }
}