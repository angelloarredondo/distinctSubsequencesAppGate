package DistinctSubsequencesAppGate.application;

public class CountDistinctSubsequences {
    public int invoke(String source, String target) {
        if(source.isEmpty()) return 0;
        if(target.isEmpty()) return 1;
        if(source.equalsIgnoreCase(target)) return 1;

        int[][] table = createInitialTable(source.length(), source.length());

        initialFirstColumn(table, source);

        fillTable(table, source, target);

        return table[source.length()][target.length()];
    }

    private void fillTable(int[][] table, String source, String target) {
        for (int i = 1; i <= source.length(); i++) {
            for (int j = 1; j <= target.length(); j++) {
                if (source.charAt(i - 1) == target.charAt(j - 1)) {
                    table[i][j] = table[i - 1][j - 1] + table[i - 1][j];
                } else {
                    table[i][j] = table[i - 1][j];
                }
            }
        }
    }

    private void initialFirstColumn(int[][] table, String source) {
        for (int i = 0; i < source.length(); i++) {
            table[i][0] = 1;
        }
    }

    private int[][] createInitialTable(int sourceLength, int targetLength) {
        return new int[sourceLength+1][targetLength+1];
    }
}
