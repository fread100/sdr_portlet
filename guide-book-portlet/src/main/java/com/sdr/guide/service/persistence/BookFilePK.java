package com.sdr.guide.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author leegyuseong
 * @generated
 */
public class BookFilePK implements Comparable<BookFilePK>, Serializable {
    public int gusetbookId;
    public int fileId;

    public BookFilePK() {
    }

    public BookFilePK(int gusetbookId, int fileId) {
        this.gusetbookId = gusetbookId;
        this.fileId = fileId;
    }

    public int getGusetbookId() {
        return gusetbookId;
    }

    public void setGusetbookId(int gusetbookId) {
        this.gusetbookId = gusetbookId;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @Override
    public int compareTo(BookFilePK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (gusetbookId < pk.gusetbookId) {
            value = -1;
        } else if (gusetbookId > pk.gusetbookId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (fileId < pk.fileId) {
            value = -1;
        } else if (fileId > pk.fileId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BookFilePK)) {
            return false;
        }

        BookFilePK pk = (BookFilePK) obj;

        if ((gusetbookId == pk.gusetbookId) && (fileId == pk.fileId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(gusetbookId) + String.valueOf(fileId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("gusetbookId");
        sb.append(StringPool.EQUAL);
        sb.append(gusetbookId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("fileId");
        sb.append(StringPool.EQUAL);
        sb.append(fileId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}
