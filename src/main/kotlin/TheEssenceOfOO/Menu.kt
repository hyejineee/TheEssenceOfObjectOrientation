package TheEssenceOfOO

class Menu {
    val menuItems: List<MenuItem>
        get() = listOf(
                MenuItem("아메리카노", 1000),
                MenuItem("에스프레소", 2000),
                MenuItem("카라멜 마키아또", 3000),
                MenuItem("카푸치노", 4000)
        )

    fun choose(name: String): MenuItem = menuItems.first { it.name == name }

}