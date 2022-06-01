public class Calculation {

  public int calculate(int number1,int number2,char operator) {
      switch (operator){
          case '*':
              return number1*number2;
          case '/':
              return number1/number2;
          case '%':
              return number1%number2;
          default:
              return 0;
      }
  }
}
