# Question 4: 2D Arrays
This question involves a Space class with a board object that contains values for certain tiles within a board. The question asks for the student to create an algorithm that will return the total value of a targetRow (parameter), and if they are all the same color, then the total value of that row will be doubled. 

## My Approach 
Since we are only looking at one row at a time, the only thing that needs to be traversed is the columns to get through that desired row. As a result, I created that loop and I summed each value for the objects within that row. While that is occurring, I also have a boolean checker that is set to true outside of the loop, and if the color at any index is not equal to the color at the first index, then it will change that boolean to false. At the end of the code when the total sum is found, it will check that boolean, and if it is true, then it means that the entire row has the same color, thus doubling the value and returning that final sum.

## Course Connections 
This was similar to the parking lot project, where we had to traverse through the parking lot in multiple different ways. I think one of the ways that we did traverse through it was column-wise (which was helpful here). 

## What Gave Me Trouble 
What gave me trouble was making sure that my boolean condition was right and that it accurately determines if all the objects within the row was the same color. I thought about how to compare if the colors were the same, and I landed on using the first color as a point of basis for comparison in order to check if all the other colors share that same color as that first color. 

## What I Would Do Differently
Next time, I might try a different method in order to check if all the colors are the same. I may try it using a method of incrementing if a certain color and if that increment is equal to the length of the row, then they must all be the same color. 
