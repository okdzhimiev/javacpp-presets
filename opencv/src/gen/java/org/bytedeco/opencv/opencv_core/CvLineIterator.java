// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif


/** Line iterator state: */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvLineIterator extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvLineIterator() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvLineIterator(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvLineIterator(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvLineIterator position(long position) {
        return (CvLineIterator)super.position(position);
    }

    /** Pointer to the current point: */
    public native @Cast("uchar*") BytePointer ptr(); public native CvLineIterator ptr(BytePointer ptr);

    /* Bresenham algorithm state: */
    public native int err(); public native CvLineIterator err(int err);
    public native int plus_delta(); public native CvLineIterator plus_delta(int plus_delta);
    public native int minus_delta(); public native CvLineIterator minus_delta(int minus_delta);
    public native int plus_step(); public native CvLineIterator plus_step(int plus_step);
    public native int minus_step(); public native CvLineIterator minus_step(int minus_step);
}