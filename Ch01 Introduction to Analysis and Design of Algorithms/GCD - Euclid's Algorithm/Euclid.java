public class Euclid {
    public static void main(String[] args) {
        
    }

    /**
     * Applies the algorithm of Euclid's to solve the gcd
     * problem recursively.
     * The psueodocode can be found at ../README.md.
     *
     * @param m first non-negative integer, m != 0 if n = 0.
     * @param n second non-negative integer, n != 0 if m = 0.
     * @return greatest common divisor between m and n
     */
    public int recursive_gcd(int m, int n){
        public int recursive_gcd(int m, int n) {
        if(n == 0)
            return m;
        
        return recursive_gcd(n, m % n);
    }
    }
}
