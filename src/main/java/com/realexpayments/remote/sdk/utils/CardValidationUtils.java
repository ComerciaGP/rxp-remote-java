package com.realexpayments.remote.sdk.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.realexpayments.remote.sdk.domain.Card;

/**
 * @author thomasduffy
 *
 */
public class CardValidationUtils {

    private static final String EXPIRY_DATE_PATTERN = "MMyy";
    private static final String EXP_DATE_REG_EXP = "\\d\\d\\d\\d";

    /**
     * Method to perform a Luhn check on the card number.  This allows the SDK user to perform  
     * basic validation on the card number. The card number may contain whitespace or '-' which will 
     * be stripped before validation.
     * 
     * @param cardNumber
     * 
     * @return true if a valid card number and false otherwise
     */
    public static boolean performLuhnCheck(String cardNumber) {

        if (cardNumber == null || cardNumber.equalsIgnoreCase("")) {
            return false;
        }

        /** If string has alpha characters it is not a valid credit card **/
        if (!cardNumber.matches("\\d*")) {
            return false;
        }

        /** Check length of credit card is valid (between 12 and 19 digits) **/
        int length = cardNumber.length();
        if (length < 12 || length > 19) {
            return false;
        }

        /** Perform luhn check **/
        int sum = 0;
        int digit = 0;
        int addend = 0;
        boolean timesTwo = false;

        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            digit = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (timesTwo) {
                addend = digit * 2;
                if (addend > 9) {
                    addend -= 9;
                }
            } else {
                addend = digit;
            }
            sum += addend;
            timesTwo = !timesTwo;
        }

        int modulus = sum % 10;
        return modulus == 0;
    }

    /**
     * Method to perform an expiry date check.  This allows the SDK user to perform basic validation 
     * on the card number. The expiry date may contain whitespace, '-' or '/' separators, should be 
     * two digits for the month followed by two digits for the year and may not be in the past.
     * 
     * @param expiryDate
     * 
     * @return true if a valid expiry date and false otherwise
     */
    public static boolean performExpiryDateCheck(String expiryDate) {

        DateFormat df = new SimpleDateFormat(EXPIRY_DATE_PATTERN);
        df.setLenient(false);

        //Length should be four digits long
        if (!expiryDate.matches(EXP_DATE_REG_EXP)) {
            return false;
        }

        Calendar currentCal = Calendar.getInstance();
        Calendar expiryDateCal = Calendar.getInstance();

        //Expiry date matches the pattern
        try {
            expiryDateCal.setTime(df.parse(expiryDate));
        } catch (ParseException pe) {
            return false;
        }

        // Date is not in the past
        if (expiryDateCal.get(Calendar.YEAR) < currentCal.get(Calendar.YEAR)) {
            return false;
        }

        if ((expiryDateCal.get(Calendar.MONTH) < currentCal.get(Calendar.MONTH))
                && (expiryDateCal.get(Calendar.YEAR) == currentCal.get(Calendar.YEAR))) {
            return false;
        }
        return true;
    }

    /**
     * Method to perform a CVV number check.  The CVV must be 4 digits for AMEX and 3 digits for 
     * all other cards.
     * 
     * @param cvvNumber
     * @param cardType
     * 
     * @return true if a valid CVV number and false otherwise
     */
    public static boolean performCvvCheck(String cvvNumber, String cardType) {

        /* If string has alpha characters it is not a CVV number */
        if (!cvvNumber.matches("\\d*")) {
            return false;
        }

        /* Length should be four digits long for AMEX */
        if (cardType.equalsIgnoreCase(Card.CardType.AMEX.getType())) {
            if (cvvNumber.length() != 4) {
                return false;
            }
        }
        /* Otherwise the length should be three digits */
        else if (cvvNumber.length() != 3) {
            return false;
        }

        return true;
    }
}
