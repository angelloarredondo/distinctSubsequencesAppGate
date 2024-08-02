package DistinctSubsequencesAppGate.domain;

public class Sequence {
    private final String value;

    public Sequence(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isEmpty() {
        return value.isEmpty();
    }

    public int length() {
        return value.length();
    }
}
