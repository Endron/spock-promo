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
package tech.kremer.spock.promotion

import org.junit.Test

class CalculatorTest {

  @Test
  void 'Arbitrary strings as test names. How cool is that?'() {
  }

  @Test
  void '''
Even multi line because for somethings you need to talk a lot. Imagine this: You can write huge description on your
test cases right into its name. Finally we could get rid of all external documentation and have it in our test cases.
It will be great!

Well this is probably not that a practical idea...
But still cool...
'''() {
  }

  @Test
  void 'Even emoji. Because current year. \uD83D\uDE03'() {
  }

  @Test
  void 'an assert statement that is actual useful'() {
    assert "hallo" == "wrong"
  }

  @Test
  void 'even for more complex stuff'() {
    def yes = 'yes'
    def no = 'no'
    def a = 87
    def b = 13
    def c = 100

    assert (yes == no) & (a + b == c)
  }

  @Test(expected = Exception)
  void 'no checked exceptions'() {
    def calculator = new Calculator(null)

    assert calculator.isPositive(-1)
  }

  @Test
  void 'some basic mocking, for more you should use a mocking framework anyways'() {
    def delegate = new Expando(
      isPrime: { it % 2 == 1 }
    ) as PrimeCheck //type coercion, not a type cast

    def calculator = new Calculator(delegate)

    assert calculator.isPrime(7)
    assert calculator.isPrime(9) //OK the mock is doing this
    assert calculator.isPrime(4)
  }
}
