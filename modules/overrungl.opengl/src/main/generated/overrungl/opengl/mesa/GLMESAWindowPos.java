// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.mesa;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_MESA_window_pos`
public final class GLMESAWindowPos {
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glWindowPos2dMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glWindowPos2dvMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos2fMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glWindowPos2fvMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos2iMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glWindowPos2ivMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos2sMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glWindowPos2svMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos3dMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glWindowPos3dvMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos3fMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glWindowPos3fvMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos3iMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glWindowPos3ivMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos3sMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glWindowPos3svMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos4dMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)));
        public static final Supplier<MethodHandle> MH_glWindowPos4dvMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos4fMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT)));
        public static final Supplier<MethodHandle> MH_glWindowPos4fvMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos4iMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)));
        public static final Supplier<MethodHandle> MH_glWindowPos4ivMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glWindowPos4sMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT)));
        public static final Supplier<MethodHandle> MH_glWindowPos4svMESA = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glWindowPos2dMESA;
        public final MemorySegment PFN_glWindowPos2dvMESA;
        public final MemorySegment PFN_glWindowPos2fMESA;
        public final MemorySegment PFN_glWindowPos2fvMESA;
        public final MemorySegment PFN_glWindowPos2iMESA;
        public final MemorySegment PFN_glWindowPos2ivMESA;
        public final MemorySegment PFN_glWindowPos2sMESA;
        public final MemorySegment PFN_glWindowPos2svMESA;
        public final MemorySegment PFN_glWindowPos3dMESA;
        public final MemorySegment PFN_glWindowPos3dvMESA;
        public final MemorySegment PFN_glWindowPos3fMESA;
        public final MemorySegment PFN_glWindowPos3fvMESA;
        public final MemorySegment PFN_glWindowPos3iMESA;
        public final MemorySegment PFN_glWindowPos3ivMESA;
        public final MemorySegment PFN_glWindowPos3sMESA;
        public final MemorySegment PFN_glWindowPos3svMESA;
        public final MemorySegment PFN_glWindowPos4dMESA;
        public final MemorySegment PFN_glWindowPos4dvMESA;
        public final MemorySegment PFN_glWindowPos4fMESA;
        public final MemorySegment PFN_glWindowPos4fvMESA;
        public final MemorySegment PFN_glWindowPos4iMESA;
        public final MemorySegment PFN_glWindowPos4ivMESA;
        public final MemorySegment PFN_glWindowPos4sMESA;
        public final MemorySegment PFN_glWindowPos4svMESA;
        private Handles(GLLoadFunc func) {
            PFN_glWindowPos2dMESA = func.invoke("glWindowPos2dMESA", "glWindowPos2d");
            PFN_glWindowPos2dvMESA = func.invoke("glWindowPos2dvMESA", "glWindowPos2dv");
            PFN_glWindowPos2fMESA = func.invoke("glWindowPos2fMESA", "glWindowPos2f");
            PFN_glWindowPos2fvMESA = func.invoke("glWindowPos2fvMESA", "glWindowPos2fv");
            PFN_glWindowPos2iMESA = func.invoke("glWindowPos2iMESA", "glWindowPos2i");
            PFN_glWindowPos2ivMESA = func.invoke("glWindowPos2ivMESA", "glWindowPos2iv");
            PFN_glWindowPos2sMESA = func.invoke("glWindowPos2sMESA", "glWindowPos2s");
            PFN_glWindowPos2svMESA = func.invoke("glWindowPos2svMESA", "glWindowPos2sv");
            PFN_glWindowPos3dMESA = func.invoke("glWindowPos3dMESA", "glWindowPos3d");
            PFN_glWindowPos3dvMESA = func.invoke("glWindowPos3dvMESA", "glWindowPos3dv");
            PFN_glWindowPos3fMESA = func.invoke("glWindowPos3fMESA", "glWindowPos3f");
            PFN_glWindowPos3fvMESA = func.invoke("glWindowPos3fvMESA", "glWindowPos3fv");
            PFN_glWindowPos3iMESA = func.invoke("glWindowPos3iMESA", "glWindowPos3i");
            PFN_glWindowPos3ivMESA = func.invoke("glWindowPos3ivMESA", "glWindowPos3iv");
            PFN_glWindowPos3sMESA = func.invoke("glWindowPos3sMESA", "glWindowPos3s");
            PFN_glWindowPos3svMESA = func.invoke("glWindowPos3svMESA", "glWindowPos3sv");
            PFN_glWindowPos4dMESA = func.invoke("glWindowPos4dMESA");
            PFN_glWindowPos4dvMESA = func.invoke("glWindowPos4dvMESA");
            PFN_glWindowPos4fMESA = func.invoke("glWindowPos4fMESA");
            PFN_glWindowPos4fvMESA = func.invoke("glWindowPos4fvMESA");
            PFN_glWindowPos4iMESA = func.invoke("glWindowPos4iMESA");
            PFN_glWindowPos4ivMESA = func.invoke("glWindowPos4ivMESA");
            PFN_glWindowPos4sMESA = func.invoke("glWindowPos4sMESA");
            PFN_glWindowPos4svMESA = func.invoke("glWindowPos4svMESA");
        }
    }

    public GLMESAWindowPos(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glWindowPos2dMESA`.
    /// ```
    /// void glWindowPos2dMESA((double) GLdouble x, (double) GLdouble y);
    /// ```
    public void WindowPos2dMESA(double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2dMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2dMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2dMESA", x, y); }
        Handles.MH_glWindowPos2dMESA.get().invokeExact(handles.PFN_glWindowPos2dMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2dMESA", e); }
    }

    /// Invokes `glWindowPos2dvMESA`.
    /// ```
    /// void glWindowPos2dvMESA(const GLdouble* v);
    /// ```
    public void WindowPos2dvMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2dvMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2dvMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2dvMESA", v); }
        Handles.MH_glWindowPos2dvMESA.get().invokeExact(handles.PFN_glWindowPos2dvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2dvMESA", e); }
    }

    /// Invokes `glWindowPos2fMESA`.
    /// ```
    /// void glWindowPos2fMESA(((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void WindowPos2fMESA(float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2fMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2fMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2fMESA", x, y); }
        Handles.MH_glWindowPos2fMESA.get().invokeExact(handles.PFN_glWindowPos2fMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2fMESA", e); }
    }

    /// Invokes `glWindowPos2fvMESA`.
    /// ```
    /// void glWindowPos2fvMESA(const GLfloat* v);
    /// ```
    public void WindowPos2fvMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2fvMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2fvMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2fvMESA", v); }
        Handles.MH_glWindowPos2fvMESA.get().invokeExact(handles.PFN_glWindowPos2fvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2fvMESA", e); }
    }

    /// Invokes `glWindowPos2iMESA`.
    /// ```
    /// void glWindowPos2iMESA((int) GLint x, (int) GLint y);
    /// ```
    public void WindowPos2iMESA(int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2iMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2iMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2iMESA", x, y); }
        Handles.MH_glWindowPos2iMESA.get().invokeExact(handles.PFN_glWindowPos2iMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2iMESA", e); }
    }

    /// Invokes `glWindowPos2ivMESA`.
    /// ```
    /// void glWindowPos2ivMESA(const GLint* v);
    /// ```
    public void WindowPos2ivMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2ivMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2ivMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2ivMESA", v); }
        Handles.MH_glWindowPos2ivMESA.get().invokeExact(handles.PFN_glWindowPos2ivMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2ivMESA", e); }
    }

    /// Invokes `glWindowPos2sMESA`.
    /// ```
    /// void glWindowPos2sMESA(((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void WindowPos2sMESA(short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2sMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2sMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2sMESA", x, y); }
        Handles.MH_glWindowPos2sMESA.get().invokeExact(handles.PFN_glWindowPos2sMESA, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2sMESA", e); }
    }

    /// Invokes `glWindowPos2svMESA`.
    /// ```
    /// void glWindowPos2svMESA(const GLshort* v);
    /// ```
    public void WindowPos2svMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos2svMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos2svMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos2svMESA", v); }
        Handles.MH_glWindowPos2svMESA.get().invokeExact(handles.PFN_glWindowPos2svMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos2svMESA", e); }
    }

    /// Invokes `glWindowPos3dMESA`.
    /// ```
    /// void glWindowPos3dMESA((double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void WindowPos3dMESA(double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3dMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3dMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3dMESA", x, y, z); }
        Handles.MH_glWindowPos3dMESA.get().invokeExact(handles.PFN_glWindowPos3dMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3dMESA", e); }
    }

    /// Invokes `glWindowPos3dvMESA`.
    /// ```
    /// void glWindowPos3dvMESA(const GLdouble* v);
    /// ```
    public void WindowPos3dvMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3dvMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3dvMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3dvMESA", v); }
        Handles.MH_glWindowPos3dvMESA.get().invokeExact(handles.PFN_glWindowPos3dvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3dvMESA", e); }
    }

    /// Invokes `glWindowPos3fMESA`.
    /// ```
    /// void glWindowPos3fMESA(((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void WindowPos3fMESA(float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3fMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3fMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3fMESA", x, y, z); }
        Handles.MH_glWindowPos3fMESA.get().invokeExact(handles.PFN_glWindowPos3fMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3fMESA", e); }
    }

    /// Invokes `glWindowPos3fvMESA`.
    /// ```
    /// void glWindowPos3fvMESA(const GLfloat* v);
    /// ```
    public void WindowPos3fvMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3fvMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3fvMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3fvMESA", v); }
        Handles.MH_glWindowPos3fvMESA.get().invokeExact(handles.PFN_glWindowPos3fvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3fvMESA", e); }
    }

    /// Invokes `glWindowPos3iMESA`.
    /// ```
    /// void glWindowPos3iMESA((int) GLint x, (int) GLint y, (int) GLint z);
    /// ```
    public void WindowPos3iMESA(int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3iMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3iMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3iMESA", x, y, z); }
        Handles.MH_glWindowPos3iMESA.get().invokeExact(handles.PFN_glWindowPos3iMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3iMESA", e); }
    }

    /// Invokes `glWindowPos3ivMESA`.
    /// ```
    /// void glWindowPos3ivMESA(const GLint* v);
    /// ```
    public void WindowPos3ivMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3ivMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3ivMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3ivMESA", v); }
        Handles.MH_glWindowPos3ivMESA.get().invokeExact(handles.PFN_glWindowPos3ivMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3ivMESA", e); }
    }

    /// Invokes `glWindowPos3sMESA`.
    /// ```
    /// void glWindowPos3sMESA(((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void WindowPos3sMESA(short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3sMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3sMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3sMESA", x, y, z); }
        Handles.MH_glWindowPos3sMESA.get().invokeExact(handles.PFN_glWindowPos3sMESA, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3sMESA", e); }
    }

    /// Invokes `glWindowPos3svMESA`.
    /// ```
    /// void glWindowPos3svMESA(const GLshort* v);
    /// ```
    public void WindowPos3svMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos3svMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos3svMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos3svMESA", v); }
        Handles.MH_glWindowPos3svMESA.get().invokeExact(handles.PFN_glWindowPos3svMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos3svMESA", e); }
    }

    /// Invokes `glWindowPos4dMESA`.
    /// ```
    /// void glWindowPos4dMESA((double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void WindowPos4dMESA(double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4dMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4dMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4dMESA", x, y, z, w); }
        Handles.MH_glWindowPos4dMESA.get().invokeExact(handles.PFN_glWindowPos4dMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4dMESA", e); }
    }

    /// Invokes `glWindowPos4dvMESA`.
    /// ```
    /// void glWindowPos4dvMESA(const GLdouble* v);
    /// ```
    public void WindowPos4dvMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4dvMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4dvMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4dvMESA", v); }
        Handles.MH_glWindowPos4dvMESA.get().invokeExact(handles.PFN_glWindowPos4dvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4dvMESA", e); }
    }

    /// Invokes `glWindowPos4fMESA`.
    /// ```
    /// void glWindowPos4fMESA(((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void WindowPos4fMESA(float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4fMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4fMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4fMESA", x, y, z, w); }
        Handles.MH_glWindowPos4fMESA.get().invokeExact(handles.PFN_glWindowPos4fMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4fMESA", e); }
    }

    /// Invokes `glWindowPos4fvMESA`.
    /// ```
    /// void glWindowPos4fvMESA(const GLfloat* v);
    /// ```
    public void WindowPos4fvMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4fvMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4fvMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4fvMESA", v); }
        Handles.MH_glWindowPos4fvMESA.get().invokeExact(handles.PFN_glWindowPos4fvMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4fvMESA", e); }
    }

    /// Invokes `glWindowPos4iMESA`.
    /// ```
    /// void glWindowPos4iMESA((int) GLint x, (int) GLint y, (int) GLint z, (int) GLint w);
    /// ```
    public void WindowPos4iMESA(int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4iMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4iMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4iMESA", x, y, z, w); }
        Handles.MH_glWindowPos4iMESA.get().invokeExact(handles.PFN_glWindowPos4iMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4iMESA", e); }
    }

    /// Invokes `glWindowPos4ivMESA`.
    /// ```
    /// void glWindowPos4ivMESA(const GLint* v);
    /// ```
    public void WindowPos4ivMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4ivMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4ivMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4ivMESA", v); }
        Handles.MH_glWindowPos4ivMESA.get().invokeExact(handles.PFN_glWindowPos4ivMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4ivMESA", e); }
    }

    /// Invokes `glWindowPos4sMESA`.
    /// ```
    /// void glWindowPos4sMESA(((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z, ((signed short) khronos_int16_t) GLshort w);
    /// ```
    public void WindowPos4sMESA(short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4sMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4sMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4sMESA", x, y, z, w); }
        Handles.MH_glWindowPos4sMESA.get().invokeExact(handles.PFN_glWindowPos4sMESA, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4sMESA", e); }
    }

    /// Invokes `glWindowPos4svMESA`.
    /// ```
    /// void glWindowPos4svMESA(const GLshort* v);
    /// ```
    public void WindowPos4svMESA(@NonNull MemorySegment v) {
        if (MemoryUtil.isNullPointer(handles.PFN_glWindowPos4svMESA)) throw new GLSymbolNotFoundError("Symbol not found: glWindowPos4svMESA");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glWindowPos4svMESA", v); }
        Handles.MH_glWindowPos4svMESA.get().invokeExact(handles.PFN_glWindowPos4svMESA, v); }
        catch (Throwable e) { throw new RuntimeException("error in WindowPos4svMESA", e); }
    }

}
