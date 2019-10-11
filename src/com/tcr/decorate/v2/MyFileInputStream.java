package com.tcr.decorate.v2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;

/**
 * @Description TODO
 * @Author TCR
 * @Email 670830864@qq.com
 * @Date 2019/10/11 8:44
 */
public class MyFileInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected MyFileInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char)c);
    }

    @Override
    public int read(byte[] b) throws IOException {
        int c = super.read(b);
        return c == -1 ? c : Character.toLowerCase((char)c);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int total = super.read(b, off, len);
        for(int i = off;i < off + total;i++){
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return total;
    }
}
