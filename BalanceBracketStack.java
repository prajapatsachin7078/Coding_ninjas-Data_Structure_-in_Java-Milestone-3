package stack.DSA;

import java.util.Stack;
public class BalanceBracketStack {
	
	public static void main(String str[]) {
		String str1 = "()((()())";
		System.out.println(str1);
		System.out.print(isBalanced("Is Balance : " +str1));
	}


    public static boolean isBalanced(String str) {
        //Your code goes here
        Stack<Character>stack = new Stack<Character>();
        if(str.length() == 0){
            return true;
        }
        int i = 0,j=-1;
        // check if there is any closing bracket at first index
        if(str.charAt(i) == '}' || str.charAt(i) == ']' 
                     || str.charAt(i) == ')'){
            return false;
        }
        while(i<str.length()){
            if(str.charAt(i) == '{' ||str.charAt(i) == '[' 
               ||str.charAt(i) =='('){
                
                stack.push(str.charAt(i));
                i++;
               
            }
            else if(str.charAt(i) == '}' || str.charAt(i) == ']' 
                     || str.charAt(i) == ')'){
                if(j==-1){
                    j = i;
                }
                i++;
                continue;
                
                
            }
                
            else{
                i++;
            }
        }
        i = j;
        boolean flag = false;
        while(i<str.length() && !stack.isEmpty())
        {
            if(stack.peek() == '(' && str.charAt(i) == ')'|| stack.peek() =='[' && str.charAt(i) == ']'
            		|| stack.peek() == '{' && str.charAt(i) == '}')
            {
               flag = true;
               stack.pop(); 
               i++;
            }else if(stack.peek() == '(' && str.charAt(i) != ')'|| stack.peek() =='[' && str.charAt(i) != ']'
            		|| stack.peek() == '{' && str.charAt(i) != '}') {
            	flag =  false;
            	i++;
            }
            else
            {
                i++;
            }
        }
        if(stack.isEmpty() && flag) {
        	return true;
        }
        return false;
    }
}