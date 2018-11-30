package com.sdr.guide.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sdr.guide.service.http.BookServiceSoap}.
 *
 * @author leegyuseong
 * @see com.sdr.guide.service.http.BookServiceSoap
 * @generated
 */
public class BookSoap implements Serializable {
    private int _gusetbookId;
    private String _title;
    private String _content;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private Date _deleteDate;

    public BookSoap() {
    }

    public static BookSoap toSoapModel(Book model) {
        BookSoap soapModel = new BookSoap();

        soapModel.setGusetbookId(model.getGusetbookId());
        soapModel.setTitle(model.getTitle());
        soapModel.setContent(model.getContent());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setDeleteDate(model.getDeleteDate());

        return soapModel;
    }

    public static BookSoap[] toSoapModels(Book[] models) {
        BookSoap[] soapModels = new BookSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BookSoap[][] toSoapModels(Book[][] models) {
        BookSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BookSoap[models.length][models[0].length];
        } else {
            soapModels = new BookSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BookSoap[] toSoapModels(List<Book> models) {
        List<BookSoap> soapModels = new ArrayList<BookSoap>(models.size());

        for (Book model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BookSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _gusetbookId;
    }

    public void setPrimaryKey(int pk) {
        setGusetbookId(pk);
    }

    public int getGusetbookId() {
        return _gusetbookId;
    }

    public void setGusetbookId(int gusetbookId) {
        _gusetbookId = gusetbookId;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String title) {
        _title = title;
    }

    public String getContent() {
        return _content;
    }

    public void setContent(String content) {
        _content = content;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public Date getDeleteDate() {
        return _deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        _deleteDate = deleteDate;
    }
}
