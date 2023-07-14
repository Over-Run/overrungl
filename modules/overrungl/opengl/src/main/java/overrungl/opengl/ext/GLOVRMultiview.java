/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

package overrungl.opengl.ext;

import overrungl.opengl.GLExtCaps;
import overrungl.opengl.GLLoadFunc;
import overrungl.opengl.GLLoader;
import overrungl.FunctionDescriptors;

/**
 * {@code GL_OVR_multiview}
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLOVRMultiview {
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_NUM_VIEWS_OVR = 0x9630;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_BASE_VIEW_INDEX_OVR = 0x9632;
    public static final int GL_MAX_VIEWS_OVR = 0x9631;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_VIEW_TARGETS_OVR = 0x9633;

    public static void load(GLExtCaps ext, GLLoadFunc load) {
        if (!ext.GL_OVR_multiview) return;
        ext.glFramebufferTextureMultiviewOVR = load.invoke("glFramebufferTextureMultiviewOVR", FunctionDescriptors.IIIIIIV);
    }

    public static void glFramebufferTextureMultiviewOVR(int target, int attachment, int texture, int level, int baseViewIndex, int numViews) {
        var ext = GLLoader.getExtCapabilities();
        try {
            GLLoader.check(ext.glFramebufferTextureMultiviewOVR).invokeExact(target, attachment, texture, level, baseViewIndex, numViews);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
