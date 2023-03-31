package FrameWork.Utils;

import java.util.List;
import java.util.Random;

public class RandomUtils {
    public static int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static <T> T getRandomElementFromList(List<T> list) {
        return list.get(getRandomInt(0, list.size() - 1));
    }
}
