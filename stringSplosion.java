/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
*/

public String stringSplosion(String str) {
  String newStr = "";
  for (int i =0; i <= str.length(); i++) {
    newStr += str.substring(0, i);
  }
  return newStr;
}
