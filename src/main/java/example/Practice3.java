package example;

public class Practice3 {
        public static void main(String[] args) {
            int loops = 100_000_000; // 100 million
            int modSum = 0;
            int andSum = 0;

            // Benchmark modulus (%)
            long startMod = System.nanoTime();
            for (int i = 0; i < loops; i++) {
                modSum += i % 8;
            }
            long endMod = System.nanoTime();
            long modTime = endMod - startMod;

            // Benchmark bitwise (&)
            long startAnd = System.nanoTime();
            for (int i = 0; i < loops; i++) {
                andSum += i & 7;
            }
            long endAnd = System.nanoTime();
            long andTime = endAnd - startAnd;

            // Output results
            System.out.println("Modulus (%) time : " + modTime / 1_000_000 + " ms");
            System.out.println("Bitwise (&) time : " + andTime / 1_000_000 + " ms");

            // To ensure compiler doesn't optimize out the code
            System.out.println("modSum = " + modSum);
            System.out.println("andSum = " + andSum);
        }
    }


