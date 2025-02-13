package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer Temp = new defaultCountingOutRhymer();
    
    @Override
    public int countOut() {
        while (!callCheck())
        Temp.CountIn(super.countOut());
        
        int ret = Temp.countOut();
        
        while (!Temp.callCheck())
        CountIn(Temp.countOut());
        
        return ret;
    }
}
