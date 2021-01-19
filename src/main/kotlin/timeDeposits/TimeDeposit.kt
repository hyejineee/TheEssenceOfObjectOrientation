package timeDeposits

import java.time.LocalDate

class TimeDeposit(
        private val duration: Int,
        private val expireDate: LocalDate
) {

    fun calculateInterest(): Int {
        return ((1000000 + 100000) * 0.022 * 3 / 2).toInt()
    }
}