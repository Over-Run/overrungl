// this file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ext.arb;

import overrungl.*;
import overrungl.opengl.*;
import java.lang.foreign.*;
import static java.lang.foreign.FunctionDescriptor.of;
import static java.lang.foreign.FunctionDescriptor.ofVoid;
import static java.lang.foreign.ValueLayout.*;
import static overrungl.opengl.GLLoader.*;

/**
  * {@code GL_ARB_sample_shading}
  */
public final class GLARBSampleShading {
    public static final int GL_SAMPLE_SHADING_ARB = 0x8C36;
    public static final int GL_MIN_SAMPLE_SHADING_VALUE_ARB = 0x8C37;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_sample_shading) return;
        ext.glMinSampleShadingARB = load.invoke("glMinSampleShadingARB", ofVoid(JAVA_FLOAT));
    }

    public static void glMinSampleShadingARB(float value) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glMinSampleShadingARB).invokeExact(value);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
