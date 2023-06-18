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

package org.overrun.gl.demo.nfd;

import org.overrun.gl.nfd.NativeFileDialog;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

/**
 * @author squid233
 * @since 0.1.0
 */
public final class NFDTest {
    public static void main(String[] args) {
        System.out.println("----- 1. openDialog without any arguments -----");
        try (Arena arena = Arena.ofConfined()) {
            String[] path = new String[1];
            switch (NativeFileDialog.openDialog(arena, null, null, path)) {
                case ERROR -> System.err.println("Error: " + NativeFileDialog.getError());
                case OKAY -> System.out.println("Success! " + path[0]);
                case CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        System.out.println("----- 2. openDialog with filterList -----");
        try (Arena arena = Arena.ofConfined()) {
            String[] path = new String[1];
            switch (NativeFileDialog.openDialog(arena, "png,jpg;txt", null, path)) {
                case ERROR -> System.err.println("Error: " + NativeFileDialog.getError());
                case OKAY -> System.out.println("Success! " + path[0]);
                case CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        System.out.println("----- 3. openDialog with defaultPath -----");
        try (Arena arena = Arena.ofConfined()) {
            String[] path = new String[1];
            switch (NativeFileDialog.openDialog(arena, null, System.getProperty("user.home"), path)) {
                case ERROR -> System.err.println("Error: " + NativeFileDialog.getError());
                case OKAY -> System.out.println("Success! " + path[0]);
                case CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        System.out.println("----- 4. openDialogMultiple -----");
        try (Arena arena = Arena.ofConfined()) {
            final MemorySegment pathSet = arena.allocate(NativeFileDialog.PATH_SET_LAYOUT);
            switch (NativeFileDialog.openDialogMultiple(arena, null, null, pathSet)) {
                case ERROR -> System.err.println("Error: " + NativeFileDialog.getError());
                case OKAY -> {
                    System.out.println("Success!");
                    for (long i = 0; i < NativeFileDialog.pathSetGetCount(pathSet); i++) {
                        System.out.println(i + ": " + NativeFileDialog.pathSetGetPath(pathSet, i));
                    }
                    NativeFileDialog.pathSetFree(pathSet);
                }
                case CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        System.out.println("----- 5. saveDialog -----");
        try (Arena arena = Arena.ofConfined()) {
            String[] path = new String[1];
            switch (NativeFileDialog.saveDialog(arena, null, null, path)) {
                case ERROR -> System.err.println("Error: " + NativeFileDialog.getError());
                case OKAY -> System.out.println("Success! " + path[0]);
                case CANCEL -> System.out.println("User pressed cancel.");
            }
        }

        System.out.println("----- 6. pickFolder -----");
        try (Arena arena = Arena.ofConfined()) {
            String[] path = new String[1];
            switch (NativeFileDialog.pickFolder(arena, null, path)) {
                case ERROR -> System.err.println("Error: " + NativeFileDialog.getError());
                case OKAY -> System.out.println("Success! " + path[0]);
                case CANCEL -> System.out.println("User pressed cancel.");
            }
        }
    }
}
