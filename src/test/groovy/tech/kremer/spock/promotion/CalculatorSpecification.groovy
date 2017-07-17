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

import spock.lang.Specification
import spock.lang.Unroll


class CalculatorSpecification extends Specification {

  final delegate = Mock(PrimeCheck)

  final calculator = new Calculator(delegate)

  @Unroll
  def 'test divide #a by #b results in #expected'() {
    expect:
    calculator.divide(a, b) == expected

    where:
    a | b || expected
    1 | 1 || 1D
    1 | 2 || 0.5D
    2 | 1 || 2D
  }

  def 'is truly prime'() {
    given:
    def number = 7

    and:
    delegate.isPrime(_) >> true

    when:
    def result = calculator.isPrime(number)

    then:
    result
  }
}
