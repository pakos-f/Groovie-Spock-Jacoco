package com.integration.and.junit.tests.controller
import spock.lang.Specification
import spock.lang.Unroll

class ControllerTest1Spec extends Specification {

    /**
     * NOTE!
     * when mvn clean install is finished a test folder will be created under
     * target/site/jacoco/
     * open index.html site in order to find out the coverage - branch
     */
    Controller controller

    def setup() {
        controller = new Controller()
    }

    @Unroll  // necessary for where: clause - to run both cases.
    def"validate behavior of controller for given input value #inputValue"(int inputValue, int expected) {
        when: 'function which needs to be tested'
        def result = controller.test(inputValue)

        then: 'validate expected result'
        result == expected

        where: 'in that way we run 2 test cases with diff input values'
        inputValue | expected
        3          |1
        0          |2
    }
}
