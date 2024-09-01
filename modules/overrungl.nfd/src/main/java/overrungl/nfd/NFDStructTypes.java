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

// This file is auto-generated. DO NOT EDIT!
package overrungl.nfd;
import static overrun.marshal.gen.processor.ProcessorTypes.registerStruct;
final class NFDStructTypes {
    private NFDStructTypes() { }
    static void registerAll() {
        registerStruct(NFDU8FilterItem.class, NFDU8FilterItem.OF);
        registerStruct(NFDNFilterItem.class, NFDNFilterItem.OF);
        registerStruct(NFDWindowHandle.class, NFDWindowHandle.OF);
        registerStruct(NFDOpenDialogU8Args.class, NFDOpenDialogU8Args.OF);
        registerStruct(NFDOpenDialogNArgs.class, NFDOpenDialogNArgs.OF);
        registerStruct(NFDSaveDialogU8Args.class, NFDSaveDialogU8Args.OF);
        registerStruct(NFDSaveDialogNArgs.class, NFDSaveDialogNArgs.OF);
        registerStruct(NFDPickFolderU8Args.class, NFDPickFolderU8Args.OF);
        registerStruct(NFDPickFolderNArgs.class, NFDPickFolderNArgs.OF);
    }
}
