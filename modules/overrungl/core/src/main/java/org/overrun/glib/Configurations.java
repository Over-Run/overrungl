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

package org.overrun.glib;

import java.util.function.Supplier;

/**
 * The configurations for game library.
 *
 * @author squid233
 * @since 0.1.0
 */
public final class Configurations {
    /**
     * The stack size configuration for {@link org.overrun.glib.util.MemoryStack MemoryStack}.
     * <p>
     * The default value is {@code 64}.
     */
    public static final Entry<Long> STACK_SIZE = new Entry<>(() -> 64L);
    /**
     * Enable debug messages and prints to {@link RuntimeHelper#apiLogger()}.
     * <p>
     * The default value is {@code false}.
     */
    public static final Entry<Boolean> DEBUG = new Entry<>(() -> false);
    /**
     * Enable using debug memory stack.
     * <p>
     * The default value is {@code false}.
     */
    public static final Entry<Boolean> DEBUG_STACK = new Entry<>(() -> false);
    /**
     * Enable checks.
     * <p>
     * The default value is {@code true}.
     */
    public static final Entry<Boolean> CHECKS = new Entry<>(() -> true);

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
         * Gets the value.
         *
         * @return the value, or the default value if it is {@code null}
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
