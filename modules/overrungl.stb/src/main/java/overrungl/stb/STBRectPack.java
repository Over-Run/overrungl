/*
 * MIT License
 *
 * Copyright (c) 2024-2025 Overrun Organization
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

import overrungl.annotation.CType;
import overrungl.internal.RuntimeHelper;
import overrungl.util.Marshal;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

/// [stb_rect_pack.h](https://github.com/nothings/stb/blob/master/stb_rect_pack.h)
///
/// @author squid233
/// @since 0.1.0
public final class STBRectPack {
    //region ---[BEGIN GENERATOR BEGIN]---
    //@formatter:off
    //region Fields
    public static final int STBRP__MAXVAL = 0x7fffffff;
    public static final int STBRP_HEURISTIC_Skyline_default = 0;
    public static final int STBRP_HEURISTIC_Skyline_BL_sortHeight = STBRP_HEURISTIC_Skyline_default;
    public static final int STBRP_HEURISTIC_Skyline_BF_sortHeight = 1;
    //endregion
    /// Function descriptors.
    public static final class Descriptors {
        private Descriptors() { }
        /// The function descriptor of `stbrp_pack_rects`.
        public static final FunctionDescriptor FD_stbrp_pack_rects = FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPRect.LAYOUT), ValueLayout.JAVA_INT);
        /// The function descriptor of `stbrp_init_target`.
        public static final FunctionDescriptor FD_stbrp_init_target = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPNode.LAYOUT), ValueLayout.JAVA_INT);
        /// The function descriptor of `stbrp_setup_allow_out_of_mem`.
        public static final FunctionDescriptor FD_stbrp_setup_allow_out_of_mem = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.JAVA_BOOLEAN);
        /// The function descriptor of `stbrp_setup_heuristic`.
        public static final FunctionDescriptor FD_stbrp_setup_heuristic = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(overrungl.stb.STBRPContext.LAYOUT), ValueLayout.JAVA_INT);
    }
    /// Method handles.
    public static final class Handles {
        /// The method handle of `stbrp_pack_rects`.
        public static final MethodHandle MH_stbrp_pack_rects = RuntimeHelper.downcall(Descriptors.FD_stbrp_pack_rects);
        /// The method handle of `stbrp_init_target`.
        public static final MethodHandle MH_stbrp_init_target = RuntimeHelper.downcall(Descriptors.FD_stbrp_init_target);
        /// The method handle of `stbrp_setup_allow_out_of_mem`.
        public static final MethodHandle MH_stbrp_setup_allow_out_of_mem = RuntimeHelper.downcall(Descriptors.FD_stbrp_setup_allow_out_of_mem);
        /// The method handle of `stbrp_setup_heuristic`.
        public static final MethodHandle MH_stbrp_setup_heuristic = RuntimeHelper.downcall(Descriptors.FD_stbrp_setup_heuristic);
        /// The function address of `stbrp_pack_rects`.
        public final MemorySegment PFN_stbrp_pack_rects;
        /// The function address of `stbrp_init_target`.
        public final MemorySegment PFN_stbrp_init_target;
        /// The function address of `stbrp_setup_allow_out_of_mem`.
        public final MemorySegment PFN_stbrp_setup_allow_out_of_mem;
        /// The function address of `stbrp_setup_heuristic`.
        public final MemorySegment PFN_stbrp_setup_heuristic;
        private Handles() {
            PFN_stbrp_pack_rects = STBInternal.lookup().findOrThrow("stbrp_pack_rects");
            PFN_stbrp_init_target = STBInternal.lookup().findOrThrow("stbrp_init_target");
            PFN_stbrp_setup_allow_out_of_mem = STBInternal.lookup().findOrThrow("stbrp_setup_allow_out_of_mem");
            PFN_stbrp_setup_heuristic = STBInternal.lookup().findOrThrow("stbrp_setup_heuristic");
        }
        private static volatile Handles instance;
        private static Handles get() {
            if (instance == null) {
                synchronized (Handles.class) {
                    if (instance == null) { instance = new Handles(); }
                }
            }
            return instance;
        }
    }

    public static @CType("int") int stbrp_pack_rects(@CType("stbrp_context *") MemorySegment context, @CType("stbrp_rect *") MemorySegment rects, @CType("int") int num_rects) {
        try {
            return (int) Handles.MH_stbrp_pack_rects.invokeExact(Handles.get().PFN_stbrp_pack_rects, context, rects, num_rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_pack_rects", e); }
    }

    public static @CType("int") int stbrp_pack_rects(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("stbrp_rect *") overrungl.stb.STBRPRect rects, @CType("int") int num_rects) {
        try {
            return (int) Handles.MH_stbrp_pack_rects.invokeExact(Handles.get().PFN_stbrp_pack_rects, Marshal.marshal(context), Marshal.marshal(rects), num_rects);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_pack_rects", e); }
    }

    public static void stbrp_init_target(@CType("stbrp_context *") MemorySegment context, @CType("int") int width, @CType("int") int height, @CType("stbrp_node *") MemorySegment nodes, @CType("int") int num_nodes) {
        try {
            Handles.MH_stbrp_init_target.invokeExact(Handles.get().PFN_stbrp_init_target, context, width, height, nodes, num_nodes);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_init_target", e); }
    }

    public static void stbrp_init_target(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("int") int width, @CType("int") int height, @CType("stbrp_node *") overrungl.stb.STBRPNode nodes, @CType("int") int num_nodes) {
        try {
            Handles.MH_stbrp_init_target.invokeExact(Handles.get().PFN_stbrp_init_target, Marshal.marshal(context), width, height, Marshal.marshal(nodes), num_nodes);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_init_target", e); }
    }

    public static void stbrp_setup_allow_out_of_mem(@CType("stbrp_context *") MemorySegment context, @CType("int") boolean allow_out_of_mem) {
        try {
            Handles.MH_stbrp_setup_allow_out_of_mem.invokeExact(Handles.get().PFN_stbrp_setup_allow_out_of_mem, context, allow_out_of_mem);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_allow_out_of_mem", e); }
    }

    public static void stbrp_setup_allow_out_of_mem(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("int") boolean allow_out_of_mem) {
        try {
            Handles.MH_stbrp_setup_allow_out_of_mem.invokeExact(Handles.get().PFN_stbrp_setup_allow_out_of_mem, Marshal.marshal(context), allow_out_of_mem);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_allow_out_of_mem", e); }
    }

    public static void stbrp_setup_heuristic(@CType("stbrp_context *") MemorySegment context, @CType("int") int heuristic) {
        try {
            Handles.MH_stbrp_setup_heuristic.invokeExact(Handles.get().PFN_stbrp_setup_heuristic, context, heuristic);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_heuristic", e); }
    }

    public static void stbrp_setup_heuristic(@CType("stbrp_context *") overrungl.stb.STBRPContext context, @CType("int") int heuristic) {
        try {
            Handles.MH_stbrp_setup_heuristic.invokeExact(Handles.get().PFN_stbrp_setup_heuristic, Marshal.marshal(context), heuristic);
        } catch (Throwable e) { throw new RuntimeException("error in stbrp_setup_heuristic", e); }
    }

    //@formatter:on
    //endregion ---[END GENERATOR END]---

    private STBRectPack() {
    }
}
