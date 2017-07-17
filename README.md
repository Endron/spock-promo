<!--
MIT License

Copyright (c) 2017 Tobias Kremer

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
-->
# spock-promo

## Abstract (TL;DR)
Use Groovy and the Spock Framework to right the tests for your project. It is just more fun that way. And by making
writing tests more fun, you will improve the code coverage of your project.

## Hypothesis
The usefulness of unit tests is widely documented and regarded in the IT industry. So why are we still finding whole
classes and even package without any tests out there? While one aspect is certainly the tests as an afterthought problem
leaving us with implementations that are nearly untestable without refactoring the whole thing, there is another issue:
Writing tests is grinding hard work.

The first problem can probably be fixed by consequent application of test driven development (TDD). But this might only
make the second issue worse: Writing tests will still be hard work. So with this I present you with my central 
hypothesis:

_If we make writing tests easier, we will get better test coverage in our project._

## Start by writing your tests in Groovy
As a first step we will move over our test code to Groovy. This will serve us to reduce to amount of boiler plate code
we need to write our tests. As Groovy was designed with the goal of interoperability with Java as a major goal we will
keep most of what we already have at the same time. We can keep our already existing test infrastructure including
all these nice abstract test base classes some people like to use and just use them with our code.


