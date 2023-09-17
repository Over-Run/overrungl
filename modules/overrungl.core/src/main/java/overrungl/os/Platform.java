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

package overrungl.os;

import overrungl.internal.Exceptions;

/**
 * The native platform, identifying the operating system and the architecture.
 *
 * @author squid233
 * @since 0.1.0
 */
public sealed interface Platform {
    /**
     * {@return the current native platform}
     */
    static Platform current() {
        class Holder {
            private static final Platform CURRENT;

            static {
                final String os = System.getProperty("os.name");
                if (os.startsWith("Linux") || os.startsWith("FreeBSD") || os.startsWith("SunOS") || os.startsWith("Unit"))
                    CURRENT = Linux.INSTANCE;
                else if (os.startsWith("Mac OS X") || os.startsWith("Darwin"))
                    CURRENT = MacOSX.INSTANCE;
                else if (os.startsWith("Windows"))
                    CURRENT = Windows.INSTANCE;
                else throw Exceptions.ISE. "Unrecognized or unsupported platform: \{ os }" ;
            }
        }
        return Holder.CURRENT;
    }

    /**
     * {@return the family name of this platform}
     */
    String familyName();

    /**
     * {@return the suffix of shared library on this platform, including dot}
     */
    String sharedLibrarySuffix();

    /**
     * Converts the given library name for this platform.
     *
     * @param libraryName the original library name.
     * @return the processed library name.
     */
    String sharedLibraryName(String libraryName);

    /**
     * Linux
     *
     * @author squid233
     * @since 0.1.0
     */
    final class Linux implements Platform {
        private static final Linux INSTANCE = new Linux();

        @Override
        public String familyName() {
            return "linux";
        }

        @Override
        public String sharedLibrarySuffix() {
            return ".so";
        }

        @Override
        public String sharedLibraryName(String libraryName) {
            return Platform.unixSharedLibraryName(libraryName, sharedLibrarySuffix());
        }

        @Override
        public String toString() {
            return familyName();
        }
    }

    /**
     * Mac OS X
     *
     * @author squid233
     * @since 0.1.0
     */
    final class MacOSX implements Platform {
        private static final MacOSX INSTANCE = new MacOSX();

        @Override
        public String familyName() {
            return "macos";
        }

        @Override
        public String sharedLibrarySuffix() {
            return ".dylib";
        }

        @Override
        public String sharedLibraryName(String libraryName) {
            return Platform.unixSharedLibraryName(libraryName, sharedLibrarySuffix());
        }

        @Override
        public String toString() {
            return familyName();
        }
    }

    /**
     * Windows
     *
     * @author squid233
     * @since 0.1.0
     */
    final class Windows implements Platform {
        private static final Windows INSTANCE = new Windows();

        @Override
        public String familyName() {
            return "windows";
        }

        @Override
        public String sharedLibrarySuffix() {
            return ".dll";
        }

        @Override
        public String sharedLibraryName(String libraryName) {
            return Platform.withExtension(libraryName, sharedLibrarySuffix());
        }

        @Override
        public String toString() {
            return familyName();
        }
    }

    private static String unixSharedLibraryName(String libraryName, String suffix) {
        if (libraryName.endsWith(suffix)) {
            return libraryName;
        }
        int pos = libraryName.lastIndexOf('/');
        if (pos >= 0) {
            return STR. "\{ libraryName.substring(0, pos + 1) }lib\{ libraryName.substring(pos + 1) }\{ suffix }" ;
        }
        return STR. "lib\{ libraryName }\{ suffix }" ;
    }

    /**
     * Returns a representation of the file path with an alternate extension.  If the file path has no extension,
     * then the provided extension is simply concatenated.  If the file path has an extension, the extension is
     * stripped and replaced with the provided extension.
     * <p>
     * e.g. with a provided extension of ".bar"
     * foo -&gt; foo.bar
     * foo.baz -&gt; foo.bar
     *
     * @param filePath  the file path to transform
     * @param extension the extension to use in the transformed path
     * @return the transformed path
     */
    private static String withExtension(String filePath, String extension) {
        if (filePath.toLowerCase().endsWith(extension)) {
            return filePath;
        }
        return removeExtension(filePath) + extension;
    }

    /**
     * Removes the extension (if any) from the file path.  If the file path has no extension, then it returns the same string.
     *
     * @return the file path without an extension
     */
    private static String removeExtension(String filePath) {
        int fileNameStart = Math.max(filePath.lastIndexOf('/'), filePath.lastIndexOf('\\'));
        int extensionPos = filePath.lastIndexOf('.');

        if (extensionPos > fileNameStart) {
            return filePath.substring(0, extensionPos);
        }
        return filePath;
    }
}
