package com.sdr.guide.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link BookFile}.
 * </p>
 *
 * @author leegyuseong
 * @see BookFile
 * @generated
 */
public class BookFileWrapper implements BookFile, ModelWrapper<BookFile> {
    private BookFile _bookFile;

    public BookFileWrapper(BookFile bookFile) {
        _bookFile = bookFile;
    }

    @Override
    public Class<?> getModelClass() {
        return BookFile.class;
    }

    @Override
    public String getModelClassName() {
        return BookFile.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("gusetbookId", getGusetbookId());
        attributes.put("fileId", getFileId());
        attributes.put("fileName", getFileName());
        attributes.put("fileType", getFileType());
        attributes.put("fileLocation", getFileLocation());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("deleteDate", getDeleteDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer gusetbookId = (Integer) attributes.get("gusetbookId");

        if (gusetbookId != null) {
            setGusetbookId(gusetbookId);
        }

        Integer fileId = (Integer) attributes.get("fileId");

        if (fileId != null) {
            setFileId(fileId);
        }

        String fileName = (String) attributes.get("fileName");

        if (fileName != null) {
            setFileName(fileName);
        }

        String fileType = (String) attributes.get("fileType");

        if (fileType != null) {
            setFileType(fileType);
        }

        String fileLocation = (String) attributes.get("fileLocation");

        if (fileLocation != null) {
            setFileLocation(fileLocation);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Date deleteDate = (Date) attributes.get("deleteDate");

        if (deleteDate != null) {
            setDeleteDate(deleteDate);
        }
    }

    /**
    * Returns the primary key of this book file.
    *
    * @return the primary key of this book file
    */
    @Override
    public com.sdr.guide.service.persistence.BookFilePK getPrimaryKey() {
        return _bookFile.getPrimaryKey();
    }

    /**
    * Sets the primary key of this book file.
    *
    * @param primaryKey the primary key of this book file
    */
    @Override
    public void setPrimaryKey(
        com.sdr.guide.service.persistence.BookFilePK primaryKey) {
        _bookFile.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the gusetbook ID of this book file.
    *
    * @return the gusetbook ID of this book file
    */
    @Override
    public int getGusetbookId() {
        return _bookFile.getGusetbookId();
    }

    /**
    * Sets the gusetbook ID of this book file.
    *
    * @param gusetbookId the gusetbook ID of this book file
    */
    @Override
    public void setGusetbookId(int gusetbookId) {
        _bookFile.setGusetbookId(gusetbookId);
    }

    /**
    * Returns the file ID of this book file.
    *
    * @return the file ID of this book file
    */
    @Override
    public int getFileId() {
        return _bookFile.getFileId();
    }

    /**
    * Sets the file ID of this book file.
    *
    * @param fileId the file ID of this book file
    */
    @Override
    public void setFileId(int fileId) {
        _bookFile.setFileId(fileId);
    }

    /**
    * Returns the file name of this book file.
    *
    * @return the file name of this book file
    */
    @Override
    public java.lang.String getFileName() {
        return _bookFile.getFileName();
    }

    /**
    * Sets the file name of this book file.
    *
    * @param fileName the file name of this book file
    */
    @Override
    public void setFileName(java.lang.String fileName) {
        _bookFile.setFileName(fileName);
    }

    /**
    * Returns the file type of this book file.
    *
    * @return the file type of this book file
    */
    @Override
    public java.lang.String getFileType() {
        return _bookFile.getFileType();
    }

    /**
    * Sets the file type of this book file.
    *
    * @param fileType the file type of this book file
    */
    @Override
    public void setFileType(java.lang.String fileType) {
        _bookFile.setFileType(fileType);
    }

    /**
    * Returns the file location of this book file.
    *
    * @return the file location of this book file
    */
    @Override
    public java.lang.String getFileLocation() {
        return _bookFile.getFileLocation();
    }

    /**
    * Sets the file location of this book file.
    *
    * @param fileLocation the file location of this book file
    */
    @Override
    public void setFileLocation(java.lang.String fileLocation) {
        _bookFile.setFileLocation(fileLocation);
    }

    /**
    * Returns the group ID of this book file.
    *
    * @return the group ID of this book file
    */
    @Override
    public long getGroupId() {
        return _bookFile.getGroupId();
    }

    /**
    * Sets the group ID of this book file.
    *
    * @param groupId the group ID of this book file
    */
    @Override
    public void setGroupId(long groupId) {
        _bookFile.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this book file.
    *
    * @return the company ID of this book file
    */
    @Override
    public long getCompanyId() {
        return _bookFile.getCompanyId();
    }

    /**
    * Sets the company ID of this book file.
    *
    * @param companyId the company ID of this book file
    */
    @Override
    public void setCompanyId(long companyId) {
        _bookFile.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this book file.
    *
    * @return the user ID of this book file
    */
    @Override
    public long getUserId() {
        return _bookFile.getUserId();
    }

    /**
    * Sets the user ID of this book file.
    *
    * @param userId the user ID of this book file
    */
    @Override
    public void setUserId(long userId) {
        _bookFile.setUserId(userId);
    }

    /**
    * Returns the user uuid of this book file.
    *
    * @return the user uuid of this book file
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFile.getUserUuid();
    }

    /**
    * Sets the user uuid of this book file.
    *
    * @param userUuid the user uuid of this book file
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _bookFile.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this book file.
    *
    * @return the user name of this book file
    */
    @Override
    public java.lang.String getUserName() {
        return _bookFile.getUserName();
    }

    /**
    * Sets the user name of this book file.
    *
    * @param userName the user name of this book file
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _bookFile.setUserName(userName);
    }

    /**
    * Returns the create date of this book file.
    *
    * @return the create date of this book file
    */
    @Override
    public java.util.Date getCreateDate() {
        return _bookFile.getCreateDate();
    }

    /**
    * Sets the create date of this book file.
    *
    * @param createDate the create date of this book file
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _bookFile.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this book file.
    *
    * @return the modified date of this book file
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _bookFile.getModifiedDate();
    }

    /**
    * Sets the modified date of this book file.
    *
    * @param modifiedDate the modified date of this book file
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _bookFile.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the delete date of this book file.
    *
    * @return the delete date of this book file
    */
    @Override
    public java.util.Date getDeleteDate() {
        return _bookFile.getDeleteDate();
    }

    /**
    * Sets the delete date of this book file.
    *
    * @param deleteDate the delete date of this book file
    */
    @Override
    public void setDeleteDate(java.util.Date deleteDate) {
        _bookFile.setDeleteDate(deleteDate);
    }

    @Override
    public boolean isNew() {
        return _bookFile.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bookFile.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bookFile.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bookFile.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bookFile.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bookFile.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bookFile.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bookFile.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bookFile.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bookFile.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bookFile.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BookFileWrapper((BookFile) _bookFile.clone());
    }

    @Override
    public int compareTo(com.sdr.guide.model.BookFile bookFile) {
        return _bookFile.compareTo(bookFile);
    }

    @Override
    public int hashCode() {
        return _bookFile.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.sdr.guide.model.BookFile> toCacheModel() {
        return _bookFile.toCacheModel();
    }

    @Override
    public com.sdr.guide.model.BookFile toEscapedModel() {
        return new BookFileWrapper(_bookFile.toEscapedModel());
    }

    @Override
    public com.sdr.guide.model.BookFile toUnescapedModel() {
        return new BookFileWrapper(_bookFile.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bookFile.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bookFile.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bookFile.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BookFileWrapper)) {
            return false;
        }

        BookFileWrapper bookFileWrapper = (BookFileWrapper) obj;

        if (Validator.equals(_bookFile, bookFileWrapper._bookFile)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public BookFile getWrappedBookFile() {
        return _bookFile;
    }

    @Override
    public BookFile getWrappedModel() {
        return _bookFile;
    }

    @Override
    public void resetOriginalValues() {
        _bookFile.resetOriginalValues();
    }
}
