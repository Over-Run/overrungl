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

import org.jetbrains.annotations.Nullable;
import overrun.marshal.Downcall;
import overrungl.opengl.ext.GLExtension;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandles;
import java.util.Map;

/**
 * This class must be used before any OpenGL function is called. It has the following responsibilities:
 * <ul>
 * <li>Loads the OpenGL native library into the JVM process.</li>
 * <li>Creates instances of {@link GLFlags} classes. A {@code GLFlags} instance contains flags for functionality that is available in an OpenGL
 * context.</li>
 * <li>Creates instances of {@link GL} instances, corresponding to OpenGL contexts that are current in those threads.
 * Internally, it also contains function pointers that are only valid in that specific OpenGL context.</li>
 * </ul>
 * <h2>OpenGL Context Creation</h2>
 * <p>Instances of {@code GL} can be created with the {@link #load(GLFlags) load} method. An OpenGL context must be current in the current thread
 * before it is called. Calling this method is expensive, so the {@code GL} instance should be associated with the OpenGL context and reused as
 * necessary.</p>
 *
 * @author squid233
 * @see GLLoadFunc
 * @since 0.1.0
 */
public final class GLLoader {
    private static final Map<String, FunctionDescriptor> DESCRIPTOR_MAP = Map.of(
        "glMapBuffer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
        "glMapBufferRange", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT),
        "glMapNamedBuffer", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
        "glMapNamedBufferRange", FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();

    /**
     * Loads OpenGL flags.
     *
     * @param load the load function
     * @return the OpenGL flags
     */
    public static GLFlags loadFlags(GLLoadFunc load) {
        return new GLFlags(load);
    }

    /**
     * Loads OpenGL core profile with the given flags.
     *
     * @param flags the OpenGL flags
     * @return the OpenGL context, or {@code null} if no OpenGL context found.
     */
    @Nullable
    public static GL load(GLFlags flags) {
        return flags.GL10 ? Downcall.load(LOOKUP, GL.class, flags.load.lookup(), DESCRIPTOR_MAP) : null;
    }

    /**
     * Loads OpenGL compatibility profile with the given flags.
     *
     * @param flags the OpenGL flags
     * @return the OpenGL context, or {@code null} if no OpenGL context found.
     */
    @Nullable
    public static GLLegacy loadLegacy(GLFlags flags) {
        return flags.GL10 ? Downcall.load(LOOKUP, GLLegacy.class, flags.load.lookup(), DESCRIPTOR_MAP) : null;
    }

    /**
     * Loads OpenGL extensions with the given flags.
     *
     * @param flags the OpenGL flags
     * @return the OpenGL extensions context, or {@code null} if no OpenGL context found.
     */
    @Nullable
    public static GLExtension loadExtension(GLFlags flags) {
        return flags.foundExtension ? Downcall.load(LOOKUP, GLExtension.class, flags.load.lookup(), DESCRIPTOR_MAP) : null;
    }
}
