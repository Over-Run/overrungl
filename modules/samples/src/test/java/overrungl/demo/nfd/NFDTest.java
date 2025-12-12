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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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
            outPath = MemoryUtil.nativeString(pOutPath.get(ValueLayout.ADDRESS, 0));

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

                    int numPaths;
                    try (MemoryStack stack1 = MemoryStack.pushLocal()) {
                        MemorySegment pNumPaths = stack1.allocate(ValueLayout.JAVA_INT);
                        NFD_PathSet_GetCount(outPaths, pNumPaths);
                        numPaths = pNumPaths.get(ValueLayout.JAVA_INT, 0);
                    }
                    for (int i = 0; i < numPaths; i++) {
                        String outPath;
                        try (MemoryStack stack1 = MemoryStack.pushLocal()) {
                            var pOutPath = stack1.allocate(ValueLayout.ADDRESS);
                            NFD_PathSet_GetPath(outPaths, i, pOutPath);
                            outPath = MemoryUtil.nativeString(pOutPath.get(ValueLayout.ADDRESS, 0));
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
            outPath = MemoryUtil.nativeString(segment.get(ValueLayout.ADDRESS, 0));
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
            final int result = NFD_SaveDialog(segment, filterItem.segment(), (int) filterItem.estimateCount(), MemorySegment.NULL, stack.allocateFrom("Untitled.java"));
            savePath = MemoryUtil.nativeString(segment.get(ValueLayout.ADDRESS, 0));
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
            .nameAt(0, allocator.allocateFrom("Source code"))
            .specAt(0, allocator.allocateFrom("java"))
            .nameAt(1, allocator.allocateFrom("Image file"))
            .specAt(1, allocator.allocateFrom("png,jpg"));
    }
}
