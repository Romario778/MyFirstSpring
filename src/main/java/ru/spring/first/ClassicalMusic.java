package ru.spring.first;

import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    String[] arrayClassicalMusic = {"Flight of the Bumblebee", "In the cave of the mountain king", "Symphony 40"};
    Random rnd = new Random();
    int num = rnd.nextInt(arrayClassicalMusic.length);
    @Override
    public String getSong() {
        return arrayClassicalMusic[num];
    }
}
