/*
 * MIT License
 *
 * Copyright (c) 2023 Overrun Organization
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

package overrungl.stb;

import overrungl.Struct;
import overrungl.internal.RuntimeHelper;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;

/**
 * <h2>Layout</h2>
 * <pre><code>
 * typedef struct
 * {
 *    char *{@link #vendor() vendor};
 *
 *    int {@link #commentListLength() comment_list_length};
 *    char **{@link #commentList() comment_list};
 * } stb_vorbis_comment;
 * </code></pre>
 *
 * @author squid233
 * @since 0.1.0
 */
public final class STBVorbisComment extends Struct {
    /**
     * The struct layout.
     */
    public static final StructLayout LAYOUT = MemoryLayout.structLayout(
        ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(JAVA_BYTE)).withName("vendor"),
        JAVA_INT.withName("comment_list_length"),
        ADDRESS.withTargetLayout(ADDRESS.withTargetLayout(MemoryLayout.sequenceLayout(JAVA_BYTE))).withName("comment_list")
    );
    private static final VarHandle
        vendor = LAYOUT.varHandle(PathElement.groupElement("vendor")),
        comment_list_length = LAYOUT.varHandle(PathElement.groupElement("comment_list_length")),
        comment_list = LAYOUT.varHandle(PathElement.groupElement("comment_list"));

    public STBVorbisComment(MemorySegment address) {
        super(address, LAYOUT);
    }

    public String vendor() {
        return nvendor().getUtf8String(0);
    }

    public int commentListLength() {
        return (int) comment_list_length.get(segment());
    }

    public String[] commentList() {
        final MemorySegment list = ncommentList();
        String[] arr = new String[commentListLength()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.getAtIndex(RuntimeHelper.ADDRESS_UNBOUNDED, i).getUtf8String(0);
        }
        return arr;
    }

    public MemorySegment nvendor() {
        return (MemorySegment) vendor.get(segment());
    }

    public MemorySegment ncommentList() {
        return (MemorySegment) comment_list.get(segment());
    }
}
