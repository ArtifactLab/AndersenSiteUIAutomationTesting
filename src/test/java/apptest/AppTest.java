package apptest;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class AppTest {

    @Test
    void getStartTest() {
        open("https://yandex.by/");
    }

}
