package me.vganshin.zodiac.entity;

import me.vganshin.zodiac.util.DateParser;

import java.util.Date;

public enum Zodiac {
    Aries("Овен", "21.03", "19.04", "/images/aries.gif"),
    Taurus("Телец", "20.04", "20.05", "/images/taurus.gif"),
    Gemini("Близнецы", "21.05", "20.06", "/images/gemini.gif"),
    Cancer("Рак", "21.06", "22.07", "/images/cancer.gif"),
    Leo("Лев", "23.07", "22.08", "/images/leo.gif"),
    Virgo("Дева", "23.08", "22.09", "/images/virgo.gif"),
    Libra("Весы", "23.09", "22.10", "/images/libra.gif"),
    Scorpio("Скорпион", "23.10", "21.11", "/images/scorpio.gif"),
    Sagittarius("Стрелец", "22.11", "21.12", "/images/sagittarius.gif"),
    Capricorn("Козерог", "22.12", "19.01", "/images/capricorn.gif"),
    Aquarius("Водолей", "20.01", "18.02", "/images/aquarius.gif"),
    Pisces("Рыбы", "19.02", "20.03", "/images/pisces.gif");

    private String name;
    private Date startDate;
    private Date endDate;
    private String imageLink;

    Zodiac(String name, String startDate, String endDate, String imageLink) {
        this.name = name;
        this.startDate = DateParser.parse(startDate);
        this.endDate = DateParser.parse(endDate);
        this.imageLink = imageLink;
    }

    public static Zodiac getByDate(Date date) {
        for (int i = 0; i < Zodiac.values().length; i++) {
            Zodiac zodiac = Zodiac.values()[i];
            if (date.after(zodiac.getStartDate()) && date.before(zodiac.getEndDate()) ||
                    date.equals(zodiac.getStartDate()) || date.equals(zodiac.getEndDate())) {
                return zodiac;
            }
        }
        return Capricorn;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getImageLink() {
        return imageLink;
    }
}
