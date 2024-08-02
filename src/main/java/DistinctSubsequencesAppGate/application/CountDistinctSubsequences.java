package DistinctSubsequencesAppGate.application;

public class CountDistinctSubsequences {
    public int invoke(String S, String T) {
        if(S.isEmpty()) return 0;
        if(T.isEmpty()) return 1;
        if(S.equalsIgnoreCase(T)) return 1;
        return 0;
    }
}
