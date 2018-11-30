package com.sdr.guide.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Book service. Represents a row in the &quot;test_Book&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.sdr.guide.model.impl.BookModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.sdr.guide.model.impl.BookImpl}.
 * </p>
 *
 * @author leegyuseong
 * @see Book
 * @see com.sdr.guide.model.impl.BookImpl
 * @see com.sdr.guide.model.impl.BookModelImpl
 * @generated
 */
public interface BookModel extends BaseModel<Book>, GroupedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a book model instance should use the {@link Book} interface instead.
     */

    /**
     * Returns the primary key of this book.
     *
     * @return the primary key of this book
     */
    public int getPrimaryKey();

    /**
     * Sets the primary key of this book.
     *
     * @param primaryKey the primary key of this book
     */
    public void setPrimaryKey(int primaryKey);

    /**
     * Returns the gusetbook ID of this book.
     *
     * @return the gusetbook ID of this book
     */
    public int getGusetbookId();

    /**
     * Sets the gusetbook ID of this book.
     *
     * @param gusetbookId the gusetbook ID of this book
     */
    public void setGusetbookId(int gusetbookId);

    /**
     * Returns the title of this book.
     *
     * @return the title of this book
     */
    @AutoEscape
    public String getTitle();

    /**
     * Sets the title of this book.
     *
     * @param title the title of this book
     */
    public void setTitle(String title);

    /**
     * Returns the content of this book.
     *
     * @return the content of this book
     */
    @AutoEscape
    public String getContent();

    /**
     * Sets the content of this book.
     *
     * @param content the content of this book
     */
    public void setContent(String content);

    /**
     * Returns the group ID of this book.
     *
     * @return the group ID of this book
     */
    @Override
    public long getGroupId();

    /**
     * Sets the group ID of this book.
     *
     * @param groupId the group ID of this book
     */
    @Override
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this book.
     *
     * @return the company ID of this book
     */
    @Override
    public long getCompanyId();

    /**
     * Sets the company ID of this book.
     *
     * @param companyId the company ID of this book
     */
    @Override
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this book.
     *
     * @return the user ID of this book
     */
    @Override
    public long getUserId();

    /**
     * Sets the user ID of this book.
     *
     * @param userId the user ID of this book
     */
    @Override
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this book.
     *
     * @return the user uuid of this book
     * @throws SystemException if a system exception occurred
     */
    @Override
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this book.
     *
     * @param userUuid the user uuid of this book
     */
    @Override
    public void setUserUuid(String userUuid);

    /**
     * Returns the user name of this book.
     *
     * @return the user name of this book
     */
    @AutoEscape
    @Override
    public String getUserName();

    /**
     * Sets the user name of this book.
     *
     * @param userName the user name of this book
     */
    @Override
    public void setUserName(String userName);

    /**
     * Returns the create date of this book.
     *
     * @return the create date of this book
     */
    @Override
    public Date getCreateDate();

    /**
     * Sets the create date of this book.
     *
     * @param createDate the create date of this book
     */
    @Override
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this book.
     *
     * @return the modified date of this book
     */
    @Override
    public Date getModifiedDate();

    /**
     * Sets the modified date of this book.
     *
     * @param modifiedDate the modified date of this book
     */
    @Override
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the delete date of this book.
     *
     * @return the delete date of this book
     */
    public Date getDeleteDate();

    /**
     * Sets the delete date of this book.
     *
     * @param deleteDate the delete date of this book
     */
    public void setDeleteDate(Date deleteDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(com.sdr.guide.model.Book book);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.sdr.guide.model.Book> toCacheModel();

    @Override
    public com.sdr.guide.model.Book toEscapedModel();

    @Override
    public com.sdr.guide.model.Book toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
