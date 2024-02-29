package dev.cisnux.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {
    @Test
    void testNewLocale() {
        var language = "id";
        var country = "ID";
        var locale = Locale.of(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }

    @Test
    void testNewLocaleUs() {
        var language = "en";
        var country = "US";
        var locale = Locale.of(language, country);

        System.out.println(locale.getLanguage());
        System.out.println(locale.getCountry());

        System.out.println(locale.getDisplayLanguage());
        System.out.println(locale.getDisplayCountry());
    }
}
