/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ovr;

import java.lang.foreign.*;
import java.lang.invoke.*;
import static overrungl.internal.RuntimeHelper.*;
import overrungl.util.*;
import overrungl.opengl.*;

public final class GLOVRMultiview {
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR = 0x9630;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;
    public static final int GL_MAX_VIEWS_OVR = 0x9631;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glFramebufferTextureMultiviewOVR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNamedFramebufferTextureMultiviewOVR = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public final MemorySegment PFN_glFramebufferTextureMultiviewOVR;
        public final MemorySegment PFN_glNamedFramebufferTextureMultiviewOVR;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFramebufferTextureMultiviewOVR = func.invoke("glFramebufferTextureMultiviewOVR");PFN_glNamedFramebufferTextureMultiviewOVR = func.invoke("glNamedFramebufferTextureMultiviewOVR");
        }
    }

    public GLOVRMultiview(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// ```
    /// void glFramebufferTextureMultiviewOVR((unsigned int) GLenum target, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint baseViewIndex, (int) GLsizei numViews);
    /// ```
    public void FramebufferTextureMultiviewOVR(int target, int attachment, int texture, int level, int baseViewIndex, int numViews) {
        if (MemoryUtil.isNullPointer(handles.PFN_glFramebufferTextureMultiviewOVR)) throw new GLSymbolNotFoundError("Symbol not found: glFramebufferTextureMultiviewOVR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glFramebufferTextureMultiviewOVR", target, attachment, texture, level, baseViewIndex, numViews); }
        Handles.MH_glFramebufferTextureMultiviewOVR.invokeExact(handles.PFN_glFramebufferTextureMultiviewOVR, target, attachment, texture, level, baseViewIndex, numViews); }
        catch (Throwable e) { throw new RuntimeException("error in FramebufferTextureMultiviewOVR", e); }
    }

    /// ```
    /// void glNamedFramebufferTextureMultiviewOVR((unsigned int) GLuint framebuffer, (unsigned int) GLenum attachment, (unsigned int) GLuint texture, (int) GLint level, (int) GLint baseViewIndex, (int) GLsizei numViews);
    /// ```
    public void NamedFramebufferTextureMultiviewOVR(int framebuffer, int attachment, int texture, int level, int baseViewIndex, int numViews) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedFramebufferTextureMultiviewOVR)) throw new GLSymbolNotFoundError("Symbol not found: glNamedFramebufferTextureMultiviewOVR");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedFramebufferTextureMultiviewOVR", framebuffer, attachment, texture, level, baseViewIndex, numViews); }
        Handles.MH_glNamedFramebufferTextureMultiviewOVR.invokeExact(handles.PFN_glNamedFramebufferTextureMultiviewOVR, framebuffer, attachment, texture, level, baseViewIndex, numViews); }
        catch (Throwable e) { throw new RuntimeException("error in NamedFramebufferTextureMultiviewOVR", e); }
    }

}
