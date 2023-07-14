import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Day14 {
	 static class Node implements Comparable<Node>{
	        int idx;
	        int age;
	        String name;

	        public Node(int idx, int age, String name) {
	            this.idx = idx;
	            this.age = age;
	            this.name = name;
	        }

	        @Override
	        public int compareTo(Node o) {
	            if (this.age == o.age) {
	                return this.idx - o.idx;
	            }
	            return this.age - o.age;
	        }
	    }


	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(st.nextToken());

	        ArrayList<Node> list = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            st = new StringTokenizer(br.readLine());
	            int age = Integer.parseInt(st.nextToken());
	            String name = st.nextToken();
	            list.add(new Node(i, age, name));
	        }

	        Collections.sort(list);

	        for (int i = 0; i < n; i++) {
	            Node cur = list.get(i);
	            System.out.println(cur.age + " " + cur.name);
	        }
	    }
}
