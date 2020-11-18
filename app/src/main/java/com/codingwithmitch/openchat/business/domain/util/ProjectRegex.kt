package com.codingwithmitch.openchat.business.domain.util

object ProjectRegex{

    /*
        https://stackoverflow.com/questions/23214434/regular-expression-in-android-for-password-field
        ^                 # start-of-string
        (?=.*[0-9])       # a digit must occur at least once
        (?=.*[a-z])       # a lower case letter must occur at least once
        (?=.*[A-Z])       # an upper case letter must occur at least once
        (?=.*[@#$%^&+=])  # a special character must occur at least once you can replace with your special characters
        (?=\\S+$)          # no whitespace allowed in the entire string
        .{4,}             # anything, at least six places though
        $                 # end-of-string
     */
    const val PASSWORD_VALIDATION_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#\$%^&+=])(?=\\\\S+\$).{4,}\$"

    const val PASSWORD_VALIDATION_INFO =
            "A valid password must contain:" +
                    "\nA number." +
                    "\nA lowercase letter." +
                    "\nA uppercase letter." +
                    "\nA special character (@#$%^&+=)." +
                    "\nNo whitespace." +
                    "\nAt least 6 characters."


                    const val EMAIL_VALIDATION_REGEX = "^(.+)@(.+)\$"

}











