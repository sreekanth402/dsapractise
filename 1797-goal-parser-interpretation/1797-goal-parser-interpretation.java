class Solution {
    public String interpret(String command) {
        StringBuilder b =new StringBuilder();
        for(int i=0;i<command.length();i++){
          if(command.charAt(i)=='G') b.append('G');
          if(command.charAt(i)=='(') {
            if(command.charAt(i+1)==')') {
            b.append('o');
            i++;
            }
            else{
                b.append("al");
                i=i+3;
            }
          }
        }
        return b.toString();
    }
}