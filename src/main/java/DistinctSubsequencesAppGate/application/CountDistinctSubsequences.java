package DistinctSubsequencesAppGate.application;

public class CountDistinctSubsequences {
    public int invoke(String sourceString, String targetString) {
        if(sourceString.isEmpty()) return 0;
        if(targetString.isEmpty()) return 1;
        if(sourceString.equalsIgnoreCase(targetString)) return 1;
        return 0;
    }
}
