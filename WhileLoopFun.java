public class WhileLoopFun {
 
  public WhileLoopFun() {}

  public void printDigits(int number) {
    while (number!= 0) {
      int integer = number % 10;
      System.out.println(integer);
      number /= 10;
    }
  }

  public int countLetter(String word, String letter) {
    int count = 0;
    int idx = 0;
    while (idx < word.length()) {
      if (letter.equals(word.substring(idx, idx+1))) {
        count++;
      }
      idx++;
    }
    return count;
  }

  public int maxDoubles(int number, int threshold) {
    int timesDoubled = 0;

    while (number * 2 <= threshold) {
      number*=2;
      timesDoubled++;
    }

    return timesDoubled;
  }

  public boolean isPrime(int number) {
    if (number == 2 || number == 3 || number == 7) {
      return true;
    }
    else if (number % 2 == 0 || number % 3 == 0 || number % 7 == 0 || number == 1) {
      return false;
    }

    return true;
  }
}
