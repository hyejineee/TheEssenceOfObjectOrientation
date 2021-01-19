package coffeeShop

class Barista {

    fun makeCoffee(menuItem: MenuItem): Coffee {
        println("${menuItem.name}을(를) 만들고 있습니다.")
        return Coffee(menuItem)
    }
}