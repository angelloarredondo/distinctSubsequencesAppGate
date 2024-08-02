package DistinctSubsequencesAppGate.application;

import DistinctSubsequencesAppGate.domain.DistinctSubsequencesService;
import DistinctSubsequencesAppGate.domain.Sequence;

public class CountDistinctSubsequences {
    private final DistinctSubsequencesService distinctSubsequencesService;

    public CountDistinctSubsequences(DistinctSubsequencesService distinctSubsequencesService) {
        this.distinctSubsequencesService = distinctSubsequencesService;
    }

    public int invoke(Sequence source, Sequence target) {
        return this.distinctSubsequencesService.count(source, target);
    }
}