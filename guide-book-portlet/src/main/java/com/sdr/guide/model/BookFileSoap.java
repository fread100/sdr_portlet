package com.sdr.guide.model;

import com.sdr.guide.service.persistence.BookFilePK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sdr.guide.service.http.BookFileServiceSoap}.
 *
 * @author leegyuseong
 * @see com.sdr.guide.service.http.BookFileServiceSoap
 * @generated
 */
public class BookFileSoap implements Serializable {
    private int _gusetbookId;
    private int _fileId;
    private String _fileName;
    private String _fileType;
    private String _fileLocation;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private Date _deleteDate;

    public BookFileSoap() {
    }

    public static BookFileSoap toSoapModel(BookFile model) {
        BookFileSoap soapModel = new BookFileSoap();

        soapModel.setGusetbookId(model.getGusetbookId());
        soapModel.setFileId(model.getFileId());
        soapModel.setFileName(model.getFileName());
        soapModel.setFileType(model.getFileType());
        soapModel.setFileLocation(model.getFileLocation());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setDeleteDate(model.getDeleteDate());

        return soapModel;
    }

    public static BookFileSoap[] toSoapModels(BookFile[] models) {
        BookFileSoap[] soapModels = new BookFileSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static BookFileSoap[][] toSoapModels(BookFile[][] models) {
        BookFileSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new BookFileSoap[models.length][models[0].length];
        } else {
            soapModels = new BookFileSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static BookFileSoap[] toSoapModels(List<BookFile> models) {
        List<BookFileSoap> soapModels = new ArrayList<BookFileSoap>(models.size());

        for (BookFile model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new BookFileSoap[soapModels.size()]);
    }

    public BookFilePK getPrimaryKey() {
        return new BookFilePK(_gusetbookId, _fileId);
    }

    public void setPrimaryKey(BookFilePK pk) {
        setGusetbookId(pk.gusetbookId);
        setFileId(pk.fileId);
    }

    public int getGusetbookId() {
        return _gusetbookId;
    }

    public void setGusetbookId(int gusetbookId) {
        _gusetbookId = gusetbookId;
    }

    public int getFileId() {
        return _fileId;
    }

    public void setFileId(int fileId) {
        _fileId = fileId;
    }

    public String getFileName() {
        return _fileName;
    }

    public void setFileName(String fileName) {
        _fileName = fileName;
    }

    public String getFileType() {
        return _fileType;
    }

    public void setFileType(String fileType) {
        _fileType = fileType;
    }

    public String getFileLocation() {
        return _fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        _fileLocation = fileLocation;
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
