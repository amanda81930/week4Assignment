package week.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class wk4Lab {

  public static void main(String[] args) {
    /*
     * 1. Why would we use a StringBuilder instead of a String? Strings cannot be changes and are
     * immutable. StringBuilder is mutable and can be added upon. Any time we have a String we know
     * is going to be build up or changed multiple times, a StringBuilder makes more sense to use.
     */
    /*
     * a. Instantiate a new StringBuilder b. Append the characters 0 through 9 to it separated by
     * dashes Note: make sure no dash appears at the end of the StringBuilder
     */
    System.out.println("\nQuestion 1: Stringbuilder - DONE");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < 10; i++) { // loop up through less than 10
      sb.append(i); // add the integer
      if (i != 9) { // if integer is not 9
        sb.append("-"); // include the dash
      }
    }
    System.out.println(sb.toString());


    /*
     * 2. List of String: a. Create a list of Strings b. Add 5 Strings to it, each with a different
     * length
     */
    System.out.println();
    System.out.println("\nQuestion 2: List of strings - DONE");
    List<String> strings = new ArrayList<String>(); // EXAMPLE USES STRINGS FOR LIST NAME
    strings.add("Tali");
    strings.add("Sammy");
    strings.add("Paul");
    strings.add("I");
    strings.add("Me and you");
    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(i));
    } // CODE TO PRINT ENTIRE MYBANDS LIST
    // System.out.println();
    // Same result as above can be done using Arrays.asList(); as opposed to ArrayList<>();
    // System.out.println("Using Arrays.asList(enter strings here separated by commas)");
    // List<String> myBands =
    // Arrays.asList("FFDP", "Slipknot", "DanceGavinDance", "Godsmack", "Nonpoint");
    // System.out.println(myBands);

    // List<String> strings = Arrays.asList("Tom", "Sammy", "Paul", "I", "Me");
    // System.out.println(strings); // prints list with an array [Tom, Sammy, Paul, I, Me]


    System.out.println();
    System.out.println("\nQuestion 3: findShortestString Method - DONE");
    // 3. Write and test a method that takes a list of Strings and returns the shortest
    // string
    System.out.println(findShortestString(strings));

    /*
     * 4. Write and test a method that takes a list of strings and returns the list with the first
     * and last element switched
     */
    System.out.println();
    System.out.println("\nQuestion 4: swapFirstAndLast Method - DONE");
    List<String> swapped = swapFirstAndLast(strings);
    for (String string : swapped) {
      System.out.println(string);
    } // end of for loop

    /*
     * 5. Write and test a method that takes a list of strings and returns a string with all the
     * list elements concatenated to each other, separated by a comma
     */
    System.out.println();
    System.out.println("\nQuestion 5: combineStrings Method - DONE");
    System.out.println(combineStrings(swapped));

    /*
     * 6. Write and test a method that takes a list of strings and a string and returns a new list
     * with all strings from the original list containing the second string parameter (i.e. like a
     * search method)
     */
    System.out.println();
    System.out.println("\nQuestion 6: search Method - DONE");
    List<String> searchResults = search(strings, "am");
    for (String result : searchResults) {
      System.out.println(result);
    }

    /*
     * 7. Write and test a method that takes a list of integers and returns a List<List<Integer>>
     * with the following conditions specified for the return value: a. The first List in the
     * returned value contains any number from the input list that is divisible by 2 b. The second
     * List contains values from the input list that are divisible by 3 c. The third containing
     * values divisible by 5, and d. The fourth all numbers from the input List not divisible by 2,
     * 3, or 5
     */
    System.out.println();
    System.out.println("\nQuestion 7: sortDivisibleNumbers Method - DONE");
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);

    List<List<Integer>> sortedNumbers = sortDivisibleNumbers(numbers);

    for (List<Integer> list : sortedNumbers) {
      for (Integer number : list) {
        System.out.println(number);
      }
      System.out.println("Next list ----------");
    }

    /*
     * 8. Write and test a method that takes a list of strings and returns a list of integers that
     * contains the length of each string
     */
    System.out.println();
    System.out.println("\nQuestion 8: calculateStringLengths Method - DONE");
    List<Integer> stringsLengths = calculateStringLengths(strings);
    for (Integer i : stringsLengths) {
      System.out.println(i);
    }

    // 9. Create a set of strings and add 5 values
    System.out.println();
    System.out.println("\nQuestion 9: Set of Strings - DONE");
    Set<String> strings2 = new HashSet<String>();
    // add the String elements to the Set
    strings2.add("It's late");
    System.out.println(strings2); // prints only the added variables above this request
    strings2.add("On a Friday");
    System.out.println(strings2); // prints all added variables above this request
    strings2.add("I'm tired");
    System.out.println(strings2); // in no particular order
    strings2.add("and want to");
    System.out.println(strings2); // in no particular order
    strings2.add("go to bed!");
    System.out.println(strings2); // in no particular order


    /*
     * 10. Write and test a method that takes a set of strings and a character and returns a set of
     * strings consisting of all the strings in the input set that start with the character
     * parameter.
     */
    System.out.println();
    System.out.println("\nQuestion 10: findALLThatStartWith Method - DONE");

    Set<String> startsWithI = findALLThatStartWith(strings2, 'I');
    for (String word : startsWithI) {
      System.out.println(word);
    }

    // 11. Write and test a method that takes a set of strings and returns a list of the same
    // strings
    System.out.println();
    System.out.println("\nQuestion 11: convertSetToList Method - DONE");
    List<String> resultList = convertSetToList(strings2);
    
    for (String listString : resultList) {
      System.out.println(listString);
    }

    /*
     * 12. Write and test a method that takes a set of integers and returns a new set of integers
     * containing only even numbers from the original set
     */
    System.out.println();
    System.out.println("\nQuestion 12: extractEvens Method - DONE");
    Set<Integer> integerSet = new HashSet<Integer>();
    integerSet.add(3);
    integerSet.add(4);
    integerSet.add(8);
    integerSet.add(33);
    
    Set<Integer> extractedEvens = extractEvens(integerSet);
    for (Integer number : extractedEvens) {
      System.out.println(number);
    } 
    
    /*
     * 13. Create a map of string and string and add 3 items to it where the key of each is a word
     * and the value is the definition of the word
     */
    System.out.println("\nQuestion 13: Dictionary Map - DONE");
    Map<String, String> dictionary = new HashMap<String, String>();
    dictionary.put("Apple", "A crunchy fruit. Usually red, green, or yellow");
    dictionary.put("Banana", "A yellow fruit which you peel before eating");
    dictionary.put("Java", "A programming language created in 1995 and still heavily used today");
    System.out.println("prompt did not request to print");

    /*
     * 14. Write and test a method that takes a Map<String, String> and a string and returns the
     * value for a key in the map that matches the string parameter (i.e. like a language dictionary
     * lookup)
     */
    System.out.println("\nQuestion 14: LookupValue Method- DONE");
    String value = lookupValue(dictionary, "Apple");
    System.out.println("Dictionary Result for 'Apple': " + value);

    
    /*
     * 15. Write and test a method that takes a List<String> and returns a Map<Character, Integer>
     * containing a count of all the strings that start with a given character
     */
    System.out.println("\nQuestion 15: countStartingLetters Method - DONE");
    Map<Character, Integer> counts = countStartingLetters(resultList);
    for (Character character : counts.keySet()) {
        System.out.println(character + " - " + counts.get(character));
    }



  } // END OF MAIN METHOD

  /*
   * 15. Write and test a method that takes a List<String> and returns a Map<Character, Integer>
   * containing a count of all the strings that start with a given character
   */
  
  public static Map<Character, Integer> countStartingLetters(List<String> list) {
    Map<Character, Integer> results = new HashMap<Character, Integer>();

    for (String string : list) {
        char c = string.charAt(0);
        if (results.get(c) == null) {
            results.put(c, 1);
        } else {
            results.put(c, results.get(c) + 1);
        }
    }

    return results;
}
  
  /*
   * 14. Write and test a method that takes a Map<String, String> and a string and returns the
   * value for a key in the map that matches the string parameter (i.e. like a language dictionary
   * lookup)
   */
  public static String lookupValue(Map<String, String> map, String string) {
      for (String key : map.keySet()) {
          if (key.equals(string)) {
            return map.get(key);
        }
    }
    return "";
}
  
  /*
   * 12. Write and test a method that takes a set of integers and returns a new set of integers
   * containing only even numbers from the original set
   */
  public static Set<Integer> extractEvens(Set<Integer> set) {
    Set<Integer> results = new HashSet<Integer>();
    for (Integer number : set) {
        if (number % 2 == 0) {
          results.add(number);
        } //END OF IF STATEMENT
    } // END OF FOR LOOP
    return results;
  } // END OF EXTRACTEVENS METHOD

  // 11. Write and test a method that takes a set of strings and returns a list of the same strings
  public static List<String> convertSetToList(Set<String> set) {
    List<String> results = new ArrayList<String>();
    for (String string : set) {
      results.add(string);
    }
    return results;
  }


  /*
   * 10. Write and test a method that takes a set of strings and a character and returns a set of
   * strings consisting of all the strings in the input set that start with the character parameter.
   */
  public static Set<String> findALLThatStartWith(Set<String> set, char c) {
    Set<String> results = new HashSet<String>();

    for (String string : set) {
      if (string.charAt(0) == c) {
        results.add(string);
      }
    }
    return results;
  }


  /*
   * 8. Write and test a method that takes a list of strings and returns a list of integers that
   * contains the length of each string
   */
  public static List<Integer> calculateStringLengths(List<String> list) {
    List<Integer> lengths = new ArrayList<Integer>();
    for (String string : list) {
      lengths.add(string.length());
    }
    return lengths;

  } // end of calculateStringLengths Method


  /*
   * 7. Write and test a method that takes a list of integers and returns a List<List<Integer>> with
   * the following conditions specified for the return value: a. The first List in the returned
   * value contains any number from the input list that is divisible by 2 b. The second List
   * contains values from the input list that are divisible by 3 c. The third containing values
   * divisible by 5, and d. The fourth all numbers from the input List not divisible by 2, 3, or 5
   */
  public static List<List<Integer>> sortDivisibleNumbers(List<Integer> list) { // list of lists of
                                                                               // integers
    List<List<Integer>> results = new ArrayList<List<Integer>>();
    results.add(new ArrayList<Integer>());
    results.add(new ArrayList<Integer>());
    results.add(new ArrayList<Integer>());
    results.add(new ArrayList<Integer>());

    for (Integer number : list) {
      if (number % 2 == 0) {
        results.get(0).add(number);
      } // END OF DIVISIBLE BY 2 STATEMENT
      if (number % 3 == 0) {
        results.get(1).add(number);
      } // END OF DIVISIBLE BY 3 STATEMENT
      if (number % 5 == 0) {
        results.get(2).add(number);
      } // END OF DIVISIBLE BY 5 STATEMENT
      if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0) {
        results.get(3).add(number);
      } // END OF NOT DIVISIBLE BY 2, 3, OR 5 STATEMENT
    }
    return results;
  } // END OF FOR LOOP


  /*
   * 6. Write and test a method that takes a list of strings and a string and returns a new list
   * with all strings from the original list containing the second string parameter (i.e. like a
   * search method)
   */
  public static List<String> search(List<String> list, String query) {
    List<String> results = new ArrayList<String>();
    for (String string : list) {
      if (string.contains(query)) {
        results.add(string);
      }
    }
    return results;
  } // END OF SEARCH METHOD


  /*
   * 5. Write and test a method that takes a list of strings and returns a string with all the list
   * elements concatenated to each other, separated by a comma
   */
  public static String combineStrings(List<String> strings) {
    StringBuilder result = new StringBuilder();
    for (String string : strings) {
      result.append(string + ", ");
    }
    return result.toString();
  } // END OF COMBINESTRINGS METHOD


  /*
   * 4. Write and test a method that takes a list of strings and returns the list with the first and
   * last element switched
   */
  public static List<String> swapFirstAndLast(List<String> list) {
    // we need a place holder variable
    String temp = list.get(0); // gets first element from list and saves into temp variable
    list.set(0, list.get(list.size() - 1)); // override first element with last element
    list.set(list.size() - 1, temp); // set last element as first element
    return list;
  }


  // 3. Write and test a method that takes a list of Strings and returns the shortest
  // string findShortestString
  // Method 3:
  public static String findShortestString(List<String> list) {
    String shortest = list.get(0);
    for (String string : list) {
      if (string.length() < shortest.length()) {
        shortest = string;
      }
    }
    return shortest;
  } // END OF FINDSHORTESTSTRING METHOD


} // END OF CLASS
