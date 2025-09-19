import java.util.List;
import java.util.ArrayList;

class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<String>();
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                answer.add("Fizz");
            } 
            else if (i % 5 == 0){
                answer.add("Buzz");
            }
            else{
                String str = Integer.toString(i);
                answer.add(str);
            }
        }
        return answer;
    }
}