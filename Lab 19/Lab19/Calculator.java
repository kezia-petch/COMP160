/** 
 * Calculator.java
 * 
 * Lab 19, COMP160,  2019
 * 
 * A calculator class - for SIMPLE calculations like 5 + 20 =
 * Large inputs will overload int, should convert to long 
 */

public class Calculator {  
  private long previous2Input;
  private long currentInput;          //current input
  private long previousInput;
  private String last2Operator = ""; // previous input
  private long result; 
  private long resultSecond;
  private long resultFin;// result of calculation
  private String lastOperator = "";  // keeps track of the last operator entered
  
  /** New digit entered as integer value i - moves currentInput 1 decimal place to the left and adds i in "one's column" 
    @param i a digit */
    public void inDigit(long i) {
      currentInput = (currentInput * 10) + i;
    }
    
    /** Operator entered  + - or *   
      @param op an operator symbol, one of + - * */
      public void inOperator(String op) {
        previous2Input = previousInput;
        previousInput = currentInput;      // save the new input as previous to get ready for next input
        currentInput = 0;
        last2Operator = lastOperator;
        lastOperator = op;                 // remember which operator was entered
      } 
      
      /** Equals operation sets result to previousInput + - or * currentInput (depending on lastOperator) */
      public void inEquals() {
        if (lastOperator.equals("+")) {
          result = previousInput + currentInput;
        } else if (lastOperator.equals("-")) { 
          result = previousInput - currentInput;
        } else if (lastOperator.equals("*"))  {
          result = previousInput * currentInput;
        } else if (lastOperator.equals("")){
          result = currentInput;
        }
        else if (last2Operator.equals("+")) {
          resultSecond = previous2Input + result;
        } else if (last2Operator.equals("-")) { 
          resultSecond = previous2Input - result;
        } else if (last2Operator.equals("*"))  {
          resultSecond = previous2Input * result;
        } else if (last2Operator.equals("")){
          resultSecond = result;
        }
        resultFin = resultSecond + result;
        lastOperator = "";
// reset last operator to "nothing"
      }
      
      /** Clear operation */
      public void inClear() {
        previous2Input = 0;
        currentInput = 0;
        previousInput = 0;
        result = 0;
        resultSecond = 0;
        lastOperator = "";
      } 
      
      /** returns the current result 
        @return the current result as a string*/
        public String getResult() {  
          return Long.toString(resultFin);  //converts int to String
        }
        
        /** returns the previous input value
          @return the previous input as a string */
          public String getPreviousInput() {
            return Long.toString(previousInput);
          }
          /** returns the current input value 
            @return the current input as a string */
            public String getCurrentInput() {
              return Long.toString(currentInput);
            }
}  

