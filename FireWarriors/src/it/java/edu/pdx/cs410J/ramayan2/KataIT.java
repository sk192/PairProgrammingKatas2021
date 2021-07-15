package edu.pdx.cs410J.ramayan2;


import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {


  @Test
  void invokingMainWithNoArgumentsHasExitCodeOf1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void divByThreeShouldWriteFoo() {
    InvokeMainTestCase.MainMethodResult resultFor3 = invokeMain(Kata.class, "3");
    InvokeMainTestCase.MainMethodResult resultFor6 = invokeMain(Kata.class, "6");
    InvokeMainTestCase.MainMethodResult resultFor9 = invokeMain(Kata.class, "6");

    assertThat(resultFor3.getTextWrittenToStandardOut(), containsString("Foo"));
    assertThat(resultFor6.getTextWrittenToStandardOut(), containsString("Foo"));
    assertThat(resultFor9.getTextWrittenToStandardOut(), containsString("Foo"));
  }

  @Test
  void divByFiveShouldContainsBar() {
    InvokeMainTestCase.MainMethodResult resultFor5 = invokeMain(Kata.class, "5");
    InvokeMainTestCase.MainMethodResult resultFor10 = invokeMain(Kata.class, "10");
//    InvokeMainTestCase.MainMethodResult resultFor15 = invokeMain(Kata.class, "15");

    assertThat(resultFor5.getTextWrittenToStandardOut(), containsString("Bar"));
    assertThat(resultFor10.getTextWrittenToStandardOut(), containsString("Bar"));
//    assertThat(resultFor15.getTextWrittenToStandardOut(), containsString("Bar"));
  }

  @Test
  void divByFiveSAndThreeShouldContainsFooBar() {
    InvokeMainTestCase.MainMethodResult resultFor30 = invokeMain(Kata.class, "30");
    InvokeMainTestCase.MainMethodResult resultFor15 = invokeMain(Kata.class, "15");

    assertThat(resultFor30.getTextWrittenToStandardOut(), containsString("FooBar"));
    assertThat(resultFor15.getTextWrittenToStandardOut(), containsString("FooBar"));
  }

  @Test
  void divBySevenShouldContainsFooBar() {
    InvokeMainTestCase.MainMethodResult resultFor30 = invokeMain(Kata.class, "7");
    InvokeMainTestCase.MainMethodResult resultFor15 = invokeMain(Kata.class, "14");

    assertThat(resultFor30.getTextWrittenToStandardOut(), containsString("Qix"));
    assertThat(resultFor15.getTextWrittenToStandardOut(), containsString("Qix"));
  }

  @Test
  void numberContainingThreeFiveSevenShouldContainFooBarQixInTheOrder() {
    InvokeMainTestCase.MainMethodResult resultFor357 = invokeMain(Kata.class, "357");
    InvokeMainTestCase.MainMethodResult resultFor573 = invokeMain(Kata.class, "573");

    assertThat(resultFor357.getTextWrittenToStandardOut(), containsString("FooBarQix"));
    assertThat(resultFor573.getTextWrittenToStandardOut(), containsString("BarQixFoo"));
  }

}
