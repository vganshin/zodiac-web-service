package me.vganshin.zodiac.entity;

import static org.assertj.core.api.Assertions.*;

import me.vganshin.zodiac.util.DateParser;
import org.junit.Test;

import java.util.zip.ZipOutputStream;

public class ZodiacTest {
    @Test
    public void testAries() {
        assertThat(getZodiacByDate("21.03")).isEqualTo(Zodiac.Aries);
        assertThat(getZodiacByDate("1.04")).isEqualTo(Zodiac.Aries);
        assertThat(getZodiacByDate("19.04")).isEqualTo(Zodiac.Aries);
    }

    @Test
    public void testTaurus() {
        assertThat(getZodiacByDate("20.04")).isEqualTo(Zodiac.Taurus);
        assertThat(getZodiacByDate("28.04")).isEqualTo(Zodiac.Taurus);
        assertThat(getZodiacByDate("20.05")).isEqualTo(Zodiac.Taurus);
    }

    @Test
    public void testGemini() {
        assertThat(getZodiacByDate("21.05")).isEqualTo(Zodiac.Gemini);
        assertThat(getZodiacByDate("31.05")).isEqualTo(Zodiac.Gemini);
        assertThat(getZodiacByDate("20.06")).isEqualTo(Zodiac.Gemini);
    }

    @Test
    public void testCancer() {
        assertThat(getZodiacByDate("21.06")).isEqualTo(Zodiac.Cancer);
        assertThat(getZodiacByDate("22.06")).isEqualTo(Zodiac.Cancer);
        assertThat(getZodiacByDate("22.07")).isEqualTo(Zodiac.Cancer);
    }

    @Test
    public void testLeo() {
        assertThat(getZodiacByDate("23.07")).isEqualTo(Zodiac.Leo);
        assertThat(getZodiacByDate("07.08")).isEqualTo(Zodiac.Leo);
        assertThat(getZodiacByDate("22.08")).isEqualTo(Zodiac.Leo);
    }

    @Test
    public void testVirgo() {
        assertThat(getZodiacByDate("23.08")).isEqualTo(Zodiac.Virgo);
        assertThat(getZodiacByDate("28.08")).isEqualTo(Zodiac.Virgo);
        assertThat(getZodiacByDate("22.09")).isEqualTo(Zodiac.Virgo);
    }

    @Test
    public void testLibra() {
        assertThat(getZodiacByDate("23.09")).isEqualTo(Zodiac.Libra);
        assertThat(getZodiacByDate("26.09")).isEqualTo(Zodiac.Libra);
        assertThat(getZodiacByDate("22.10")).isEqualTo(Zodiac.Libra);
    }

    @Test
    public void testScorpio() {
        assertThat(getZodiacByDate("23.10")).isEqualTo(Zodiac.Scorpio);
        assertThat(getZodiacByDate("11.11")).isEqualTo(Zodiac.Scorpio);
        assertThat(getZodiacByDate("21.11")).isEqualTo(Zodiac.Scorpio);
    }

    @Test
    public void testSagittarius() {
        assertThat(getZodiacByDate("22.11")).isEqualTo(Zodiac.Sagittarius);
        assertThat(getZodiacByDate("01.12")).isEqualTo(Zodiac.Sagittarius);
        assertThat(getZodiacByDate("21.12")).isEqualTo(Zodiac.Sagittarius);
    }

    @Test
    public void testCapricorn() {
        assertThat(getZodiacByDate("22.12")).isEqualTo(Zodiac.Capricorn);
        assertThat(getZodiacByDate("25.12")).isEqualTo(Zodiac.Capricorn);
        assertThat(getZodiacByDate("31.12")).isEqualTo(Zodiac.Capricorn);

        assertThat(getZodiacByDate("1.01")).isEqualTo(Zodiac.Capricorn);
        assertThat(getZodiacByDate("7.01")).isEqualTo(Zodiac.Capricorn);
        assertThat(getZodiacByDate("19.01")).isEqualTo(Zodiac.Capricorn);
    }

    @Test
    public void testAquarius() {
        assertThat(getZodiacByDate("20.01")).isEqualTo(Zodiac.Aquarius);
        assertThat(getZodiacByDate("14.02")).isEqualTo(Zodiac.Aquarius);
        assertThat(getZodiacByDate("18.02")).isEqualTo(Zodiac.Aquarius);
    }

    @Test
    public void testPisces() {
        assertThat(getZodiacByDate("19.02")).isEqualTo(Zodiac.Pisces);
        assertThat(getZodiacByDate("8.03")).isEqualTo(Zodiac.Pisces);
        assertThat(getZodiacByDate("20.03")).isEqualTo(Zodiac.Pisces);
    }

    
    Zodiac getZodiacByDate(String date) {
        return Zodiac.getByDate(DateParser.parse(date));
    }
}
