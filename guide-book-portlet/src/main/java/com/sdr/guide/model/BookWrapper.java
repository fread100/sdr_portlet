package com.sdr.guide.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Book}.
 * </p>
 *
 * @author leegyuseong
 * @see Book
 * @generated
 */
public class BookWrapper implements Book, ModelWrapper<Book> {
    private Book _book;

    public BookWrapper(Book book) {
        _book = book;
    }

    @Override
    public Class<?> getModelClass() {
        return Book.class;
    }

    @Override
    public String getModelClassName() {
        return Book.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("gusetbookId", getGusetbookId());
        attributes.put("title", getTitle());
        attributes.put("content", getContent());
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

        String title = (String) attributes.get("title");

        if (title != null) {
            setTitle(title);
        }

        String content = (String) attributes.get("content");

        if (content != null) {
            setContent(content);
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
    * Returns the primary key of this book.
    *
    * @return the primary key of this book
    */
    @Override
    public int getPrimaryKey() {
        return _book.getPrimaryKey();
    }

    /**
    * Sets the primary key of this book.
    *
    * @param primaryKey the primary key of this book
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _book.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the gusetbook ID of this book.
    *
    * @return the gusetbook ID of this book
    */
    @Override
    public int getGusetbookId() {
        return _book.getGusetbookId();
    }

    /**
    * Sets the gusetbook ID of this book.
    *
    * @param gusetbookId the gusetbook ID of this book
    */
    @Override
    public void setGusetbookId(int gusetbookId) {
        _book.setGusetbookId(gusetbookId);
    }

    /**
    * Returns the title of this book.
    *
    * @return the title of this book
    */
    @Override
    public java.lang.String getTitle() {
        return _book.getTitle();
    }

    /**
    * Sets the title of this book.
    *
    * @param title the title of this book
    */
    @Override
    public void setTitle(java.lang.String title) {
        _book.setTitle(title);
    }

    /**
    * Returns the content of this book.
    *
    * @return the content of this book
    */
    @Override
    public java.lang.String getContent() {
        return _book.getContent();
    }

    /**
    * Sets the content of this book.
    *
    * @param content the content of this book
    */
    @Override
    public void setContent(java.lang.String content) {
        _book.setContent(content);
    }

    /**
    * Returns the group ID of this book.
    *
    * @return the group ID of this book
    */
    @Override
    public long getGroupId() {
        return _book.getGroupId();
    }

    /**
    * Sets the group ID of this book.
    *
    * @param groupId the group ID of this book
    */
    @Override
    public void setGroupId(long groupId) {
        _book.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this book.
    *
    * @return the company ID of this book
    */
    @Override
    public long getCompanyId() {
        return _book.getCompanyId();
    }

    /**
    * Sets the company ID of this book.
    *
    * @param companyId the company ID of this book
    */
    @Override
    public void setCompanyId(long companyId) {
        _book.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this book.
    *
    * @return the user ID of this book
    */
    @Override
    public long getUserId() {
        return _book.getUserId();
    }

    /**
    * Sets the user ID of this book.
    *
    * @param userId the user ID of this book
    */
    @Override
    public void setUserId(long userId) {
        _book.setUserId(userId);
    }

    /**
    * Returns the user uuid of this book.
    *
    * @return the user uuid of this book
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _book.getUserUuid();
    }

    /**
    * Sets the user uuid of this book.
    *
    * @param userUuid the user uuid of this book
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _book.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this book.
    *
    * @return the user name of this book
    */
    @Override
    public java.lang.String getUserName() {
        return _book.getUserName();
    }

    /**
    * Sets the user name of this book.
    *
    * @param userName the user name of this book
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _book.setUserName(userName);
    }

    /**
    * Returns the create date of this book.
    *
    * @return the create date of this book
    */
    @Override
    public java.util.Date getCreateDate() {
        return _book.getCreateDate();
    }

    /**
    * Sets the create date of this book.
    *
    * @param createDate the create date of this book
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _book.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this book.
    *
    * @return the modified date of this book
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _book.getModifiedDate();
    }

    /**
    * Sets the modified date of this book.
    *
    * @param modifiedDate the modified date of this book
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _book.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the delete date of this book.
    *
    * @return the delete date of this book
    */
    @Override
    public java.util.Date getDeleteDate() {
        return _book.getDeleteDate();
    }

    /**
    * Sets the delete date of this book.
    *
    * @param deleteDate the delete date of this book
    */
    @Override
    public void setDeleteDate(java.util.Date deleteDate) {
        _book.setDeleteDate(deleteDate);
    }

    @Override
    public boolean isNew() {
        return _book.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _book.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _book.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _book.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _book.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _book.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _book.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _book.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _book.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _book.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _book.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BookWrapper((Book) _book.clone());
    }

    @Override
    public int compareTo(com.sdr.guide.model.Book book) {
        return _book.compareTo(book);
    }

    @Override
    public int hashCode() {
        return _book.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.sdr.guide.model.Book> toCacheModel() {
        return _book.toCacheModel();
    }

    @Override
    public com.sdr.guide.model.Book toEscapedModel() {
        return new BookWrapper(_book.toEscapedModel());
    }

    @Override
    public com.sdr.guide.model.Book toUnescapedModel() {
        return new BookWrapper(_book.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _book.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _book.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _book.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BookWrapper)) {
            return false;
        }

        BookWrapper bookWrapper = (BookWrapper) obj;

        if (Validator.equals(_book, bookWrapper._book)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Book getWrappedBook() {
        return _book;
    }

    @Override
    public Book getWrappedModel() {
        return _book;
    }

    @Override
    public void resetOriginalValues() {
        _book.resetOriginalValues();
    }
}
