# Jerrify
Set of solutions for a task on Joker conf'18.

## Original task
![Preview image](preview.png)

Meeseeks is a function with two parameters: x and y. Meeseeks is quite simple and works only with **natural** numbers. And the result is **strictly increasing** by each argument. Jerry invents a number and tries to find out how many options to get it meeseeks knows. But frequent appeal is a real pain for meeseeks. And the simple enumeration of all pairs (x, y) makes him suffer. Help Jerry solve the problem as humanely as possible.

## Investigation
So, we have some function m, which acts from a set of pairs of natural numbers to a set of natural numbers, and a natural number z. We should find the number of all pairs (x, y) which satisfy the equality *m(x, y) = z*. We just know that the function is strictly increasing by each argument. The number of function calls should be minimal.

Strict increasing of the function may be formalized by the inequalities:
> m(x + 1, y) > m(x, y)  
> m(x, y + 1) > m(x, y)  

, where 1 is the minimal possible increment in the set of natural numbers.

As examples of such function, might be considered:
> x + y  
> x * (y + 3)  
> 2^x + 2 * y + 2  

## Implementations
[The initial solution](src/main/java/com/jerrify/Jerrify0.java) enumerates all possible pairs (x, y) and demands *(z + 1)^2* iterations.
