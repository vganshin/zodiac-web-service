package me.vganshin.zodiac.dto;

public class ZodiacDto {
    String name;
    String imageUrl;

    public ZodiacDto() {
    }

    public ZodiacDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
