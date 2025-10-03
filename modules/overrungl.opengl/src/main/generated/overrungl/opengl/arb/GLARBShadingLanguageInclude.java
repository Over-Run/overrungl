// This file is auto-generated. DO NOT EDIT!
package overrungl.opengl.arb;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.util.function.*;
import org.jspecify.annotations.*;
import overrungl.util.*;
import overrungl.opengl.*;
import static overrungl.internal.RuntimeHelper.*;
/// `GL_ARB_shading_language_include`
public final class GLARBShadingLanguageInclude {
    public static final int GL_SHADER_INCLUDE_ARB = 0x8DAE;
    public static final int GL_NAMED_STRING_LENGTH_ARB = 0x8DE9;
    public static final int GL_NAMED_STRING_TYPE_ARB = 0x8DEA;
    private final Handles handles;
    public static final class Handles {
        public static final Supplier<MethodHandle> MH_glNamedStringARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glDeleteNamedStringARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glCompileShaderIncludeARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glIsNamedStringARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetNamedStringARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)));
        public static final Supplier<MethodHandle> MH_glGetNamedStringivARB = StableValue.supplier(() -> downcallHandle(FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)));
        public final MemorySegment PFN_glNamedStringARB;
        public final MemorySegment PFN_glDeleteNamedStringARB;
        public final MemorySegment PFN_glCompileShaderIncludeARB;
        public final MemorySegment PFN_glIsNamedStringARB;
        public final MemorySegment PFN_glGetNamedStringARB;
        public final MemorySegment PFN_glGetNamedStringivARB;
        private Handles(GLLoadFunc func) {
            PFN_glNamedStringARB = func.invoke("glNamedStringARB");
            PFN_glDeleteNamedStringARB = func.invoke("glDeleteNamedStringARB");
            PFN_glCompileShaderIncludeARB = func.invoke("glCompileShaderIncludeARB");
            PFN_glIsNamedStringARB = func.invoke("glIsNamedStringARB");
            PFN_glGetNamedStringARB = func.invoke("glGetNamedStringARB");
            PFN_glGetNamedStringivARB = func.invoke("glGetNamedStringivARB");
        }
    }

    public GLARBShadingLanguageInclude(GLLoadFunc func) {
        this.handles = new Handles(func);
    }

    /// Invokes `glNamedStringARB`.
    /// ```
    /// void glNamedStringARB((unsigned int) GLenum type, (int) GLint namelen, const GLchar* name, (int) GLint stringlen, const GLchar* string);
    /// ```
    public void NamedStringARB(int type, int namelen, @NonNull MemorySegment name, int stringlen, @NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glNamedStringARB", type, namelen, name, stringlen, string); }
        Handles.MH_glNamedStringARB.get().invokeExact(handles.PFN_glNamedStringARB, type, namelen, name, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in NamedStringARB", e); }
    }

    /// Invokes `glDeleteNamedStringARB`.
    /// ```
    /// void glDeleteNamedStringARB((int) GLint namelen, const GLchar* name);
    /// ```
    public void DeleteNamedStringARB(int namelen, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glDeleteNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glDeleteNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glDeleteNamedStringARB", namelen, name); }
        Handles.MH_glDeleteNamedStringARB.get().invokeExact(handles.PFN_glDeleteNamedStringARB, namelen, name); }
        catch (Throwable e) { throw new RuntimeException("error in DeleteNamedStringARB", e); }
    }

    /// Invokes `glCompileShaderIncludeARB`.
    /// ```
    /// void glCompileShaderIncludeARB((unsigned int) GLuint shader, (int) GLsizei count, const GLchar* const * path, const GLint* length);
    /// ```
    public void CompileShaderIncludeARB(int shader, int count, @NonNull MemorySegment path, @NonNull MemorySegment length) {
        if (MemoryUtil.isNullPointer(handles.PFN_glCompileShaderIncludeARB)) throw new GLSymbolNotFoundError("Symbol not found: glCompileShaderIncludeARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glCompileShaderIncludeARB", shader, count, path, length); }
        Handles.MH_glCompileShaderIncludeARB.get().invokeExact(handles.PFN_glCompileShaderIncludeARB, shader, count, path, length); }
        catch (Throwable e) { throw new RuntimeException("error in CompileShaderIncludeARB", e); }
    }

    /// Invokes `glIsNamedStringARB`.
    /// ```
    /// GLboolean glIsNamedStringARB((int) GLint namelen, const GLchar* name);
    /// ```
    public boolean IsNamedStringARB(int namelen, @NonNull MemorySegment name) {
        if (MemoryUtil.isNullPointer(handles.PFN_glIsNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glIsNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glIsNamedStringARB", namelen, name); }
        return (((byte) Handles.MH_glIsNamedStringARB.get().invokeExact(handles.PFN_glIsNamedStringARB, namelen, name)) != 0); }
        catch (Throwable e) { throw new RuntimeException("error in IsNamedStringARB", e); }
    }

    /// Invokes `glGetNamedStringARB`.
    /// ```
    /// void glGetNamedStringARB((int) GLint namelen, const GLchar* name, (int) GLsizei bufSize, GLint* stringlen, GLchar* string);
    /// ```
    public void GetNamedStringARB(int namelen, @NonNull MemorySegment name, int bufSize, @NonNull MemorySegment stringlen, @NonNull MemorySegment string) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedStringARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedStringARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedStringARB", namelen, name, bufSize, stringlen, string); }
        Handles.MH_glGetNamedStringARB.get().invokeExact(handles.PFN_glGetNamedStringARB, namelen, name, bufSize, stringlen, string); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedStringARB", e); }
    }

    /// Invokes `glGetNamedStringivARB`.
    /// ```
    /// void glGetNamedStringivARB((int) GLint namelen, const GLchar* name, (unsigned int) GLenum pname, GLint* params);
    /// ```
    public void GetNamedStringivARB(int namelen, @NonNull MemorySegment name, int pname, @NonNull MemorySegment params) {
        if (MemoryUtil.isNullPointer(handles.PFN_glGetNamedStringivARB)) throw new GLSymbolNotFoundError("Symbol not found: glGetNamedStringivARB");
        try { if (TRACE_DOWNCALLS) { traceDowncall("glGetNamedStringivARB", namelen, name, pname, params); }
        Handles.MH_glGetNamedStringivARB.get().invokeExact(handles.PFN_glGetNamedStringivARB, namelen, name, pname, params); }
        catch (Throwable e) { throw new RuntimeException("error in GetNamedStringivARB", e); }
    }

}
