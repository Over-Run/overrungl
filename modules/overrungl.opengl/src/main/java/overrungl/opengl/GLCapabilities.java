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
@Deprecated(since = "0.1.0")
public final class GLCapabilities {
    private static final Pattern VERSION_PATTERN = Pattern.compile("^(\\d+)\\.(\\d+).*$");
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

        int version = findCoreGL(glGetString);

        ext = new GLExtCaps(this);
        if (!ext.findExtensionsGL(load, version)) return 0;
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
