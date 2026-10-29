package com.example.practicalfive;

public class TextProcessor {

    public String processMunicipality(String municipality) {
        if (municipality == null || municipality.trim().isEmpty()) {
            return null;
        }
        String lower = municipality.trim().toLowerCase();
        String result;

        switch (lower) {
            case "beijing":
                result = "Beijing";
                break;
            case "shanghai":
                result = "Shanghai";
                break;
            case "tianjin":
                result = "Tianjin";
                break;
            case "chongqing":
                result = "Chongqing";
                break;
            default:
                result = null;
                break;
        }
        return result;
    }
}
