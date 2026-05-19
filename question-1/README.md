# Question 1: Methods and Control Structures

# Part A 
## My Approach
Part A: For Part A, the question asks if a certain name is available and not taken through using the boolean helper method, isAvailable(). Through this method, I checked if a certain username was available, and if it was, then my code will construct that object for Account with that username set as the input message. Now, if the username was not available, then my code would append digits, (starting from 1 all the way until an available username is open), and then set username equal to that first instance of the availble username. 

## What Gave me Trouble
At first, I didn't fully understand the adding of the digits onto the string in order to create a valid username for the user. After I understood that it was removing the past digits and just adding the new digit, then I was able to solve the problem. 

## What I would do Differently 
I would probably try to simplify the boolean expression within the while loop because it was a little convoluted and hard to read. 

# Part B
## My Approach
Part B: The question involves returning a String word that removes all the hyphens and the letter preceding the hyphen as well. My code works in the form of a while loop that checks if there is a hyphen within the username String. If a hyphen is found, then the username is substringed to remove both the hyphen and the letter before it, and it is repeated until there is no longer a hyphen in the word (or when the indexOf the hyphen is -1).

## What Gave me Trouble
I think that the problem was fairly straight forward, but I think one thing that I somewhat struggled on was indices for the substring I used on the String. 

## What I would do Differently 
I would probably rename the variables or add comments so it is easier to read. 

## Course Connections 
Both of the parts were similar to the Restaurant project, which involved substrings of words and more for data. 
