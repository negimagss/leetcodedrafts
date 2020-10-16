
public class REverseWords {




	public static void main(String[] args) {
	
		System.out.println(	new REverseWords().reverseWords1("Let's take LeetCode contest"));
	
	
	}


	public String reverseWords1(String s) {

		String[] str = s.split("");
		StringBuilder  sb = new StringBuilder();
		for(int i =str.length-1;i>=0;i--) {
			StringBuilder  sb1 = new StringBuilder(str[i]);
			sb.append(sb1.reverse().toString());
			if(i==0){
				break;
			}
			sb.append(" ");

		}


		return sb.toString();

	}
}
