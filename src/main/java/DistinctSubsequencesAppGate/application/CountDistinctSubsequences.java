package DistinctSubsequencesAppGate.application;

import DistinctSubsequencesAppGate.domain.DistinctSubsequencesService;
import DistinctSubsequencesAppGate.domain.IsNullSource;
import DistinctSubsequencesAppGate.domain.IsNullTarget;
import DistinctSubsequencesAppGate.domain.Sequence;

public class CountDistinctSubsequences {
    private final DistinctSubsequencesService distinctSubsequencesService;

    public CountDistinctSubsequences(DistinctSubsequencesService distinctSubsequencesService) {
        this.distinctSubsequencesService = distinctSubsequencesService;
    }

    public int invoke(Sequence source, Sequence target) {

        guard_validate_source(source);
        guard_validate_target(target);

        return this.distinctSubsequencesService.count(source, target);
    }

    private static void guard_validate_source(Sequence source) {
        if(source == null) throw new IsNullSource("Is null source");
    }

    private static void guard_validate_target(Sequence target) {
        if(target == null) throw new IsNullTarget("Is null target");
    }
}