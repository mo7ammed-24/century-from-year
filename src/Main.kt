fun main() {
    println(centuryFromYear(1997))
}

fun centuryFromYear(year: Int): Int {

    var test =(year-1)/100
    test =test+1
    return test}