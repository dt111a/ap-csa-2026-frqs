# Question 3: Array List Algorithms 
This question involves extracting data from an ArrayList of Attendance objects, which hold the data for the ID of a given student and that student's attendance. The question asks for a method that determines the number of students who are in both the Math Class (mathList) and History Class (historyList) and has more absences in history than math, and returns that count of students. 

## My approach
I started by realizing I needed to keep track of an incrementer variable for the number of students, so that was my first line (not including method initialization). After that, I knew I needed to traverse through the history list to see if that student was also in math class, which I achieved by having a nested loop that traverses first through the history list and then the math list, and if the student ID is the same within both list, then it would go into the conditional since the boolean expression is passed. After this, my code checks if the absences within history list for that given student is higher than the absences of the student within the math list, and if so, then the incrementer variable of count is incremented and added once.

## Course Connections
This is similar to candy box, where we traverse the list and see if a given object in an ArrayList is contained in order to remove that candy. 

## What Gave Me Trouble 
I think the hardest thing in this problem was how to traverse through the list in order to check if a given student in history list is also located within math list. It was made a lot easier though, with the precondition that no elements are null and there are no student duplicates. 

## What I Would Do Differently 
Next Time, I think I could probably make the code more efficient by removing the variables I created within the nested loop. I created a lot of variables which took up space and probably computing time, but it could possibly be skipped instead by just putting everything into that same boolean expression. 
