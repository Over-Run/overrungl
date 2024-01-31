/*
 * MIT License
 *
 * Copyright (c) 2022-2024 Overrun Organization
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

package overrungl.opengl;

import overrun.marshal.Unmarshal;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.regex.Pattern;

/**
 * The OpenGL capabilities.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class GLCapabilities {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^(\\d+)\\.(\\d+).*$");
    /**
     * OpenGL 2.0 method handles
     */
    public MethodHandle glAttachShader, glBindAttribLocation, glBlendEquationSeparate, glCompileShader, glCreateProgram, glCreateShader,
        glDeleteProgram, glDeleteShader, glDetachShader, glDisableVertexAttribArray, glDrawBuffers, glEnableVertexAttribArray,
        glGetActiveAttrib, glGetActiveUniform, glGetAttachedShaders, glGetAttribLocation, glGetProgramInfoLog, glGetProgramiv,
        glGetShaderInfoLog, glGetShaderSource, glGetShaderiv, glGetUniformLocation, glGetUniformfv, glGetUniformiv,
        glGetVertexAttribPointerv, glGetVertexAttribdv, glGetVertexAttribfv, glGetVertexAttribiv, glIsProgram, glIsShader,
        glLinkProgram, glShaderSource, glStencilFuncSeparate, glStencilMaskSeparate, glStencilOpSeparate, glUniform1f,
        glUniform1fv, glUniform1i, glUniform1iv, glUniform2f, glUniform2fv, glUniform2i, glUniform2iv, glUniform3f,
        glUniform3fv, glUniform3i, glUniform3iv, glUniform4f, glUniform4fv, glUniform4i, glUniform4iv, glUniformMatrix2fv,
        glUniformMatrix3fv, glUniformMatrix4fv, glUseProgram, glValidateProgram, glVertexAttrib1d, glVertexAttrib1dv,
        glVertexAttrib1f, glVertexAttrib1fv, glVertexAttrib1s, glVertexAttrib1sv, glVertexAttrib2d, glVertexAttrib2dv,
        glVertexAttrib2f, glVertexAttrib2fv, glVertexAttrib2s, glVertexAttrib2sv, glVertexAttrib3d, glVertexAttrib3dv,
        glVertexAttrib3f, glVertexAttrib3fv, glVertexAttrib3s, glVertexAttrib3sv, glVertexAttrib4Nbv, glVertexAttrib4Niv,
        glVertexAttrib4Nsv, glVertexAttrib4Nub, glVertexAttrib4Nubv, glVertexAttrib4Nuiv, glVertexAttrib4Nusv, glVertexAttrib4bv,
        glVertexAttrib4d, glVertexAttrib4dv, glVertexAttrib4f, glVertexAttrib4fv, glVertexAttrib4iv, glVertexAttrib4s,
        glVertexAttrib4sv, glVertexAttrib4ubv, glVertexAttrib4uiv, glVertexAttrib4usv, glVertexAttribPointer;
    /**
     * OpenGL 3.0 method handles
     */
    public MethodHandle glBeginConditionalRender, glBeginTransformFeedback, glBindBufferBase, glBindBufferRange, glBindFragDataLocation, glBindFramebuffer,
        glBindRenderbuffer, glBindVertexArray, glBlitFramebuffer, glCheckFramebufferStatus, glClampColor, glClearBufferfi,
        glClearBufferfv, glClearBufferiv, glClearBufferuiv, glColorMaski, glDeleteFramebuffers, glDeleteRenderbuffers,
        glDeleteVertexArrays, glDisablei, glEnablei, glEndConditionalRender, glEndTransformFeedback, glFlushMappedBufferRange,
        glFramebufferRenderbuffer, glFramebufferTexture1D, glFramebufferTexture2D, glFramebufferTexture3D, glFramebufferTextureLayer, glGenFramebuffers,
        glGenRenderbuffers, glGenVertexArrays, glGenerateMipmap, glGetBooleani_v, glGetFragDataLocation, glGetFramebufferAttachmentParameteriv,
        glGetIntegeri_v, glGetRenderbufferParameteriv, glGetStringi, glGetTexParameterIiv, glGetTexParameterIuiv, glGetTransformFeedbackVarying,
        glGetUniformuiv, glGetVertexAttribIiv, glGetVertexAttribIuiv, glIsEnabledi, glIsFramebuffer, glIsRenderbuffer,
        glIsVertexArray, glMapBufferRange, glRenderbufferStorage, glRenderbufferStorageMultisample, glTexParameterIiv, glTexParameterIuiv,
        glTransformFeedbackVaryings, glUniform1ui, glUniform1uiv, glUniform2ui, glUniform2uiv, glUniform3ui, glUniform3uiv,
        glUniform4ui, glUniform4uiv, glVertexAttribI1i, glVertexAttribI1iv, glVertexAttribI1ui, glVertexAttribI1uiv,
        glVertexAttribI2i, glVertexAttribI2iv, glVertexAttribI2ui, glVertexAttribI2uiv, glVertexAttribI3i, glVertexAttribI3iv,
        glVertexAttribI3ui, glVertexAttribI3uiv, glVertexAttribI4bv, glVertexAttribI4i, glVertexAttribI4iv, glVertexAttribI4sv,
        glVertexAttribI4ubv, glVertexAttribI4ui, glVertexAttribI4uiv, glVertexAttribI4usv, glVertexAttribIPointer;
    /**
     * OpenGL 4.1 method handles
     */
    public MethodHandle glActiveShaderProgram, glBindProgramPipeline, glClearDepthf, glCreateShaderProgramv, glDeleteProgramPipelines, glDepthRangeArrayv,
        glDepthRangeIndexed, glDepthRangef, glGenProgramPipelines, glGetDoublei_v, glGetFloati_v, glGetProgramBinary,
        glGetProgramPipelineInfoLog, glGetProgramPipelineiv, glGetShaderPrecisionFormat, glGetVertexAttribLdv, glIsProgramPipeline, glProgramBinary,
        glProgramParameteri, glProgramUniform1d, glProgramUniform1dv, glProgramUniform1f, glProgramUniform1fv, glProgramUniform1i,
        glProgramUniform1iv, glProgramUniform1ui, glProgramUniform1uiv, glProgramUniform2d, glProgramUniform2dv, glProgramUniform2f,
        glProgramUniform2fv, glProgramUniform2i, glProgramUniform2iv, glProgramUniform2ui, glProgramUniform2uiv, glProgramUniform3d,
        glProgramUniform3dv, glProgramUniform3f, glProgramUniform3fv, glProgramUniform3i, glProgramUniform3iv, glProgramUniform3ui,
        glProgramUniform3uiv, glProgramUniform4d, glProgramUniform4dv, glProgramUniform4f, glProgramUniform4fv, glProgramUniform4i,
        glProgramUniform4iv, glProgramUniform4ui, glProgramUniform4uiv, glProgramUniformMatrix2dv, glProgramUniformMatrix2fv, glProgramUniformMatrix2x3dv,
        glProgramUniformMatrix2x3fv, glProgramUniformMatrix2x4dv, glProgramUniformMatrix2x4fv, glProgramUniformMatrix3dv, glProgramUniformMatrix3fv, glProgramUniformMatrix3x2dv,
        glProgramUniformMatrix3x2fv, glProgramUniformMatrix3x4dv, glProgramUniformMatrix3x4fv, glProgramUniformMatrix4dv, glProgramUniformMatrix4fv, glProgramUniformMatrix4x2dv,
        glProgramUniformMatrix4x2fv, glProgramUniformMatrix4x3dv, glProgramUniformMatrix4x3fv, glReleaseShaderCompiler, glScissorArrayv, glScissorIndexed,
        glScissorIndexedv, glShaderBinary, glUseProgramStages, glValidateProgramPipeline, glVertexAttribL1d, glVertexAttribL1dv,
        glVertexAttribL2d, glVertexAttribL2dv, glVertexAttribL3d, glVertexAttribL3dv, glVertexAttribL4d, glVertexAttribL4dv,
        glVertexAttribLPointer, glViewportArrayv, glViewportIndexedf, glViewportIndexedfv;
    /**
     * OpenGL 4.5 method handles
     */
    public MethodHandle glBindTextureUnit, glBlitNamedFramebuffer, glCheckNamedFramebufferStatus, glClearNamedBufferData,
        glClearNamedBufferSubData, glClearNamedFramebufferfi, glClearNamedFramebufferfv, glClearNamedFramebufferiv,
        glClearNamedFramebufferuiv, glClipControl, glCompressedTextureSubImage1D, glCompressedTextureSubImage2D,
        glCompressedTextureSubImage3D, glCopyNamedBufferSubData, glCopyTextureSubImage1D, glCopyTextureSubImage2D,
        glCopyTextureSubImage3D, glCreateBuffers, glCreateFramebuffers, glCreateProgramPipelines, glCreateQueries,
        glCreateRenderbuffers, glCreateSamplers, glCreateTextures, glCreateTransformFeedbacks, glCreateVertexArrays,
        glDisableVertexArrayAttrib, glEnableVertexArrayAttrib, glFlushMappedNamedBufferRange, glGenerateTextureMipmap,
        glGetCompressedTextureImage, glGetCompressedTextureSubImage, glGetGraphicsResetStatus, glGetNamedBufferParameteri64v,
        glGetNamedBufferParameteriv, glGetNamedBufferPointerv, glGetNamedBufferSubData, glGetNamedFramebufferAttachmentParameteriv,
        glGetNamedFramebufferParameteriv, glGetNamedRenderbufferParameteriv, glGetQueryBufferObjecti64v, glGetQueryBufferObjectiv,
        glGetQueryBufferObjectui64v, glGetQueryBufferObjectuiv, glGetTextureImage, glGetTextureLevelParameterfv,
        glGetTextureLevelParameteriv, glGetTextureParameterIiv, glGetTextureParameterIuiv, glGetTextureParameterfv,
        glGetTextureParameteriv, glGetTextureSubImage, glGetTransformFeedbacki64_v, glGetTransformFeedbacki_v,
        glGetTransformFeedbackiv, glGetVertexArrayIndexed64iv,
        glGetVertexArrayIndexediv, glGetVertexArrayiv, glGetnCompressedTexImage, glGetnTexImage, glGetnUniformdv,
        glGetnUniformfv, glGetnUniformiv, glGetnUniformuiv, glInvalidateNamedFramebufferData,
        glInvalidateNamedFramebufferSubData, glMapNamedBuffer, glMapNamedBufferRange, glMemoryBarrierByRegion,
        glNamedBufferData, glNamedBufferStorage, glNamedBufferSubData, glNamedFramebufferDrawBuffer,
        glNamedFramebufferDrawBuffers, glNamedFramebufferParameteri, glNamedFramebufferReadBuffer,
        glNamedFramebufferRenderbuffer, glNamedFramebufferTexture, glNamedFramebufferTextureLayer,
        glNamedRenderbufferStorage, glNamedRenderbufferStorageMultisample, glReadnPixels, glTextureBarrier,
        glTextureBuffer, glTextureBufferRange, glTextureParameterIiv, glTextureParameterIuiv, glTextureParameterf,
        glTextureParameterfv, glTextureParameteri, glTextureParameteriv, glTextureStorage1D, glTextureStorage2D,
        glTextureStorage2DMultisample, glTextureStorage3D, glTextureStorage3DMultisample, glTextureSubImage1D,
        glTextureSubImage2D, glTextureSubImage3D, glTransformFeedbackBufferBase, glTransformFeedbackBufferRange,
        glUnmapNamedBuffer, glVertexArrayAttribBinding, glVertexArrayAttribFormat, glVertexArrayAttribIFormat,
        glVertexArrayAttribLFormat, glVertexArrayBindingDivisor, glVertexArrayElementBuffer, glVertexArrayVertexBuffer,
        glVertexArrayVertexBuffers;

    /**
     * The OpenGL context version flags.
     */
    public boolean
        Ver10, Ver11, Ver12, Ver13, Ver14, Ver15,
        Ver20, Ver21,
        Ver30, Ver31, Ver32, Ver33,
        Ver40, Ver41, Ver42, Ver43, Ver44, Ver45, Ver46;
    private int rawGLVersion;
    private final boolean forwardCompatible;
    private GLExtCaps ext;

    /**
     * Constructs <i>incomplete</i> OpenGL capabilities.
     *
     * @param forwardCompatible If {@code true}, only loads core profile functions.
     */
    public GLCapabilities(boolean forwardCompatible) {
        this.forwardCompatible = forwardCompatible;
    }

    /**
     * Load OpenGL by the given load function.
     *
     * @param load the load function.
     * @return the OpenGL version returned from the graphics driver, or {@code 0} if no OpenGL context found.
     */
    public int load(GLLoadFunc load) {
        final MethodHandle glGetString = load.invoke("glGetString", FunctionDescriptor.of(Unmarshal.STR_LAYOUT, ValueLayout.JAVA_INT));
        if (glGetString == null) return 0;

        GL20C.load(this, load);
        GL30C.load(this, load);
        GL41C.load(this, load);
        GL45C.load(this, load);

        int version = findCoreGL(glGetString);

        ext = new GLExtCaps(this);

        try (var arena = Arena.ofConfined()) {
            if (!ext.findExtensionsGL(version, arena)) return 0;
        }
        ext.load(load);

        rawGLVersion = version;

        return version;
    }

    private int findCoreGL(MethodHandle glGetString) {
        final String[] prefixes = {
            "OpenGL ES-CM ",
            "OpenGL ES-CL ",
            "OpenGL ES ",
            "OpenGL SC "
        };
        String version;
        try {
            version = ((MemorySegment) glGetString.invokeExact(GL10C.VERSION)).getString(0L);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        if (version == null) return 0;
        for (var prefix : prefixes) {
            int len = prefix.length();
            if (version.startsWith(prefix)) {
                version = version.substring(len);
                break;
            }
        }
        var matcher = VERSION_PATTERN.matcher(version);
        int major, minor;
        if (matcher.find()) {
            major = Integer.parseInt(matcher.group(1));
            minor = Integer.parseInt(matcher.group(2));
        } else {
            major = 0;
            minor = 0;
        }
        Ver10 = (major == 1 && minor >= 0) || major > 1;
        Ver11 = (major == 1 && minor >= 1) || major > 1;
        Ver12 = (major == 1 && minor >= 2) || major > 1;
        Ver13 = (major == 1 && minor >= 3) || major > 1;
        Ver14 = (major == 1 && minor >= 4) || major > 1;
        Ver15 = (major == 1 && minor >= 5) || major > 1;
        Ver20 = (major == 2 && minor >= 0) || major > 2;
        Ver21 = (major == 2 && minor >= 1) || major > 2;
        Ver30 = (major == 3 && minor >= 0) || major > 3;
        Ver31 = (major == 3 && minor >= 1) || major > 3;
        Ver32 = (major == 3 && minor >= 2) || major > 3;
        Ver33 = (major == 3 && minor >= 3) || major > 3;
        Ver40 = (major == 4 && minor >= 0) || major > 4;
        Ver41 = (major == 4 && minor >= 1) || major > 4;
        Ver42 = (major == 4 && minor >= 2) || major > 4;
        Ver43 = (major == 4 && minor >= 3) || major > 4;
        Ver44 = (major == 4 && minor >= 4) || major > 4;
        Ver45 = (major == 4 && minor >= 5) || major > 4;
        Ver46 = (major == 4 && minor >= 6) || major > 4;
        return GLLoader.makeVersion(major, minor);
    }

    /**
     * {@return the raw OpenGL version value}
     */
    public int rawGLVersion() {
        return rawGLVersion;
    }

    /**
     * Forward compatible flag.
     *
     * @return {@code false} for deprecated and removed function.
     */
    public boolean forwardCompatible() {
        return forwardCompatible;
    }

    /**
     * {@return the OpenGL extension capabilities}
     */
    public GLExtCaps ext() {
        return ext;
    }
}
