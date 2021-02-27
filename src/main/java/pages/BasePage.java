package pages;

import com.codeborne.selenide.Screenshots;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.openqa.selenium.logging.LogType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.logging.Level;

public class BasePage {

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] takeScreenShot(byte[] screenShot) {
        String path = Screenshots.takeScreenShot("screenshot" + new Date().getTime());
        try {
            return Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void attachLogs() {
        Allure.addAttachment("Console logs:", String.valueOf(Selenide.getWebDriverLogs(LogType.BROWSER, Level.ALL)));
    }
}
