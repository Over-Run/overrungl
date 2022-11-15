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

import org.jetbrains.annotations.Nullable;
import org.overrun.glib.RuntimeHelper;
import org.overrun.glib.util.MemoryStack;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.FunctionDescriptors.*;
import static org.overrun.glib.gl.GLCaps.check;
import static org.overrun.glib.gl.GLCaps.checkAll;

/**
 * The OpenGL 4.3 core profile functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL43C extends GL42C permits GL44C {
    @Nullable
    public static MethodHandle
        glBindVertexBuffer, glClearBufferData, glClearBufferSubData, glCopyImageSubData, glDebugMessageCallback,
        glDebugMessageControl, glDebugMessageInsert, glDispatchCompute, glDispatchComputeIndirect,
        glFramebufferParameteri, glGetDebugMessageLog, glGetFramebufferParameteriv, glGetInternalformati64v,
        glGetObjectLabel, glGetObjectPtrLabel, glGetPointerv, glGetProgramInterfaceiv, glGetProgramResourceIndex,
        glGetProgramResourceLocation, glGetProgramResourceLocationIndex, glGetProgramResourceName,
        glGetProgramResourceiv, glInvalidateBufferData, glInvalidateBufferSubData, glInvalidateFramebuffer,
        glInvalidateSubFramebuffer, glInvalidateTexImage, glInvalidateTexSubImage, glMultiDrawArraysIndirect,
        glMultiDrawElementsIndirect, glObjectLabel, glObjectPtrLabel, glPopDebugGroup, glPushDebugGroup,
        glShaderStorageBlockBinding, glTexBufferRange, glTexStorage2DMultisample, glTexStorage3DMultisample,
        glTextureView, glVertexAttribBinding, glVertexAttribFormat, glVertexAttribIFormat, glVertexAttribLFormat,
        glVertexBindingDivisor;

    static boolean isSupported() {
        return checkAll(glBindVertexBuffer, glClearBufferData, glClearBufferSubData, glCopyImageSubData,
            glDebugMessageCallback, glDebugMessageControl, glDebugMessageInsert, glDispatchCompute,
            glDispatchComputeIndirect, glFramebufferParameteri, glGetDebugMessageLog, glGetFramebufferParameteriv,
            glGetInternalformati64v, glGetObjectLabel, glGetObjectPtrLabel, glGetPointerv, glGetProgramInterfaceiv,
            glGetProgramResourceIndex, glGetProgramResourceLocation, glGetProgramResourceLocationIndex,
            glGetProgramResourceName, glGetProgramResourceiv, glInvalidateBufferData, glInvalidateBufferSubData,
            glInvalidateFramebuffer, glInvalidateSubFramebuffer, glInvalidateTexImage, glInvalidateTexSubImage,
            glMultiDrawArraysIndirect, glMultiDrawElementsIndirect, glObjectLabel, glObjectPtrLabel, glPopDebugGroup,
            glPushDebugGroup, glShaderStorageBlockBinding, glTexBufferRange, glTexStorage2DMultisample,
            glTexStorage3DMultisample, glTextureView, glVertexAttribBinding, glVertexAttribFormat,
            glVertexAttribIFormat, glVertexAttribLFormat, glVertexBindingDivisor);
    }

    static void load(GLLoadFunc load) {
        glBindVertexBuffer = load.invoke("glBindVertexBuffer", IIJIV);
        glClearBufferData = load.invoke("glClearBufferData", IIIIPV);
        glClearBufferSubData = load.invoke("glClearBufferSubData", IIJJIIPV);
        glCopyImageSubData = load.invoke("glCopyImageSubData", IIIIIIIIIIIIIIIV);
        glDebugMessageCallback = load.invoke("glDebugMessageCallback", PPV);
        glDebugMessageControl = load.invoke("glDebugMessageControl", IIIIPZV);
        glDebugMessageInsert = load.invoke("glDebugMessageInsert", IIIIIPV);
        glDispatchCompute = load.invoke("glDispatchCompute", IIIV);
        glDispatchComputeIndirect = load.invoke("glDispatchComputeIndirect", JV);
        glFramebufferParameteri = load.invoke("glFramebufferParameteri", IIIV);
        glGetDebugMessageLog = load.invoke("glGetDebugMessageLog", IIPPPPPPI);
        glGetFramebufferParameteriv = load.invoke("glGetFramebufferParameteriv", IIPV);
        glGetInternalformati64v = load.invoke("glGetInternalformati64v", IIIIPV);
        glGetObjectLabel = load.invoke("glGetObjectLabel", IIIPPV);
        glGetObjectPtrLabel = load.invoke("glGetObjectPtrLabel", PIPPV);
        glGetPointerv = load.invoke("glGetPointerv", IPV);
        glGetProgramInterfaceiv = load.invoke("glGetProgramInterfaceiv", IIIPV);
        glGetProgramResourceIndex = load.invoke("glGetProgramResourceIndex", IIPI);
        glGetProgramResourceLocation = load.invoke("glGetProgramResourceLocation", IIPI);
        glGetProgramResourceLocationIndex = load.invoke("glGetProgramResourceLocationIndex", IIPI);
        glGetProgramResourceName = load.invoke("glGetProgramResourceName", IIIIPPV);
        glGetProgramResourceiv = load.invoke("glGetProgramResourceiv", IIIIPIPPV);
        glInvalidateBufferData = load.invoke("glInvalidateBufferData", IV);
        glInvalidateBufferSubData = load.invoke("glInvalidateBufferSubData", IJJV);
        glInvalidateFramebuffer = load.invoke("glInvalidateFramebuffer", IIPV);
        glInvalidateSubFramebuffer = load.invoke("glInvalidateSubFramebuffer", IIPIIIIV);
        glInvalidateTexImage = load.invoke("glInvalidateTexImage", IIV);
        glInvalidateTexSubImage = load.invoke("glInvalidateTexSubImage", IIIIIIIIV);
        glMultiDrawArraysIndirect = load.invoke("glMultiDrawArraysIndirect", IPIIV);
        glMultiDrawElementsIndirect = load.invoke("glMultiDrawElementsIndirect", IIPIIV);
        glObjectLabel = load.invoke("glObjectLabel", IIIPV);
        glObjectPtrLabel = load.invoke("glObjectPtrLabel", PIPV);
        glPopDebugGroup = load.invoke("glPopDebugGroup", V);
        glPushDebugGroup = load.invoke("glPushDebugGroup", IIIPV);
        glShaderStorageBlockBinding = load.invoke("glShaderStorageBlockBinding", IIIV);
        glTexBufferRange = load.invoke("glTexBufferRange", IIIJJV);
        glTexStorage2DMultisample = load.invoke("glTexStorage2DMultisample", IIIIIZV);
        glTexStorage3DMultisample = load.invoke("glTexStorage3DMultisample", IIIIIIZV);
        glTextureView = load.invoke("glTextureView", IIIIIIIIV);
        glVertexAttribBinding = load.invoke("glVertexAttribBinding", IIV);
        glVertexAttribFormat = load.invoke("glVertexAttribFormat", IIIZIV);
        glVertexAttribIFormat = load.invoke("glVertexAttribIFormat", IIIIV);
        glVertexAttribLFormat = load.invoke("glVertexAttribLFormat", IIIIV);
        glVertexBindingDivisor = load.invoke("glVertexBindingDivisor", IIV);
    }

    public static void bindVertexBuffer(int bindingIndex, int buffer, long offset, int stride) {
        try {
            check(glBindVertexBuffer).invokeExact(bindingIndex, buffer, offset, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferData(int target, int internalFormat, int format, int type, Addressable data) {
        try {
            check(glClearBufferData).invokeExact(target, internalFormat, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void clearBufferSubData(int target, int internalFormat, long offset, long size, int format, int type, Addressable data) {
        try {
            check(glClearBufferSubData).invokeExact(target, internalFormat, offset, size, format, type, data);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void copyImageSubData(int srcName, int srcTarget, int srcLevel, int srcX, int srcY, int srcZ, int dstName, int dstTarget, int dstLevel, int dstX, int dstY, int dstZ, int srcWidth, int srcHeight, int srcDepth) {
        try {
            check(glCopyImageSubData).invokeExact(srcName, srcTarget, srcLevel, srcX, srcY, srcZ, dstName, dstTarget, dstLevel, dstX, dstY, dstZ, srcWidth, srcHeight, srcDepth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageCallback(Addressable callback, Addressable userParam) {
        try {
            check(glDebugMessageCallback).invokeExact(callback, userParam);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageCallback(MemorySession session, GLDebugProc callback, Addressable userParam) {
        debugMessageCallback(callback.address(session), userParam);
    }

    public static void debugMessageControl(int source, int type, int severity, int count, Addressable ids, boolean enabled) {
        try {
            check(glDebugMessageControl).invokeExact(source, type, severity, count, ids, enabled);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageControl(SegmentAllocator session, int source, int type, int severity, int count, int[] ids, boolean enabled) {
        debugMessageControl(source, type, severity, count, session.allocateArray(JAVA_INT, ids), enabled);
    }

    public static void debugMessageInsert(int source, int type, int id, int severity, int length, Addressable buf) {
        try {
            check(glDebugMessageInsert).invokeExact(source, type, id, severity, length, buf);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void debugMessageInsert(SegmentAllocator session, int source, int type, int id, int severity, String buf) {
        debugMessageInsert(source, type, id, severity, -1, session.allocateUtf8String(buf));
    }

    public static void dispatchCompute(int numGroupsX, int numGroupsY, int numGroupsZ) {
        try {
            check(glDispatchCompute).invokeExact(numGroupsX, numGroupsY, numGroupsZ);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void dispatchComputeIndirect(long indirect) {
        try {
            check(glDispatchComputeIndirect).invokeExact(indirect);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void framebufferParameteri(int target, int pname, int param) {
        try {
            check(glFramebufferParameteri).invokeExact(target, pname, param);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getDebugMessageLog(int count, int bufSize, Addressable sources, Addressable types, Addressable ids, Addressable severities, Addressable lengths, Addressable messageLog) {
        try {
            return (int) check(glGetDebugMessageLog).invokeExact(count, bufSize, sources, types, ids, severities, lengths, messageLog);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getDebugMessageLog(int count, MemorySegment sources, MemorySegment types, MemorySegment ids, MemorySegment severities, MemorySegment lengths, MemorySegment messageLog) {
        return getDebugMessageLog(count, (int) messageLog.byteSize(), sources, types, ids, severities, lengths, messageLog);
    }

    public static int getDebugMessageLog(SegmentAllocator session, int count, int bufSize, int[] sources, int[] types, int[] ids, int[] severities, int[] lengths, String[] messageLog) {
        var pSrc = session.allocateArray(JAVA_INT, sources.length);
        var pTypes = session.allocateArray(JAVA_INT, types.length);
        var pIds = session.allocateArray(JAVA_INT, ids.length);
        var pSvr = session.allocateArray(JAVA_INT, severities.length);
        var pLen = session.allocateArray(JAVA_INT, lengths.length);
        var pLog = session.allocateArray(JAVA_BYTE, bufSize);
        int num = getDebugMessageLog(count, bufSize, pSrc, pTypes, pIds, pSvr, pLen, pLog);
        RuntimeHelper.toArray(pSrc, sources);
        RuntimeHelper.toArray(pTypes, types);
        RuntimeHelper.toArray(pIds, ids);
        RuntimeHelper.toArray(pSvr, severities);
        RuntimeHelper.toArray(pLen, lengths);
        messageLog[0] = pLog.getUtf8String(0);
        return num;
    }

    public static void getFramebufferParameteriv(int target, int pname, Addressable params) {
        try {
            check(glGetFramebufferParameteriv).invokeExact(target, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getFramebufferParameteri(int target, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getFramebufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getInternalformati64v(int target, int internalFormat, int pname, int count, Addressable params) {
        try {
            check(glGetInternalformati64v).invokeExact(target, internalFormat, pname, count, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getInternalformati64v(SegmentAllocator session, int target, int internalFormat, int pname, long[] params) {
        var seg = session.allocateArray(JAVA_LONG, params.length);
        getInternalformati64v(target, internalFormat, pname, params.length, seg);
        RuntimeHelper.toArray(seg, params);
    }

    public static long getInternalformati64(int target, int internalFormat, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_LONG);
            getInternalformati64v(target, internalFormat, pname, 1, seg);
            return seg.get(JAVA_LONG, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void getObjectLabel(int identifier, int name, int bufSize, Addressable length, Addressable label) {
        try {
            check(glGetObjectLabel).invokeExact(identifier, name, bufSize, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getObjectLabel(int identifier, int name, Addressable length, MemorySegment label) {
        getObjectLabel(identifier, name, (int) label.byteSize(), length, label);
    }

    public static String getObjectLabel(SegmentAllocator session, int identifier, int name, int bufSize, int @Nullable [] length) {
        var seg = session.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
        getObjectLabel(identifier, name, bufSize, seg, pLen);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getObjectLabel(SegmentAllocator session, int identifier, int name, int @Nullable [] length) {
        return getObjectLabel(session, identifier, name, 1024, length);
    }

    public static void getObjectPtrLabel(MemoryAddress ptr, int bufSize, Addressable length, Addressable label) {
        try {
            check(glGetObjectPtrLabel).invokeExact(ptr, bufSize, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getObjectPtrLabel(MemoryAddress ptr, Addressable length, MemorySegment label) {
        getObjectPtrLabel(ptr, (int) label.byteSize(), length, label);
    }

    public static String getObjectPtrLabel(SegmentAllocator session, MemoryAddress ptr, int bufSize, int @Nullable [] length) {
        var seg = session.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
        getObjectPtrLabel(ptr, bufSize, seg, pLen);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getObjectPtrLabel(SegmentAllocator session, MemoryAddress ptr, int @Nullable [] length) {
        return getObjectPtrLabel(session, ptr, 1024, length);
    }

    public static void getProgramInterfaceiv(int program, int programInterface, int pname, Addressable params) {
        try {
            check(glGetProgramInterfaceiv).invokeExact(program, programInterface, pname, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramInterfacei(int program, int programInterface, int pname) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var seg = stack.calloc(JAVA_INT);
            getProgramInterfaceiv(program, programInterface, pname, seg);
            return seg.get(JAVA_INT, 0);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static int getProgramResourceIndex(int program, int programInterface, Addressable name) {
        try {
            return (int) check(glGetProgramResourceIndex).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceIndex(SegmentAllocator session, int program, int programInterface, String name) {
        return getProgramResourceIndex(program, programInterface, session.allocateUtf8String(name));
    }

    public static int getProgramResourceLocation(int program, int programInterface, Addressable name) {
        try {
            return (int) check(glGetProgramResourceLocation).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceLocation(SegmentAllocator session, int program, int programInterface, String name) {
        return getProgramResourceLocation(program, programInterface, session.allocateUtf8String(name));
    }

    public static int getProgramResourceLocationIndex(int program, int programInterface, Addressable name) {
        try {
            return (int) check(glGetProgramResourceLocationIndex).invokeExact(program, programInterface, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static int getProgramResourceLocationIndex(SegmentAllocator session, int program, int programInterface, String name) {
        return getProgramResourceLocationIndex(program, programInterface, session.allocateUtf8String(name));
    }

    public static void getProgramResourceName(int program, int programInterface, int index, int bufSize, Addressable length, Addressable name) {
        try {
            check(glGetProgramResourceName).invokeExact(program, programInterface, index, bufSize, length, name);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramResourceName(int program, int programInterface, int index, Addressable length, MemorySegment name) {
        getProgramResourceName(program, programInterface, index, (int) name.byteSize(), length, name);
    }

    public static String getProgramResourceName(SegmentAllocator session, int program, int programInterface, int index, int bufSize, int @Nullable [] length) {
        var seg = session.allocateArray(JAVA_BYTE, bufSize);
        var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
        getProgramResourceName(program, programInterface, index, bufSize, pLen, seg);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        return seg.getUtf8String(0);
    }

    public static String getProgramResourceName(SegmentAllocator session, int program, int programInterface, int index, int @Nullable [] length) {
        return getProgramResourceName(session, program, programInterface, index, 1024, length);
    }

    public static void getProgramResourceiv(int program, int programInterface, int index, int propCount, Addressable props, int count, Addressable length, Addressable params) {
        try {
            check(glGetProgramResourceiv).invokeExact(program, programInterface, index, propCount, props, count, length, params);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void getProgramResourceiv(int program, int programInterface, int index, MemorySegment props, Addressable length, MemorySegment params) {
        getProgramResourceiv(program, programInterface, index, (int) (props.byteSize() >> 2), props, (int) params.byteSize(), length, params);
    }

    public static void getProgramResourceiv(SegmentAllocator session, int program, int programInterface, int index, int[] props, int @Nullable [] length, int[] params) {
        var seg = session.allocateArray(JAVA_INT, params.length);
        var pLen = length != null ? session.allocate(JAVA_INT) : MemoryAddress.NULL;
        getProgramResourceiv(program, programInterface, index, props.length, session.allocateArray(JAVA_INT, props), params.length, pLen, seg);
        if (length != null && length.length > 0) {
            length[0] = ((MemorySegment) pLen).get(JAVA_INT, 0);
        }
        RuntimeHelper.toArray(seg, params);
    }

    public static int getProgramResourceiv(SegmentAllocator session, int program, int programInterface, int index, int[] props) {
        var seg = session.allocate(JAVA_INT);
        getProgramResourceiv(program, programInterface, index, props.length, session.allocateArray(JAVA_INT, props), 1, MemoryAddress.NULL, seg);
        return seg.get(JAVA_INT, 0);
    }

    public static void invalidateBufferData(int buffer) {
        try {
            check(glInvalidateBufferData).invokeExact(buffer);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateBufferSubData(int buffer, long offset, long length) {
        try {
            check(glInvalidateBufferSubData).invokeExact(buffer, offset, length);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateFramebuffer(int target, int numAttachments, Addressable attachments) {
        try {
            check(glInvalidateFramebuffer).invokeExact(target, numAttachments, attachments);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateFramebuffer(SegmentAllocator session, int target, int[] attachments) {
        invalidateFramebuffer(target, attachments.length, session.allocateArray(JAVA_INT, attachments));
    }

    public static void invalidateFramebuffer(int target, int attachment) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, attachment);
            invalidateFramebuffer(target, 1, mem);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateSubFramebuffer(int target, int numAttachments, Addressable attachments, int x, int y, int width, int height) {
        try {
            check(glInvalidateSubFramebuffer).invokeExact(target, numAttachments, attachments, x, y, width, height);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateSubFramebuffer(SegmentAllocator session, int target, int[] attachments, int x, int y, int width, int height) {
        invalidateSubFramebuffer(target, attachments.length, session.allocateArray(JAVA_INT, attachments), x, y, width, height);
    }

    public static void invalidateSubFramebuffer(int target, int attachment, int x, int y, int width, int height) {
        var stack = MemoryStack.stackGet();
        long stackPointer = stack.getPointer();
        try {
            var mem = stack.malloc(JAVA_INT);
            mem.set(JAVA_INT, 0, attachment);
            invalidateSubFramebuffer(target, 1, mem, x, y, width, height);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    public static void invalidateTexImage(int texture, int level) {
        try {
            check(glInvalidateTexImage).invokeExact(texture, level);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void invalidateTexSubImage(int texture, int level, int xoffset, int yoffset, int zoffset, int width, int height, int depth) {
        try {
            check(glInvalidateTexSubImage).invokeExact(texture, level, xoffset, yoffset, zoffset, width, height, depth);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArraysIndirect(int mode, Addressable indirect, int drawCount, int stride) {
        try {
            check(glMultiDrawArraysIndirect).invokeExact(mode, indirect, drawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawArraysIndirect(int mode, DrawArraysIndirectCommand.Buffer indirect, int drawCount, int stride) {
        multiDrawArraysIndirect(mode, indirect.rawAddress(), drawCount, stride);
    }

    public static void multiDrawElementsIndirect(int mode, int type, Addressable indirect, int drawCount, int stride) {
        try {
            check(glMultiDrawElementsIndirect).invokeExact(mode, type, indirect, drawCount, stride);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void multiDrawElementsIndirect(int mode, int type, DrawElementsIndirectCommand.Buffer indirect, int drawCount, int stride) {
        multiDrawElementsIndirect(mode, type, indirect.rawAddress(), drawCount, stride);
    }

    public static void objectLabel(int identifier, int name, int length, Addressable label) {
        try {
            check(glObjectLabel).invokeExact(identifier, name, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void objectLabel(SegmentAllocator session, int identifier, int name, String label) {
        objectLabel(identifier, name, -1, session.allocateUtf8String(label));
    }

    public static void objectPtrLabel(MemoryAddress ptr, int length, Addressable label) {
        try {
            check(glObjectPtrLabel).invokeExact(ptr, length, label);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void objectPtrLabel(SegmentAllocator session, MemoryAddress ptr, String label) {
        objectPtrLabel(ptr, -1, session.allocateUtf8String(label));
    }

    public static void popDebugGroup() {
        try {
            check(glPopDebugGroup).invokeExact();
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushDebugGroup(int source, int id, int length, Addressable message) {
        try {
            check(glPushDebugGroup).invokeExact(source, id, length, message);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void pushDebugGroup(SegmentAllocator session, int source, int id, String message) {
        pushDebugGroup(source, id, -1, session.allocateUtf8String(message));
    }

    public static void shaderStorageBlockBinding(int program, int storageBlockIndex, int storageBlockBinding) {
        try {
            check(glShaderStorageBlockBinding).invokeExact(program, storageBlockIndex, storageBlockBinding);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texBufferRange(int target, int internalFormat, int buffer, long offset, long size) {
        try {
            check(glTexBufferRange).invokeExact(target, internalFormat, buffer, offset, size);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage2DMultisample(int target, int samples, int internalFormat, int width, int height, boolean fixedSampleLocations) {
        try {
            check(glTexStorage2DMultisample).invokeExact(target, samples, internalFormat, width, height, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void texStorage3DMultisample(int target, int samples, int internalFormat, int width, int height, int depth, boolean fixedSampleLocations) {
        try {
            check(glTexStorage3DMultisample).invokeExact(target, samples, internalFormat, width, height, depth, fixedSampleLocations);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void textureView(int texture, int target, int origTexture, int internalFormat, int minLevel, int numLevels, int minLayer, int numLayers) {
        try {
            check(glTextureView).invokeExact(texture, target, origTexture, internalFormat, minLevel, numLevels, minLayer, numLayers);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribBinding(int attribIndex, int bindingIndex) {
        try {
            check(glVertexAttribBinding).invokeExact(attribIndex, bindingIndex);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribFormat(int attribIndex, int size, int type, boolean normalized, int relativeOffset) {
        try {
            check(glVertexAttribFormat).invokeExact(attribIndex, size, type, normalized, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribIFormat(int attribIndex, int size, int type, int relativeOffset) {
        try {
            check(glVertexAttribIFormat).invokeExact(attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexAttribLFormat(int attribIndex, int size, int type, int relativeOffset) {
        try {
            check(glVertexAttribLFormat).invokeExact(attribIndex, size, type, relativeOffset);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }

    public static void vertexBindingDivisor(int bindingIndex, int divisor) {
        try {
            check(glVertexBindingDivisor).invokeExact(bindingIndex, divisor);
        } catch (Throwable e) {
            throw new AssertionError("should not reach here", e);
        }
    }
}
