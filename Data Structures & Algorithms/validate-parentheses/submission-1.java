class Solution {
    public boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                res.push(')');
            }
            else if (x == '{') {
                res.push('}');
            }
            else if (x == '[') {
                res.push(']');
            }
            else {
                if (res.empty() || res.pop() != x) {
                    return false;
                }
            }
        }
        return res.isEmpty();
    }
}
