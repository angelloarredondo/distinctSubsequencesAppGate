package DistinctSubsequencesAppGate.distinctSubsequencesAppGate;

import DistinctSubsequencesAppGate.application.CountDistinctSubsequences;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistinctSequencesTest {
    private CountDistinctSubsequences countDistinctSubsequences;

    @Test
    public void shouldReturnZeroGivenEmptySAndNonEmptyT() {
        givenACountDistinctSubsequences();

        String sourceString = "";
        String targetString = "a";

        int result = whenCountDistinctSubsequencesWith(sourceString, targetString);

        thenTheNumberOfSubsequencesIs(0, result);

    }

    @Test
    public void should_Return_1_Given_Non_Empty_S_And_empty_T() {

        givenACountDistinctSubsequences();

        String sourceString = "a";
        String targetString = "";

        int result = whenCountDistinctSubsequencesWith(sourceString, targetString );

        thenTheNumberOfSubsequencesIs(1, result);
    }

    @Test
    public void should_return_1_when_S_and_T_have_the_same_strings() {
        givenACountDistinctSubsequences();

        String sourceString = "RabbitMq";
        String targetString = "RabbitMq";

        int result = whenCountDistinctSubsequencesWith( sourceString, targetString);

        assertEquals(1, result);

    }

    @Test
    public void should_return_Three_given_Rabbbit_and_Rabbit() {
        givenACountDistinctSubsequences();

        String sourceString = "rabbbit";
        String targetString = "rabbit";

        int result = whenCountDistinctSubsequencesWith( sourceString, targetString);

        assertEquals(3, result);

    }


    private void givenACountDistinctSubsequences() {
        countDistinctSubsequences = new CountDistinctSubsequences();
    }

    private int whenCountDistinctSubsequencesWith(String S, String T) {
        return this.countDistinctSubsequences.invoke(S, T);
    }

    private static void thenTheNumberOfSubsequencesIs(int subsequences, int result) {
        assertEquals(subsequences, result);
    }
}
