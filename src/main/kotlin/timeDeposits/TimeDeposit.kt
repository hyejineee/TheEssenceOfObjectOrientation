package timeDeposits

import java.time.LocalDate

class TimeDeposit(
        private val duration: Int,
        private val expireDate: LocalDate,
        private val account: Account
) {

    fun calculateInterest(): Int = account.calculateInterest(36)
}