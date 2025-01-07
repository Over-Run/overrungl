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
package overrungl.opengl.ibm;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLIBMStaticData {
    public static final int GL_ALL_STATIC_DATA_IBM = 103060;
    public static final int GL_STATIC_VERTEX_ARRAY_IBM = 103061;
    public static final MethodHandle MH_glFlushStaticDataIBM = RuntimeHelper.downcall(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
    public final MemorySegment PFN_glFlushStaticDataIBM;

    public GLIBMStaticData(overrungl.opengl.GLLoadFunc func) {
        PFN_glFlushStaticDataIBM = func.invoke("glFlushStaticDataIBM");
    }

    public void FlushStaticDataIBM(@CType("GLenum") int target) {
        try { if (!Unmarshal.isNullPointer(PFN_glFlushStaticDataIBM))
            MH_glFlushStaticDataIBM.invokeExact(PFN_glFlushStaticDataIBM, target);
        }
        catch (Throwable e) { throw new RuntimeException("error in glFlushStaticDataIBM", e); }
    }

}