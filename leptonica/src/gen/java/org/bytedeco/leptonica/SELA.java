// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Array of Sel */
@Name("Sela") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class SELA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SELA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SELA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SELA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SELA position(long position) {
        return (SELA)super.position(position);
    }

    /** number of sel actually stored           */
    public native @Cast("l_int32") int n(); public native SELA n(int n);
    /** size of allocated ptr array             */
    public native @Cast("l_int32") int nalloc(); public native SELA nalloc(int nalloc);
    /** sel ptr array                           */
    public native SEL sel(int i); public native SELA sel(int i, SEL sel);
    public native @Cast("Sel**") PointerPointer sel(); public native SELA sel(PointerPointer sel);
}