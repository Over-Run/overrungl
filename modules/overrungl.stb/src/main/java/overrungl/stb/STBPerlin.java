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

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

import static overrungl.internal.RuntimeHelper.*;

/// [stb_perlin.h](https://github.com/nothings/stb/blob/master/stb_perlin.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBPerlin {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    //endregion
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stb_perlin_noise3`.
        public static final MethodHandle MH_stb_perlin_noise3 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_noise3_seed`.
        public static final MethodHandle MH_stb_perlin_noise3_seed = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_ridge_noise3`.
        public static final MethodHandle MH_stb_perlin_ridge_noise3 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_fbm_noise3`.
        public static final MethodHandle MH_stb_perlin_fbm_noise3 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_turbulence_noise3`.
        public static final MethodHandle MH_stb_perlin_turbulence_noise3 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT));
        /// The method handle of `stb_perlin_noise3_wrap_nonpow2`.
        public static final MethodHandle MH_stb_perlin_noise3_wrap_nonpow2 = downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE));
        /// The function address of `stb_perlin_noise3`.
        public final MemorySegment PFN_stb_perlin_noise3;
        /// The function address of `stb_perlin_noise3_seed`.
        public final MemorySegment PFN_stb_perlin_noise3_seed;
        /// The function address of `stb_perlin_ridge_noise3`.
        public final MemorySegment PFN_stb_perlin_ridge_noise3;
        /// The function address of `stb_perlin_fbm_noise3`.
        public final MemorySegment PFN_stb_perlin_fbm_noise3;
        /// The function address of `stb_perlin_turbulence_noise3`.
        public final MemorySegment PFN_stb_perlin_turbulence_noise3;
        /// The function address of `stb_perlin_noise3_wrap_nonpow2`.
        public final MemorySegment PFN_stb_perlin_noise3_wrap_nonpow2;
        private Handles() {
            PFN_stb_perlin_noise3 = STBInternal.lookup().findOrThrow("stb_perlin_noise3");
            PFN_stb_perlin_noise3_seed = STBInternal.lookup().findOrThrow("stb_perlin_noise3_seed");
            PFN_stb_perlin_ridge_noise3 = STBInternal.lookup().findOrThrow("stb_perlin_ridge_noise3");
            PFN_stb_perlin_fbm_noise3 = STBInternal.lookup().findOrThrow("stb_perlin_fbm_noise3");
            PFN_stb_perlin_turbulence_noise3 = STBInternal.lookup().findOrThrow("stb_perlin_turbulence_noise3");
            PFN_stb_perlin_noise3_wrap_nonpow2 = STBInternal.lookup().findOrThrow("stb_perlin_noise3_wrap_nonpow2");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    /// ```
    /// float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap);
    /// ```
    public static float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_perlin_noise3", x, y, z, x_wrap, y_wrap, z_wrap); }
        return (float) Handles.MH_stb_perlin_noise3.invokeExact(Handles.get().PFN_stb_perlin_noise3, x, y, z, x_wrap, y_wrap, z_wrap); }
        catch (Throwable e) { throw new RuntimeException("error in stb_perlin_noise3", e); }
    }

    /// ```
    /// float stb_perlin_noise3_seed(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, int seed);
    /// ```
    public static float stb_perlin_noise3_seed(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, int seed) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_perlin_noise3_seed", x, y, z, x_wrap, y_wrap, z_wrap, seed); }
        return (float) Handles.MH_stb_perlin_noise3_seed.invokeExact(Handles.get().PFN_stb_perlin_noise3_seed, x, y, z, x_wrap, y_wrap, z_wrap, seed); }
        catch (Throwable e) { throw new RuntimeException("error in stb_perlin_noise3_seed", e); }
    }

    /// ```
    /// float stb_perlin_ridge_noise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves);
    /// ```
    public static float stb_perlin_ridge_noise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_perlin_ridge_noise3", x, y, z, lacunarity, gain, offset, octaves); }
        return (float) Handles.MH_stb_perlin_ridge_noise3.invokeExact(Handles.get().PFN_stb_perlin_ridge_noise3, x, y, z, lacunarity, gain, offset, octaves); }
        catch (Throwable e) { throw new RuntimeException("error in stb_perlin_ridge_noise3", e); }
    }

    /// ```
    /// float stb_perlin_fbm_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);
    /// ```
    public static float stb_perlin_fbm_noise3(float x, float y, float z, float lacunarity, float gain, int octaves) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_perlin_fbm_noise3", x, y, z, lacunarity, gain, octaves); }
        return (float) Handles.MH_stb_perlin_fbm_noise3.invokeExact(Handles.get().PFN_stb_perlin_fbm_noise3, x, y, z, lacunarity, gain, octaves); }
        catch (Throwable e) { throw new RuntimeException("error in stb_perlin_fbm_noise3", e); }
    }

    /// ```
    /// float stb_perlin_turbulence_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);
    /// ```
    public static float stb_perlin_turbulence_noise3(float x, float y, float z, float lacunarity, float gain, int octaves) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_perlin_turbulence_noise3", x, y, z, lacunarity, gain, octaves); }
        return (float) Handles.MH_stb_perlin_turbulence_noise3.invokeExact(Handles.get().PFN_stb_perlin_turbulence_noise3, x, y, z, lacunarity, gain, octaves); }
        catch (Throwable e) { throw new RuntimeException("error in stb_perlin_turbulence_noise3", e); }
    }

    /// ```
    /// float stb_perlin_noise3_wrap_nonpow2(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, unsigned char seed);
    /// ```
    public static float stb_perlin_noise3_wrap_nonpow2(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, byte seed) {
        try { if (TRACE_DOWNCALLS) { traceDowncall("stb_perlin_noise3_wrap_nonpow2", x, y, z, x_wrap, y_wrap, z_wrap, seed); }
        return (float) Handles.MH_stb_perlin_noise3_wrap_nonpow2.invokeExact(Handles.get().PFN_stb_perlin_noise3_wrap_nonpow2, x, y, z, x_wrap, y_wrap, z_wrap, seed); }
        catch (Throwable e) { throw new RuntimeException("error in stb_perlin_noise3_wrap_nonpow2", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBPerlin() {
    }
}
