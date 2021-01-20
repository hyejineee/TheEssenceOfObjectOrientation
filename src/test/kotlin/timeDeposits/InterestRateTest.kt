package timeDeposits

import org.junit.Test
import kotlin.test.assertEquals

class InterestRateTest() {
    
    @Test
    fun calculateInterest() {
        val interestRate = InterestRate(2.2)
        assertEquals(36300, interestRate.calculateInterest(36, 1000000))
    }
}