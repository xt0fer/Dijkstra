# Dijkstra 

## Dijkstra’s two stack algorithm for arithmetic expression evaluation

An example of some very elegant code.

### Stacks

Oftentimes, beginner coders look at a stack and wonder what the fuss is about. Queues are
often seen as obviously useful, stacks seem a little more obscure and abstract. Why use a Stack
when you have Queues?

A very good example of stacks is the back button implementation in browser. 
Whenever we click hyperlinks, the previous page address is pushed onto a stack. 
When back button is clicked, the most recent address is popped and displayed.

Other examples include implementing UNDO function in any editor and checking for balanced parenthesis in a compiler.

Stack is a very popular form of an abstract data type used in any modern programming language. 
It is “abstract” because all the details are hidden from us. 
We are not bothered about how the methods are implemented or where/how the data is stored. 
We just invoke the functions and make use of it.

Common operations on a stack are –

- Push() – push new element into the top of the stack.
- Pop() – Most recent element from the top of the stack is popped out.
- isEmpty() – returns true if stack is empty
- size() – returns number of elements in the stackp.

A few languages allow the use of Peek() function wherein you can get the value of top most element without popping it.

### Arithmetic expression evaluation. 

This program is a stack-based interpreter that evaluates fully parenthesized arithmetic expressions. 

It uses Dijkstra's 2-stack algorithm:
- Push() operands (numbers) onto the operands stack.
- Push() operators (+,-,*,/) onto the operators stack.
- Ignore left parentheses.
- On encountering a right parenthesis, Pop() an operator, Pop() the requisite number of operands, 
and Push() onto the operand stack the result of applying that operator to those operands.

This code is a simple example of an interpreter.

Take an arithmetic expression like this –

> (5+(3\*8))–(2*7)
>
> ( ( 5 + ( 3 * 8 ) ) - ( 2 * 7 ) )

(Answer should be 15)

Without use of stacks, it is quite challenging to evaluate an arithmetic expression like this. 
In 1960, Edsger Dijkstra came up with a very simple algorithm to evaluate arithmetic expression 
with the help of two stacks.

Declare two stacks – operand stack and operator stack. 

Read the expression character by character and do the following:

- If number, push it into operands stack
- If operator, push it into operators stack
- Ignore left parenthesis
- when right parenthesis is encountered, pop operator and corresponding number of values and perform the operation. Then push the result into values stack.
At the end, the result will be available in values stack.

In order to focus on the algorithm and lets assume the following to avoid unnecessary 
logic for handling the input:

1. Each token is separated by space. Token here represents either the parenthesis or the number or the operator.

2. Each expression is entered within parenthesis and the parenthesis are perfectly balanced.

Eg ( 3 * 4 ) + 5 is invalid but ( ( 3 * 4 ) + 5 ) is valid. Note space between each token, and the () around
the complete expression.

