package week.four;

import java.time.Year;
import java.util.Arrays;

public class w3n4Coding {

  public static void main(String[] args) {

    System.out.println("Intro to Java Weeks 3-4 Coding Assignment");
    System.out.println();
    System.out.println("Arrays and Methods");
    System.out.println();
    // 1. Create an array of int called ages that contains 3, 9, 23, 64, 2, 8, 28, 93.
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 7};
    System.out.print("1. nothing to print :) ");
    /*
     * a. Programmatically subtract the value of the first element in the array from the value in
     * the last element of the array (i.e. do not use ages[7] in your code). Print the result to the
     * console.
     */
    int difference = ages[ages.length - 1] - ages[0];
    // System.out.println("The age difference is " + difference);

    /*
     * b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for
     * arrays of different lengths). Added ages[9] - value 7
     */
    System.out.print("  1b. " + difference);


    /*
     * c. Use a loop to iterate through the array and calculate the average age. Print the result to
     * the console.
     */
    int sum = 0;
    for (int i = 0; i < ages.length; i++) {
      sum += ages[i];
    }
    System.out.println("  1c. " + sum/ages.length);

    /*
     * 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”,
     * “Tim”, “Sally”, “Buck”, “Bob”.
     */

    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    System.out.print("2. nothing to print :) ");
    /*
     * a. Use a loop to iterate through the array and calculate the average number of letters per
     * name. Print the result to the console.
     */
    int sum1 = 0;
    for (int i = 0; i < names.length; i++) {
      sum1 += names[i].length();
    }
    int avgName = sum1 / names.length;
    System.out.print("  2a. " + avgName);

    /*
     * b. Use a loop to iterate through the array again and concatenate all the names together,
     * separated by spaces, and print the result to the console.
     */
    String concatenatedNames = "";
    for (int i = 0; i < names.length; i++) {
      concatenatedNames += names[i] + " ";
    }
    System.out.print("  2b. " + concatenatedNames);
    System.out.println();

    // 3. How do you access the last element of any array?
    System.out.println("3. To print the last element is: names.length - 1");

    // 4. How do you access the first element of any array?
    System.out.println("4. the code to access the first element is: names[0]");

    /*
     * 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously
     * created names array and add the length of each name to the nameLengths array.
     */
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }
    System.out.println("5. " + Arrays.toString(nameLengths));

    /*
     * 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the
     * elements in the array. Print the result to the console.
     */
    int sum3 = 0;
    for (int i = 0; i < nameLengths.length; i++) {
      sum3 += nameLengths[i];
    }
    System.out.println("6. The sum of all lengths in nameLengths[] = " + sum3);

    /*
     * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word
     * concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the
     * method to return “HelloHelloHello”).
     */
    System.out.println("7. " + multiplyString("Yermom", 7));

    /*
     * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name
     * (the full name should be the first and the last name as a String separated by a space).
     */
    // see below main for createFullName method
    String firstName = "The";
    String lastName = "Doctor";
    String fullName = createFullName(firstName, lastName);
    System.out.println("8. " + fullName);

    /*
     * 9. Write a method that takes an array of int and returns true if the sum of all the ints in
     * the array is greater than 100.
     */
    System.out.println("9. Are the SUM of all ints > 100? " + checkIfSumGreaterThan100(ages));

    /*
     * 10. Write a method that takes an array of double and returns the average of all the elements
     * in the array.
     */
    double[] doubleArr = {1.4, 2.6, 26.26, 80.0};
    double[] emptyDoubleArr = {};
    System.out.println("10. " + getAverageOfDoubleArr(doubleArr));
    // System.out.println(getAverageOfDoubleArr(emptyDoubleArr));

    /*
     * 11. Write a method that takes two arrays of double and returns true if the average of the
     * elements in the first array is greater than the average of the elements in the second array.
     */
    double[] anotherDoubleArr = {2.2, 3.3, 4.4, 5.5};
    System.out.println("11. " + isFirstArrAvgGreater(doubleArr, anotherDoubleArr));

    /*
     * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
     * moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than
     * 10.50.
     */
    boolean isHotOutside = true;
    double moneyInPocket = 9.50;
    System.out.println("12. " + willBuyDrink(isHotOutside, moneyInPocket));


    /*
     * 13. Create a method of your own that solves a problem. In comments, write what the method
     * does and why you created it.
     */
    System.out.println("13. " + getAge(1980));


  } // END OF MAIN

  /*
   * 13. Create a method of your own that solves a problem. In comments, write what the method does
   * and why you created it.
   */
  /*
   * getAge calculates a new user's age with the given birthYear
   */
  public static int getAge(int birthYear) {
    return Year.now().getValue() - birthYear;
  }

  /*
   * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
   * moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than
   * 10.50.
   */
  public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    if (isHotOutside == true && moneyInPocket > 10.50)
      return true;
    else
      return false;
  }

  /*
   * 11. Write a method that takes two arrays of double and returns true if the average of the
   * elements in the first array is greater than the average of the elements in the second array.
   */
  public static boolean isFirstArrAvgGreater(double[] firstArr, double[] secondArr) {
    return getAverageOfDoubleArr(firstArr) > getAverageOfDoubleArr(secondArr);
  }

  /*
   * 10. 10. Write a method that takes an array of double and returns the average of all the
   * elements in the array.
   */
  public static double getAverageOfDoubleArr(double[] arr) {
    // We need to use .orElse() in case an empty array is passed in
    return Arrays.stream(arr).average().orElse(Double.NaN);
  }

  /*
   * 9. Write a method that takes an array of int and returns true if the sum of all the ints in the
   * array is greater than 100.
   */
  public static Boolean checkIfSumGreaterThan100(int[] arr) {
    return Arrays.stream(arr).sum() > 100;
  }

  /*
   * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the
   * full name should be the first and the last name as a String separated by a space).
   */
  public static String createFullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  /*
   * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word
   * concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method
   * to return “HelloHelloHello”).
   */
  public static String multiplyString(String str, int num) {
    String result = "";
    for (int i = 0; i < num; i++) {
      result += str;
    }
    return result;
  }



} // END OF CLASS

