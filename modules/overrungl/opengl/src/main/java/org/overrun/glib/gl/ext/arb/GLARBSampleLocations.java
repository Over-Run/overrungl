// this file is auto-generated. DO NOT EDIT!
package org.overrun.glib.gl.ext.arb;

import org.overrun.glib.*;
import org.overrun.glib.gl.*;
import java.lang.foreign.MemorySegment;
import static org.overrun.glib.FunctionDescriptors.*;

/**
 * {@code GL_ARB_sample_locations}
 */
public final class GLARBSampleLocations {
    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_ARB_sample_locations) return;
        ext.glEvaluateDepthValuesARB = load.invoke("glEvaluateDepthValuesARB", V);
        ext.glFramebufferSampleLocationsfvARB = load.invoke("glFramebufferSampleLocationsfvARB", IIIPV);
        ext.glNamedFramebufferSampleLocationsfvARB = load.invoke("glNamedFramebufferSampleLocationsfvARB", IIIPV);
    }

    public static void glEvaluateDepthValuesARB() {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glEvaluateDepthValuesARB).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glFramebufferSampleLocationsfvARB(int target, int start, int count, MemorySegment v) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glFramebufferSampleLocationsfvARB).invokeExact(target, start, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void glNamedFramebufferSampleLocationsfvARB(int framebuffer, int start, int count, MemorySegment v) {
        final var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glNamedFramebufferSampleLocationsfvARB).invokeExact(framebuffer, start, count, v);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

}
