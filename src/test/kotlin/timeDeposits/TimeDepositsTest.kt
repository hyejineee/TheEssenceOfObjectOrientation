package timeDeposits

import org.junit.Test
import java.time.LocalDate
import java.util.*
import kotlin.test.assertEquals

class TimeDepositsTest {

    /**
     * 정기예금으로 이자를 계산하라는 요청이 들어온다. => timeDeposit.calculateInterest()
     * 그러면 정기예금은 해당 일자가 약정 기간에 포함되는지 확인한 후 이자를 계산한다.
     * (단리 계산법 : (총불입 원금 + 1회 월불입금 ) * 이율 * 기간(년) / 2) -> (100 +10) * 2.2 * 3년 /2
     * 계산한 이자를 반환한다.
     * 편의상 약정 기간은 36개월로 고정
     * 만기 해지 일자는 2022.01.01
     * */

    @Test
    fun `만기 해지할 경우 이자를 계산한다.`() {
        val timeDeposit = TimeDeposit(36, LocalDate.of(2022, 1, 1))
        val interest = timeDeposit.calculateInterest()

        assertEquals(36300, interest)
    }

}