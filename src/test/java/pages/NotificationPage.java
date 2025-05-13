package pages;

import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class NotificationPage {

    private final SelenideElement successNotification = $(".notification_status_ok");
    private final SelenideElement errorNotification = $(".notification_status_error");
    private final SelenideElement closeNotification = $(".notification__closer");

    public void waitSuccessNotification() {
        successNotification.shouldBe(visible, Duration.ofSeconds(15));
    }

    public void waitErrorNotification() {
        errorNotification.shouldBe(visible, Duration.ofSeconds(15));
    }

    public void closeNotification() {
        closeNotification.click();
    }
}