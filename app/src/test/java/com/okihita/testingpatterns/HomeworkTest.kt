package com.okihita.testingpatterns


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `fibonacci zero returns zero`() {
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `fibonacci one returns one`() {
        val result = Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fibonacci two returns one`() {
        val result = Homework.fib(2)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `fibonacci three returns two`() {
        val result = Homework.fib(3)
        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `fibonacci four returns three`() {
        val result = Homework.fib(4)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `fibonacci five returns three`() {
        val result = Homework.fib(5)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `fibonacci six returns three`() {
        val result = Homework.fib(6)
        assertThat(result).isEqualTo(8)
    }

    @Test
    fun `odd braces return false`() {
        val result = Homework.checkBraces("(")
        assertThat(result).isFalse()
    }

    @Test
    fun `even braces return true`() {
        val result = Homework.checkBraces(")(")
        assertThat(result).isTrue()
    }
}