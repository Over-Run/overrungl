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
  * {@code GL_ARB_sample_locations}
  */
public final class GLARBSampleLocations {
    public static final int GL_SAMPLE_LOCATION_SUBPIXEL_BITS_ARB = 0x933D;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_WIDTH_ARB = 0x933E;
    public static final int GL_SAMPLE_LOCATION_PIXEL_GRID_HEIGHT_ARB = 0x933F;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_TABLE_SIZE_ARB = 0x9340;
    public static final int GL_SAMPLE_LOCATION_ARB = 0x8E50;
    public static final int GL_PROGRAMMABLE_SAMPLE_LOCATION_ARB = 0x9341;
    public static final int GL_FRAMEBUFFER_PROGRAMMABLE_SAMPLE_LOCATIONS_ARB = 0x9342;
    public static final int GL_FRAMEBUFFER_SAMPLE_LOCATION_PIXEL_GRID_ARB = 0x9343;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_sample_locations) return;
        ext.glEvaluateDepthValuesARB = load.invoke("glEvaluateDepthValuesARB", ofVoid());
        ext.glFramebufferSampleLocationsfvARB = load.invoke("glFramebufferSampleLocationsfvARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
        ext.glNamedFramebufferSampleLocationsfvARB = load.invoke("glNamedFramebufferSampleLocationsfvARB", ofVoid(JAVA_INT, JAVA_INT, JAVA_INT, ADDRESS));
    }

    public static void glEvaluateDepthValuesARB() {
        final var ext = getExtCapabilities();
        try {
            check(ext.glEvaluateDepthValuesARB).invokeExact();
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glFramebufferSampleLocationsfvARB(int target, int start, int count, @NativeType("const GLfloat *v") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glFramebufferSampleLocationsfvARB).invokeExact(target, start, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

    public static void glNamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, @NativeType("const GLfloat *v") MemorySegment v) {
        final var ext = getExtCapabilities();
        try {
            check(ext.glNamedFramebufferSampleLocationsfvARB).invokeExact(framebuffer, start, count, v);
        } catch (Throwable e) { throw new AssertionError("should not reach here", e); }
    }

}
