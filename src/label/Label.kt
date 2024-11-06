package label

fun main() {

    /**
     * A label is used to mark a position in code that you can jump to
     * Can be used with break and continue
     * Loop is not considered a good practice in development because
     * it breaks the normal flow of the system
     */

    loop@ for(i in 1..10) {
        for(j in 1..10) {
            if(i % 3 == 0) {
                // by using this break@loop, I will end the execution
                // from the first for, because it is marked with a label
                // and I move the execution to the for assigned to it
                // If I didn't have the @loop in this break, the for j would
                // be the loop which would be finalized
                break@loop
            }

            println("$i, $j")
        }
    }
}