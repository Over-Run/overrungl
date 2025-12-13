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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package overrungl.stb;

/// [stb_perlin.h](https://github.com/nothings/stb/blob/master/stb_perlin.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBPerlin {
    //@formatter:off

    /// Invokes `stb_perlin_noise3`.
    /// ```
    /// float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap);
    /// ```
    public static float stb_perlin_noise3(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap) {
        return org.lwjgl.stb.STBPerlin.stb_perlin_noise3(x, y, z, x_wrap, y_wrap, z_wrap);
    }

    /// Invokes `stb_perlin_noise3_seed`.
    /// ```
    /// float stb_perlin_noise3_seed(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, int seed);
    /// ```
    public static float stb_perlin_noise3_seed(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, int seed) {
        return org.lwjgl.stb.STBPerlin.stb_perlin_noise3_seed(x, y, z, x_wrap, y_wrap, z_wrap, seed);
    }

    /// Invokes `stb_perlin_ridge_noise3`.
    /// ```
    /// float stb_perlin_ridge_noise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves);
    /// ```
    public static float stb_perlin_ridge_noise3(float x, float y, float z, float lacunarity, float gain, float offset, int octaves) {
        return org.lwjgl.stb.STBPerlin.stb_perlin_ridge_noise3(x, y, z, lacunarity, gain, offset, octaves);
    }

    /// Invokes `stb_perlin_fbm_noise3`.
    /// ```
    /// float stb_perlin_fbm_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);
    /// ```
    public static float stb_perlin_fbm_noise3(float x, float y, float z, float lacunarity, float gain, int octaves) {
        return org.lwjgl.stb.STBPerlin.stb_perlin_fbm_noise3(x, y, z, lacunarity, gain, octaves);
    }

    /// Invokes `stb_perlin_turbulence_noise3`.
    /// ```
    /// float stb_perlin_turbulence_noise3(float x, float y, float z, float lacunarity, float gain, int octaves);
    /// ```
    public static float stb_perlin_turbulence_noise3(float x, float y, float z, float lacunarity, float gain, int octaves) {
        return org.lwjgl.stb.STBPerlin.stb_perlin_turbulence_noise3(x, y, z, lacunarity, gain, octaves);
    }

    /// Invokes `stb_perlin_noise3_wrap_nonpow2`.
    /// ```
    /// float stb_perlin_noise3_wrap_nonpow2(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, unsigned char seed);
    /// ```
    public static float stb_perlin_noise3_wrap_nonpow2(float x, float y, float z, int x_wrap, int y_wrap, int z_wrap, byte seed) {
        return org.lwjgl.stb.STBPerlin.stb_perlin_noise3_wrap_nonpow2(x, y, z, x_wrap, y_wrap, z_wrap, seed);
    }

    //@formatter:on

    private STBPerlin() {
    }
}
