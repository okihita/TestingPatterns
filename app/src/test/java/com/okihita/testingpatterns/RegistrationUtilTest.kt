package com.okihita.testingpatterns

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sanchez",
            "ojdfojij3ron12o3rno2r",
            "ojdfojij3ron12o3rno2r"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username exists, returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Okihita",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Sanchez",
            "",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password mismatch, returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Okihita",
            "123",
            "123412313"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password too short, returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Okihita",
            "12",
            "12"
        )

        assertThat(result).isFalse()
    }
}