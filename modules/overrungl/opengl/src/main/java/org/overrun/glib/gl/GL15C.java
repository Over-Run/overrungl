package org.overrun.glib.gl;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Addressable;
import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;
import static org.overrun.glib.gl.GL.*;

/**
 * The OpenGL 1.5 forward compatible functions.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed class GL15C extends GL14C permits GL20C {
    @Nullable
    public static MethodHandle
        glBeginQuery, glBindBuffer,
        glBufferData, glBufferSubData,
        glDeleteBuffers, glDeleteQueries,
        glEndQuery,
        glGenBuffers, glGenQueries,
        glGetBufferParameteriv, glGetBufferPointerv, glGetBufferSubData,
        glGetQueryObjectiv, glGetQueryObjectuiv, glGetQueryiv,
        glIsBuffer, glIsQuery,
        glMapBuffer, glUnmapBuffer;

    static boolean isSupported() {
        return checkAll(glBeginQuery, glBindBuffer, glBufferData, glBufferSubData, glDeleteBuffers,
            glDeleteQueries, glEndQuery, glGenBuffers, glGenQueries, glGetBufferParameteriv,
            glGetBufferPointerv, glGetBufferSubData, glGetQueryObjectiv, glGetQueryObjectuiv,
            glGetQueryiv, glIsBuffer, glIsQuery, glMapBuffer, glUnmapBuffer);
    }

    static void load(GLLoadFunc load) {
        glBeginQuery = downcallSafe(load.invoke("glBeginQuery"), dIIV);
        glBindBuffer = downcallSafe(load.invoke("glBindBuffer"), dIIV);
        glBufferData = downcallSafe(load.invoke("glBufferData"), dIJPIV);
        glBufferSubData = downcallSafe(load.invoke("glBufferSubData"), dIJJPV);
        glDeleteBuffers = downcallSafe(load.invoke("glDeleteBuffers"), dIPV);
        glDeleteQueries = downcallSafe(load.invoke("glDeleteQueries"), dIPV);
        glEndQuery = downcallSafe(load.invoke("glEndQuery"), dIV);
        glGenBuffers = downcallSafe(load.invoke("glGenBuffers"), dIPV);
        glGenQueries = downcallSafe(load.invoke("glGenQueries"), dIPV);
        glGetBufferParameteriv = downcallSafe(load.invoke("glGetBufferParameteriv"), dIIPV);
        glGetBufferPointerv = downcallSafe(load.invoke("glGetBufferPointerv"), dIIPV);
        glGetBufferSubData = downcallSafe(load.invoke("glGetBufferSubData"), dIJJPV);
        glGetQueryObjectiv = downcallSafe(load.invoke("glGetQueryObjectiv"), dIIPV);
        glGetQueryObjectuiv = downcallSafe(load.invoke("glGetQueryObjectuiv"), dIIPV);
        glGetQueryiv = downcallSafe(load.invoke("glGetQueryiv"), dIIPV);
        glIsBuffer = downcallSafe(load.invoke("glIsBuffer"), dIZ);
        glIsQuery = downcallSafe(load.invoke("glIsQuery"), dIZ);
        glMapBuffer = downcallSafe(load.invoke("glMapBuffer"), dIIP);
        glUnmapBuffer = downcallSafe(load.invoke("glUnmapBuffer"), dIZ);
    }

    public static void beginQuery(int target, int id) {
        try {
            check(glBeginQuery).invoke(target, id);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bindBuffer(int target, int buffer) {
        try {
            check(glBindBuffer).invoke(target, buffer);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bufferData(int target, long size, Addressable data, int usage) {
        try {
            check(glBufferData).invoke(target, size, data, usage);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bufferData(int target, long size, int usage) {
        bufferData(target, size, MemoryAddress.NULL, usage);
    }

    public static void bufferData(int target, byte[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            bufferData(target, Integer.toUnsignedLong(data.length), session.allocateArray(JAVA_BYTE, data), usage);
        }
    }

    public static void bufferData(int target, short[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            bufferData(target, Integer.toUnsignedLong(data.length) << 1, session.allocateArray(JAVA_SHORT, data), usage);
        }
    }

    public static void bufferData(int target, int[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            bufferData(target, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_INT, data), usage);
        }
    }

    public static void bufferData(int target, long[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            bufferData(target, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_LONG, data), usage);
        }
    }

    public static void bufferData(int target, float[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            bufferData(target, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_FLOAT, data), usage);
        }
    }

    public static void bufferData(int target, double[] data, int usage) {
        try (var session = MemorySession.openShared()) {
            bufferData(target, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_DOUBLE, data), usage);
        }
    }

    public static void bufferSubData(int target, long offset, long size, Addressable data) {
        try {
            check(glBufferSubData).invoke(target, offset, size, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void bufferSubData(int target, long offset, byte[] data) {
        try (var session = MemorySession.openShared()) {
            bufferSubData(target, offset, Integer.toUnsignedLong(data.length), session.allocateArray(JAVA_BYTE, data));
        }
    }

    public static void bufferSubData(int target, long offset, short[] data) {
        try (var session = MemorySession.openShared()) {
            bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 1, session.allocateArray(JAVA_SHORT, data));
        }
    }

    public static void bufferSubData(int target, long offset, int[] data) {
        try (var session = MemorySession.openShared()) {
            bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_INT, data));
        }
    }

    public static void bufferSubData(int target, long offset, long[] data) {
        try (var session = MemorySession.openShared()) {
            bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_LONG, data));
        }
    }

    public static void bufferSubData(int target, long offset, float[] data) {
        try (var session = MemorySession.openShared()) {
            bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_FLOAT, data));
        }
    }

    public static void bufferSubData(int target, long offset, double[] data) {
        try (var session = MemorySession.openShared()) {
            bufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_DOUBLE, data));
        }
    }

    public static void deleteBuffers(int n, Addressable buffers) {
        try {
            check(glDeleteBuffers).invoke(n, buffers);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteBuffers(int[] buffers) {
        try (var session = MemorySession.openShared()) {
            deleteBuffers(buffers.length, session.allocateArray(JAVA_INT, buffers));
        }
    }

    public static void deleteBuffer(int buffer) {
        try (var session = MemorySession.openShared()) {
            deleteBuffers(1, session.allocate(JAVA_INT, buffer));
        }
    }

    public static void deleteQueries(int n, Addressable ids) {
        try {
            check(glDeleteQueries).invoke(n, ids);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void deleteQueries(int[] ids) {
        try (var session = MemorySession.openShared()) {
            deleteQueries(ids.length, session.allocateArray(JAVA_INT, ids));
        }
    }

    public static void deleteQuery(int id) {
        try (var session = MemorySession.openShared()) {
            deleteQueries(1, session.allocate(JAVA_INT, id));
        }
    }

    public static void endQuery(int target) {
        try {
            check(glEndQuery).invoke(target);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genBuffers(int n, Addressable buffers) {
        try {
            check(glGenBuffers).invoke(n, buffers);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genBuffers(int[] buffers) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, buffers.length);
            genBuffers(buffers.length, seg);
            for (int i = 0; i < buffers.length; i++) {
                buffers[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int genBuffer() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            genBuffers(1, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void genQueries(int n, Addressable ids) {
        try {
            check(glGenQueries).invoke(n, ids);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void genQueries(int[] ids) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocateArray(JAVA_INT, ids.length);
            genQueries(ids.length, seg);
            for (int i = 0; i < ids.length; i++) {
                ids[i] = seg.getAtIndex(JAVA_INT, i);
            }
        }
    }

    public static int genQuery() {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            genQueries(1, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getBufferParameteriv(int target, int pname, Addressable params) {
        try {
            check(glGetBufferParameteriv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getBufferParameteriv(int target, int pname, int[] params) {
        params[0] = getBufferParameteri(target, pname);
    }

    public static int getBufferParameteri(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getBufferParameteriv(target, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getBufferPointerv(int target, int pname, Addressable params) {
        try {
            check(glGetBufferPointerv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getBufferPointerv(int target, int pname, MemoryAddress[] params) {
        params[0] = getBufferPointer(target, pname);
    }

    public static MemoryAddress getBufferPointer(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(ADDRESS);
            getBufferPointerv(target, pname, seg);
            return seg.get(ADDRESS, 0L);
        }
    }

    public static void getBufferSubData(int target, long offset, long size, Addressable data) {
        try {
            check(glGetBufferSubData).invoke(target, offset, size, data);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getBufferSubData(int target, long offset, byte[] data) {
        try (var session = MemorySession.openShared()) {
            getBufferSubData(target, offset, Integer.toUnsignedLong(data.length), session.allocateArray(JAVA_BYTE, data));
        }
    }

    public static void getBufferSubData(int target, long offset, short[] data) {
        try (var session = MemorySession.openShared()) {
            getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 1, session.allocateArray(JAVA_SHORT, data));
        }
    }

    public static void getBufferSubData(int target, long offset, int[] data) {
        try (var session = MemorySession.openShared()) {
            getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_INT, data));
        }
    }

    public static void getBufferSubData(int target, long offset, long[] data) {
        try (var session = MemorySession.openShared()) {
            getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_LONG, data));
        }
    }

    public static void getBufferSubData(int target, long offset, float[] data) {
        try (var session = MemorySession.openShared()) {
            getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 2, session.allocateArray(JAVA_FLOAT, data));
        }
    }

    public static void getBufferSubData(int target, long offset, double[] data) {
        try (var session = MemorySession.openShared()) {
            getBufferSubData(target, offset, Integer.toUnsignedLong(data.length) << 3, session.allocateArray(JAVA_DOUBLE, data));
        }
    }

    public static void getQueryObjectiv(int id, int pname, Addressable params) {
        try {
            check(glGetQueryObjectiv).invoke(id, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getQueryObjectiv(int id, int pname, int[] params) {
        params[0] = getQueryObjecti(id, pname);
    }

    public static int getQueryObjecti(int id, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getQueryObjectiv(id, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getQueryObjectuiv(int id, int pname, Addressable params) {
        try {
            check(glGetQueryObjectuiv).invoke(id, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getQueryObjectuiv(int id, int pname, int[] params) {
        params[0] = getQueryObjectui(id, pname);
    }

    public static int getQueryObjectui(int id, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getQueryObjectuiv(id, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static void getQueryiv(int target, int pname, Addressable params) {
        try {
            check(glGetQueryiv).invoke(target, pname, params);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void getQueryiv(int target, int pname, int[] params) {
        params[0] = getQueryi(target, pname);
    }

    public static int getQueryi(int target, int pname) {
        try (var session = MemorySession.openShared()) {
            var seg = session.allocate(JAVA_INT);
            getQueryiv(target, pname, seg);
            return seg.get(JAVA_INT, 0L);
        }
    }

    public static boolean isBuffer(int buffer) {
        try {
            return (boolean) check(glIsBuffer).invoke(buffer);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isQuery(int buffer) {
        try {
            return (boolean) check(glIsQuery).invoke(buffer);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }

    public static MemoryAddress mapBuffer(int target, int access) {
        try {
            return (MemoryAddress) check(glMapBuffer).invoke(target, access);
        } catch (Throwable e) {
            e.printStackTrace();
            return MemoryAddress.NULL;
        }
    }

    public static boolean unmapBuffer(int target) {
        try {
            return (boolean) check(glUnmapBuffer).invoke(target);
        } catch (Throwable e) {
            e.printStackTrace();
            return false;
        }
    }
}
