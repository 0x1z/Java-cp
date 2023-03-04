import java.util.*;
import java.io.*;

public class Main {
    static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;

    static FastScanner sc;
    static PrintWriter pw;
    static PrintWriter err;

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


    static void setEnv() {
        sc = new FastScanner(System.in);
        pw = new PrintWriter(System.out);
        err = new PrintWriter(System.err);

        if (!ONLINE_JUDGE) { // if running locally, read input from file
            File input = new File("input.txt");
            try {
                sc = new FastScanner(new FileInputStream(input));
                pw = new PrintWriter(new FileWriter("output.txt"));
                err = new PrintWriter(new FileWriter("Error.txt"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static void closeEnv() {
        if (!ONLINE_JUDGE) {
            pw.close();
            err.close();
        }
    }

    static void solve() {
        int n = sc.nextInt();

        // err.println("n " + n);
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[i] = x;
        }
        List<Integer> arlist = new ArrayList<>();
        for (int i : arr) {
            arlist.add(i);
        }
        Collections.sort(arlist);
        err.println(arlist.toString());
    }

    public static void main(String[] args) throws IOException {
        setEnv();

        // logic and operations here
        int t = sc.nextInt(); // placeholder for the result of the program's computation
        // pw.println(result); // output to file or standard output
        // err.println(result);
        while (t-- > 0) {
            solve();
        }
        closeEnv();
    }
}
