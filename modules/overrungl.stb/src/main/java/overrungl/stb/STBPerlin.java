/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package overrungl.stb;

import java.lang.invoke.MethodHandle;

import static overrungl.FunctionDescriptors.*;
import static overrungl.stb.Handles.*;

/**
 * The STB perlin noise generator.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBPerlin {
    private static final MethodHandle
        stb_perlin_noise3 = downcall("stb_perlin_noise3", FFFIIIF),
        stb_perlin_noise3_seed = downcall("stb_perlin_noise3_seed", FFFIIIIF),
        stb_perlin_ridge_noise3 = downcall("stb_perlin_ridge_noise3", FFFFFFIF),
        stb_perlin_fbm_noise3 = downcall("stb_perlin_fbm_noise3", FFFFFIF),
        stb_perlin_turbulence_noise3 = downcall("stb_perlin_turbulence_noise3", FFFFFIF),
        stb_perlin_noise3_wrap_nonpow2 = downcall("stb_perlin_noise3_wrap_nonpow2", FFFIIIBF);

    private STBPerlin() {
        throw new IllegalStateException("Do not construct instance");
    }

    /**
     * This function computes a random value at the coordinate (x,y,z).<br>
     * Adjacent random values are continuous but the noise fluctuates
     * its randomness with period 1, i.e. takes on wholly unrelated values
     * at integer points. Specifically, this implements Ken Perlin's
     * revised noise function from 2002.
     * <p>
     * The "wrap" parameters can be used to create wraparound noise that
     * wraps at powers of two. The numbers MUST be powers of two. Specify
     * 0 to mean "don't care". (The noise always wraps every 256 due
     * details of the implementation, even if you ask for larger or no
     * wrapping.)
     *
     * @param x     x
     * @param y     y
     * @param z     z
     * @param wrapX wrap x
     * @param wrapY wrap y
     * @param wrapZ wrap z
     * @return the value
     */
    public static float noise3(float x, float y, float z, int wrapX, int wrapY, int wrapZ) {
        try {
            return (float) stb_perlin_noise3.invokeExact(x, y, z, wrapX, wrapY, wrapZ);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * As {@link #noise3}, but 'seed' selects from multiple different variations of the
     * noise function. The current implementation only uses the bottom 8 bits
     * of 'seed', but possibly in the future more bits will be used.
     *
     * @param x     x
     * @param y     y
     * @param z     z
     * @param wrapX wrap x
     * @param wrapY wrap y
     * @param wrapZ wrap z
     * @param seed  the seed
     * @return the value
     */
    public static float noise3seed(float x, float y, float z, int wrapX, int wrapY, int wrapZ, int seed) {
        try {
            return (float) stb_perlin_noise3_seed.invokeExact(x, y, z, wrapX, wrapY, wrapZ, seed);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Three common fractal noise functions are included, which produce
     * a wide variety of nice effects depending on the parameters
     * provided. Note that each function will call stb_perlin_noise3
     * 'octaves' times, so this parameter will affect runtime.
     *
     * @param x          x
     * @param y          y
     * @param z          z
     * @param lacunarity = ~ 2.0 -- spacing between successive octaves (use exactly 2.0 for wrapping output)
     * @param gain       = 0.5   -- relative weighting applied to each successive octave
     * @param offset     = 1.0?  -- used to invert the ridges, may need to be larger, not sure
     * @param octaves    = 6     -- number of "octaves" of noise3() to sum
     * @return the value
     */
    public static float ridgeNoise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves) {
        try {
            return (float) stb_perlin_ridge_noise3.invokeExact(x, y, z, lacunarity, gain, offset, octaves);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Three common fractal noise functions are included, which produce
     * a wide variety of nice effects depending on the parameters
     * provided. Note that each function will call stb_perlin_noise3
     * 'octaves' times, so this parameter will affect runtime.
     *
     * @param x          x
     * @param y          y
     * @param z          z
     * @param lacunarity = ~ 2.0 -- spacing between successive octaves (use exactly 2.0 for wrapping output)
     * @param gain       = 0.5   -- relative weighting applied to each successive octave
     * @param octaves    = 6     -- number of "octaves" of noise3() to sum
     * @return the value
     */
    public static float fbmNoise3(float x, float y, float z, float lacunarity, float gain, int octaves) {
        try {
            return (float) stb_perlin_fbm_noise3.invokeExact(x, y, z, lacunarity, gain, octaves);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    /**
     * Three common fractal noise functions are included, which produce
     * a wide variety of nice effects depending on the parameters
     * provided. Note that each function will call stb_perlin_noise3
     * 'octaves' times, so this parameter will affect runtime.
     *
     * @param x          x
     * @param y          y
     * @param z          z
     * @param lacunarity = ~ 2.0 -- spacing between successive octaves (use exactly 2.0 for wrapping output)
     * @param gain       = 0.5   -- relative weighting applied to each successive octave
     * @param octaves    = 6     -- number of "octaves" of noise3() to sum
     * @return the value
     */
    public static float turbulenceNoise3(float x, float y, float z, float lacunarity, float gain, int octaves) {
        try {
            return (float) stb_perlin_turbulence_noise3.invokeExact(x, y, z, lacunarity, gain, octaves);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static float noise3wrapNonpow2(float x, float y, float z, int wrapX, int wrapY, int wrapZ, byte seed) {
        try {
            return (float) stb_perlin_noise3_wrap_nonpow2.invokeExact(x, y, z, wrapX, wrapY, wrapZ, seed);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
