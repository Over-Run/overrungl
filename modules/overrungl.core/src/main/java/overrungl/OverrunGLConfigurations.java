/*
 * MIT License
 *
 * Copyright (c) 2022-2025 Overrun Organization
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

package overrungl;

import java.lang.foreign.SymbolLookup;
import java.util.function.Function;
import java.util.function.Supplier;

/// The configurations for OverrunGL.
///
/// @author squid233
/// @since 0.1.0
public final class OverrunGLConfigurations {
    /**
     * Enable debug messages and prints to {@link OverrunGL#apiLogger()}.
     * <p>
     * The default value is {@code false}.
     */
    public static final Entry<Boolean> DEBUG = new Entry<>(() -> false);
    /**
     * The default stack size in bytes.
     * Default value: 65536 (64 KiB)
     */
    public static final Entry<Long> STACK_SIZE = new Entry<>(() -> 64L * 1024);
    /**
     * The default {@linkplain overrungl.util.MemoryStack#frameCount() frame count} for a memory stack.
     * Default value: 8
     */
    public static final Entry<Integer> STACK_FRAME_COUNT = new Entry<>(() -> 8);

    /**
     * The symbol lookup of GLFW.
     * The returned value must not be null.
     * <p>
     * The default value is {@code null}.
     */
    @Deprecated
    public static final Entry<Function<Supplier<SymbolLookup>, SymbolLookup>> GLFW_SYMBOL_LOOKUP = new Entry<>(() -> null);
    /**
     * The symbol lookup of NFD.
     * The returned value must not be null.
     * <p>
     * The default value is {@code null}.
     */
    @Deprecated
    public static final Entry<Function<Supplier<SymbolLookup>, SymbolLookup>> NFD_SYMBOL_LOOKUP = new Entry<>(() -> null);
    /// The symbol lookup of OpenAL. The returned value must not be null.
    ///
    /// The default value is `null`.
    @Deprecated
    public static final Entry<Function<Supplier<SymbolLookup>, SymbolLookup>> OPENAL_SYMBOL_LOOKUP = new Entry<>(() -> null);
    /**
     * The symbol lookup of stb.
     * The returned value must not be null.
     * <p>
     * The default value is {@code null}.
     */
    @Deprecated
    public static final Entry<Function<Supplier<SymbolLookup>, SymbolLookup>> STB_SYMBOL_LOOKUP = new Entry<>(() -> null);
    /// The symbol lookup of Vulkan Memory Allocator. The returned value must not be null.
    ///
    /// The default value is `null`.
    @Deprecated
    public static final Entry<Function<Supplier<SymbolLookup>, SymbolLookup>> VMA_SYMBOL_LOOKUP = new Entry<>(() -> null);

    private OverrunGLConfigurations() {
        //no instance
    }

    /**
     * A configuration entry.
     *
     * @param <T> the entry type
     * @author squid233
     * @since 0.1.0
     */
    public static final class Entry<T> implements Supplier<T> {
        private T value;
        private final Supplier<T> defaultValue;

        private Entry(Supplier<T> defaultValue) {
            this.defaultValue = defaultValue;
        }

        /**
         * Sets the value.
         *
         * @param value the value
         */
        public void set(T value) {
            this.value = value;
        }

        /**
         * {@return the value, or the default value if it is {@code null}}
         */
        @Override
        public T get() {
            if (value == null) {
                value = defaultValue.get();
            }
            return value;
        }
    }
}
