This is the working solution I came up with for FizzBuzz problem in Leetcode (Problem 412). 
The code first initiates the answer variable to be returned for later. We then make a for loop that goes from 1 to n. During this loop, if the number i is divisible by 3 and 5, we add the string "FizzBuzz" to the array. The rest of the code follows the problem format:
answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.

This is a basic problem I did a while back but I wanted to put it here cause why not.

