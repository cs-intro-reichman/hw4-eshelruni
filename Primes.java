public class Primes {
    public static void main(String[] args) {
        int untilNum = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[untilNum + 1];
        for (int i = 2; i <= untilNum; i++) {
            primes[i] = true;
        }
        int primeNum = 2;
        while (primeNum <= untilNum) {
            if (primes[primeNum]) {
                for (int i = primeNum + 1; i <= untilNum; i++) {
                    if (i % primeNum == 0) {
                        primes[i] = false;
                    }
                }
            }
            primeNum++;
        }
        int counter = 0;
        System.out.println("Prime numbers up to " + untilNum + ":");
        for (int i = 2; i <= untilNum; i++) {
            if (primes[i]) {
                System.out.println("" + i);
                counter++;
            }
        }
        double percentage = ((double) counter / (double) untilNum) * 100;
        System.out.println("There are " + counter + " primes between 2 and " + untilNum + " (" + (int) percentage + "% are primes)");
    }
}