package io.github.pgagala


import spock.lang.Shared
import spock.lang.Specification
/**
 * Correct way of testing calculator class
 */
class CalculatorFixedSpec extends Specification {

    @Shared
    Calculator calculator = new Calculator()

    def "Should correctly divide numbers"() {
        when: "number are divided"
            def result = calculator.divide(4, 3)
        then: "correct result should be returned"
            result == new Result(1, 1)
    }

    def "Should throw exception for 0 divider"() {
        when: "number are divided with 0 divider"
            calculator.divide(1, 0)
        then: "Exception should be thrown"
            thrown IllegalArgumentException
    }

}