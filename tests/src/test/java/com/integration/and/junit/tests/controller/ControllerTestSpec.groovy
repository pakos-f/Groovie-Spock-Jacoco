package com.integration.and.junit.tests.controller
import spock.lang.Specification
import spock.lang.Unroll

class ControllerTestSpec extends Specification {

    Controller controller

    def setup() {
        controller = new Controller()
    }

    @Unroll
    def"validate behavior of controller"(int inputValue, int expected) {
        when:
        def result = controller.test(inputValue)

        then:
        result == expected

        where:
        inputValue | expected
        3          |1
        0          |2
    }
}
