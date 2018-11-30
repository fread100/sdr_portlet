package com.sdr.guide.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.sdr.guide.model.Book;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Book in entity cache.
 *
 * @author leegyuseong
 * @see Book
 * @generated
 */
public class BookCacheModel implements CacheModel<Book>, Externalizable {
    public int gusetbookId;
    public String title;
    public String content;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long deleteDate;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{gusetbookId=");
        sb.append(gusetbookId);
        sb.append(", title=");
        sb.append(title);
        sb.append(", content=");
        sb.append(content);
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
    public Book toEntityModel() {
        BookImpl bookImpl = new BookImpl();

        bookImpl.setGusetbookId(gusetbookId);

        if (title == null) {
            bookImpl.setTitle(StringPool.BLANK);
        } else {
            bookImpl.setTitle(title);
        }

        if (content == null) {
            bookImpl.setContent(StringPool.BLANK);
        } else {
            bookImpl.setContent(content);
        }

        bookImpl.setGroupId(groupId);
        bookImpl.setCompanyId(companyId);
        bookImpl.setUserId(userId);

        if (userName == null) {
            bookImpl.setUserName(StringPool.BLANK);
        } else {
            bookImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            bookImpl.setCreateDate(null);
        } else {
            bookImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            bookImpl.setModifiedDate(null);
        } else {
            bookImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (deleteDate == Long.MIN_VALUE) {
            bookImpl.setDeleteDate(null);
        } else {
            bookImpl.setDeleteDate(new Date(deleteDate));
        }

        bookImpl.resetOriginalValues();

        return bookImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        gusetbookId = objectInput.readInt();
        title = objectInput.readUTF();
        content = objectInput.readUTF();
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

        if (title == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(title);
        }

        if (content == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(content);
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
