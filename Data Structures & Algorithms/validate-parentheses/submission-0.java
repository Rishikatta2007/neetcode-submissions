class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> pairs=new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (pairs.containsKey(ch)){
                if(stack.isEmpty() || stack.pop() != pairs.get(ch)){
                    return false;
                }
                

            }
            else {
                stack.push(ch);
            }
        }

        return stack.isEmpty();
        
    }
}
