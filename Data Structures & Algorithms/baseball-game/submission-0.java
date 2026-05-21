class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> result = new Stack();
        for(String s : operations){
            if(s.equals("+")){
            int size = result.size();
            int sum = result.get(size-1)+result.get(size-2);
            result.add(sum);
            }
            

            else if(s.equals("D")){
                result.add(result.peek()*2);
            }
            else if(s.equals("C")){
                result.pop();
            }
            else{
                result.add(Integer.parseInt(s));
            }
        }
        int sum=0;
        for(int num:result){
            sum+=num;
        }
        return sum;

    }
}