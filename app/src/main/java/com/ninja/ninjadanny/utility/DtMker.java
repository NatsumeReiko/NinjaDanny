package com.ninja.ninjadanny.utility;

import java.util.Random;

public class DtMker {
    private DtMker() {
    }


    public static int randInt(final int min, final int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    public static float randFloat(final float min, final float max) {
        return new Random().nextFloat() * (max - min) + min;
    }
}
