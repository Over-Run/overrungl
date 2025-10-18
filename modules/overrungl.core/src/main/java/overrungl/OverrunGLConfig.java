/*
 * MIT License
 *
 * Copyright (c) 2025 Overrun Organization
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

package overrungl;

import java.util.function.Function;
import java.util.function.Supplier;

/// The configurations for OverrunGL.
///
/// ## System properties
///
/// It is supported to specify the configurations with [system properties][System#getProperties()].
/// The key for each configuration is separately documented.
///
/// ## Usage
///
/// There are 2 usages for different configurations: static and dynamic.
/// Static configurations are supplied on class loading (using static fields),
/// while dynamic ones are supplied in method body.
///
/// The static configurations must be set before used, otherwise it will not take effect.
///
/// @since 0.2.0
public final class OverrunGLConfig {
    /// Enable debug messages and prints to [OverrunGL#apiLogger()].
    /// - Default value: `false`
    /// - System property: {@systemProperty overrungl.debug}
    /// - Usage: static
    public static final Entry<Boolean> DEBUG = Entry.of("overrungl.debug", false, Boolean::parseBoolean);
    /// The default stack size in bytes.
    /// - Default value: 64 * 1024 = 65536
    /// - System property: {@systemProperty overrungl.stack.size}
    /// - Usage: dynamic
    public static final Entry<Long> STACK_SIZE = Entry.of("overrungl.stack.size", 64L * 1024, Long::parseLong);
    /// The default [frame count][overrungl.util.MemoryStack#frameCount()] for a memory stack.
    /// - Default value: 8
    /// - System property: {@systemProperty overrungl.stack.frame.count}
    /// - Usage: dynamic
    public static final Entry<Integer> STACK_FRAME_COUNT = Entry.of("overrungl.stack.frame.count", 8, Integer::parseInt);
    /// Trace downcall invocations and print messages to [OverrunGL#apiLogger()].
    /// - Default value: `false`
    /// - System property: {@systemProperty overrungl.trace.downcalls}
    /// - Usage: static
    public static final Entry<Boolean> TRACE_DOWNCALLS = Entry.of("overrungl.trace.downcalls", false, Boolean::parseBoolean);

    private OverrunGLConfig() {
    }

    /// A configuration entry.
    ///
    /// @param <T> the type of the configuration
    public static final class Entry<T> implements Supplier<T> {
        private final Supplier<T> defaultValueSupplier;
        private T value;

        private Entry(Supplier<T> defaultValueSupplier) {
            this.defaultValueSupplier = defaultValueSupplier;
        }

        static <T> Entry<T> of(String propertyName, T defaultValue, Function<String, T> function) {
            return new Entry<>(() -> {
                String v = System.getProperty(propertyName);
                if (v == null) {
                    return defaultValue;
                }
                try {
                    return function.apply(v);
                } catch (Exception e) {
                    OverrunGL.apiLog("failed to read system property " + propertyName + " with value " + v);
                    return defaultValue;
                }
            });
        }

        /// Sets the value.
        ///
        /// @param value the new value
        public void set(T value) {
            this.value = value;
        }

        /// {@return the value, or the supplied default value if not [set][#set(java.lang.Object)]}
        @Override
        public T get() {
            if (value == null) {
                value = defaultValueSupplier.get();
            }
            return value;
        }
    }
}
