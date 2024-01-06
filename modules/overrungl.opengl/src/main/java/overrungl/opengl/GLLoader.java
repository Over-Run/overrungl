/*
 * MIT License
 *
 * Copyright (c) 2022-2023 Overrun Organization
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

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import overrungl.internal.RuntimeHelper;
import overrungl.util.CheckUtil;

import java.lang.invoke.MethodHandle;

/**
 * This class must be used before any OpenGL function is called. It has the following responsibilities:
 * <ul>
 * <li>Loads the OpenGL native library into the JVM process.</li>
 * <li>Creates instances of {@link GLCapabilities} classes. A {@code GLCapabilities} instance contains flags for functionality that is available in an OpenGL
 * context. Internally, it also contains function pointers that are only valid in that specific OpenGL context.</li>
 * <li>Maintains thread-local state for {@code GLCapabilities} instances, corresponding to OpenGL contexts that are current in those threads.</li>
 * </ul>
 * <h2>GLCapabilities creation</h2>
 * <p>Instances of {@code GLCapabilities} can be created with the {@link #load(GLLoadFunc, boolean) load} method. An OpenGL context must be current in the current thread
 * before it is called. Calling this method is expensive, so the {@code GLCapabilities} instance should be associated with the OpenGL context and reused as
 * necessary.</p>
 * <h2>Thread-local state</h2>
 * <p>Before a function for a given OpenGL context can be called, the corresponding {@code GLCapabilities} instance must be passed to the
 * {@link #setCapabilities} method. The user is also responsible for clearing the current {@code GLCapabilities} instance when the context is destroyed or made
 * current in another thread.</p>
 *
 * <p>Note that the {@link #load(GLLoadFunc, boolean) load} method implicitly calls {@link #setCapabilities} with the newly created instance.</p>
 *
 * @author squid233
 * @see GLLoadFunc
 * @since 0.1.0
 */
public final class GLLoader {
    private static final boolean DEFAULT_COMPATIBLE = false;
    private static final ThreadLocal<GLCapabilities> capabilitiesTLS = new ThreadLocal<>();

    /**
     * Sets the {@link GLCapabilities} of the OpenGL context that is current in the current thread.
     *
     * <p>This {@code GLCapabilities} instance will be used by any OpenGL call in the current thread, until {@code setCapabilities} is called again with a
     * different value.</p>
     */
    public static void setCapabilities(@Nullable GLCapabilities caps) {
        capabilitiesTLS.set(caps);
    }

    /**
     * {@return the {@link GLCapabilities} of the OpenGL context that is current in the current thread}
     * <p>
     * This method doesn't throw an exception when the capabilities are null.
     *
     * @see #getCapabilities()
     */
    public static GLCapabilities getCapabilitiesSafe() {
        return capabilitiesTLS.get();
    }

    /**
     * {@return the {@link GLCapabilities} of the OpenGL context that is current in the current thread}
     *
     * @throws IllegalStateException if {@link #setCapabilities} has never been called in the current thread or was last called with a {@code null} value
     * @see #getCapabilitiesSafe()
     */
    public static GLCapabilities getCapabilities() {
        return checkCapabilities(capabilitiesTLS.get());
    }

    /**
     * {@return the current {@link GLExtCaps} of the OpenGL context in the current thread}
     * <p>
     * This is equivalent to the following code:
     * <pre><code>
     * {@link #getCapabilities()}.{@link GLCapabilities#ext() ext()}
     * </code></pre>
     *
     * @throws IllegalStateException if {@link #setCapabilities} has never been called in the current thread or was last called with a {@code null} value
     */
    public static GLExtCaps getExtCapabilities() {
        return getCapabilities().ext();
    }

    private static GLCapabilities checkCapabilities(@Nullable GLCapabilities caps) {
        if (RuntimeHelper.CHECKS)
            CheckUtil.check(caps != null, """
                No GLCapabilities instance set for the current thread. Possible solutions:
                \ta) Call GLLoader.load() after making a context current in the current thread.
                \tb) Call GLLoader.setCapabilities() if a GLCapabilities instance already exists for the current context.""");
        return caps;
    }

    /**
     * Loads OpenGL compatibility profile with the given load function.
     *
     * @param load the load function
     * @return the OpenGL capabilities, or {@code null} if no OpenGL context found.
     */
    @Nullable
    public static GLCapabilities load(GLLoadFunc load) {
        return load(load, DEFAULT_COMPATIBLE);
    }

    /**
     * Loads OpenGL with the given load function.
     *
     * @param load              the load function
     * @param forwardCompatible If {@code true}, only loads core profile functions.
     * @return the OpenGL capabilities, or {@code null} if no OpenGL context found.
     */
    @Nullable
    public static GLCapabilities load(GLLoadFunc load, boolean forwardCompatible) {
        var caps = new GLCapabilities(forwardCompatible);
        // set the global capabilities first
        setCapabilities(caps);
        if (caps.load(load) != 0) {
            return caps;
        }
        // reset if failed to load
        setCapabilities(null);
        return null;
    }

    /**
     * Checks whether the given GL function is available in this context.
     * This method raises an {@link IllegalStateException} rather than a {@link NullPointerException}.
     *
     * @param handle the method handle to be checked.
     * @return <i>{@code handle}</i>
     * @throws IllegalStateException if <i>{@code handle}</i> is {@code null}.
     */
    @NotNull
    @Contract(value = "null -> fail; !null -> param1", pure = true)
    public static MethodHandle check(@Nullable MethodHandle handle) throws IllegalStateException {
        CheckUtil.check(handle != null, "handle is null; maybe no context or function exists.");
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

    /**
     * Pack the version into an integer.
     *
     * @param major the major version
     * @param minor the minor version
     * @return the packed version
     */
    public static int makeVersion(int major, int minor) {
        return major * 10000 + minor;
    }

    /**
     * {@return the major version}
     *
     * @param version the packed version
     */
    public static int versionMajor(int version) {
        return version / 10000;
    }

    /**
     * {@return the minor version}
     *
     * @param version the packed version
     */
    public static int versionMinor(int version) {
        return version % 10000;
    }
}
