package timeDeposits

import org.junit.Test
import kotlin.test.assertEquals

class AccountTest {
    @Test
    fun calculateInterestTest() {
        val account = Account("0000-00-0000", 1000000)
        assertEquals(36300, account.calculateInterest(36))
    }
}