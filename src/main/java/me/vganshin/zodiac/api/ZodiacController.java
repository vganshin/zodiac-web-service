package me.vganshin.zodiac.api;

import me.vganshin.zodiac.dto.ZodiacDto;
import me.vganshin.zodiac.entity.Zodiac;
import me.vganshin.zodiac.mapper.ZodiacMapper;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ZodiacController {
    @RequestMapping(
            value = "/api/zodiac",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ZodiacDto> getZodiac(@RequestParam @DateTimeFormat(pattern = "dd.MM") Date date) {
        if (date == null) {
            return null;
        }

        ZodiacDto dto = ZodiacMapper.toDto(Zodiac.getByDate(date));

        return new ResponseEntity<ZodiacDto>(dto, HttpStatus.OK);
    }
}
