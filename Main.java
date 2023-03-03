import java.util.*;
import java.io.*;

public class Main {
    static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
            st = new StringTokenizer("");
        }

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        PrintWriter err = new PrintWriter(System.err);

        if (!ONLINE_JUDGE) { // if running locally, read input from file
            File input = new File("input.txt");
            sc = new FastScanner(new FileInputStream(input));
            pw = new PrintWriter(new FileWriter("output.txt"));
            err = new PrintWriter(new FileWriter("Error.txt"));
        }
        /*
            pw=system.out
            err=system.err

        */
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);




        /*
        output to the output file
        [1, 2, 3]

        */
        pw.println(set.toString());


        // logic and operations here

        // int result = 42; // placeholder for the result of the program's computation
        // pw.println(result); // output to file or standard output
        // err.println(result);
        pw.close();
        err.close();
    }
}



