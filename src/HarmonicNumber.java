public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        float i = 2;
        float harmonic = 1;

        while (i<=n){
            System.out.println(harmonic);
            harmonic += (float) 1 / i;
            i++;
        }
    }
}
