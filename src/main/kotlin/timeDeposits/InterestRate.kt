package timeDeposits

class InterestRate(_rate: Double) {
    val rate: Double = _rate / 100

    fun calculateInterest(duration: Int, amount: Int) = ((amount + 100000) * rate * (duration / 12) / 2).toInt()
}
