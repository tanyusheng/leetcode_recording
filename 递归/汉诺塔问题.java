package 递归;

import java.util.List;

public class 汉诺塔问题 {
	
	public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }
	
	private void move(int n,List<Integer> A, List<Integer> B, List<Integer> C) {
		if(n==1) {
			do_move(A, C);
		}else {
			move(n-1, A, C, B);
			do_move(A, C);
			move(n-1, B, A, C);
		}
		
	}
	private void do_move(List<Integer> start, List<Integer> over) {
		over.add(start.remove(start.size()-1));
	}
}
