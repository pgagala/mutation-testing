package io.github.pgagala


import spock.lang.Specification
/**
 * Tests without enough test cases
 */
class CalculatorSpec extends Specification {

    Calculator calculator = new Calculator()

    def "Should correctly divide numbers"() {
        when: "number are divided"
            def result = calculator.divide(1, 1)
        then: "correct result should be returned"
            result == new Result(1, 0)
    }

    def "Should throw exception for 0 divider"() {
        when: "number are divided with 0 divider"
            calculator.divide(1, 0)
        then: "Exception should be thrown"
            thrown IllegalArgumentException
    }

}