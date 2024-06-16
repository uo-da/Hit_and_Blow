public class BlowJudge {
    /**
     * 
     * @param Ansarray 乱数配列
     * @param HaBarray 入力配列
     * @return blowcount
     */
    public int Bjudge(int[] Ansarray, int[] HaBarray) {
        
        @SuppressWarnings("unused")
        int hitcount = 0;
        int blowcount = 0;

        for (int i = 0; i < 4; i++) {
            if (Ansarray[i] == HaBarray[i]) {
                hitcount++;
            }else{
                for (int j = 0; j < 4; j++) {
                    if (Ansarray[i] == HaBarray[j]) {
                        blowcount++;
                        j = 5;
                    }
                }

            }
        }

        return blowcount;
        
    }
}
