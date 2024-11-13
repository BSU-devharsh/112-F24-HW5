## Problem 1          (50 points)

You calculated the area of a circle in ```HW1```. Could you extend that program to calculate areas of circles, rectangles, and trapezoids using the same function name?

- Overloading: Create three overloaded versions of the ```area``` method, each accepting different parameters:
  - Circle: A single, ```double``` parameter representing the radius.
  - Rectangle: Two ```double``` parameters representing the length and width.
  - Trapezoid: Three ```double``` parameters representing the two bases and the height.
- Input: Prompt the user to input the required parameters for the desired shape.
- Output: Display the calculated area to the console, clearly indicating the shape and dimensions.


## Problem 2          (50 points)

You calculated factorials using ```for```, ```while```, and ```do...while``` loops in ```HW3```. Now, approach the same problem with a recursive function and compare calculation time to ```for``` or ```while``` loops.

- Recursive Implementation: Define a recursive function ```factorial``` that takes an integer ```n``` as input and returns its factorial.
- Base Case: The base case should handle the factorial of ```0```, which is ```1```.
- Recursive Case: The recursive case should calculate the factorial of ```n``` by multiplying ```n``` with the factorial of ```(n-1)```.
- Performance Comparison: Compare the execution time of the recursive implementation with iterative approaches (e.g., using ```for``` or ```while``` loops) for different input values. Analyze the time complexity of both approaches.
