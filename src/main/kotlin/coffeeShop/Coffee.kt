package coffeeShop

class Coffee(private val menuItem: MenuItem) {
    init {
        println("${menuItem.name}이(가) 만들어졌습니다.")
    }
}
