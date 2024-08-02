package DistinctSubsequencesAppGate.distinctSubsequencesAppGate;

import DistinctSubsequencesAppGate.application.CountDistinctSubsequences;
import DistinctSubsequencesAppGate.domain.IsNullSource;
import DistinctSubsequencesAppGate.domain.IsNullTarget;
import DistinctSubsequencesAppGate.domain.Sequence;
import DistinctSubsequencesAppGate.infraestructure.DistinctSubsequencesServiceImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DistinctSequencesTest {
    private CountDistinctSubsequences countDistinctSubsequences;

    @Test
    public void shouldReturnZeroGivenEmptySAndNonEmptyT() {
        givenACountDistinctSubsequences();

        Sequence sourceString = new Sequence("");
        Sequence targetString = new Sequence("a");

        int result = whenCountDistinctSubsequencesWith(sourceString, targetString);

        thenTheNumberOfSubsequencesIs(0, result);

    }

    @Test
    public void should_Return_1_Given_Non_Empty_S_And_empty_T() {

        givenACountDistinctSubsequences();

        Sequence sourceString = new Sequence("a");
        Sequence targetString = new Sequence("");

        int result = whenCountDistinctSubsequencesWith(sourceString, targetString );

        thenTheNumberOfSubsequencesIs(1, result);
    }

    @Test
    public void should_return_1_when_S_and_T_have_the_same_strings() {
        givenACountDistinctSubsequences();

        Sequence sourceString = new Sequence("RabbitMq");
        Sequence targetString = new Sequence("RabbitMq");

        int result = whenCountDistinctSubsequencesWith( sourceString, targetString);

        thenTheNumberOfSubsequencesIs(1, result);
    }

    @Test
    public void should_return_Three_given_Rabbbit_and_Rabbit() {
        givenACountDistinctSubsequences();

        Sequence sourceString = new Sequence("rabbbit");
        Sequence targetString = new Sequence("rabbit");

        int result = whenCountDistinctSubsequencesWith( sourceString, targetString);

        thenTheNumberOfSubsequencesIs(3, result);
    }

    @Test
    public void should_return_five_given_babgbag_and_bag() {
        givenACountDistinctSubsequences();

        Sequence sourceString = new Sequence("babgbag");
        Sequence targetString = new Sequence("bag");

        int result = whenCountDistinctSubsequencesWith( sourceString, targetString);

        thenTheNumberOfSubsequencesIs(5, result);
    }

    @Test
    public void shouldReturnThreeGivenPatternOfTwoConsecutiveLoginFailuresInLogEvents() {

        givenACountDistinctSubsequences();

        Sequence sourceString = new Sequence("LOGINFAILURELOGINSUCCESS");
        Sequence targetString = new Sequence("LOGINFAILURE");

        int result = whenCountDistinctSubsequencesWith(sourceString, targetString);

        thenTheNumberOfSubsequencesIs(2, result);
    }

    @Test
    public void should_Throw_Exception_when_Source_is_null() {

        givenACountDistinctSubsequences();
        Sequence sourceString = null;
        Sequence targetString = new Sequence("LOGINFAILURE");

        assertThrows(IsNullSource.class, () -> {
            whenCountDistinctSubsequencesWith(sourceString, targetString);
        }, "is null source");
    }

    @Test
    public void should_Throw_Exception_when_target_is_null() {

        givenACountDistinctSubsequences();
        Sequence sourceString = new Sequence("LOGINFAILURELOGINSUCCESS");
        Sequence targetString = null;

        assertThrows(IsNullTarget.class, () -> {
            whenCountDistinctSubsequencesWith(sourceString, targetString);
        }, "Is null target");
    }


    private void givenACountDistinctSubsequences() {
        countDistinctSubsequences = new CountDistinctSubsequences(new DistinctSubsequencesServiceImpl());
    }

    private int whenCountDistinctSubsequencesWith(Sequence S, Sequence T) {
        return this.countDistinctSubsequences.invoke(S, T);
    }

    private static void thenTheNumberOfSubsequencesIs(int subsequences, int result) {
        assertEquals(subsequences, result);
    }
}
