package DistinctSubsequencesAppGate.distinctSubsequencesAppGate;

import DistinctSubsequencesAppGate.application.CountDistinctSubsequences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctSequencesTest {

    @Test
    public void should_return_zero_given_empty_S_And_NonEmpty_T() {
        CountDistinctSubsequences countDistinctSubsequences = new CountDistinctSubsequences();

        String S = "";
        String T = "a";

        int result = countDistinctSubsequences.invoke(S, T);

        assertEquals(0, result);

    }

}
