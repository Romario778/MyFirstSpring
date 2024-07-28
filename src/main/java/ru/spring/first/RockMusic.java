package ru.spring.first;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Neil Alishev
 */

@Component
public class RockMusic implements Music {
    String[] arrayRocklMusic = {"Sorcerer doll", "Fog", "Time in a bottle"};
    Random rnd = new Random();
    int num = rnd.nextInt(arrayRocklMusic.length);
    @Override
    public String getSong() {
        return arrayRocklMusic[num];
    }
}
