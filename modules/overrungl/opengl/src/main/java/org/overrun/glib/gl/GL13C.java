package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.invoke.MethodHandle;

import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 1.3 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL13C extends GL12C permits GL13 {
    @Nullable
    public static MethodHandle
        glActiveTexture,
        glCompressedTexImage1D,
        glCompressedTexImage2D,
        glCompressedTexImage3D,
        glCompressedTexSubImage1D,
        glCompressedTexSubImage2D,
        glCompressedTexSubImage3D,
        glGetCompressedTexImage,
        glSampleCoverage;

    static void load(GLLoadFunc load) {
        if (!Ver13) return;
        glActiveTexture = downcallSafe(load.invoke("glActiveTexture"), dIV);
        glCompressedTexImage1D = downcallSafe(load.invoke("glCompressedTexImage1D"), );
        glCompressedTexImage2D = downcallSafe(load.invoke("glCompressedTexImage2D"), );
        glCompressedTexImage3D = downcallSafe(load.invoke("glCompressedTexImage3D"), );
        glCompressedTexSubImage1D = downcallSafe(load.invoke("glCompressedTexSubImage1D"), );
        glCompressedTexSubImage2D = downcallSafe(load.invoke("glCompressedTexSubImage2D"), );
        glCompressedTexSubImage3D = downcallSafe(load.invoke("glCompressedTexSubImage3D"), );
        glGetCompressedTexImage = downcallSafe(load.invoke("glGetCompressedTexImage"), );
        glSampleCoverage = downcallSafe(load.invoke("glSampleCoverage"), );
    }

    public static void activeTexture(int texture) {
        try {
            check(glActiveTexture).invoke(texture);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    // todo: wip
}
