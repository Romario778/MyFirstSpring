package ru.spring.first;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
