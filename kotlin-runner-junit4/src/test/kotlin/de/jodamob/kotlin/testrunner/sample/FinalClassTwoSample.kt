package de.jodamob.kotlin.testrunner.sample

class FinalClassTwoSample : TestedClass {

    override fun finalMethod() {
        throw IllegalAccessError("you should not see this")
    }
}