package standardfunctions

/**
 * Can be used to apply some functionality and return a result
 * Returns the initial object
 * Common use case is applying configuration to an object creation
 */
fun main() {

    val databaseConfigs = DatabaseConfigsStandardFunctionApplyLessonOne().apply {
        this.host = "host" // I can use the 'this', but it can be omitted
        port = 1234
        isHttps = true
        createConnection()
    }

    println(databaseConfigs)
}

class DatabaseConfigsStandardFunctionApplyLessonOne {

    var host: String? = null
    var port: Int? = null
    var isHttps: Boolean? = null

    fun createConnection() {
        println("Created connection")
    }

    override fun toString(): String {
        return "host: $host | port: $port | isHttps: $isHttps"
    }
}