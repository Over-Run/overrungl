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
package overrungl.opengl.sun;

import java.lang.foreign.*;
import java.lang.invoke.*;
import overrungl.annotation.*;
import overrungl.internal.RuntimeHelper;
import overrungl.util.*;

public final class GLSUNVertex {
    private final Handles handles;
    public static final class Descriptors {
        private Descriptors() {}
        public static final FunctionDescriptor FD_glColor4ubVertex2fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glColor4ubVertex2fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColor4ubVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glColor4ubVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColor3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glColor3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glColor4fNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glColor4fNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord2fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTexCoord2fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord4fVertex4fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTexCoord4fVertex4fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord2fColor4ubVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTexCoord2fColor4ubVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord2fColor3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTexCoord2fColor3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord2fNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTexCoord2fNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord2fColor4fNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTexCoord2fColor4fNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glTexCoord4fColor4fNormal3fVertex4fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glTexCoord4fColor4fNormal3fVertex4fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiColor4ubVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiColor4ubVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiColor3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiColor3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiColor4fNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiTexCoord2fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiTexCoord2fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
        public static final FunctionDescriptor FD_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT);
        public static final FunctionDescriptor FD_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
    }
    public static final class Handles {
        public static final MethodHandle MH_glColor4ubVertex2fSUN = RuntimeHelper.downcall(Descriptors.FD_glColor4ubVertex2fSUN);
        public static final MethodHandle MH_glColor4ubVertex2fvSUN = RuntimeHelper.downcall(Descriptors.FD_glColor4ubVertex2fvSUN);
        public static final MethodHandle MH_glColor4ubVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glColor4ubVertex3fSUN);
        public static final MethodHandle MH_glColor4ubVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glColor4ubVertex3fvSUN);
        public static final MethodHandle MH_glColor3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glColor3fVertex3fSUN);
        public static final MethodHandle MH_glColor3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glColor3fVertex3fvSUN);
        public static final MethodHandle MH_glNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glNormal3fVertex3fSUN);
        public static final MethodHandle MH_glNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glNormal3fVertex3fvSUN);
        public static final MethodHandle MH_glColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glColor4fNormal3fVertex3fSUN);
        public static final MethodHandle MH_glColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glColor4fNormal3fVertex3fvSUN);
        public static final MethodHandle MH_glTexCoord2fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fVertex3fSUN);
        public static final MethodHandle MH_glTexCoord2fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fVertex3fvSUN);
        public static final MethodHandle MH_glTexCoord4fVertex4fSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord4fVertex4fSUN);
        public static final MethodHandle MH_glTexCoord4fVertex4fvSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord4fVertex4fvSUN);
        public static final MethodHandle MH_glTexCoord2fColor4ubVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fColor4ubVertex3fSUN);
        public static final MethodHandle MH_glTexCoord2fColor4ubVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fColor4ubVertex3fvSUN);
        public static final MethodHandle MH_glTexCoord2fColor3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fColor3fVertex3fSUN);
        public static final MethodHandle MH_glTexCoord2fColor3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fColor3fVertex3fvSUN);
        public static final MethodHandle MH_glTexCoord2fNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fNormal3fVertex3fSUN);
        public static final MethodHandle MH_glTexCoord2fNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fNormal3fVertex3fvSUN);
        public static final MethodHandle MH_glTexCoord2fColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fColor4fNormal3fVertex3fSUN);
        public static final MethodHandle MH_glTexCoord2fColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord2fColor4fNormal3fVertex3fvSUN);
        public static final MethodHandle MH_glTexCoord4fColor4fNormal3fVertex4fSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord4fColor4fNormal3fVertex4fSUN);
        public static final MethodHandle MH_glTexCoord4fColor4fNormal3fVertex4fvSUN = RuntimeHelper.downcall(Descriptors.FD_glTexCoord4fColor4fNormal3fVertex4fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiVertex3fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiColor4ubVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiColor4ubVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiColor4ubVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiColor4ubVertex3fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiColor3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiColor3fVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiColor3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiColor3fVertex3fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiNormal3fVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiNormal3fVertex3fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiColor4fNormal3fVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiColor4fNormal3fVertex3fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiTexCoord2fVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiTexCoord2fVertex3fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN);
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN);
        public static final MethodHandle MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = RuntimeHelper.downcall(Descriptors.FD_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN);
        public final MemorySegment PFN_glColor4ubVertex2fSUN;
        public final MemorySegment PFN_glColor4ubVertex2fvSUN;
        public final MemorySegment PFN_glColor4ubVertex3fSUN;
        public final MemorySegment PFN_glColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glColor3fVertex3fSUN;
        public final MemorySegment PFN_glColor3fVertex3fvSUN;
        public final MemorySegment PFN_glNormal3fVertex3fSUN;
        public final MemorySegment PFN_glNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord4fVertex4fSUN;
        public final MemorySegment PFN_glTexCoord4fVertex4fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fSUN;
        public final MemorySegment PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4ubVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN;
        public final MemorySegment PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN;
        private Handles(overrungl.opengl.GLLoadFunc func) {
            PFN_glColor4ubVertex2fSUN = func.invoke("glColor4ubVertex2fSUN");
            PFN_glColor4ubVertex2fvSUN = func.invoke("glColor4ubVertex2fvSUN");
            PFN_glColor4ubVertex3fSUN = func.invoke("glColor4ubVertex3fSUN");
            PFN_glColor4ubVertex3fvSUN = func.invoke("glColor4ubVertex3fvSUN");
            PFN_glColor3fVertex3fSUN = func.invoke("glColor3fVertex3fSUN");
            PFN_glColor3fVertex3fvSUN = func.invoke("glColor3fVertex3fvSUN");
            PFN_glNormal3fVertex3fSUN = func.invoke("glNormal3fVertex3fSUN");
            PFN_glNormal3fVertex3fvSUN = func.invoke("glNormal3fVertex3fvSUN");
            PFN_glColor4fNormal3fVertex3fSUN = func.invoke("glColor4fNormal3fVertex3fSUN");
            PFN_glColor4fNormal3fVertex3fvSUN = func.invoke("glColor4fNormal3fVertex3fvSUN");
            PFN_glTexCoord2fVertex3fSUN = func.invoke("glTexCoord2fVertex3fSUN");
            PFN_glTexCoord2fVertex3fvSUN = func.invoke("glTexCoord2fVertex3fvSUN");
            PFN_glTexCoord4fVertex4fSUN = func.invoke("glTexCoord4fVertex4fSUN");
            PFN_glTexCoord4fVertex4fvSUN = func.invoke("glTexCoord4fVertex4fvSUN");
            PFN_glTexCoord2fColor4ubVertex3fSUN = func.invoke("glTexCoord2fColor4ubVertex3fSUN");
            PFN_glTexCoord2fColor4ubVertex3fvSUN = func.invoke("glTexCoord2fColor4ubVertex3fvSUN");
            PFN_glTexCoord2fColor3fVertex3fSUN = func.invoke("glTexCoord2fColor3fVertex3fSUN");
            PFN_glTexCoord2fColor3fVertex3fvSUN = func.invoke("glTexCoord2fColor3fVertex3fvSUN");
            PFN_glTexCoord2fNormal3fVertex3fSUN = func.invoke("glTexCoord2fNormal3fVertex3fSUN");
            PFN_glTexCoord2fNormal3fVertex3fvSUN = func.invoke("glTexCoord2fNormal3fVertex3fvSUN");
            PFN_glTexCoord2fColor4fNormal3fVertex3fSUN = func.invoke("glTexCoord2fColor4fNormal3fVertex3fSUN");
            PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN = func.invoke("glTexCoord2fColor4fNormal3fVertex3fvSUN");
            PFN_glTexCoord4fColor4fNormal3fVertex4fSUN = func.invoke("glTexCoord4fColor4fNormal3fVertex4fSUN");
            PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN = func.invoke("glTexCoord4fColor4fNormal3fVertex4fvSUN");
            PFN_glReplacementCodeuiVertex3fSUN = func.invoke("glReplacementCodeuiVertex3fSUN");
            PFN_glReplacementCodeuiVertex3fvSUN = func.invoke("glReplacementCodeuiVertex3fvSUN");
            PFN_glReplacementCodeuiColor4ubVertex3fSUN = func.invoke("glReplacementCodeuiColor4ubVertex3fSUN");
            PFN_glReplacementCodeuiColor4ubVertex3fvSUN = func.invoke("glReplacementCodeuiColor4ubVertex3fvSUN");
            PFN_glReplacementCodeuiColor3fVertex3fSUN = func.invoke("glReplacementCodeuiColor3fVertex3fSUN");
            PFN_glReplacementCodeuiColor3fVertex3fvSUN = func.invoke("glReplacementCodeuiColor3fVertex3fvSUN");
            PFN_glReplacementCodeuiNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiColor4fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiColor4fNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN");
            PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN = func.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN");
            PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN = func.invoke("glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN");
        }
    }

    public GLSUNVertex(overrungl.opengl.GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    public void Color4ubVertex2fSUN(@CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4ubVertex2fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex2fSUN");
        try { Handles.MH_glColor4ubVertex2fSUN.invokeExact(handles.PFN_glColor4ubVertex2fSUN, r, g, b, a, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex2fSUN", e); }
    }

    public void Color4ubVertex2fvSUN(@CType("const GLubyte *") MemorySegment c, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4ubVertex2fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex2fvSUN");
        try { Handles.MH_glColor4ubVertex2fvSUN.invokeExact(handles.PFN_glColor4ubVertex2fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex2fvSUN", e); }
    }

    public void Color4ubVertex3fSUN(@CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4ubVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex3fSUN");
        try { Handles.MH_glColor4ubVertex3fSUN.invokeExact(handles.PFN_glColor4ubVertex3fSUN, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex3fSUN", e); }
    }

    public void Color4ubVertex3fvSUN(@CType("const GLubyte *") MemorySegment c, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4ubVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4ubVertex3fvSUN");
        try { Handles.MH_glColor4ubVertex3fvSUN.invokeExact(handles.PFN_glColor4ubVertex3fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4ubVertex3fvSUN", e); }
    }

    public void Color3fVertex3fSUN(@CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor3fVertex3fSUN");
        try { Handles.MH_glColor3fVertex3fSUN.invokeExact(handles.PFN_glColor3fVertex3fSUN, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glColor3fVertex3fSUN", e); }
    }

    public void Color3fVertex3fvSUN(@CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor3fVertex3fvSUN");
        try { Handles.MH_glColor3fVertex3fvSUN.invokeExact(handles.PFN_glColor3fVertex3fvSUN, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in glColor3fVertex3fvSUN", e); }
    }

    public void Normal3fVertex3fSUN(@CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glNormal3fVertex3fSUN");
        try { Handles.MH_glNormal3fVertex3fSUN.invokeExact(handles.PFN_glNormal3fVertex3fSUN, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glNormal3fVertex3fSUN", e); }
    }

    public void Normal3fVertex3fvSUN(@CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glNormal3fVertex3fvSUN");
        try { Handles.MH_glNormal3fVertex3fvSUN.invokeExact(handles.PFN_glNormal3fVertex3fvSUN, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glNormal3fVertex3fvSUN", e); }
    }

    public void Color4fNormal3fVertex3fSUN(@CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glColor4fNormal3fVertex3fSUN, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4fNormal3fVertex3fSUN", e); }
    }

    public void Color4fNormal3fVertex3fvSUN(@CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glColor4fNormal3fVertex3fvSUN, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glColor4fNormal3fVertex3fvSUN", e); }
    }

    public void TexCoord2fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fSUN");
        try { Handles.MH_glTexCoord2fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fVertex3fSUN, s, t, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fVertex3fSUN", e); }
    }

    public void TexCoord2fVertex3fvSUN(@CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fVertex3fvSUN, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fVertex3fvSUN", e); }
    }

    public void TexCoord4fVertex4fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float p, @CType("GLfloat") float q, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord4fVertex4fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fSUN");
        try { Handles.MH_glTexCoord4fVertex4fSUN.invokeExact(handles.PFN_glTexCoord4fVertex4fSUN, s, t, p, q, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fVertex4fSUN", e); }
    }

    public void TexCoord4fVertex4fvSUN(@CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord4fVertex4fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fVertex4fvSUN");
        try { Handles.MH_glTexCoord4fVertex4fvSUN.invokeExact(handles.PFN_glTexCoord4fVertex4fvSUN, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fVertex4fvSUN", e); }
    }

    public void TexCoord2fColor4ubVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fColor4ubVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fSUN");
        try { Handles.MH_glTexCoord2fColor4ubVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fColor4ubVertex3fSUN, s, t, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4ubVertex3fSUN", e); }
    }

    public void TexCoord2fColor4ubVertex3fvSUN(@CType("const GLfloat *") MemorySegment tc, @CType("const GLubyte *") MemorySegment c, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fColor4ubVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4ubVertex3fvSUN");
        try { Handles.MH_glTexCoord2fColor4ubVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fColor4ubVertex3fvSUN, tc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4ubVertex3fvSUN", e); }
    }

    public void TexCoord2fColor3fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fColor3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fSUN");
        try { Handles.MH_glTexCoord2fColor3fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fColor3fVertex3fSUN, s, t, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor3fVertex3fSUN", e); }
    }

    public void TexCoord2fColor3fVertex3fvSUN(@CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fColor3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor3fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fColor3fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fColor3fVertex3fvSUN, tc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor3fVertex3fvSUN", e); }
    }

    public void TexCoord2fNormal3fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fSUN");
        try { Handles.MH_glTexCoord2fNormal3fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fNormal3fVertex3fSUN, s, t, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fNormal3fVertex3fSUN", e); }
    }

    public void TexCoord2fNormal3fVertex3fvSUN(@CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fNormal3fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fNormal3fVertex3fvSUN, tc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fNormal3fVertex3fvSUN", e); }
    }

    public void TexCoord2fColor4fNormal3fVertex3fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glTexCoord2fColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fSUN, s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4fNormal3fVertex3fSUN", e); }
    }

    public void TexCoord2fColor4fNormal3fVertex3fvSUN(@CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord2fColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glTexCoord2fColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glTexCoord2fColor4fNormal3fVertex3fvSUN, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord2fColor4fNormal3fVertex3fvSUN", e); }
    }

    public void TexCoord4fColor4fNormal3fVertex4fSUN(@CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float p, @CType("GLfloat") float q, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z, @CType("GLfloat") float w) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fSUN");
        try { Handles.MH_glTexCoord4fColor4fNormal3fVertex4fSUN.invokeExact(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fSUN, s, t, p, q, r, g, b, a, nx, ny, nz, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fColor4fNormal3fVertex4fSUN", e); }
    }

    public void TexCoord4fColor4fNormal3fVertex4fvSUN(@CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN)) throw new SymbolNotFoundError("Symbol not found: glTexCoord4fColor4fNormal3fVertex4fvSUN");
        try { Handles.MH_glTexCoord4fColor4fNormal3fVertex4fvSUN.invokeExact(handles.PFN_glTexCoord4fColor4fNormal3fVertex4fvSUN, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glTexCoord4fColor4fNormal3fVertex4fvSUN", e); }
    }

    public void ReplacementCodeuiVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiVertex3fSUN, rc, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiVertex3fSUN", e); }
    }

    public void ReplacementCodeuiVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiVertex3fvSUN, rc, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiVertex3fvSUN", e); }
    }

    public void ReplacementCodeuiColor4ubVertex3fSUN(@CType("GLuint") int rc, @CType("GLubyte") byte r, @CType("GLubyte") byte g, @CType("GLubyte") byte b, @CType("GLubyte") byte a, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiColor4ubVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiColor4ubVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4ubVertex3fSUN, rc, r, g, b, a, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4ubVertex3fSUN", e); }
    }

    public void ReplacementCodeuiColor4ubVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLubyte *") MemorySegment c, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiColor4ubVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4ubVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiColor4ubVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4ubVertex3fvSUN, rc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4ubVertex3fvSUN", e); }
    }

    public void ReplacementCodeuiColor3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiColor3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiColor3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiColor3fVertex3fSUN, rc, r, g, b, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor3fVertex3fSUN", e); }
    }

    public void ReplacementCodeuiColor3fVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiColor3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiColor3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiColor3fVertex3fvSUN, rc, c, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor3fVertex3fvSUN", e); }
    }

    public void ReplacementCodeuiNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiNormal3fVertex3fSUN, rc, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiNormal3fVertex3fSUN", e); }
    }

    public void ReplacementCodeuiNormal3fVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiNormal3fVertex3fvSUN, rc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiNormal3fVertex3fvSUN", e); }
    }

    public void ReplacementCodeuiColor4fNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fSUN, rc, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4fNormal3fVertex3fSUN", e); }
    }

    public void ReplacementCodeuiColor4fNormal3fVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiColor4fNormal3fVertex3fvSUN, rc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiColor4fNormal3fVertex3fvSUN", e); }
    }

    public void ReplacementCodeuiTexCoord2fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fSUN, rc, s, t, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fVertex3fSUN", e); }
    }

    public void ReplacementCodeuiTexCoord2fVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fVertex3fvSUN, rc, tc, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fVertex3fvSUN", e); }
    }

    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN, rc, s, t, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fNormal3fVertex3fSUN", e); }
    }

    public void ReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN, rc, tc, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fNormal3fVertex3fvSUN", e); }
    }

    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN(@CType("GLuint") int rc, @CType("GLfloat") float s, @CType("GLfloat") float t, @CType("GLfloat") float r, @CType("GLfloat") float g, @CType("GLfloat") float b, @CType("GLfloat") float a, @CType("GLfloat") float nx, @CType("GLfloat") float ny, @CType("GLfloat") float nz, @CType("GLfloat") float x, @CType("GLfloat") float y, @CType("GLfloat") float z) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN, rc, s, t, r, g, b, a, nx, ny, nz, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fSUN", e); }
    }

    public void ReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN(@CType("const GLuint *") MemorySegment rc, @CType("const GLfloat *") MemorySegment tc, @CType("const GLfloat *") MemorySegment c, @CType("const GLfloat *") MemorySegment n, @CType("const GLfloat *") MemorySegment v) {
        if (Unmarshal.isNullPointer(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN)) throw new SymbolNotFoundError("Symbol not found: glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN");
        try { Handles.MH_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN.invokeExact(handles.PFN_glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN, rc, tc, c, n, v); }
        catch (Throwable e) { throw new RuntimeException("error in glReplacementCodeuiTexCoord2fColor4fNormal3fVertex3fvSUN", e); }
    }

}
