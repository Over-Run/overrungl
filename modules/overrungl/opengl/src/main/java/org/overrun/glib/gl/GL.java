package org.overrun.glib.gl;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.regex.Pattern;

import static java.lang.foreign.ValueLayout.*;

/**
 * The OpenGL capabilities.
 *
 * @author squid233
 * @since 0.1.0
 */
public class GL {
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
    static final FunctionDescriptor dZV = FunctionDescriptor.ofVoid(JAVA_BOOLEAN);
    static final FunctionDescriptor dDDV = ofDescriptor("DDV");
    static final FunctionDescriptor dFFV = ofDescriptor("FFV");
    static final FunctionDescriptor dIFV = ofDescriptor("IFV");
    static final FunctionDescriptor dIIV = ofDescriptor("IIV");
    static final FunctionDescriptor dIPV = ofDescriptor("IPV");
    static final FunctionDescriptor dISV = ofDescriptor("ISV");
    static final FunctionDescriptor dBBBV = ofDescriptor("BBBV");
    static final FunctionDescriptor dDDDV = ofDescriptor("DDDV");
    static final FunctionDescriptor dFFFV = ofDescriptor("FFFV");
    static final FunctionDescriptor dIIFV = ofDescriptor("IIFV");
    static final FunctionDescriptor dIIIV = ofDescriptor("IIIV");
    static final FunctionDescriptor dIIPV = ofDescriptor("IIPV");
    static final FunctionDescriptor dIPPV = ofDescriptor("IPPV");
    static final FunctionDescriptor dIPPZ = ofDescriptor("IPPZ");
    static final FunctionDescriptor dSSSV = ofDescriptor("SSSV");
    static final FunctionDescriptor dBBBBV = ofDescriptor("BBBBV");
    static final FunctionDescriptor dDDDDV = ofDescriptor("DDDDV");
    static final FunctionDescriptor dFFFFV = ofDescriptor("FFFFV");
    static final FunctionDescriptor dIIIIV = ofDescriptor("IIIIV");
    static final FunctionDescriptor dIIIPV = ofDescriptor("IIIPV");
    static final FunctionDescriptor dSSSSV = ofDescriptor("SSSSV");
    static final FunctionDescriptor dZZZZV = ofDescriptor("ZZZZV");
    static final FunctionDescriptor dIIIIIV = ofDescriptor("IIIIIV");
    static final FunctionDescriptor dIIIIPV = ofDescriptor("IIIIPV");
    static final FunctionDescriptor dDDDDDDV = ofDescriptor("DDDDDDV");
    static final FunctionDescriptor dIIIIIIV = ofDescriptor("IIIIIIV");
    static final FunctionDescriptor dIIFFFFPV = ofDescriptor("IIFFFFPV");
    static final FunctionDescriptor dIIIIIIIV = ofDescriptor("IIIIIIIV");
    static final FunctionDescriptor dIIIIIIPV = ofDescriptor("IIIIIIPV");
    static final FunctionDescriptor dIIIIIIIIV = ofDescriptor("IIIIIIIIV");
    static final FunctionDescriptor dIIIIIIIPV = ofDescriptor("IIIIIIIPV");
    static final FunctionDescriptor dIIIIIIIIPV = ofDescriptor("IIIIIIIIPV");

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

    public static boolean
        Ver10, Ver11, Ver12, Ver13, Ver14, Ver15,
        Ver20, Ver21,
        Ver30, Ver31, Ver32, Ver33,
        Ver40, Ver41, Ver42, Ver43, Ver44, Ver45, Ver46;

    public static MethodHandle check(MethodHandle handle) {
        if (handle == null)
            throw new IllegalStateException("The argument 'handle' is null; may be no context or function exists.");
        return handle;
    }

    public static MethodHandle downcallSafe(Addressable symbol, FunctionDescriptor function) {
        if (symbol.address() == MemoryAddress.NULL) return null;
        return downcall(symbol, function);
    }

    public static MethodHandle downcall(Addressable symbol, FunctionDescriptor function) {
        return Linker.nativeLinker().downcallHandle(symbol, function);
    }

    public static int load(GLLoadFunc load) throws Throwable {
        return load(false, load);
    }

    public static int load(boolean forwardCompatible, GLLoadFunc load) throws Throwable {
        GL10C.glGetString = downcallSafe(load.invoke("glGetString"), dIP);
        if (GL10C.glGetString == null) return 0;
        if (GL10C.getString(GLConstC.GL_VERSION) == null) return 0;
        int version = findCoreGL();

        GL10C.load(load);
        GL11C.load(load);
        if (!forwardCompatible) {
            GL10.load(load);
            GL11.load(load);
        }

        return version;
    }

    private static int findCoreGL() throws Throwable {
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
            if (version.substring(0, len).startsWith(prefix)) {
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
        return major * 10000 + minor;
    }
}
