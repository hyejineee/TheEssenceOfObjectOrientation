package timeDeposits

import java.time.LocalDate
import java.time.Period

class TimeDeposit(
    private val expireDuration: Int,
    private val expireDate: LocalDate,
    private val account: Account
) {

    fun calculateInterest(): Int = account.calculateInterest(expireDuration)

    fun calculateInterest(terminateDate: LocalDate): Int {
        return account.calculateInterest(
            expireDuration - Period.between(terminateDate, expireDate).toTotalMonths().toInt()
        )
    }
}