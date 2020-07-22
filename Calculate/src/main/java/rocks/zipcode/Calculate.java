package rocks.zipcode;

import rocks.zipcode.Library.Stack;

/******************************************************************************
 * Compilation: javac Evaluate.java Execution: java Evaluate Dependencies:
 * Stack.java
 *
 * Evaluates (fully parenthesized) arithmetic expressions using Dijkstra's
 * two-stack algorithm.
 *
 * % java Evaluate ( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) ) 101.0
 *
 * % java Evaulate ( ( 1 + sqrt ( 5 ) ) / 2.0 ) 1.618033988749895
 *
 *
 * Note: the operators, operators, and parentheses must be separated by
 * whitespace. Also, each operation must be enclosed in parentheses. For
 * example, you must write ( 1 + ( 2 + 3 ) ) instead of ( 1 + 2 + 3 ). See
 * EvaluateDeluxe.java for a fancier version.
 *
 *
 * Remarkably, Dijkstra's algorithm computes the same answer if we put each
 * operator *after* its two operators instead of *between* them.
 *
 * % java Evaluate ( 1 ( ( 2 3 + ) ( 4 5 * ) * ) + ) 101.0
 *
 * Moreover, in such expressions, all parentheses are redundant! Removing them
 * yields an expression known as a postfix expression. 1 2 3 + 4 5 * * +
 * 
 *
 ******************************************************************************/

public class Calculate {
    private Stack<String> operators = new Stack<String>();
    private Stack<Double> operands = new Stack<Double>();

    public Calculate() { }
    
    public double run(String toEvaluate) {

        String[] tokens = toEvaluate.split(" ");
        for (String token : tokens) {
            if      (token.equals("("))               ;
            else if (token.equals("+"))    operators.push(token);
            else if (token.equals("-"))    operators.push(token);
            else if (token.equals("*"))    operators.push(token);
            else if (token.equals("/"))    operators.push(token);
            else if (token.equals("sqrt")) operators.push(token);
            else if (token.equals(")")) {
                String op = operators.pop();
                double v = operands.pop();
                if      (op.equals("+"))    v = operands.pop() + v;
                else if (op.equals("-"))    v = operands.pop() - v;
                else if (op.equals("*"))    v = operands.pop() * v;
                else if (op.equals("/"))    v = operands.pop() / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
                operands.push(v);
            }
            else operands.push(Double.parseDouble(token));
        }
        return operands.pop();
    }
}
