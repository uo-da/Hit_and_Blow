public class HitJudge {
    /**
     * 
     * @param Ansarray 乱数配列
     * @param HaBarray 入力配列
     * @return hitcount
     */
    public int Hjudge(int[] Ansarray, int[] HaBarray) {

        int hitcount = 0;

        for (int i = 0; i < 4; i++) {
            if (Ansarray[i] == HaBarray[i]) {
                hitcount++;
            }else{
                for (int j = 0; j < 4; j++) {
                    if (Ansarray[i] == HaBarray[j]) {
                        j = 5;
                    }
                }
            }
        }

        return hitcount;
    }
}
