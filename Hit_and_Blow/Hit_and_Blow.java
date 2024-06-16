import java.util.Random;

/**
 * Hit_and_Brow
 */

public class Hit_and_Blow extends Object {
/**
 * 
 * @return AnsArray
 */
    public int[] hit_and_blow() {

        int flg = 0;
        int[] AnsArray = { 99, 99, 99, 99 };


        int ans;
        for (int i = 0; i < 4; i++) {

            do {

                Random random = new Random();
                ans = random.nextInt(6);

                flg = 0;

                for (int j = 0; j < 4; j++) {

                    if(ans == AnsArray[j]) {

                        flg++;
                    }

                }

            } while (flg != 0);
                
            AnsArray[i] = ans;
        }

        return AnsArray;
    }
}