package algorithmProgrammers.java.level2;

public class Solution12936 {
	long k, count = 0;
	int[] answer;
	public int[] solution(int n, long k) {
		this.k = k;
		answer = new int[n];
		int[] arr = new int[n];
		int[] output = new int[n];
		boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) { arr[i] = i+1; }
        
        perm(arr, output, visited, 0, n);
        
        return answer;
    }
	
	public void perm(int[] arr, int[] output, boolean[] visited, int depth, int n) {		
		if(depth == n) {			
			this.count++;
			if(this.k == this.count) {
				for(int i=0; i<n; i++) { this.answer[i] = output[i]; }
			}
			return;
		}
        
        if(this.k == this.count) return;

		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				output[depth] = arr[i];
				perm(arr, output, visited, depth + 1, n);
				visited[i] = false;
			}
		}
	}
	
	public static void main(String[] args) {
		Solution12936 sol = new Solution12936();
		int[] out = sol.solution(4, 8);
		
		for(int o : out) {
			System.out.print(o + " ");
		}
	}
}
