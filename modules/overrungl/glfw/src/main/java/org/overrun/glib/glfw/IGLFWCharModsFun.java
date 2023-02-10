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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.overrun.glib.glfw;

import org.overrun.glib.Callback;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * This is the function pointer type for Unicode character with modifiers
 * callbacks. It is called for each input character, regardless of what
 * modifier keys are held down.  A Unicode character with modifiers callback
 * function has the following signature:
 * {@snippet :
 * @Invoker(IGLFWCharModsFun::invoke)
 * void functionName(MemoryAddress window, int codepoint, int mods);
 * }
 *
 * @author squid233
 * @see GLFW#setCharModsCallback
 * @since 0.1.0
 * @deprecated Scheduled for removal in version GLFW 4.0.
 */
@FunctionalInterface
@Deprecated(forRemoval = true)
public interface IGLFWCharModsFun extends Callback {
    FunctionDescriptor DESC = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT);
    MethodType MTYPE = DESC.toMethodType();

    /**
     * The function pointer type for Unicode character with modifiers callbacks.
     *
     * @param window    The window that received the event.
     * @param codepoint The Unicode code point of the character.
     * @param mods      Bit field describing which <a href="https://www.glfw.org/docs/latest/group__mods.html">modifier keys</a> were
     *                  held down.
     */
    void invoke(MemorySegment window, int codepoint, int mods);

    @Override
    default FunctionDescriptor descriptor() {
        return DESC;
    }

    @Override
    default MethodHandle handle(MethodHandles.Lookup lookup) throws NoSuchMethodException, IllegalAccessException {
        return lookup.findVirtual(IGLFWCharModsFun.class, "invoke", MTYPE);
    }
}
