/*
 * MIT License
 *
 * Copyright (c) 2023-2025 Overrun Organization
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

package overrungl.demo.nfd;

import overrungl.nfd.NFDEnumerator;
import overrungl.nfd.NFDFilterItem;
import overrungl.util.MemoryStack;
import overrungl.util.MemoryUtil;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.ValueLayout;

import static overrungl.nfd.NFD.*;

/**
 * @author squid233
 * @since 0.1.0
 */
public final class NFDTest {
    private static void openDialog() {
        System.out.println("===== openDialog =====");
        // initialize NFD
        // either call NFD::init at the start of your program and NFD::quit at the end of your program,
        // or before/after every time you want to show a file dialog.
        NFD_Init();

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pOutPath = stack.allocate(ValueLayout.ADDRESS);
            String outPath;

            // prepare filters for the dialog
            final var filterItem = setupFilterItem(stack);

            // show the dialog
            final int result = NFD_OpenDialog(pOutPath, filterItem.segment(), (int) filterItem.estimateCount(), MemorySegment.NULL);
            outPath = NFD_NativeString(pOutPath.get(ValueLayout.ADDRESS, 0));

            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> System.out.println("Success! " + outPath);
                case NFD_CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        // Quit NFD
        NFD_Quit();
    }

    private static void openDialogMultiple() {
        System.out.println("===== openDialogMultiple =====");
        // initialize NFD
        // either call NFD::init at the start of your program and NFD::quit at the end of your program,
        // or before/after every time you want to show a file dialog.
        NFD_Init();

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pOutPaths = stack.allocate(ValueLayout.ADDRESS);

            // prepare filters for the dialog
            final var filterItem = setupFilterItem(stack);

            // show the dialog
            final int result = NFD_OpenDialogMultiple(pOutPaths, filterItem.segment(), (int) filterItem.estimateCount(), MemorySegment.NULL);
            MemorySegment outPaths = pOutPaths.get(ValueLayout.ADDRESS, 0);

            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> {
                    System.out.println("Success!");

                    long numPaths;
                    try (MemoryStack stack1 = MemoryStack.pushLocal()) {
                        MemorySegment pNumPaths = stack1.allocate(nfdpathsetsize_t);
                        NFD_PathSet_GetCount(outPaths, pNumPaths);
                        numPaths = MemoryUtil.wideningToLong(nfdpathsetsize_t, switch (nfdpathsetsize_t) {
                            case ValueLayout.OfInt ofInt -> pNumPaths.get(ofInt, 0);
                            case ValueLayout.OfLong ofLong -> pNumPaths.get(ofLong, 0);
                            default -> throw new IllegalStateException("Unexpected value: " + nfdpathsetsize_t);
                        });
                    }
                    for (long i = 0; i < numPaths; i++) {
                        String outPath;
                        try (MemoryStack stack1 = MemoryStack.pushLocal()) {
                            var pOutPath = stack1.allocate(ValueLayout.ADDRESS);
                            NFD_PathSet_GetPath(outPaths, i, pOutPath);
                            outPath = NFD_NativeString(pOutPath.get(ValueLayout.ADDRESS, 0));
                        }
                        System.out.println("Path " + i + ": " + outPath);
                    }

                    // remember to free the path-set memory (since NFDResult::OKAY is returned)
                    NFD_PathSet_Free(outPaths);
                }
                case NFD_CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        // Quit NFD
        NFD_Quit();
    }

    private static void openDialogMultipleEnum() {
        System.out.println("===== openDialogMultipleEnum =====");
        // initialize NFD
        // either call NFD::init at the start of your program and NFD::quit at the end of your program,
        // or before/after every time you want to show a file dialog.
        NFD_Init();

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment pOutPaths = stack.allocate(ValueLayout.ADDRESS);

            // prepare filters for the dialog
            final var filterItem = setupFilterItem(stack);

            // show the dialog
            final int result = NFD_OpenDialogMultiple(pOutPaths, filterItem.segment(), (int) filterItem.estimateCount(), MemorySegment.NULL);
            MemorySegment outPaths = pOutPaths.get(ValueLayout.ADDRESS, 0);

            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> {
                    System.out.println("Success!");

                    try (NFDEnumerator enumerator = NFDEnumerator.fromPathSet(stack, outPaths).enumerator()) {
                        int i = 0;
                        for (String path : enumerator) {
                            System.out.println("Path " + i + ": " + path);
                            i++;
                        }
                    }

                    // remember to free the path-set memory (since NFDResult::OKAY is returned)
                    NFD_PathSet_Free(outPaths);
                }
                case NFD_CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        // Quit NFD
        NFD_Quit();
    }

    private static void pickFolder() {
        System.out.println("===== pickFolder =====");
        // initialize NFD
        // either call NFD::init at the start of your program and NFD::quit at the end of your program,
        // or before/after every time you want to show a file dialog.
        NFD_Init();

        String outPath;

        // show the dialog
        int result;
        try (MemoryStack stack = MemoryStack.pushLocal()) {
            MemorySegment segment = stack.allocate(ValueLayout.ADDRESS);
            result = NFD_PickFolder(segment, MemorySegment.NULL);
            outPath = NFD_NativeString(segment.get(ValueLayout.ADDRESS, 0));
        }
        switch (result) {
            case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
            case NFD_OKAY -> System.out.println("Success! " + outPath);
            case NFD_CANCEL -> System.out.println("User pressed cancel.");
        }

        // Quit NFD
        NFD_Quit();
    }

    private static void saveDialog() {
        System.out.println("===== saveDialog =====");
        // initialize NFD
        // either call NFD::init at the start of your program and NFD::quit at the end of your program,
        // or before/after every time you want to show a file dialog.
        NFD_Init();

        try (MemoryStack stack = MemoryStack.pushLocal()) {
            String savePath;

            // prepare filters for the dialog
            final var filterItem = setupFilterItem(stack);

            // show the dialog
            MemorySegment segment = stack.allocate(ValueLayout.ADDRESS);
            final int result = NFD_SaveDialog(segment, filterItem.segment(), (int) filterItem.estimateCount(), MemorySegment.NULL, NFD_AllocString(stack, "Untitled.java"));
            savePath = NFD_NativeString(segment.get(ValueLayout.ADDRESS, 0));
            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> System.out.println("Success! " + savePath);
                case NFD_CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        // Quit NFD
        NFD_Quit();
    }

    public static void main(String[] args) {
        openDialog();
        openDialogMultiple();
        openDialogMultipleEnum();
        pickFolder();
        saveDialog();
    }

    private static NFDFilterItem setupFilterItem(SegmentAllocator allocator) {
        return NFDFilterItem.alloc(allocator, 2)
            .nameAt(0, NFD_AllocString(allocator, "Source code"))
            .specAt(0, NFD_AllocString(allocator, "java"))
            .nameAt(1, NFD_AllocString(allocator, "Image file"))
            .specAt(1, NFD_AllocString(allocator, "png,jpg"));
    }
}
