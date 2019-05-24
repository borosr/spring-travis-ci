package hu.borosr.citest.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(JUnit4.class)
public class PalindromCheckerTest {

  PalindromChecker palindromChecker = new PalindromChecker();

  @Test()
  public void testValidData() {
    boolean response = palindromChecker.check("gorog");
    Assert.assertTrue(response);
  }

  @Test()
  public void testInvalidData() {
    boolean response = palindromChecker.check("randomstring");
    Assert.assertFalse(response);
  }

  @Test()
  public void testValidOtherData() {
    boolean response = palindromChecker.check(null);
    Assert.assertFalse(response);
  }

  @Test()
  public void testEmptyString() {
    boolean response = palindromChecker.check("");
    Assert.assertFalse(response);
  }
}
