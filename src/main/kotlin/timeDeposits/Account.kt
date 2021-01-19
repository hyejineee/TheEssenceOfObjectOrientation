package timeDeposits

class Account(
        private val accountNumber: String,
        private val amount: Int
) {

    fun calculateInterest(duration: Int): Int = ((amount + 100000) * 0.022 * (duration / 12) / 2).toInt()
}