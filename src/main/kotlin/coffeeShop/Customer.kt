package coffeeShop

class Customer(private val menu: Menu, private val barista: Barista) {

    fun order(menuName: String): Coffee {
        val selectedMenu = menu.choose(menuName)
        return barista.makeCoffee(selectedMenu)
    }
}
