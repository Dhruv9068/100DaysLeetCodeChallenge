package first_ideaprogram.src.Leetcode_100days_Challenge.Counting;

public class BullsAndCows {
    public static void main(String[] args) {
        String secret ="1807",guess="7810";
        System.out.println(getHint(secret,guess));

    }
    static String getHint(String secret, String guess) {
        int bullCount = 0;
        int cowsCount = 0;


        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bullCount++;
            }
        }
        int [] secretCount = new int[10];
        int [] GuessCount = new int[10];

        for(int i =0; i<secret.length(); i++){


            secretCount[secret.charAt(i)-'0']++;
            GuessCount[guess.charAt(i)-'0']++;

        }
        for(int i =0; i<10; i++){
            cowsCount += Math.min(secretCount[i],GuessCount[i]);
        }

        cowsCount -= bullCount;

        return bullCount + "A"+ cowsCount +"B";

    }
}


