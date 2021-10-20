package com.udacity.project4.core.utils


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ExtensionsKtTest{


        @Test
        fun isValidEmail_valid_returnsTrue(){
            val email = "a@a.in"
            assertThat(email.isValidEmail).isTrue()
        }

        @Test
        fun isValidEmail_notValid_returnsFalse(){
            var invalidEmail = ""
            assertThat(invalidEmail.isValidEmail).isFalse()
            invalidEmail = "a"
            assertThat(invalidEmail.isValidEmail).isFalse()
            invalidEmail = "a@a"
            assertThat(invalidEmail.isValidEmail).isFalse()
        }

}