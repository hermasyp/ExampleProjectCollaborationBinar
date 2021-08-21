class App {
    companion object {
        //constanta
        const val DUMMY_USERNAME = "admin"
        const val DUMMY_PASSWORD = "Admin@123"

        // static method
        @JvmStatic
        fun main(args: Array<String>) {
            App().start()
        }

    }

    fun start() {
        //asking for username and password
        println("Enter Username = ")
        val username = readLine().orEmpty()
        println("Enter Password = ")
        val password = readLine().orEmpty()
        doLogin(username, password)
    }

    private fun doLogin(username: String, password: String) {
        if (username == DUMMY_USERNAME && password == DUMMY_PASSWORD) {
            println("Login Success")
            printNameShodiq()
            printNameRifki()
            printNameAlun()
            printNameAlun()
        } else {
            println("Login Failed")
        }
    }
    private fun printNameShodiq(){
        println("Hello My Name is Shodiq")
    }

    private fun printNameAlun(){
        println("Hey my name is Alun")
    }

    private fun printNameRifki() {
        println("Hello My name is Rifki")
    }

}