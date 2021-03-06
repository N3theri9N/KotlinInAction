package kotlininaction.episode3.property

import java.lang.StringBuilder

val String.lastChar : Char
    get() = get(length -1 )

var StringBuilder.lastChar: Char
    get() = get(length -1 )
    set(value : Char){
        this.setCharAt(length -1, value);
    }

fun main() {
    println("Kotlin".lastChar);
    val sb : StringBuilder = StringBuilder("Kotlin?");
    sb.lastChar= '!';
    println(sb);
}