package algorithm.cc150.chapter1;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume
 * that the string has sufficient space at the end of the string to hold the
 * additional characters, and that you are given the "true" length of the
 * string.
 * 
 */
//  O(n) space, O(n) time
public class Question4 {

  public char[] replace(char[] input, int length) {
    
    char[] out = new char[length];

    int pos = length - 1;
    //  traverse backwards
    for (int i = input.length - 1; i >= 0; --i) {
      if (input[i] == ' ') {
        out[pos--] = '0';
        out[pos--] = '2';
        out[pos--] = '%';
      }
      else {
        out[pos--] = input[i];
      }
    }

    return out;
  }

}

