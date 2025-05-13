package data;

import com.github.javafaker.Faker;
import lombok.Value;
import java.time.LocalDate;
import java.util.Locale;

public class DataHelper {
    private static final Faker faker = new Faker(new Locale("en"));

    public static CardInfo getApprovedCard() {
        return new CardInfo(
                "1111 2222 3333 4444",
                getValidMonth(),
                getValidYear(),
                getValidName(),
                getValidCvc()
        );
    }

    public static CardInfo getDeclinedCard() {
        return new CardInfo(
                "5555 6666 7777 8888",
                getValidMonth(),
                getValidYear(),
                getValidName(),
                getValidCvc()
        );
    }

    public static String getValidMonth() {
        return String.format("%02d", LocalDate.now().getMonthValue());
    }

    public static String getValidYear() {
        return "28";
    }

    public static String getValidName() {
        return faker.name().lastName().toUpperCase() + " " + faker.name().firstName().toUpperCase();
    }

    public static String getValidCvc() {
        return "123";
    }

    public static String getInvalidCardNumber() {
        return "1111 2222 3333 4445";
    }

    public static String getInvalidMonth() {
        return "13";
    }

    public static String getZeroMonth() {
        return "00";
    }

    public static String getExpiredYear() {
        return "22";
    }

    public static String getFutureYear() {
        return "31";
    }

    public static String getInvalidName() {
        return "1van 1van0v@";
    }

    public static String getEmptyField() {
        return "";
    }

    @Value
    public static class CardInfo {
        String number;
        String month;
        String year;
        String holder;
        String cvc;
    }
}