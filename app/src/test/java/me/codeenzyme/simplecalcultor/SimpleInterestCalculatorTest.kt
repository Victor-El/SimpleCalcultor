package me.codeenzyme.simplecalcultor

import org.junit.Assert
import org.junit.Test

class SimpleInterestCalculatorTest {

    @Test
    fun calculate_isCorrect() {
        val simpleInterestCalculator = SimpleInterestCalculator()
        val principal = 2000.0
        val interest = principal * 15 * 5
        Assert.assertEquals(interest, simpleInterestCalculator.calculateInterest(principal), 0.001)
    }
}