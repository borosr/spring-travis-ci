package hu.borosr.citest.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromChecker {

  public boolean check(String value) {
    if (value == null) {
      return false;
    }
    int length = value.length();
    int n = length % 2 == 0 ? length / 2 : (length-1)/2;
    for (int i = 0; i < n; i++) {
      if (value.charAt(i) != value.charAt((length-1)-i)) {
        return false;
      }
    }
    return true;
  }

}
