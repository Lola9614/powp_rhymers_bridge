package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public interface RhymersFactory {

    defaultCountingOutRhymer getStandardRhymer();

    defaultCountingOutRhymer getFalseRhymer();

    defaultCountingOutRhymer getFIFORhymer();

    defaultCountingOutRhymer getHanoiRhymer();

}
