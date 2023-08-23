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
  * {@code GL_ARB_viewport_array}
  */
public final class GLARBViewportArray {

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_viewport_array) return;
        ext.glDepthRangeArraydvNV = load.invoke("glDepthRangeArraydvNV", ofVoid(JAVA_INT, JAVA_INT, ADDRESS));
        ext.glDepthRangeIndexeddNV = load.invoke("glDepthRangeIndexeddNV", ofVoid(JAVA_INT, JAVA_DOUBLE, JAVA_DOUBLE));
    }

    public static void glDepthRangeArraydvNV(int first, int count, @NativeType("const GLdouble *") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDepthRangeArraydvNV).invokeExact(first, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glDepthRangeIndexeddNV(int index, double n, double f) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glDepthRangeIndexeddNV).invokeExact(index, n, f);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
