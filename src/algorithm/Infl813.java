package algorithm;
import java.util.*;

class Infl813{
		static int answer = 0, n;
		static int [][] board;
		static int dx[] = {-1, -1, 0, 1, 1, 0, -1};
		static int dy[] = {0, 1, 1, 1, 0, -1, -1, -1};
	
	public void DFS(int x, int y, int board[][]) {
		for(int i= 0; i<8; i++) {
		int nx = dx[i] + x;
		int ny = dy[i] + y;
		if(nx >= 0 && nx <n && ny >= 0 && ny < n && board[nx][ny] == 1) {
			board[nx][ny] = 0;
			DFS(nx,ny,board);
		
		}
		}
	}
	public void solution(int board[][]) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j<n; j++) {
				if(board[i][j] == 1) {
					answer++;
					DFS(i, j, board);
				}
			}
		}
	}
		
			
	public static void main(String[] args) {
		Infl813 T = new Infl813();
		Scanner kb = new Scanner(System.in);
		n = kb.nextInt();
		int arr[][] = new int [n][n];
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = kb.nextInt();
			}
		}
		T.solution(arr);
	
		System.out.print(answer);
	}

}


