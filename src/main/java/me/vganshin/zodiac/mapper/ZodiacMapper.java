package me.vganshin.zodiac.mapper;

import me.vganshin.zodiac.dto.ZodiacDto;
import me.vganshin.zodiac.entity.Zodiac;

public class ZodiacMapper {
    public static ZodiacDto toDto(Zodiac entity) {
        if (entity == null) {
            return null;
        }

        ZodiacDto dto = new ZodiacDto();

        dto.setName(entity.getName());
        dto.setImageUrl(entity.getImageLink());

        return dto;
    }
}
