/*
 * MIT License
 *
 * Copyright (c) 2022 Overrun Organization
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.gl;

import org.overrun.glib.FunctionDescriptors;

import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;
import java.util.regex.Pattern;

/**
 * The OpenGL capabilities.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLCapabilities {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^(\\d+)\\.(\\d+).*$");

    /**
     * OpenGL 1.0 method handles
     */
    public MethodHandle glBlendFunc, glClear, glClearColor, glClearDepth, glClearStencil, glColorMask, glCullFace, glDepthFunc,
        glDepthMask, glDepthRange, glDisable, glDrawBuffer, glEnable, glFinish, glFlush, glFrontFace, glGetBooleanv,
        glGetDoublev, glGetError, glGetFloatv, glGetIntegerv, glGetString, glGetTexImage, glGetTexLevelParameterfv,
        glGetTexLevelParameteriv, glGetTexParameterfv, glGetTexParameteriv, glHint, glIsEnabled, glLineWidth, glLogicOp,
        glPixelStoref, glPixelStorei, glPointSize, glPolygonMode, glReadBuffer, glReadPixels, glScissor, glStencilFunc,
        glStencilMask, glStencilOp, glTexImage1D, glTexImage2D, glTexParameterf, glTexParameterfv, glTexParameteri,
        glTexParameteriv, glViewport;
    /**
     * OpenGL 1.0 compatibility method handles
     */
    public MethodHandle glAccum, glAlphaFunc, glBegin, glBitmap, glCallList, glCallLists, glClearAccum, glClearIndex,
        glClipPlane, glColor3b, glColor3bv, glColor3d, glColor3dv, glColor3f, glColor3fv, glColor3i, glColor3iv, glColor3s,
        glColor3sv, glColor3ub, glColor3ubv, glColor3ui, glColor3uiv, glColor3us, glColor3usv, glColor4b, glColor4bv,
        glColor4d, glColor4dv, glColor4f, glColor4fv, glColor4i, glColor4iv, glColor4s, glColor4sv, glColor4ub, glColor4ubv,
        glColor4ui, glColor4uiv, glColor4us, glColor4usv, glColorMaterial, glCopyPixels, glDeleteLists, glDrawPixels,
        glEdgeFlag, glEdgeFlagv, glEnd, glEndList, glEvalCoord1d, glEvalCoord1dv, glEvalCoord1f, glEvalCoord1fv,
        glEvalCoord2d, glEvalCoord2dv, glEvalCoord2f, glEvalCoord2fv, glEvalMesh1, glEvalMesh2, glEvalPoint1, glEvalPoint2,
        glFeedbackBuffer, glFogf, glFogfv, glFogi, glFogiv, glFrustum, glGenLists, glGetClipPlane, glGetLightfv, glGetLightiv,
        glGetMapdv, glGetMapfv, glGetMapiv, glGetMaterialfv, glGetMaterialiv, glGetPixelMapfv, glGetPixelMapuiv,
        glGetPixelMapusv, glGetPolygonStipple, glGetTexEnvfv, glGetTexEnviv, glGetTexGendv, glGetTexGenfv, glGetTexGeniv,
        glIndexMask, glIndexd, glIndexdv, glIndexf, glIndexfv, glIndexi, glIndexiv, glIndexs, glIndexsv, glInitNames,
        glIsList, glLightModelf, glLightModelfv, glLightModeli, glLightModeliv, glLightf, glLightfv, glLighti, glLightiv,
        glLineStipple, glListBase, glLoadIdentity, glLoadMatrixd, glLoadMatrixf, glLoadName, glMap1d, glMap1f, glMap2d,
        glMap2f, glMapGrid1d, glMapGrid1f, glMapGrid2d, glMapGrid2f, glMaterialf, glMaterialfv, glMateriali, glMaterialiv,
        glMatrixMode, glMultMatrixd, glMultMatrixf, glNewList, glNormal3b, glNormal3bv, glNormal3d, glNormal3dv, glNormal3f,
        glNormal3fv, glNormal3i, glNormal3iv, glNormal3s, glNormal3sv, glOrtho, glPassThrough, glPixelMapfv, glPixelMapuiv,
        glPixelMapusv, glPixelTransferf, glPixelTransferi, glPixelZoom, glPolygonStipple, glPopAttrib, glPopMatrix, glPopName,
        glPushAttrib, glPushMatrix, glPushName, glRasterPos2d, glRasterPos2dv, glRasterPos2f, glRasterPos2fv, glRasterPos2i,
        glRasterPos2iv, glRasterPos2s, glRasterPos2sv, glRasterPos3d, glRasterPos3dv, glRasterPos3f, glRasterPos3fv,
        glRasterPos3i, glRasterPos3iv, glRasterPos3s, glRasterPos3sv, glRasterPos4d, glRasterPos4dv, glRasterPos4f,
        glRasterPos4fv, glRasterPos4i, glRasterPos4iv, glRasterPos4s, glRasterPos4sv, glRectd, glRectdv, glRectf, glRectfv,
        glRecti, glRectiv, glRects, glRectsv, glRenderMode, glRotated, glRotatef, glScaled, glScalef, glSelectBuffer,
        glShadeModel, glTexCoord1d, glTexCoord1dv, glTexCoord1f, glTexCoord1fv, glTexCoord1i, glTexCoord1iv, glTexCoord1s,
        glTexCoord1sv, glTexCoord2d, glTexCoord2dv, glTexCoord2f, glTexCoord2fv, glTexCoord2i, glTexCoord2iv, glTexCoord2s,
        glTexCoord2sv, glTexCoord3d, glTexCoord3dv, glTexCoord3f, glTexCoord3fv, glTexCoord3i, glTexCoord3iv, glTexCoord3s,
        glTexCoord3sv, glTexCoord4d, glTexCoord4dv, glTexCoord4f, glTexCoord4fv, glTexCoord4i, glTexCoord4iv, glTexCoord4s,
        glTexCoord4sv, glTexEnvf, glTexEnvfv, glTexEnvi, glTexEnviv, glTexGend, glTexGendv, glTexGenf, glTexGenfv, glTexGeni,
        glTexGeniv, glTranslated, glTranslatef, glVertex2d, glVertex2dv, glVertex2f, glVertex2fv, glVertex2i, glVertex2iv,
        glVertex2s, glVertex2sv, glVertex3d, glVertex3dv, glVertex3f, glVertex3fv, glVertex3i, glVertex3iv, glVertex3s,
        glVertex3sv, glVertex4d, glVertex4dv, glVertex4f, glVertex4fv, glVertex4i, glVertex4iv, glVertex4s, glVertex4sv;
    /**
     * OpenGL 1.1 method handles
     */
    public MethodHandle glBindTexture, glCopyTexImage1D, glCopyTexImage2D, glCopyTexSubImage1D, glCopyTexSubImage2D, glDeleteTextures,
        glDrawArrays, glDrawElements, glGenTextures, glGetPointerv, glIsTexture, glPolygonOffset, glTexSubImage1D, glTexSubImage2D;
    /**
     * OpenGL 1.1 compatibility method handles
     */
    public MethodHandle glAreTexturesResident, glArrayElement, glColorPointer, glDisableClientState, glEdgeFlagPointer, glEnableClientState,
        glIndexPointer, glIndexub, glIndexubv, glInterleavedArrays, glNormalPointer, glPopClientAttrib, glPrioritizeTextures,
        glPushClientAttrib, glTexCoordPointer, glVertexPointer;
    /**
     * OpenGL 1.2 method handles
     */
    public MethodHandle glCopyTexSubImage3D, glDrawRangeElements, glTexImage3D, glTexSubImage3D;
    /**
     * OpenGL 1.3 method handles
     */
    public MethodHandle glActiveTexture, glCompressedTexImage1D, glCompressedTexImage2D, glCompressedTexImage3D, glCompressedTexSubImage1D,
        glCompressedTexSubImage2D, glCompressedTexSubImage3D, glGetCompressedTexImage, glSampleCoverage;
    /**
     * OpenGL 1.3 compatibility method handles
     */
    public MethodHandle glClientActiveTexture, glLoadTransposeMatrixd, glLoadTransposeMatrixf, glMultTransposeMatrixd, glMultTransposeMatrixf,
        glMultiTexCoord1d, glMultiTexCoord1dv, glMultiTexCoord1f, glMultiTexCoord1fv, glMultiTexCoord1i, glMultiTexCoord1iv,
        glMultiTexCoord1s, glMultiTexCoord1sv, glMultiTexCoord2d, glMultiTexCoord2dv, glMultiTexCoord2f, glMultiTexCoord2fv,
        glMultiTexCoord2i, glMultiTexCoord2iv, glMultiTexCoord2s, glMultiTexCoord2sv, glMultiTexCoord3d, glMultiTexCoord3dv,
        glMultiTexCoord3f, glMultiTexCoord3fv, glMultiTexCoord3i, glMultiTexCoord3iv, glMultiTexCoord3s, glMultiTexCoord3sv,
        glMultiTexCoord4d, glMultiTexCoord4dv, glMultiTexCoord4f, glMultiTexCoord4fv, glMultiTexCoord4i, glMultiTexCoord4iv,
        glMultiTexCoord4s, glMultiTexCoord4sv;
    /**
     * OpenGL 1.4 method handles
     */
    public MethodHandle glBlendColor, glBlendEquation, glBlendFuncSeparate, glMultiDrawArrays, glMultiDrawElements, glPointParameterf,
        glPointParameterfv, glPointParameteri, glPointParameteriv;
    /**
     * OpenGL 1.4 compatibility method handles
     */
    public MethodHandle glFogCoordPointer, glFogCoordd, glFogCoorddv, glFogCoordf, glFogCoordfv, glSecondaryColor3b,
        glSecondaryColor3bv, glSecondaryColor3d, glSecondaryColor3dv, glSecondaryColor3f, glSecondaryColor3fv, glSecondaryColor3i,
        glSecondaryColor3iv, glSecondaryColor3s, glSecondaryColor3sv, glSecondaryColor3ub, glSecondaryColor3ubv, glSecondaryColor3ui,
        glSecondaryColor3uiv, glSecondaryColor3us, glSecondaryColor3usv, glSecondaryColorPointer, glWindowPos2d, glWindowPos2dv,
        glWindowPos2f, glWindowPos2fv, glWindowPos2i, glWindowPos2iv, glWindowPos2s, glWindowPos2sv, glWindowPos3d,
        glWindowPos3dv, glWindowPos3f, glWindowPos3fv, glWindowPos3i, glWindowPos3iv, glWindowPos3s, glWindowPos3sv;
    /**
     * OpenGL 1.5 method handles
     */
    public MethodHandle glBeginQuery, glBindBuffer, glBufferData, glBufferSubData, glDeleteBuffers, glDeleteQueries, glEndQuery,
        glGenBuffers, glGenQueries, glGetBufferParameteriv, glGetBufferPointerv, glGetBufferSubData, glGetQueryObjectiv,
        glGetQueryObjectuiv, glGetQueryiv, glIsBuffer, glIsQuery, glMapBuffer, glUnmapBuffer;
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
     * OpenGL 2.1 method handles
     */
    public MethodHandle glUniformMatrix2x3fv, glUniformMatrix2x4fv, glUniformMatrix3x2fv, glUniformMatrix3x4fv, glUniformMatrix4x2fv, glUniformMatrix4x3fv;
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
     * OpenGL 3.1 method handles
     */
    public MethodHandle glCopyBufferSubData, glDrawArraysInstanced, glDrawElementsInstanced, glGetActiveUniformBlockName, glGetActiveUniformBlockiv,
        glGetActiveUniformName, glGetActiveUniformsiv, glGetUniformBlockIndex, glGetUniformIndices, glPrimitiveRestartIndex, glTexBuffer, glUniformBlockBinding;
    /**
     * OpenGL 3.2 method handles
     */
    public MethodHandle glClientWaitSync, glDeleteSync, glDrawElementsBaseVertex, glDrawElementsInstancedBaseVertex, glDrawRangeElementsBaseVertex,
        glFenceSync, glFramebufferTexture, glGetBufferParameteri64v, glGetInteger64i_v, glGetInteger64v, glGetMultisamplefv, glGetSynciv,
        glIsSync, glMultiDrawElementsBaseVertex, glProvokingVertex, glSampleMaski, glTexImage2DMultisample, glTexImage3DMultisample, glWaitSync;
    /**
     * OpenGL 3.3 method handles
     */
    public MethodHandle glBindFragDataLocationIndexed, glBindSampler, glDeleteSamplers, glGenSamplers, glGetFragDataIndex, glGetQueryObjecti64v,
        glGetQueryObjectui64v, glGetSamplerParameterIiv, glGetSamplerParameterIuiv, glGetSamplerParameterfv, glGetSamplerParameteriv, glIsSampler,
        glQueryCounter, glSamplerParameterIiv, glSamplerParameterIuiv, glSamplerParameterf, glSamplerParameterfv, glSamplerParameteri,
        glSamplerParameteriv, glVertexAttribDivisor, glVertexAttribP1ui, glVertexAttribP1uiv, glVertexAttribP2ui, glVertexAttribP2uiv,
        glVertexAttribP3ui, glVertexAttribP3uiv, glVertexAttribP4ui, glVertexAttribP4uiv;
    /**
     * OpenGL 4.0 method handles
     */
    public MethodHandle glBeginQueryIndexed, glBindTransformFeedback, glBlendEquationSeparatei, glBlendEquationi, glBlendFuncSeparatei, glBlendFunci,
        glDeleteTransformFeedbacks, glDrawArraysIndirect, glDrawElementsIndirect, glDrawTransformFeedback, glDrawTransformFeedbackStream, glEndQueryIndexed,
        glGenTransformFeedbacks, glGetActiveSubroutineName, glGetActiveSubroutineUniformName, glGetActiveSubroutineUniformiv, glGetProgramStageiv, glGetQueryIndexediv,
        glGetSubroutineIndex, glGetSubroutineUniformLocation, glGetUniformSubroutineuiv, glGetUniformdv, glIsTransformFeedback, glMinSampleShading,
        glPatchParameterfv, glPatchParameteri, glPauseTransformFeedback, glResumeTransformFeedback, glUniform1d, glUniform1dv,
        glUniform2d, glUniform2dv, glUniform3d, glUniform3dv, glUniform4d, glUniform4dv, glUniformMatrix2dv, glUniformMatrix2x3dv,
        glUniformMatrix2x4dv, glUniformMatrix3dv, glUniformMatrix3x2dv, glUniformMatrix3x4dv, glUniformMatrix4dv, glUniformMatrix4x2dv,
        glUniformMatrix4x3dv, glUniformSubroutinesuiv;
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
     * OpenGL 4.2 method handles
     */
    public MethodHandle glBindImageTexture, glDrawArraysInstancedBaseInstance, glDrawElementsInstancedBaseInstance,
        glDrawElementsInstancedBaseVertexBaseInstance, glDrawTransformFeedbackInstanced, glDrawTransformFeedbackStreamInstanced,
        glGetActiveAtomicCounterBufferiv, glGetInternalformativ, glMemoryBarrier, glTexStorage1D, glTexStorage2D, glTexStorage3D;
    /**
     * OpenGL 4.3 method handles
     */
    public MethodHandle glBindVertexBuffer, glClearBufferData, glClearBufferSubData, glCopyImageSubData, glDebugMessageCallback,
        glDebugMessageControl, glDebugMessageInsert, glDispatchCompute, glDispatchComputeIndirect, glFramebufferParameteri,
        glGetDebugMessageLog, glGetFramebufferParameteriv, glGetInternalformati64v, glGetObjectLabel, glGetObjectPtrLabel,
        glGetProgramInterfaceiv, glGetProgramResourceIndex, glGetProgramResourceLocation, glGetProgramResourceLocationIndex,
        glGetProgramResourceName, glGetProgramResourceiv, glInvalidateBufferData, glInvalidateBufferSubData, glInvalidateFramebuffer,
        glInvalidateSubFramebuffer, glInvalidateTexImage, glInvalidateTexSubImage, glMultiDrawArraysIndirect, glMultiDrawElementsIndirect,
        glObjectLabel, glObjectPtrLabel, glPopDebugGroup, glPushDebugGroup, glShaderStorageBlockBinding, glTexBufferRange,
        glTexStorage2DMultisample, glTexStorage3DMultisample, glTextureView, glVertexAttribBinding, glVertexAttribFormat,
        glVertexAttribIFormat, glVertexAttribLFormat, glVertexBindingDivisor;
    /**
     * OpenGL 4.4 method handles
     */
    public MethodHandle glBindBuffersBase, glBindBuffersRange, glBindImageTextures, glBindSamplers, glBindTextures,
        glBindVertexBuffers, glBufferStorage, glClearTexImage, glClearTexSubImage;
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
     * OpenGL 4.6 method handles
     */
    public MethodHandle glMultiDrawArraysIndirectCount, glMultiDrawElementsIndirectCount, glPolygonOffsetClamp, glSpecializeShader;

    /**
     * The OpenGL context version flags
     */
    public boolean
        Ver10, Ver11, Ver12, Ver13, Ver14, Ver15,
        Ver20, Ver21,
        Ver30, Ver31, Ver32, Ver33,
        Ver40, Ver41, Ver42, Ver43, Ver44, Ver45, Ver46;
    /**
     * Forward compatible flag. {@code false} for deprecated and removed function.
     */
    public boolean forwardCompatible;
    /**
     * The OpenGL extension capabilities.
     */
    public GLExtCaps ext;

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
     * no guaranteed to actually supported version, please use {@code Ver##}
     */
    public int load(GLLoadFunc load) {
        glGetString = load.invoke("glGetString", FunctionDescriptors.IP);
        if (glGetString == null) return 0;
        if (GL10C.getString(GLConstC.GL_VERSION) == null) return 0;

        GL10C.load(this, load);
        GL11C.load(this, load);
        GL12C.load(this, load);
        GL13C.load(this, load);
        GL14C.load(this, load);
        GL15C.load(this, load);
        GL20C.load(this, load);
        GL21C.load(this, load);
        GL30C.load(this, load);
        GL31C.load(this, load);
        GL32C.load(this, load);
        GL33C.load(this, load);
        GL40C.load(this, load);
        GL41C.load(this, load);
        GL42C.load(this, load);
        GL43C.load(this, load);
        GL44C.load(this, load);
        GL45C.load(this, load);
        GL46C.load(this, load);

        int version = findCoreGL(false);
        if (!forwardCompatible) {
            GL10.load(this, load);
            GL11.load(this, load);
            GL13.load(this, load);
            GL14.load(this, load);
        }

        ext = new GLExtCaps(this);

        try (var arena = MemorySession.openShared()) {
            if (!ext.findExtensionsGL(version, arena, this)) return 0;
            findCoreGL(true);
        }
        // TODO: 2022/11/26 Load extension with GLCapabilities
        ext.load(load);

        return version;
    }

    private int findCoreGL(boolean checkAll) {
        if (checkAll) {
            Ver10 = Ver10 || GL10C.isSupported(this);
            Ver11 = Ver11 || GL11C.isSupported(this);
            Ver12 = Ver12 || GL12C.isSupported(this);
            Ver13 = Ver13 || GL13C.isSupported(this);
            Ver14 = Ver14 || GL14C.isSupported(this);
            Ver15 = Ver15 || GL15C.isSupported(this);
            Ver20 = Ver20 || GL20C.isSupported(this);
            Ver21 = Ver21 || GL21C.isSupported(this);
            Ver30 = Ver30 || GL30C.isSupported(this);
            Ver31 = Ver31 || GL31C.isSupported(this);
            Ver32 = Ver32 || GL32C.isSupported(this);
            Ver33 = Ver33 || GL33C.isSupported(this);
            Ver40 = Ver40 || GL40C.isSupported(this);
            Ver41 = Ver41 || GL41C.isSupported(this);
            Ver42 = Ver42 || GL42C.isSupported(this);
            Ver43 = Ver43 || GL43C.isSupported(this);
            Ver44 = Ver44 || GL44C.isSupported(this);
            Ver45 = Ver45 || GL45C.isSupported(this);
            Ver46 = Ver46 || GL46C.isSupported(this);
            return -1;
        }
        final String[] prefixes = {
            "OpenGL ES-CM ",
            "OpenGL ES-CL ",
            "OpenGL ES ",
            "OpenGL SC "
        };
        var version = GL10C.getString(GLConstC.GL_VERSION);
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
}
