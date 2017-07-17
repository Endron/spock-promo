/*
 * MIT License
 *
 * Copyright (c) 2017 Tobias Kremer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package tech.kremer.spock.promotion;

/**
 * This class implements some basic operations. While these are quite useless in most cases and some are even out right
 * broken, it mostly serves so we have something to run our tests against.
 */
public class Calculator {

  /**
   * This class has a delegate mostly so we can do some mocking on our tests.
   */
  private final PrimeCheck primeCheck;

  public Calculator(PrimeCheck delegate) {
    this.primeCheck = delegate;
  }

  /**
   * Performs an addition returning the sum of {@code a} and {@code b}.
   */
  public int addition(int a, int b) {
    return a + b;
  }

  /**
   * Checks if the given number {@code a} is positive and throws an {@link Exception} otherwise.
   */
  public void isPositive(int a) throws Exception {
    if (a <= 0) {
      throw new Exception("not positive");
    }
  }

  /**
   * Divides {@code a} by {@code b}.
   */
  public double divide(int a, int b) {
    /*
     * Note that this implementation is actually buggy.
     * This is by design as we want to demonstrate a failing test.
     */
    return a / b;
  }

  /**
   * Returns {@code true} when the given {@code number} is a prime number.
   */
  public boolean isPrime(int number) {
    return primeCheck.isPrime(number);
  }
}
