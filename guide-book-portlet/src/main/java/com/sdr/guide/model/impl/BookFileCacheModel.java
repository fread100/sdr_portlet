package com.sdr.guide.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sdr.guide.model.BookFile;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing BookFile in entity cache.
 *
 * @author leegyuseong
 * @see BookFile
 * @generated
 */
public class BookFileCacheModel implements CacheModel<BookFile>, Externalizable {
    public int gusetbookId;
    public int fileId;
    public String fileName;
    public String fileType;
    public String fileLocation;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long deleteDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{gusetbookId=");
        sb.append(gusetbookId);
        sb.append(", fileId=");
        sb.append(fileId);
        sb.append(", fileName=");
        sb.append(fileName);
        sb.append(", fileType=");
        sb.append(fileType);
        sb.append(", fileLocation=");
        sb.append(fileLocation);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", deleteDate=");
        sb.append(deleteDate);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public BookFile toEntityModel() {
        BookFileImpl bookFileImpl = new BookFileImpl();

        bookFileImpl.setGusetbookId(gusetbookId);
        bookFileImpl.setFileId(fileId);

        if (fileName == null) {
            bookFileImpl.setFileName(StringPool.BLANK);
        } else {
            bookFileImpl.setFileName(fileName);
        }

        if (fileType == null) {
            bookFileImpl.setFileType(StringPool.BLANK);
        } else {
            bookFileImpl.setFileType(fileType);
        }

        if (fileLocation == null) {
            bookFileImpl.setFileLocation(StringPool.BLANK);
        } else {
            bookFileImpl.setFileLocation(fileLocation);
        }

        bookFileImpl.setGroupId(groupId);
        bookFileImpl.setCompanyId(companyId);
        bookFileImpl.setUserId(userId);

        if (userName == null) {
            bookFileImpl.setUserName(StringPool.BLANK);
        } else {
            bookFileImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            bookFileImpl.setCreateDate(null);
        } else {
            bookFileImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            bookFileImpl.setModifiedDate(null);
        } else {
            bookFileImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (deleteDate == Long.MIN_VALUE) {
            bookFileImpl.setDeleteDate(null);
        } else {
            bookFileImpl.setDeleteDate(new Date(deleteDate));
        }

        bookFileImpl.resetOriginalValues();

        return bookFileImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        gusetbookId = objectInput.readInt();
        fileId = objectInput.readInt();
        fileName = objectInput.readUTF();
        fileType = objectInput.readUTF();
        fileLocation = objectInput.readUTF();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        deleteDate = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(gusetbookId);
        objectOutput.writeInt(fileId);

        if (fileName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(fileName);
        }

        if (fileType == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(fileType);
        }

        if (fileLocation == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(fileLocation);
        }

        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(deleteDate);
    }
}
