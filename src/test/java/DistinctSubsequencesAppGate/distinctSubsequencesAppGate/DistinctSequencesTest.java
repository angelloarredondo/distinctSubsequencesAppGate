package DistinctSubsequencesAppGate.distinctSubsequencesAppGate;

import DistinctSubsequencesAppGate.application.CountDistinctSubsequences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctSequencesTest {

    @Test
    public void shouldReturnZeroGivenEmptySAndNonEmptyT() {
        CountDistinctSubsequences countDistinctSubsequences = new CountDistinctSubsequences();

        String S = "";
        String T = "a";

        int result = countDistinctSubsequences.invoke(S, T);

        assertEquals(0, result);

    }

    @Test
    public void should_Return_1_Given_Non_Empty_S_And_empty_T() {

        CountDistinctSubsequences countDistinctSubsequences = new CountDistinctSubsequences();

        String S = "a";
        String T = "";

        int result = countDistinctSubsequences.invoke(S, T);

        assertEquals(1, result);

    }

    @Test
    public void should_return_1_when_S_and_T_have_the_same_strings() {
        CountDistinctSubsequences countDistinctSubsequences = new CountDistinctSubsequences();

        String S = "RabbitMq";
        String T = "RabbitMq";

        int result = countDistinctSubsequences.invoke(S, T);

        assertEquals(1, result);

    }

}
