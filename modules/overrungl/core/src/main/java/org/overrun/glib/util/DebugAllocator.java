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

package org.overrun.glib.util;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;
import org.overrun.glib.Configurations;
import org.overrun.glib.RuntimeHelper;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * Wraps a MemoryAllocator to track allocations and detect memory leaks.
 *
 * @author squid233
 * @since 0.1.0
 */
final class DebugAllocator {
    private static final ConcurrentMap<Allocation, Allocation> ALLOCATIONS = new ConcurrentHashMap<>();
    private static final ConcurrentMap<Long, String> THREADS = new ConcurrentHashMap<>();

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            if (ALLOCATIONS.isEmpty()) {
                return;
            }

            boolean missingStacktrace = false;
            for (Allocation allocation : ALLOCATIONS.keySet()) {
                StringBuilder sb = new StringBuilder(512);

                sb.append("[OverrunGL] ")
                    .append(allocation.size)
                    .append(" bytes leaked, thread ")
                    .append(allocation.threadId)
                    .append(" (")
                    .append(THREADS.get(allocation.threadId))
                    .append("), address: 0x")
                    .append(Long.toHexString(allocation.address).toUpperCase())
                    .append("\n");

                StackTraceElement[] stackTrace = allocation.getElements();
                if (stackTrace != null) {
                    for (Object el : stackTrace) {
                        sb.append("\tat ")
                            .append(el.toString())
                            .append("\n");
                    }
                } else {
                    missingStacktrace = true;
                }

                RuntimeHelper.apiLog(sb.toString());
            }

            if (missingStacktrace) {
                RuntimeHelper.apiLog("[OverrunGL] Reminder: disable Configurations.DEBUG_MEM_UTIL_FAST to get stacktrace of leaking allocations.\n");
            }
        }));
    }

    static long track(long address, long size) {
        if (address != RuntimeHelper.NULL) {
            Thread t = Thread.currentThread();
            THREADS.putIfAbsent(t.threadId(), t.getName());

            Allocation allocationNew = new Allocation(
                address,
                size,
                t.threadId(),
                Configurations.DEBUG_MEM_UTIL_FAST.get() ? null : StackWalkUtil.stackWalkGetTrace()
            );

            Allocation allocationOld = ALLOCATIONS.put(allocationNew, allocationNew);
            if (allocationOld != null) {
                trackAbort(address, allocationOld, allocationNew);
            }
        }
        return address;
    }

    private static void trackAbort(long address, Allocation allocationOld, Allocation allocationNew) {
        String addressHex = Long.toHexString(address).toUpperCase();

        trackAbortPrint(allocationOld, "Old", addressHex);
        trackAbortPrint(allocationNew, "New", addressHex);

        throw new IllegalStateException("The memory address specified is already being tracked: 0x" + addressHex);
    }

    private static void trackAbortPrint(Allocation allocation, String name, String address) {
        StringBuilder sb = new StringBuilder(512);

        sb.append("[OverrunGL] ")
            .append(name)
            .append(" allocation with size ")
            .append(allocation.size)
            .append(", thread ")
            .append(allocation.threadId)
            .append(" (")
            .append(THREADS.get(allocation.threadId))
            .append("), address: 0x")
            .append(address)
            .append("\n");

        StackTraceElement[] stackTrace = allocation.getElements();
        if (stackTrace != null) {
            for (Object el : stackTrace) {
                sb.append("\tat ")
                    .append(el.toString())
                    .append("\n");
            }
        }

        RuntimeHelper.apiLog(sb.toString());
    }

    static long untrack(long address) {
        if (address == RuntimeHelper.NULL) {
            return 0L;
        }

        Allocation allocation = ALLOCATIONS.remove(new Allocation(address, 0L, 0L, null));
        if (allocation == null) {
            untrackAbort(address);
        }

        return allocation.size;
    }

    @Contract("_ -> fail")
    private static void untrackAbort(long address) {
        String addressHex = Long.toHexString(address).toUpperCase();

        throw new IllegalStateException("The memory address specified is not being tracked: 0x" + addressHex);
    }

    private record Allocation(long address, long size, long threadId, @Nullable Object[] stacktrace) {
        @Nullable
        private StackTraceElement[] getElements() {
            return stacktrace == null ? null : StackWalkUtil.stackWalkArray(stacktrace);
        }

        @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
        @Override
        public boolean equals(Object obj) {
            return address == ((Allocation) obj).address;
        }

        @Override
        public int hashCode() {
            return Long.hashCode(address);
        }
    }
}
