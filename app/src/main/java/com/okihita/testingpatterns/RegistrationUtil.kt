package com.okihita.testingpatterns

object RegistrationUtil {

    private val existingUsers = listOf("Okihita", "Xena")

    /**
     * The input is not valid if ...
     * ... the username/password is empty
     * ... the username is already taken
     * ... confirmPassword isn't equal to password
     * ... the password contains less than two digits
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }

        if (username in existingUsers) {
            return false
        }

        if (password != confirmPassword) {
            return false
        }

        if (password.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }

}