/*
 * MIT License
 *
 * Copyright (c) 2024 Overrun Organization
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
import overrungl.gen.char
import overrungl.gen.float
import overrungl.gen.int

val uchar = char c "unsigned char"

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
            entrypoint = "stb_perlin_noise3",
            javadoc = """
                This function computes a random value at the coordinate (x,y,z).
                Adjacent random values are continuous but the noise fluctuates
                its randomness with period 1, i.e. takes on wholly unrelated values
                at integer points. Specifically, this implements Ken Perlin's
                revised noise function from 2002.

                The "wrap" parameters can be used to create wraparound noise that
                wraps at powers of two. The numbers MUST be powers of two. Specify
                0 to mean "don't care". (The noise always wraps every 256 due
                details of the implementation, even if you ask for larger or no
                wrapping.)
            """.trimIndent()
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
            entrypoint = "stb_perlin_noise3_seed",
            javadoc = """
                As above, but 'seed' selects from multiple different variations of the
                noise function. The current implementation only uses the bottom 8 bits
                 of 'seed', but possibly in the future more bits will be used.
            """.trimIndent()
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
