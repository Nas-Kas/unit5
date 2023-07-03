import java.util.Stack;
/*
1. both of them are O(n)
2. both of them are O(n)
3. adding the hashmap wouldve cut down on lines of code
4. if you use a queue its the same thing except backwards
 */
public class stackqueue {
    public boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        if(s.charAt(0) == ')'){
            return false;
        }
        int ptr = 0;
        while(ptr < s.length()){
            Character curr = s.charAt(ptr);
            if(curr == '('){
                st.push(curr);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                Character next = st.pop();
                if(next == '(' && curr == ')'){
                    ptr += 1;
                    continue;
                }
                else{
                    return false;
                }
            }
            ptr += 1;
        }
        return st.isEmpty();
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')' || s.charAt(0) == '>'){
            return false;
        }
        int ptr = 0;
        while(ptr < s.length()){
            Character curr = s.charAt(ptr);
            if(curr == '[' || curr == '{' || curr == '(' || curr == '<'){
                st.push(curr);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                Character next = st.pop();
                if(next == '[' && curr == ']' || next == '{' && curr == '}' || next == '(' && curr == ')' || next == '<' && curr == '>'){
                    ptr += 1;
                    continue;
                }
                else{
                    return false;
                }
            }
            ptr += 1;
        }
        return st.isEmpty();
    }
}
