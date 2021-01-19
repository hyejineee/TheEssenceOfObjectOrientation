package coffeeShop

/**
 * 손님은 바리스타가 어떤 객체인지 알 필요가 없다.
 * 그래서 손님은 카운터에게 선택한 메뉴가 무엇인지 알려주면 된다.
 * 바리스타에게 커피를 제조를 요청하는 객체는 카운터다.
 */

class Customer(private val menu: Menu, private val barista: Barista) {

    fun order(menuName: String): Coffee {
        val selectedMenu = menu.choose(menuName)
        return barista.makeCoffee(selectedMenu)
    }
}