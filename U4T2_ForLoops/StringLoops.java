package U4T2_ForLoops;

public class StringLoops {
  // default constructor; no instance variables
  public StringLoops() { }


  public int countCharacters(String character, String searchString) {
    int count = 0;
    searchString = searchString.toLowerCase();
    character = character.toLowerCase();
    for (int i = 0; i < searchString.length(); i++) {
      if (searchString.substring(i,i + 1).equals(character)) {
        count++;
      }
    }
    return count;
  }
  
  public String reverseString(String origString) {
    String reverString = "";
    for (int i = origString.length(); i > 0; i--) {
      reverString += origString.substring(i - 1 , i);
    }
    return reverString;
  }

  public String removeA(String str) {
    str = str.toLowerCase();  
    String newStr = "";
    for (int i = 0; i < str.length(); i++) {  
      if (!(str.substring(i,i+1).equals("a"))) {
        newStr += str.substring(i,i+1);
      }
    }
    return newStr;
 }

 public String replaceCharacterV1(String searchChar, String origStr, String replaceChar){
  String newString = "";
  for (int i = 0; i < origStr.length(); i++) {  
    if ((origStr.substring(i,i+1).equals(searchChar))) {
      newString += replaceChar;
    }
    else {
      newString += origStr.substring(i,i+1);
    }
 }
  return newString;
 }

 public String replaceCharacterV2(String searchChar, String origStr, String replaceChar){
  String newString = "";
  int i = 0;
  while ( i < origStr.length()) {
    if ((origStr.substring(i,i+1).equals(searchChar))) {
      newString += replaceChar;
    }
    else {
      newString += origStr.substring(i,i+1);
    
    }
    i++;
  }
  return newString;
 }

  public int countString(String searchString, String origString) {
    int count = 0;
    for (int i = 0; i < origString.length(); i++) { 
      if (i + searchString.length() <= origString.length()) {
          if ((origString.substring(i,i+searchString.length()).equals(searchString))) {
            count++;
          }
      }
    }
    return count;
  }
   
      /* Returns a String with all instances of "searchString" removed from "origString";
       matches should be case sensitive (i.e. no need to worry about lowercase vs. uppercase)
     
     - if searchString = "an" and origString = "canned beans and bananas",
       this method returns "cned bes d bas"
     - if searchString = "tat" and origString = "Ratatattat",
       this method returns "Raat"
     - if searchString = "lower" and origString = "sunflower",
       this method returns "sunf"
     - if searchString = "haha" and origString = "Hahahahaha",
       this method returns "Ha" (case sensitive, so leading "Haha" isn’t a match)
     - if searchString = "HAHA" and origString = "Hahahahaha",
       this method returns "Hahahahaha" (no matches due to case)
     - if searchString = "rain" and origString = "it’s the brain drain pain train",
       this method returns "it’s the b d pain t"
     - if searchString = "lol" and origString = "lolololol",
       this method returns "ool"
     - if searchString = "was" and origString = "I was about to call you, wasn’t I?",
       this method returns "I  about to call you, n’t I?"
     - if searchString = "but" and origString = "I was about to call you, wasn’t I?",
       this method returns "I was about to call you, wasn’t I?" (no matches)
     - if searchString = "AB" and origString = "ABABABABABC",
       this method returns "C"
     - if searchString = "AB" and origString = "AAAAABBBBBC",
       this method returns "C"
    */  
    public String removeString(String searchString, String origString) {
      String newString = "";
      for (int i = 0; i < origString.length(); i++) { 
        if (i + searchString.length() <= origString.length()) {
          if (!((origString.substring(i,i+searchString.length()).equals(searchString)))) {
            newString += origString.substring(i,i+searchString.length());
          }
        }
      }
      return newString;
     }
   
   


}
