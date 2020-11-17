package me.codeenzyme.simplecalcultor

class SimpleInterestCalculator {
    private val time = 5
    private val rate = 15

    fun calculateInterest(principal: Double): Double {
        return principal * rate * time + 1
    }

}