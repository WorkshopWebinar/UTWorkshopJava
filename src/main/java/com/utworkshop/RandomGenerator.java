package com.utworkshop;
import java.util.Random;

public class RandomGenerator {
    public int generate(int min, int max) {
        return new Random().nextInt(min+max);
    }
}
