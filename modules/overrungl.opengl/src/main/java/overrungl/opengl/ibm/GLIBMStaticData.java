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
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glFlushStaticDataIBM = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT);
    }
    public static final class Handles {
        public static final MethodHandle MH_glFlushStaticDataIBM = RuntimeHelper.downcall(Descriptors.FD_glFlushStaticDataIBM);
        public final MemorySegment PFN_glFlushStaticDataIBM;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glFlushStaticDataIBM = func.invoke("glFlushStaticDataIBM");
        }
    }

    public GLIBMStaticData(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void FlushStaticDataIBM(@CType("GLenum") int target) {
        if (Unmarshal.isNullPointer(handles.PFN_glFlushStaticDataIBM)) throw new SymbolNotFoundError("Symbol not found: glFlushStaticDataIBM");
        try { Handles.MH_glFlushStaticDataIBM.invokeExact(handles.PFN_glFlushStaticDataIBM, target); }
        catch (Throwable e) { throw new RuntimeException("error in glFlushStaticDataIBM", e); }
    }

}
