package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer
{

    int TotalRejected = 0;

    public int reportRejected() {
        return TotalRejected;
    }

    public void CountIn(int in) {
        if (!callCheck() && in > peekaboo())
            TotalRejected++;
        else
            super.CountIn(in);
    }
}
