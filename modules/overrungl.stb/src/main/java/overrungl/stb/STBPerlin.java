/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

import overrungl.annotation.CType;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/// perlin noise
///
/// Fractal Noise:
///
/// Three common fractal noise functions are included, which produce
/// a wide variety of nice effects depending on the parameters
/// provided. Note that each function will call stb_perlin_noise3
/// 'octaves' times, so this parameter will affect runtime.
///
/// - [stb_perlin_ridge_noise3][#stb_perlin_ridge_noise3(float, float, float, float, float, float, int)]
/// - [stb_perlin_fbm_noise3][#stb_perlin_fbm_noise3(float, float, float, float, float, int)]
/// - [stb_perlin_turbulence_noise3][#stb_perlin_turbulence_noise3(float, float, float, float, float, int)]
///
/// Typical values to start playing with:
/// - octaves    =   6     -- number of "octaves" of noise3() to sum
/// - lacunarity = ~ 2.0   -- spacing between successive octaves (use exactly 2.0 for wrapping output)
/// - gain       =   0.5   -- relative weighting applied to each successive octave
/// - offset     =   1.0?  -- used to invert the ridges, may need to be larger, not sure
///
/// @author squid233
/// @since 0.1.0
public final class STBPerlin {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    //region Method handles
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stb_perlin_noise3`.
        public static final MethodHandle MH_stb_perlin_noise3 = RuntimeHelper.downcall(STBInternal.lookup, "stb_perlin_noise3", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_noise3_seed`.
        public static final MethodHandle MH_stb_perlin_noise3_seed = RuntimeHelper.downcall(STBInternal.lookup, "stb_perlin_noise3_seed", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_ridge_noise3`.
        public static final MethodHandle MH_stb_perlin_ridge_noise3 = RuntimeHelper.downcall(STBInternal.lookup, "stb_perlin_ridge_noise3", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_fbm_noise3`.
        public static final MethodHandle MH_stb_perlin_fbm_noise3 = RuntimeHelper.downcall(STBInternal.lookup, "stb_perlin_fbm_noise3", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_turbulence_noise3`.
        public static final MethodHandle MH_stb_perlin_turbulence_noise3 = RuntimeHelper.downcall(STBInternal.lookup, "stb_perlin_turbulence_noise3", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_noise3_wrap_nonpow2`.
        public static final MethodHandle MH_stb_perlin_noise3_wrap_nonpow2 = RuntimeHelper.downcall(STBInternal.lookup, "stb_perlin_noise3_wrap_nonpow2", FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
    }
    //endregion

    ///This function computes a random value at the coordinate (x,y,z).
    ///Adjacent random values are continuous but the noise fluctuates
    ///its randomness with period 1, i.e. takes on wholly unrelated values
    ///at integer points. Specifically, this implements Ken Perlin's
    ///revised noise function from 2002.
    ///
    ///The "wrap" parameters can be used to create wraparound noise that
    ///wraps at powers of two. The numbers MUST be powers of two. Specify
    ///0 to mean "don't care". (The noise always wraps every 256 due
    ///details of the implementation, even if you ask for larger or no
    ///wrapping.)
    public static @CType("float") float stb_perlin_noise3(@CType("float") float x, @CType("float") float y, @CType("float") float z, @CType("int") int x_wrap, @CType("int") int y_wrap, @CType("int") int z_wrap) {
        try {
            return (float) Handles.MH_stb_perlin_noise3.invokeExact(x, y, z, x_wrap, y_wrap, z_wrap);
        } catch (Throwable e) { throw new RuntimeException("error in stb_perlin_noise3", e); }
    }

    ///As above, but 'seed' selects from multiple different variations of the
    ///noise function. The current implementation only uses the bottom 8 bits
    /// of 'seed', but possibly in the future more bits will be used.
    public static @CType("float") float stb_perlin_noise3_seed(@CType("float") float x, @CType("float") float y, @CType("float") float z, @CType("int") int x_wrap, @CType("int") int y_wrap, @CType("int") int z_wrap, @CType("int") int seed) {
        try {
            return (float) Handles.MH_stb_perlin_noise3_seed.invokeExact(x, y, z, x_wrap, y_wrap, z_wrap, seed);
        } catch (Throwable e) { throw new RuntimeException("error in stb_perlin_noise3_seed", e); }
    }

    public static @CType("float") float stb_perlin_ridge_noise3(@CType("float") float x, @CType("float") float y, @CType("float") float z, @CType("float") float lacunarity, @CType("float") float gain, @CType("float") float offset, @CType("int") int octaves) {
        try {
            return (float) Handles.MH_stb_perlin_ridge_noise3.invokeExact(x, y, z, lacunarity, gain, offset, octaves);
        } catch (Throwable e) { throw new RuntimeException("error in stb_perlin_ridge_noise3", e); }
    }

    public static @CType("float") float stb_perlin_fbm_noise3(@CType("float") float x, @CType("float") float y, @CType("float") float z, @CType("float") float lacunarity, @CType("float") float gain, @CType("int") int octaves) {
        try {
            return (float) Handles.MH_stb_perlin_fbm_noise3.invokeExact(x, y, z, lacunarity, gain, octaves);
        } catch (Throwable e) { throw new RuntimeException("error in stb_perlin_fbm_noise3", e); }
    }

    public static @CType("float") float stb_perlin_turbulence_noise3(@CType("float") float x, @CType("float") float y, @CType("float") float z, @CType("float") float lacunarity, @CType("float") float gain, @CType("int") int octaves) {
        try {
            return (float) Handles.MH_stb_perlin_turbulence_noise3.invokeExact(x, y, z, lacunarity, gain, octaves);
        } catch (Throwable e) { throw new RuntimeException("error in stb_perlin_turbulence_noise3", e); }
    }

    public static @CType("float") float stb_perlin_noise3_wrap_nonpow2(@CType("float") float x, @CType("float") float y, @CType("float") float z, @CType("int") int x_wrap, @CType("int") int y_wrap, @CType("int") int z_wrap, @CType("unsigned char") byte seed) {
        try {
            return (float) Handles.MH_stb_perlin_noise3_wrap_nonpow2.invokeExact(x, y, z, x_wrap, y_wrap, z_wrap, seed);
        } catch (Throwable e) { throw new RuntimeException("error in stb_perlin_noise3_wrap_nonpow2", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBPerlin() {
    }
}
