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

import overrun.marshal.LayoutBuilder;
import overrun.marshal.struct.Struct;
import overrun.marshal.struct.StructAllocator;

import java.lang.invoke.MethodHandles;

/**
 * The OpenGL 4.2 draw arrays indirect command.
 * <h2>Layout</h2>
 * <pre><code>
 * struct DrawArraysIndirectCommand {
 *     unsigned int {@link #count};
 *     unsigned int {@link #primCount};
 *     unsigned int {@link #first};
 *     unsigned int {@link #baseInstance};
 * }</code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public interface DrawArraysIndirectCommand extends Struct<DrawArraysIndirectCommand> {
    /**
     * The allocator
     */
    StructAllocator<DrawArraysIndirectCommand> OF = new StructAllocator<>(
        MethodHandles.lookup(),
        LayoutBuilder.struct()
            .cInt("count")
            .cInt("primCount")
            .cInt("first")
            .cInt("baseInstance")
            .build()
    );

    /**
     * {@return count}
     */
    int count();

    /**
     * Sets {@link #count()}.
     *
     * @param val the value
     * @return this
     */
    DrawArraysIndirectCommand count(int val);

    /**
     * {@return primCount}
     */
    int primCount();

    /**
     * Sets {@link #primCount()}.
     *
     * @param val the value
     * @return this
     */
    DrawArraysIndirectCommand primCount(int val);

    /**
     * {@return first}
     */
    int first();

    /**
     * Sets {@link #first()}.
     *
     * @param val the value
     * @return this
     */
    DrawArraysIndirectCommand first(int val);

    /**
     * {@return baseInstance}
     */
    int baseInstance();

    /**
     * Sets {@link #baseInstance()}.
     *
     * @param val the value
     * @return this
     */
    DrawArraysIndirectCommand baseInstance(int val);
}
