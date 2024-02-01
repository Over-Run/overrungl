/*
 * MIT License
 *
 * Copyright (c) 2023-2024 Overrun Organization
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

package overrungl.opengl.ext.nv;

import overrun.marshal.Upcall;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * {@link GLNVDrawVulkanImage}
 *
 * @author squid233
 * @since 0.1.0
 */
@FunctionalInterface
public interface GLVulkanProcNV extends Upcall {
    /**
     * The type.
     */
    Type<GLVulkanProcNV> TYPE = Upcall.type();

    @Stub
    void invoke();

    @Override
    default MemorySegment stub(Arena arena) {
        return TYPE.of(arena, this);
    }

    @Wrapper
    static GLVulkanProcNV wrap(Arena arena, MemorySegment stub) {
        return TYPE.wrap(stub, handle -> () -> {
            try {
                handle.invokeExact();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        });
    }
}
