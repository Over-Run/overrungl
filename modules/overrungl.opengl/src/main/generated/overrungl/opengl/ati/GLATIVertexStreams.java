// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_vertex_streams`
public final class GLATIVertexStreams {
    public static final int GL_MAX_VERTEX_STREAMS_ATI = 0x876B;
    public static final int GL_VERTEX_STREAM0_ATI = 0x876C;
    public static final int GL_VERTEX_STREAM1_ATI = 0x876D;
    public static final int GL_VERTEX_STREAM2_ATI = 0x876E;
    public static final int GL_VERTEX_STREAM3_ATI = 0x876F;
    public static final int GL_VERTEX_STREAM4_ATI = 0x8770;
    public static final int GL_VERTEX_STREAM5_ATI = 0x8771;
    public static final int GL_VERTEX_STREAM6_ATI = 0x8772;
    public static final int GL_VERTEX_STREAM7_ATI = 0x8773;
    public static final int GL_VERTEX_SOURCE_ATI = 0x8774;
    private final Handles handles;
    public static final class Handles {
        public static final MethodHandle MH_glVertexStream1sATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream1svATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream1iATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream1ivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream1fATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream1fvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream1dATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream1dvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2sATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream2svATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2iATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream2ivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2fATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream2fvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream2dATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream2dvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3sATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream3svATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3iATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream3ivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3fATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream3fvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream3dATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream3dvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4sATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glVertexStream4svATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4iATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexStream4ivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4fATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glVertexStream4fvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glVertexStream4dATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glVertexStream4dvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3bATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE));
        public static final MethodHandle MH_glNormalStream3bvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3sATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT, ValueLayout.JAVA_SHORT));
        public static final MethodHandle MH_glNormalStream3svATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3iATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glNormalStream3ivATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3fATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT));
        public static final MethodHandle MH_glNormalStream3fvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glNormalStream3dATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE));
        public static final MethodHandle MH_glNormalStream3dvATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS));
        public static final MethodHandle MH_glClientActiveVertexStreamATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexBlendEnviATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT));
        public static final MethodHandle MH_glVertexBlendEnvfATI = downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_FLOAT));
        public final MemorySegment PFN_glVertexStream1sATI;
        public final MemorySegment PFN_glVertexStream1svATI;
        public final MemorySegment PFN_glVertexStream1iATI;
        public final MemorySegment PFN_glVertexStream1ivATI;
        public final MemorySegment PFN_glVertexStream1fATI;
        public final MemorySegment PFN_glVertexStream1fvATI;
        public final MemorySegment PFN_glVertexStream1dATI;
        public final MemorySegment PFN_glVertexStream1dvATI;
        public final MemorySegment PFN_glVertexStream2sATI;
        public final MemorySegment PFN_glVertexStream2svATI;
        public final MemorySegment PFN_glVertexStream2iATI;
        public final MemorySegment PFN_glVertexStream2ivATI;
        public final MemorySegment PFN_glVertexStream2fATI;
        public final MemorySegment PFN_glVertexStream2fvATI;
        public final MemorySegment PFN_glVertexStream2dATI;
        public final MemorySegment PFN_glVertexStream2dvATI;
        public final MemorySegment PFN_glVertexStream3sATI;
        public final MemorySegment PFN_glVertexStream3svATI;
        public final MemorySegment PFN_glVertexStream3iATI;
        public final MemorySegment PFN_glVertexStream3ivATI;
        public final MemorySegment PFN_glVertexStream3fATI;
        public final MemorySegment PFN_glVertexStream3fvATI;
        public final MemorySegment PFN_glVertexStream3dATI;
        public final MemorySegment PFN_glVertexStream3dvATI;
        public final MemorySegment PFN_glVertexStream4sATI;
        public final MemorySegment PFN_glVertexStream4svATI;
        public final MemorySegment PFN_glVertexStream4iATI;
        public final MemorySegment PFN_glVertexStream4ivATI;
        public final MemorySegment PFN_glVertexStream4fATI;
        public final MemorySegment PFN_glVertexStream4fvATI;
        public final MemorySegment PFN_glVertexStream4dATI;
        public final MemorySegment PFN_glVertexStream4dvATI;
        public final MemorySegment PFN_glNormalStream3bATI;
        public final MemorySegment PFN_glNormalStream3bvATI;
        public final MemorySegment PFN_glNormalStream3sATI;
        public final MemorySegment PFN_glNormalStream3svATI;
        public final MemorySegment PFN_glNormalStream3iATI;
        public final MemorySegment PFN_glNormalStream3ivATI;
        public final MemorySegment PFN_glNormalStream3fATI;
        public final MemorySegment PFN_glNormalStream3fvATI;
        public final MemorySegment PFN_glNormalStream3dATI;
        public final MemorySegment PFN_glNormalStream3dvATI;
        public final MemorySegment PFN_glClientActiveVertexStreamATI;
        public final MemorySegment PFN_glVertexBlendEnviATI;
        public final MemorySegment PFN_glVertexBlendEnvfATI;
        private Handles(GLLoadFunc func) {
            PFN_glVertexStream1sATI = func.invoke("glVertexStream1sATI");
            PFN_glVertexStream1svATI = func.invoke("glVertexStream1svATI");
            PFN_glVertexStream1iATI = func.invoke("glVertexStream1iATI");
            PFN_glVertexStream1ivATI = func.invoke("glVertexStream1ivATI");
            PFN_glVertexStream1fATI = func.invoke("glVertexStream1fATI");
            PFN_glVertexStream1fvATI = func.invoke("glVertexStream1fvATI");
            PFN_glVertexStream1dATI = func.invoke("glVertexStream1dATI");
            PFN_glVertexStream1dvATI = func.invoke("glVertexStream1dvATI");
            PFN_glVertexStream2sATI = func.invoke("glVertexStream2sATI");
            PFN_glVertexStream2svATI = func.invoke("glVertexStream2svATI");
            PFN_glVertexStream2iATI = func.invoke("glVertexStream2iATI");
            PFN_glVertexStream2ivATI = func.invoke("glVertexStream2ivATI");
            PFN_glVertexStream2fATI = func.invoke("glVertexStream2fATI");
            PFN_glVertexStream2fvATI = func.invoke("glVertexStream2fvATI");
            PFN_glVertexStream2dATI = func.invoke("glVertexStream2dATI");
            PFN_glVertexStream2dvATI = func.invoke("glVertexStream2dvATI");
            PFN_glVertexStream3sATI = func.invoke("glVertexStream3sATI");
            PFN_glVertexStream3svATI = func.invoke("glVertexStream3svATI");
            PFN_glVertexStream3iATI = func.invoke("glVertexStream3iATI");
            PFN_glVertexStream3ivATI = func.invoke("glVertexStream3ivATI");
            PFN_glVertexStream3fATI = func.invoke("glVertexStream3fATI");
            PFN_glVertexStream3fvATI = func.invoke("glVertexStream3fvATI");
            PFN_glVertexStream3dATI = func.invoke("glVertexStream3dATI");
            PFN_glVertexStream3dvATI = func.invoke("glVertexStream3dvATI");
            PFN_glVertexStream4sATI = func.invoke("glVertexStream4sATI");
            PFN_glVertexStream4svATI = func.invoke("glVertexStream4svATI");
            PFN_glVertexStream4iATI = func.invoke("glVertexStream4iATI");
            PFN_glVertexStream4ivATI = func.invoke("glVertexStream4ivATI");
            PFN_glVertexStream4fATI = func.invoke("glVertexStream4fATI");
            PFN_glVertexStream4fvATI = func.invoke("glVertexStream4fvATI");
            PFN_glVertexStream4dATI = func.invoke("glVertexStream4dATI");
            PFN_glVertexStream4dvATI = func.invoke("glVertexStream4dvATI");
            PFN_glNormalStream3bATI = func.invoke("glNormalStream3bATI");
            PFN_glNormalStream3bvATI = func.invoke("glNormalStream3bvATI");
            PFN_glNormalStream3sATI = func.invoke("glNormalStream3sATI");
            PFN_glNormalStream3svATI = func.invoke("glNormalStream3svATI");
            PFN_glNormalStream3iATI = func.invoke("glNormalStream3iATI");
            PFN_glNormalStream3ivATI = func.invoke("glNormalStream3ivATI");
            PFN_glNormalStream3fATI = func.invoke("glNormalStream3fATI");
            PFN_glNormalStream3fvATI = func.invoke("glNormalStream3fvATI");
            PFN_glNormalStream3dATI = func.invoke("glNormalStream3dATI");
            PFN_glNormalStream3dvATI = func.invoke("glNormalStream3dvATI");
            PFN_glClientActiveVertexStreamATI = func.invoke("glClientActiveVertexStreamATI");
            PFN_glVertexBlendEnviATI = func.invoke("glVertexBlendEnviATI");
            PFN_glVertexBlendEnvfATI = func.invoke("glVertexBlendEnvfATI");
        }
    }

    public GLATIVertexStreams(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glVertexStream1sATI`.
    /// ```
    /// void glVertexStream1sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x);
    /// ```
    public void VertexStream1sATI(int stream, short x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1sATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1sATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1sATI", stream, x); }
        Handles.MH_glVertexStream1sATI.invokeExact(handles.PFN_glVertexStream1sATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1sATI", e); }
    }

    /// Invokes `glVertexStream1svATI`.
    /// ```
    /// void glVertexStream1svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream1svATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1svATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1svATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1svATI", stream, coords); }
        Handles.MH_glVertexStream1svATI.invokeExact(handles.PFN_glVertexStream1svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1svATI", e); }
    }

    /// Invokes `glVertexStream1iATI`.
    /// ```
    /// void glVertexStream1iATI((unsigned int) GLenum stream, (int) GLint x);
    /// ```
    public void VertexStream1iATI(int stream, int x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1iATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1iATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1iATI", stream, x); }
        Handles.MH_glVertexStream1iATI.invokeExact(handles.PFN_glVertexStream1iATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1iATI", e); }
    }

    /// Invokes `glVertexStream1ivATI`.
    /// ```
    /// void glVertexStream1ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream1ivATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1ivATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1ivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1ivATI", stream, coords); }
        Handles.MH_glVertexStream1ivATI.invokeExact(handles.PFN_glVertexStream1ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1ivATI", e); }
    }

    /// Invokes `glVertexStream1fATI`.
    /// ```
    /// void glVertexStream1fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x);
    /// ```
    public void VertexStream1fATI(int stream, float x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1fATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1fATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1fATI", stream, x); }
        Handles.MH_glVertexStream1fATI.invokeExact(handles.PFN_glVertexStream1fATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1fATI", e); }
    }

    /// Invokes `glVertexStream1fvATI`.
    /// ```
    /// void glVertexStream1fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream1fvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1fvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1fvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1fvATI", stream, coords); }
        Handles.MH_glVertexStream1fvATI.invokeExact(handles.PFN_glVertexStream1fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1fvATI", e); }
    }

    /// Invokes `glVertexStream1dATI`.
    /// ```
    /// void glVertexStream1dATI((unsigned int) GLenum stream, (double) GLdouble x);
    /// ```
    public void VertexStream1dATI(int stream, double x) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1dATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1dATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1dATI", stream, x); }
        Handles.MH_glVertexStream1dATI.invokeExact(handles.PFN_glVertexStream1dATI, stream, x); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1dATI", e); }
    }

    /// Invokes `glVertexStream1dvATI`.
    /// ```
    /// void glVertexStream1dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream1dvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream1dvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream1dvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream1dvATI", stream, coords); }
        Handles.MH_glVertexStream1dvATI.invokeExact(handles.PFN_glVertexStream1dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream1dvATI", e); }
    }

    /// Invokes `glVertexStream2sATI`.
    /// ```
    /// void glVertexStream2sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y);
    /// ```
    public void VertexStream2sATI(int stream, short x, short y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2sATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2sATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2sATI", stream, x, y); }
        Handles.MH_glVertexStream2sATI.invokeExact(handles.PFN_glVertexStream2sATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2sATI", e); }
    }

    /// Invokes `glVertexStream2svATI`.
    /// ```
    /// void glVertexStream2svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream2svATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2svATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2svATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2svATI", stream, coords); }
        Handles.MH_glVertexStream2svATI.invokeExact(handles.PFN_glVertexStream2svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2svATI", e); }
    }

    /// Invokes `glVertexStream2iATI`.
    /// ```
    /// void glVertexStream2iATI((unsigned int) GLenum stream, (int) GLint x, (int) GLint y);
    /// ```
    public void VertexStream2iATI(int stream, int x, int y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2iATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2iATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2iATI", stream, x, y); }
        Handles.MH_glVertexStream2iATI.invokeExact(handles.PFN_glVertexStream2iATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2iATI", e); }
    }

    /// Invokes `glVertexStream2ivATI`.
    /// ```
    /// void glVertexStream2ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream2ivATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2ivATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2ivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2ivATI", stream, coords); }
        Handles.MH_glVertexStream2ivATI.invokeExact(handles.PFN_glVertexStream2ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2ivATI", e); }
    }

    /// Invokes `glVertexStream2fATI`.
    /// ```
    /// void glVertexStream2fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y);
    /// ```
    public void VertexStream2fATI(int stream, float x, float y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2fATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2fATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2fATI", stream, x, y); }
        Handles.MH_glVertexStream2fATI.invokeExact(handles.PFN_glVertexStream2fATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2fATI", e); }
    }

    /// Invokes `glVertexStream2fvATI`.
    /// ```
    /// void glVertexStream2fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream2fvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2fvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2fvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2fvATI", stream, coords); }
        Handles.MH_glVertexStream2fvATI.invokeExact(handles.PFN_glVertexStream2fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2fvATI", e); }
    }

    /// Invokes `glVertexStream2dATI`.
    /// ```
    /// void glVertexStream2dATI((unsigned int) GLenum stream, (double) GLdouble x, (double) GLdouble y);
    /// ```
    public void VertexStream2dATI(int stream, double x, double y) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2dATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2dATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2dATI", stream, x, y); }
        Handles.MH_glVertexStream2dATI.invokeExact(handles.PFN_glVertexStream2dATI, stream, x, y); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2dATI", e); }
    }

    /// Invokes `glVertexStream2dvATI`.
    /// ```
    /// void glVertexStream2dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream2dvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream2dvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream2dvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream2dvATI", stream, coords); }
        Handles.MH_glVertexStream2dvATI.invokeExact(handles.PFN_glVertexStream2dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream2dvATI", e); }
    }

    /// Invokes `glVertexStream3sATI`.
    /// ```
    /// void glVertexStream3sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z);
    /// ```
    public void VertexStream3sATI(int stream, short x, short y, short z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3sATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3sATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3sATI", stream, x, y, z); }
        Handles.MH_glVertexStream3sATI.invokeExact(handles.PFN_glVertexStream3sATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3sATI", e); }
    }

    /// Invokes `glVertexStream3svATI`.
    /// ```
    /// void glVertexStream3svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream3svATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3svATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3svATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3svATI", stream, coords); }
        Handles.MH_glVertexStream3svATI.invokeExact(handles.PFN_glVertexStream3svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3svATI", e); }
    }

    /// Invokes `glVertexStream3iATI`.
    /// ```
    /// void glVertexStream3iATI((unsigned int) GLenum stream, (int) GLint x, (int) GLint y, (int) GLint z);
    /// ```
    public void VertexStream3iATI(int stream, int x, int y, int z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3iATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3iATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3iATI", stream, x, y, z); }
        Handles.MH_glVertexStream3iATI.invokeExact(handles.PFN_glVertexStream3iATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3iATI", e); }
    }

    /// Invokes `glVertexStream3ivATI`.
    /// ```
    /// void glVertexStream3ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream3ivATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3ivATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3ivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3ivATI", stream, coords); }
        Handles.MH_glVertexStream3ivATI.invokeExact(handles.PFN_glVertexStream3ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3ivATI", e); }
    }

    /// Invokes `glVertexStream3fATI`.
    /// ```
    /// void glVertexStream3fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z);
    /// ```
    public void VertexStream3fATI(int stream, float x, float y, float z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3fATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3fATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3fATI", stream, x, y, z); }
        Handles.MH_glVertexStream3fATI.invokeExact(handles.PFN_glVertexStream3fATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3fATI", e); }
    }

    /// Invokes `glVertexStream3fvATI`.
    /// ```
    /// void glVertexStream3fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream3fvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3fvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3fvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3fvATI", stream, coords); }
        Handles.MH_glVertexStream3fvATI.invokeExact(handles.PFN_glVertexStream3fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3fvATI", e); }
    }

    /// Invokes `glVertexStream3dATI`.
    /// ```
    /// void glVertexStream3dATI((unsigned int) GLenum stream, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z);
    /// ```
    public void VertexStream3dATI(int stream, double x, double y, double z) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3dATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3dATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3dATI", stream, x, y, z); }
        Handles.MH_glVertexStream3dATI.invokeExact(handles.PFN_glVertexStream3dATI, stream, x, y, z); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3dATI", e); }
    }

    /// Invokes `glVertexStream3dvATI`.
    /// ```
    /// void glVertexStream3dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream3dvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream3dvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream3dvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream3dvATI", stream, coords); }
        Handles.MH_glVertexStream3dvATI.invokeExact(handles.PFN_glVertexStream3dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream3dvATI", e); }
    }

    /// Invokes `glVertexStream4sATI`.
    /// ```
    /// void glVertexStream4sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort x, ((signed short) khronos_int16_t) GLshort y, ((signed short) khronos_int16_t) GLshort z, ((signed short) khronos_int16_t) GLshort w);
    /// ```
    public void VertexStream4sATI(int stream, short x, short y, short z, short w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4sATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4sATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4sATI", stream, x, y, z, w); }
        Handles.MH_glVertexStream4sATI.invokeExact(handles.PFN_glVertexStream4sATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4sATI", e); }
    }

    /// Invokes `glVertexStream4svATI`.
    /// ```
    /// void glVertexStream4svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void VertexStream4svATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4svATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4svATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4svATI", stream, coords); }
        Handles.MH_glVertexStream4svATI.invokeExact(handles.PFN_glVertexStream4svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4svATI", e); }
    }

    /// Invokes `glVertexStream4iATI`.
    /// ```
    /// void glVertexStream4iATI((unsigned int) GLenum stream, (int) GLint x, (int) GLint y, (int) GLint z, (int) GLint w);
    /// ```
    public void VertexStream4iATI(int stream, int x, int y, int z, int w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4iATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4iATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4iATI", stream, x, y, z, w); }
        Handles.MH_glVertexStream4iATI.invokeExact(handles.PFN_glVertexStream4iATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4iATI", e); }
    }

    /// Invokes `glVertexStream4ivATI`.
    /// ```
    /// void glVertexStream4ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void VertexStream4ivATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4ivATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4ivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4ivATI", stream, coords); }
        Handles.MH_glVertexStream4ivATI.invokeExact(handles.PFN_glVertexStream4ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4ivATI", e); }
    }

    /// Invokes `glVertexStream4fATI`.
    /// ```
    /// void glVertexStream4fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat x, ((float) khronos_float_t) GLfloat y, ((float) khronos_float_t) GLfloat z, ((float) khronos_float_t) GLfloat w);
    /// ```
    public void VertexStream4fATI(int stream, float x, float y, float z, float w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4fATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4fATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4fATI", stream, x, y, z, w); }
        Handles.MH_glVertexStream4fATI.invokeExact(handles.PFN_glVertexStream4fATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4fATI", e); }
    }

    /// Invokes `glVertexStream4fvATI`.
    /// ```
    /// void glVertexStream4fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void VertexStream4fvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4fvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4fvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4fvATI", stream, coords); }
        Handles.MH_glVertexStream4fvATI.invokeExact(handles.PFN_glVertexStream4fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4fvATI", e); }
    }

    /// Invokes `glVertexStream4dATI`.
    /// ```
    /// void glVertexStream4dATI((unsigned int) GLenum stream, (double) GLdouble x, (double) GLdouble y, (double) GLdouble z, (double) GLdouble w);
    /// ```
    public void VertexStream4dATI(int stream, double x, double y, double z, double w) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4dATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4dATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4dATI", stream, x, y, z, w); }
        Handles.MH_glVertexStream4dATI.invokeExact(handles.PFN_glVertexStream4dATI, stream, x, y, z, w); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4dATI", e); }
    }

    /// Invokes `glVertexStream4dvATI`.
    /// ```
    /// void glVertexStream4dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void VertexStream4dvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexStream4dvATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexStream4dvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexStream4dvATI", stream, coords); }
        Handles.MH_glVertexStream4dvATI.invokeExact(handles.PFN_glVertexStream4dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in VertexStream4dvATI", e); }
    }

    /// Invokes `glNormalStream3bATI`.
    /// ```
    /// void glNormalStream3bATI((unsigned int) GLenum stream, ((signed char) khronos_int8_t) GLbyte nx, ((signed char) khronos_int8_t) GLbyte ny, ((signed char) khronos_int8_t) GLbyte nz);
    /// ```
    public void NormalStream3bATI(int stream, byte nx, byte ny, byte nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3bATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3bATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3bATI", stream, nx, ny, nz); }
        Handles.MH_glNormalStream3bATI.invokeExact(handles.PFN_glNormalStream3bATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3bATI", e); }
    }

    /// Invokes `glNormalStream3bvATI`.
    /// ```
    /// void glNormalStream3bvATI((unsigned int) GLenum stream, const GLbyte* coords);
    /// ```
    public void NormalStream3bvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3bvATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3bvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3bvATI", stream, coords); }
        Handles.MH_glNormalStream3bvATI.invokeExact(handles.PFN_glNormalStream3bvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3bvATI", e); }
    }

    /// Invokes `glNormalStream3sATI`.
    /// ```
    /// void glNormalStream3sATI((unsigned int) GLenum stream, ((signed short) khronos_int16_t) GLshort nx, ((signed short) khronos_int16_t) GLshort ny, ((signed short) khronos_int16_t) GLshort nz);
    /// ```
    public void NormalStream3sATI(int stream, short nx, short ny, short nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3sATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3sATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3sATI", stream, nx, ny, nz); }
        Handles.MH_glNormalStream3sATI.invokeExact(handles.PFN_glNormalStream3sATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3sATI", e); }
    }

    /// Invokes `glNormalStream3svATI`.
    /// ```
    /// void glNormalStream3svATI((unsigned int) GLenum stream, const GLshort* coords);
    /// ```
    public void NormalStream3svATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3svATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3svATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3svATI", stream, coords); }
        Handles.MH_glNormalStream3svATI.invokeExact(handles.PFN_glNormalStream3svATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3svATI", e); }
    }

    /// Invokes `glNormalStream3iATI`.
    /// ```
    /// void glNormalStream3iATI((unsigned int) GLenum stream, (int) GLint nx, (int) GLint ny, (int) GLint nz);
    /// ```
    public void NormalStream3iATI(int stream, int nx, int ny, int nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3iATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3iATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3iATI", stream, nx, ny, nz); }
        Handles.MH_glNormalStream3iATI.invokeExact(handles.PFN_glNormalStream3iATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3iATI", e); }
    }

    /// Invokes `glNormalStream3ivATI`.
    /// ```
    /// void glNormalStream3ivATI((unsigned int) GLenum stream, const GLint* coords);
    /// ```
    public void NormalStream3ivATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3ivATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3ivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3ivATI", stream, coords); }
        Handles.MH_glNormalStream3ivATI.invokeExact(handles.PFN_glNormalStream3ivATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3ivATI", e); }
    }

    /// Invokes `glNormalStream3fATI`.
    /// ```
    /// void glNormalStream3fATI((unsigned int) GLenum stream, ((float) khronos_float_t) GLfloat nx, ((float) khronos_float_t) GLfloat ny, ((float) khronos_float_t) GLfloat nz);
    /// ```
    public void NormalStream3fATI(int stream, float nx, float ny, float nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3fATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3fATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3fATI", stream, nx, ny, nz); }
        Handles.MH_glNormalStream3fATI.invokeExact(handles.PFN_glNormalStream3fATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3fATI", e); }
    }

    /// Invokes `glNormalStream3fvATI`.
    /// ```
    /// void glNormalStream3fvATI((unsigned int) GLenum stream, const GLfloat* coords);
    /// ```
    public void NormalStream3fvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3fvATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3fvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3fvATI", stream, coords); }
        Handles.MH_glNormalStream3fvATI.invokeExact(handles.PFN_glNormalStream3fvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3fvATI", e); }
    }

    /// Invokes `glNormalStream3dATI`.
    /// ```
    /// void glNormalStream3dATI((unsigned int) GLenum stream, (double) GLdouble nx, (double) GLdouble ny, (double) GLdouble nz);
    /// ```
    public void NormalStream3dATI(int stream, double nx, double ny, double nz) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3dATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3dATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3dATI", stream, nx, ny, nz); }
        Handles.MH_glNormalStream3dATI.invokeExact(handles.PFN_glNormalStream3dATI, stream, nx, ny, nz); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3dATI", e); }
    }

    /// Invokes `glNormalStream3dvATI`.
    /// ```
    /// void glNormalStream3dvATI((unsigned int) GLenum stream, const GLdouble* coords);
    /// ```
    public void NormalStream3dvATI(int stream, @NonNull MemorySegment coords) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNormalStream3dvATI)) throw new GLSymbolNotFoundError("Symbol not found: glNormalStream3dvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNormalStream3dvATI", stream, coords); }
        Handles.MH_glNormalStream3dvATI.invokeExact(handles.PFN_glNormalStream3dvATI, stream, coords); }
        catch (Throwable e) { throw new RuntimeException("error in NormalStream3dvATI", e); }
    }

    /// Invokes `glClientActiveVertexStreamATI`.
    /// ```
    /// void glClientActiveVertexStreamATI((unsigned int) GLenum stream);
    /// ```
    public void ClientActiveVertexStreamATI(int stream) {
        if (MemoryUtil.isNullPointer(handles.PFN_glClientActiveVertexStreamATI)) throw new GLSymbolNotFoundError("Symbol not found: glClientActiveVertexStreamATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glClientActiveVertexStreamATI", stream); }
        Handles.MH_glClientActiveVertexStreamATI.invokeExact(handles.PFN_glClientActiveVertexStreamATI, stream); }
        catch (Throwable e) { throw new RuntimeException("error in ClientActiveVertexStreamATI", e); }
    }

    /// Invokes `glVertexBlendEnviATI`.
    /// ```
    /// void glVertexBlendEnviATI((unsigned int) GLenum pname, (int) GLint param);
    /// ```
    public void VertexBlendEnviATI(int pname, int param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBlendEnviATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexBlendEnviATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexBlendEnviATI", pname, param); }
        Handles.MH_glVertexBlendEnviATI.invokeExact(handles.PFN_glVertexBlendEnviATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBlendEnviATI", e); }
    }

    /// Invokes `glVertexBlendEnvfATI`.
    /// ```
    /// void glVertexBlendEnvfATI((unsigned int) GLenum pname, ((float) khronos_float_t) GLfloat param);
    /// ```
    public void VertexBlendEnvfATI(int pname, float param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glVertexBlendEnvfATI)) throw new GLSymbolNotFoundError("Symbol not found: glVertexBlendEnvfATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glVertexBlendEnvfATI", pname, param); }
        Handles.MH_glVertexBlendEnvfATI.invokeExact(handles.PFN_glVertexBlendEnvfATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in VertexBlendEnvfATI", e); }
    }

}
