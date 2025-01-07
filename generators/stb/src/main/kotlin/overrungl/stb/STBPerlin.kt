/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 */

package overrungl.stb

import overrungl.gen.StaticDowncall
import overrungl.gen.float
import overrungl.gen.int
import overrungl.gen.uchar

fun STBPerlin() {
    StaticDowncall(stbPackage, "STBPerlin", symbolLookup = stbLookup) {
        "stb_perlin_noise3"(
            float,
            float("x"),
            float("y"),
            float("z"),
            int("x_wrap"),
            int("y_wrap"),
            int("z_wrap"),
            entrypoint = "stb_perlin_noise3"
        )
        "stb_perlin_noise3_seed"(
            float,
            float("x"),
            float("y"),
            float("z"),
            int("x_wrap"),
            int("y_wrap"),
            int("z_wrap"),
            int("seed"),
            entrypoint = "stb_perlin_noise3_seed"
        )
        "stb_perlin_ridge_noise3"(
            float,
            float("x"),
            float("y"),
            float("z"),
            float("lacunarity"),
            float("gain"),
            float("offset"),
            int("octaves"),
            entrypoint = "stb_perlin_ridge_noise3"
        )
        "stb_perlin_fbm_noise3"(
            float,
            float("x"),
            float("y"),
            float("z"),
            float("lacunarity"),
            float("gain"),
            int("octaves"),
            entrypoint = "stb_perlin_fbm_noise3"
        )
        "stb_perlin_turbulence_noise3"(
            float,
            float("x"),
            float("y"),
            float("z"),
            float("lacunarity"),
            float("gain"),
            int("octaves"),
            entrypoint = "stb_perlin_turbulence_noise3"
        )
        "stb_perlin_noise3_wrap_nonpow2"(
            float,
            float("x"),
            float("y"),
            float("z"),
            int("x_wrap"),
            int("y_wrap"),
            int("z_wrap"),
            uchar("seed"),
            entrypoint = "stb_perlin_noise3_wrap_nonpow2"
        )
    }
}
