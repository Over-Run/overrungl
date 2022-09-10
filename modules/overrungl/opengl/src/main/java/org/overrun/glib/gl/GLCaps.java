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

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.regex.Pattern;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL loader.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GLCaps {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^(\\d+)\\.(\\d+).*$");
    static final FunctionDescriptor dI = FunctionDescriptor.of(JAVA_INT);
    static final FunctionDescriptor dV = FunctionDescriptor.ofVoid();
    static final FunctionDescriptor dBV = FunctionDescriptor.ofVoid(JAVA_BYTE);
    static final FunctionDescriptor dDV = FunctionDescriptor.ofVoid(JAVA_DOUBLE);
    static final FunctionDescriptor dFV = FunctionDescriptor.ofVoid(JAVA_FLOAT);
    static final FunctionDescriptor dII = ofDescriptor("II");
    static final FunctionDescriptor dIP = ofDescriptor("IP");
    static final FunctionDescriptor dIV = FunctionDescriptor.ofVoid(JAVA_INT);
    static final FunctionDescriptor dIZ = ofDescriptor("IZ");
    static final FunctionDescriptor dPV = FunctionDescriptor.ofVoid(ADDRESS);
    static final FunctionDescriptor dSV = FunctionDescriptor.ofVoid(JAVA_SHORT);
    static final FunctionDescriptor dPZ = ofDescriptor("PZ");
    static final FunctionDescriptor dZV = FunctionDescriptor.ofVoid(JAVA_BOOLEAN);
    static final FunctionDescriptor dDDV = ofDescriptor("DDV");
    static final FunctionDescriptor dFFV = ofDescriptor("FFV");
    static final FunctionDescriptor dFZV = ofDescriptor("FZV");
    static final FunctionDescriptor dIDV = ofDescriptor("IDV");
    static final FunctionDescriptor dIFV = ofDescriptor("IFV");
    static final FunctionDescriptor dIIP = ofDescriptor("IIP");
    static final FunctionDescriptor dIIV = ofDescriptor("IIV");
    static final FunctionDescriptor dIIZ = ofDescriptor("IIZ");
    static final FunctionDescriptor dIPI = ofDescriptor("IPI");
    static final FunctionDescriptor dIPV = ofDescriptor("IPV");
    static final FunctionDescriptor dISV = ofDescriptor("ISV");
    static final FunctionDescriptor dPPV = ofDescriptor("PPV");
    static final FunctionDescriptor dSSV = ofDescriptor("SSV");
    static final FunctionDescriptor dBBBV = ofDescriptor("BBBV");
    static final FunctionDescriptor dDDDV = ofDescriptor("DDDV");
    static final FunctionDescriptor dFFFV = ofDescriptor("FFFV");
    static final FunctionDescriptor dIDDV = ofDescriptor("IDDV");
    static final FunctionDescriptor dIFFV = ofDescriptor("IFFV");
    static final FunctionDescriptor dIIDV = ofDescriptor("IIDV");
    static final FunctionDescriptor dIIFV = ofDescriptor("IIFV");
    static final FunctionDescriptor dIIIV = ofDescriptor("IIIV");
    static final FunctionDescriptor dIIPI = ofDescriptor("IIPI");
    static final FunctionDescriptor dIIPV = ofDescriptor("IIPV");
    static final FunctionDescriptor dIJJV = ofDescriptor("IJJV");
    static final FunctionDescriptor dIPPV = ofDescriptor("IPPV");
    static final FunctionDescriptor dIPPZ = ofDescriptor("IPPZ");
    static final FunctionDescriptor dISSV = ofDescriptor("ISSV");
    static final FunctionDescriptor dPIJI = ofDescriptor("PIJI");
    static final FunctionDescriptor dPIJV = ofDescriptor("PIJV");
    static final FunctionDescriptor dSSSV = ofDescriptor("SSSV");
    static final FunctionDescriptor dBBBBV = ofDescriptor("BBBBV");
    static final FunctionDescriptor dDDDDV = ofDescriptor("DDDDV");
    static final FunctionDescriptor dFFFFV = ofDescriptor("FFFFV");
    static final FunctionDescriptor dIDDDV = ofDescriptor("IDDDV");
    static final FunctionDescriptor dIFFFV = ofDescriptor("IFFFV");
    static final FunctionDescriptor dIIIIV = ofDescriptor("IIIIV");
    static final FunctionDescriptor dIIIPV = ofDescriptor("IIIPV");
    static final FunctionDescriptor dIIFIV = ofDescriptor("IIFIV");
    static final FunctionDescriptor dIIPIV = ofDescriptor("IIPIV");
    static final FunctionDescriptor dIIPPV = ofDescriptor("IIPPV");
    static final FunctionDescriptor dIIZIV = ofDescriptor("IIZIV");
    static final FunctionDescriptor dIIZPV = ofDescriptor("IIZPV");
    static final FunctionDescriptor dIJJIP = ofDescriptor("IJJIV");
    static final FunctionDescriptor dIJJPV = ofDescriptor("IJJPV");
    static final FunctionDescriptor dIJPIV = ofDescriptor("IJPIV");
    static final FunctionDescriptor dIPPIV = ofDescriptor("IPPIV");
    static final FunctionDescriptor dISSSV = ofDescriptor("ISSSV");
    static final FunctionDescriptor dSSSSV = ofDescriptor("SSSSV");
    static final FunctionDescriptor dZZZZV = ofDescriptor("ZZZZV");
    static final FunctionDescriptor dIBBBBV = ofDescriptor("IBBBBV");
    static final FunctionDescriptor dIDDDDV = ofDescriptor("IDDDDV");
    static final FunctionDescriptor dIFFFFV = ofDescriptor("IFFFFV");
    static final FunctionDescriptor dIIIIIV = ofDescriptor("IIIIIV");
    static final FunctionDescriptor dIIIIPV = ofDescriptor("IIIIPV");
    static final FunctionDescriptor dIIIJJV = ofDescriptor("IIIJJV");
    static final FunctionDescriptor dIIIPIV = ofDescriptor("IIIPIV");
    static final FunctionDescriptor dIIIPPV = ofDescriptor("IIIPPV");
    static final FunctionDescriptor dIIJJJV = ofDescriptor("IIJJJV");
    static final FunctionDescriptor dIIPIPV = ofDescriptor("IIPIPV");
    static final FunctionDescriptor dIPIPIV = ofDescriptor("IPIPIV");
    static final FunctionDescriptor dISSSSV = ofDescriptor("ISSSSV");
    static final FunctionDescriptor dIZZZZV = ofDescriptor("IZZZZV");
    static final FunctionDescriptor dPIIPPV = ofDescriptor("PIIPPV");
    static final FunctionDescriptor dDDDDDDV = ofDescriptor("DDDDDDV");
    static final FunctionDescriptor dIDDIDDV = ofDescriptor("IDDIDDV");
    static final FunctionDescriptor dIDDIIPV = ofDescriptor("IDDIIPV");
    static final FunctionDescriptor dIFFIFFV = ofDescriptor("IFFIFFV");
    static final FunctionDescriptor dIFFIIPV = ofDescriptor("IFFIIPV");
    static final FunctionDescriptor dIIIIIIV = ofDescriptor("IIIIIIV");
    static final FunctionDescriptor dIIIIIPV = ofDescriptor("IIIIIPV");
    static final FunctionDescriptor dIIIIIZV = ofDescriptor("IIIIIZV");
    static final FunctionDescriptor dIIIIPPV = ofDescriptor("IIIIPPV");
    static final FunctionDescriptor dIIIPIIV = ofDescriptor("IIIPIIV");
    static final FunctionDescriptor dIIIZIPV = ofDescriptor("IIIZIPV");
    static final FunctionDescriptor dIPIPIPV = ofDescriptor("IPIPIPV");
    static final FunctionDescriptor dIIFFFFPV = ofDescriptor("IIFFFFPV");
    static final FunctionDescriptor dIIIIIIIV = ofDescriptor("IIIIIIIV");
    static final FunctionDescriptor dIIIIIIPV = ofDescriptor("IIIIIIPV");
    static final FunctionDescriptor dIIIIIIZV = ofDescriptor("IIIIIIZV");
    static final FunctionDescriptor dIIIIIPIV = ofDescriptor("IIIIIPIV");
    static final FunctionDescriptor dIIIPPPPV = ofDescriptor("IIIPPPPV");
    static final FunctionDescriptor dIIIIIIIIV = ofDescriptor("IIIIIIIIV");
    static final FunctionDescriptor dIIIIIIIPV = ofDescriptor("IIIIIIIPV");
    static final FunctionDescriptor dIIIIIIIIIV = ofDescriptor("IIIIIIIIIV");
    static final FunctionDescriptor dIIIIIIIIPV = ofDescriptor("IIIIIIIIPV");
    static final FunctionDescriptor dIDDIIDDIIPV = ofDescriptor("IDDIIDDIIPV");
    static final FunctionDescriptor dIFFIIFFIIPV = ofDescriptor("IFFIIFFIIPV");
    static final FunctionDescriptor dIIIIIIIIIIV = ofDescriptor("IIIIIIIIIIV");
    static final FunctionDescriptor dIIIIIIIIIIPV = ofDescriptor("IIIIIIIIIIPV");

    private static ValueLayout ofValue(char c) {
        return switch (c) {
            case 'B' -> JAVA_BYTE;
            case 'S' -> JAVA_SHORT;
            case 'I' -> JAVA_INT;
            case 'J' -> JAVA_LONG;
            case 'C' -> JAVA_CHAR;
            case 'Z' -> JAVA_BOOLEAN;
            case 'F' -> JAVA_FLOAT;
            case 'D' -> JAVA_DOUBLE;
            default -> ADDRESS;
        };
    }

    private static FunctionDescriptor ofDescriptor(String str) {
        final int len = str.length();
        ValueLayout[] layouts = new ValueLayout[len - 1];
        for (int i = 0; i < layouts.length; i++) {
            layouts[i] = ofValue(str.charAt(i));
        }
        if (str.endsWith("V")) {
            return FunctionDescriptor.ofVoid(layouts);
        }
        return FunctionDescriptor.of(ofValue(str.charAt(len - 1)), layouts);
    }

    /**
     * The OpenGL version available status
     */
    public static boolean
        Ver10, Ver11, Ver12, Ver13, Ver14, Ver15,
        Ver20, Ver21,
        Ver30, Ver31, Ver32, Ver33,
        Ver40, Ver41, Ver42, Ver43, Ver44, Ver45, Ver46;
    /**
     * Is forward compatible
     */
    public static boolean forwardCompatible;

    @NotNull
    @Contract(value = "null -> fail; !null -> param1", pure = true)
    public static MethodHandle check(MethodHandle handle) {
        if (handle == null)
            throw new IllegalStateException("The argument 'handle' is null; may be no context or function exists.");
        return handle;
    }

    static boolean checkAll(MethodHandle... handles) {
        for (var handle : handles) {
            if (handle == null) {
                return false;
            }
        }
        return true;
    }

    public static MethodHandle downcallSafe(Addressable symbol, FunctionDescriptor function) {
        if (symbol.address() == MemoryAddress.NULL) return null;
        return downcall(symbol, function);
    }

    public static MethodHandle downcall(Addressable symbol, FunctionDescriptor function) {
        return Linker.nativeLinker().downcallHandle(symbol, function);
    }

    /**
     * Load OpenGL compatibility profile by the given load function.
     *
     * @param load the load function
     * @return the OpenGL version, or {@code 0} if no OpenGL context found
     */
    public static int load(GLLoadFunc load) {
        return load(false, load);
    }

    /**
     * Load OpenGL by the given load function.
     *
     * @param forwardCompatible If {@code true}, only loading core profile functions.
     * @param load              the load function
     * @return the OpenGL version, or {@code 0} if no OpenGL context found
     */
    public static int load(boolean forwardCompatible, GLLoadFunc load) {
        GL10C.glGetString = downcallSafe(load.invoke("glGetString"), dIP);
        if (GL10C.glGetString == null) return 0;
        if (GL10C.getString(GLConstC.GL_VERSION) == null) return 0;

        GLCaps.forwardCompatible = forwardCompatible;

        GL10C.load(load);
        GL11C.load(load);
        GL12C.load(load);
        GL13C.load(load);
        GL14C.load(load);
        GL15C.load(load);
        GL20C.load(load);
        GL21C.load(load);
        GL30C.load(load);
        GL31C.load(load);
        GL32C.load(load);
        GL33C.load(load);
        GL40C.load(load);

        int version = findCoreGL();
        if (!forwardCompatible) {
            GL10.load(load);
            GL11.load(load);
            GL13.load(load);
            GL14.load(load);
        }

        if (!findExtensionsGL(version)) return 0;

        return version;
    }

    private static boolean getExtensions(MemorySession session,
                                         int version,
                                         MemorySegment outExts,
                                         MemorySegment outNumExtsI,
                                         MemorySegment outExtsI) {
        if (version / 10000 < 3) {
            if (GL10C.glGetString == null) {
                return false;
            }
            outExts.set(ADDRESS, 0L, GL10C.ngetString(GLConstC.GL_EXTENSIONS));
        } else {
            if (GL30C.glGetStringi == null || GL10C.glGetIntegerv == null) {
                return false;
            }
            int numExtsI = GL10C.getInteger(GLConstC.GL_NUM_EXTENSIONS);
            var extsI = (Addressable) MemoryAddress.NULL;
            if (numExtsI > 0) {
                extsI = session.allocateArray(ADDRESS, numExtsI);
            }
            if (extsI == MemoryAddress.NULL) {
                return false;
            }
            for (int index = 0; index < numExtsI; index++) {
                var glStrTmp = GL30C.getStringi(GLConstC.GL_EXTENSIONS, index);
                ((MemorySegment) extsI).setAtIndex(ADDRESS, index, session.allocateUtf8String(glStrTmp));
            }
            outNumExtsI.set(JAVA_INT, 0L, numExtsI);
            outExtsI.set(ADDRESS, 0L, extsI);
        }

        return true;
    }

    static boolean hasExtension(int version, String exts, int numExtsI, String[] extsI, String ext) {
        if (version / 10000 < 3) {
            if (exts == null || ext == null) {
                return false;
            }
            return exts.contains(ext);
        } else {
            for (int index = 0; index < numExtsI; index++) {
                if (extsI[index].equals(ext)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean findExtensionsGL(int version) {
        try (var session = MemorySession.openShared()) {
            var exts = session.allocate(ADDRESS);
            var numExtsI = session.allocate(JAVA_INT);
            var extsI = session.allocate(ADDRESS);
            if (!getExtensions(session, version, exts, numExtsI, extsI)) return false;

            // (void) glad_gl_has_extension;

            return true;
        }
    }

    private static int findCoreGL() {
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
        Ver10 = (major == 1 && minor >= 0) || major > 1 || GL10C.isSupported();
        Ver11 = (major == 1 && minor >= 1) || major > 1 || GL11C.isSupported();
        Ver12 = (major == 1 && minor >= 2) || major > 1 || GL12C.isSupported();
        Ver13 = (major == 1 && minor >= 3) || major > 1 || GL13C.isSupported();
        Ver14 = (major == 1 && minor >= 4) || major > 1 || GL14C.isSupported();
        Ver15 = (major == 1 && minor >= 5) || major > 1 || GL15C.isSupported();
        Ver20 = (major == 2 && minor >= 0) || major > 2 || GL20C.isSupported();
        Ver21 = (major == 2 && minor >= 1) || major > 2 || GL21C.isSupported();
        Ver30 = (major == 3 && minor >= 0) || major > 3 || GL30C.isSupported();
        Ver31 = (major == 3 && minor >= 1) || major > 3 || GL31C.isSupported();
        Ver32 = (major == 3 && minor >= 2) || major > 3 || GL32C.isSupported();
        Ver33 = (major == 3 && minor >= 3) || major > 3 || GL33C.isSupported();
        Ver40 = (major == 4 && minor >= 0) || major > 4 || GL40C.isSupported();
        Ver41 = (major == 4 && minor >= 1) || major > 4;
        Ver42 = (major == 4 && minor >= 2) || major > 4;
        Ver43 = (major == 4 && minor >= 3) || major > 4;
        Ver44 = (major == 4 && minor >= 4) || major > 4;
        Ver45 = (major == 4 && minor >= 5) || major > 4;
        Ver46 = (major == 4 && minor >= 6) || major > 4;
        return major * 10000 + minor;
    }
}
