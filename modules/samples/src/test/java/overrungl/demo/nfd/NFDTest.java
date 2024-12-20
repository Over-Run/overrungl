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

package overrungl.demo.nfd;

import io.github.overrun.memstack.MemoryStack;
import overrungl.nfd.NFDEnumerator;
import overrungl.nfd.NFDFilterItem;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.Map;

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
            String[] outPath = new String[1];

            // prepare filters for the dialog
            final var filterItem = NFDFilterItem.create(stack,
                Map.entry("Source code", "java"),
                Map.entry("Image file", "png,jpg"));

            // show the dialog
            final int result = NFD_OpenDialog(outPath, filterItem, null);

            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> System.out.println("Success! " + outPath[0]);
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
            String[] outPath = new String[1];

            // prepare filters for the dialog
            final var filterItem = NFDFilterItem.create(stack,
                Map.entry("Source code", "java"),
                Map.entry("Image file", "png,jpg"));

            // show the dialog
            final int result = NFD_OpenDialogMultiple(pOutPaths, filterItem, null);
            MemorySegment outPaths = pOutPaths.get(ValueLayout.ADDRESS, 0);

            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> {
                    System.out.println("Success!");

                    long[] pNumPaths = new long[1];
                    NFD_PathSet_GetCount(outPaths, pNumPaths);
                    for (long i = 0, numPaths = pNumPaths[0]; i < numPaths; i++) {
                        NFD_PathSet_GetPath(outPaths, i, outPath);
                        System.out.println("Path " + i + ": " + outPath[0]);
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
            final var filterItem = NFDFilterItem.create(stack,
                Map.entry("Source code", "java"),
                Map.entry("Image file", "png,jpg"));

            // show the dialog
            final int result = NFD_OpenDialogMultiple(pOutPaths, filterItem, null);
            MemorySegment outPaths = pOutPaths.get(ValueLayout.ADDRESS, 0);

            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> {
                    System.out.println("Success!");

                    try (NFDEnumerator enumerator = NFDEnumerator.fromPathSet(stack, outPaths).x()) {
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

        String[] outPath = new String[1];

        // show the dialog
        final int result = NFD_PickFolder(outPath, null);
        switch (result) {
            case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
            case NFD_OKAY -> System.out.println("Success! " + outPath[0]);
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
            String[] savePath = new String[1];

            // prepare filters for the dialog
            final var filterItem = NFDFilterItem.create(stack,
                Map.entry("Source code", "java"),
                Map.entry("Image file", "png,jpg"));

            // show the dialog
            final int result = NFD_SaveDialog(savePath, filterItem, null, "Untitled.java");
            switch (result) {
                case NFD_ERROR -> System.err.println("Error: " + NFD_GetError());
                case NFD_OKAY -> System.out.println("Success! " + savePath[0]);
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
}
