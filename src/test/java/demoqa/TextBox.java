package demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.impl.Html.text;

public class TextBox {

    @BeforeAll
    static void beforeAll () {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        String userName = "Alex Egorov";

        open("/text-box");
        $("h1.text-center").shouldHave(text("Text Box"));

        $("#userName").setValue("userName");
        $("#userEmail").setValue("ivanov@email.com");
        $("#currentAddress").setValue("Boxer Street");
        $("#permanentAddress").setValue("Other address 1");
        $("#submit").click();

        $("#output").shouldBe(visible);
        $("#output").$("#name").shouldHave(text("userName"));
        $("#output").$("#email").shouldHave(text("ivanov@email.com"));
        $("#output").$("#currentAddress").shouldHave(text("Boxer Street"));
        $("#output").$("#permanentAddress").shouldHave(text("Other address 1"));
    }
}
