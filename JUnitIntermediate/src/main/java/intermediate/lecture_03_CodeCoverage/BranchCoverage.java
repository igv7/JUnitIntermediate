package intermediate.lecture_03_CodeCoverage;

public class BranchCoverage {
	
	public static int sumAllNumbers(int start, int end) {
		
		int res = 0;
		
		if (start > end) {
			res = 0;
		} else if (start == end) {
			res = end;
		} else {
			int position = start;
			while (position <= end) {
				res += position++;
			}
		}
		return res;
	}

}