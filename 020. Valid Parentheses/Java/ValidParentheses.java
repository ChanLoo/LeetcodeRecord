public class ValidParentheses {
    public boolean isValid(String s) {
        // 2ms 37.6MB
        Stack<Character> st = new Stack<Character>();
        char[] c = s.toCharArray();
        for(char cc : c){
            if (cc == "(".charAt(0) || cc == "[".charAt(0) || cc == "{".charAt(0)) {
                st.push(cc);
            } else if (cc == ")".charAt(0)) {
                if (st.empty()) return false;
                char cr = st.pop();
                if (cr != "(".charAt(0)) return false;
            } else if (cc == "]".charAt(0)) {
                if (st.empty()) return false;
                char cr = st.pop();
                if (cr != "[".charAt(0)) return false;
            } else if (cc == "}".charAt(0)) {
                if (st.empty()) return false;
                char cr = st.pop();
                if (cr != "{".charAt(0)) return false;
            }
        } 
        if (st.empty()) return true;
        else return false;
    }
}