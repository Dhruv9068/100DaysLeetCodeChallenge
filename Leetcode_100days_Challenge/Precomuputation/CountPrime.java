package first_ideaprogram.src.Leetcode_100days_Challenge.Precomuputation;

public class CountPrime {
    public static void main(String[] args) {
        int n=15;
        int c = countPrime(n);
        System.out.println(c);
    }
    static int countPrime(int n){
        if(n<2){
            return 0;
        }
        boolean [] Isprime = new boolean[n+1];
        int c = isSieve(Isprime ,  n);
        return c;

    }
    static int isSieve(boolean [] Isprime, int n){
        int count=0;
        for(int i=2;i*i<n;i++){
            for(int j=i*i; j<=n;j+=i){
                if(!Isprime[i]){
                    Isprime[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!Isprime[i]){
                count++;
            }
        }
        return count;
    }
}
