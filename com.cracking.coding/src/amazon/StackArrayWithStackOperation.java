package amazon;

import java.util.ArrayList;
import java.util.List;

public class StackArrayWithStackOperation {



	/**
	 * Input: target = [1,3], n = 3
Output: ["Push","Push","Pop","Push"]
Explanation: 
Read number 1 and automatically push in the array -> [1]
Read number 2 and automatically push in the array then Pop it -> [1]
Read number 3 and automatically push in the array -> [1,3]
	 * @param target
	 * @param n
	 * @return
	 */

	public List<String> buildArray(int[] target, int n) {


		// int last =target[target.length];
		int j=0;
		List<String> a = new ArrayList<String>();
		for(int i=1;i<=n;i++) {
			if(j==target.length) break;
			if(i!=target[j]) {

				a.add("Push");
				a.add("Pop");
				continue;
			}

			j++;
			a.add("Push");
		}  
		return a;
	}


}
