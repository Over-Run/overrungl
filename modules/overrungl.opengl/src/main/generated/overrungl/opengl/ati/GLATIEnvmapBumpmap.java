// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.ati;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ATI_envmap_bumpmap`
public final class GLATIEnvmapBumpmap {
    public static final int GL_BUMP_ROT_MATRIX_ATI = 0x8775;
    public static final int GL_BUMP_ROT_MATRIX_SIZE_ATI = 0x8776;
    public static final int GL_BUMP_NUM_TEX_UNITS_ATI = 0x8777;
    public static final int GL_BUMP_TEX_UNITS_ATI = 0x8778;
    public static final int GL_DUDV_ATI = 0x8779;
    public static final int GL_DU8DV8_ATI = 0x877A;
    public static final int GL_BUMP_ENVMAP_ATI = 0x877B;
    public static final int GL_BUMP_TARGET_ATI = 0x877C;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glTexBumpParameterivATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glTexBumpParameterfvATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetTexBumpParameterivATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetTexBumpParameterfvATI = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glTexBumpParameterivATI;
        public final MemorySegment PFN_glTexBumpParameterfvATI;
        public final MemorySegment PFN_glGetTexBumpParameterivATI;
        public final MemorySegment PFN_glGetTexBumpParameterfvATI;
        private Handles(GLLoadFunc func) {
            PFN_glTexBumpParameterivATI = func.invoke("glTexBumpParameterivATI");
            PFN_glTexBumpParameterfvATI = func.invoke("glTexBumpParameterfvATI");
            PFN_glGetTexBumpParameterivATI = func.invoke("glGetTexBumpParameterivATI");
            PFN_glGetTexBumpParameterfvATI = func.invoke("glGetTexBumpParameterfvATI");
        }
    }

    public GLATIEnvmapBumpmap(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glTexBumpParameterivATI`.
    /// ```
    /// void glTexBumpParameterivATI((unsigned int) GLenum pname, const GLint* param);
    /// ```
    public void TexBumpParameterivATI(int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBumpParameterivATI)) throw new GLSymbolNotFoundError("Symbol not found: glTexBumpParameterivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexBumpParameterivATI", pname, param); }
        Handles.MH_glTexBumpParameterivATI.get().invokeExact(handles.PFN_glTexBumpParameterivATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexBumpParameterivATI", e); }
    }

    /// Invokes `glTexBumpParameterfvATI`.
    /// ```
    /// void glTexBumpParameterfvATI((unsigned int) GLenum pname, const GLfloat* param);
    /// ```
    public void TexBumpParameterfvATI(int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glTexBumpParameterfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glTexBumpParameterfvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glTexBumpParameterfvATI", pname, param); }
        Handles.MH_glTexBumpParameterfvATI.get().invokeExact(handles.PFN_glTexBumpParameterfvATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in TexBumpParameterfvATI", e); }
    }

    /// Invokes `glGetTexBumpParameterivATI`.
    /// ```
    /// void glGetTexBumpParameterivATI((unsigned int) GLenum pname, GLint* param);
    /// ```
    public void GetTexBumpParameterivATI(int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexBumpParameterivATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexBumpParameterivATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexBumpParameterivATI", pname, param); }
        Handles.MH_glGetTexBumpParameterivATI.get().invokeExact(handles.PFN_glGetTexBumpParameterivATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexBumpParameterivATI", e); }
    }

    /// Invokes `glGetTexBumpParameterfvATI`.
    /// ```
    /// void glGetTexBumpParameterfvATI((unsigned int) GLenum pname, GLfloat* param);
    /// ```
    public void GetTexBumpParameterfvATI(int pname, @NonNull MemorySegment param) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetTexBumpParameterfvATI)) throw new GLSymbolNotFoundError("Symbol not found: glGetTexBumpParameterfvATI");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetTexBumpParameterfvATI", pname, param); }
        Handles.MH_glGetTexBumpParameterfvATI.get().invokeExact(handles.PFN_glGetTexBumpParameterfvATI, pname, param); }
        catch (Throwable e) { throw new RuntimeException("error in GetTexBumpParameterfvATI", e); }
    }

}
