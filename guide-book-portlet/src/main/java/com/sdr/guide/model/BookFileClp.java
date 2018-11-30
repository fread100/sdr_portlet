package com.sdr.guide.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.sdr.guide.service.BookFileLocalServiceUtil;
import com.sdr.guide.service.ClpSerializer;
import com.sdr.guide.service.persistence.BookFilePK;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class BookFileClp extends BaseModelImpl<BookFile> implements BookFile {
    private int _gusetbookId;
    private int _fileId;
    private String _fileName;
    private String _fileType;
    private String _fileLocation;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private Date _deleteDate;
    private BaseModel<?> _bookFileRemoteModel;
    private Class<?> _clpSerializerClass = com.sdr.guide.service.ClpSerializer.class;

    public BookFileClp() {
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
    public BookFilePK getPrimaryKey() {
        return new BookFilePK(_gusetbookId, _fileId);
    }

    @Override
    public void setPrimaryKey(BookFilePK primaryKey) {
        setGusetbookId(primaryKey.gusetbookId);
        setFileId(primaryKey.fileId);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return new BookFilePK(_gusetbookId, _fileId);
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((BookFilePK) primaryKeyObj);
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

    @Override
    public int getGusetbookId() {
        return _gusetbookId;
    }

    @Override
    public void setGusetbookId(int gusetbookId) {
        _gusetbookId = gusetbookId;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setGusetbookId", int.class);

                method.invoke(_bookFileRemoteModel, gusetbookId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getFileId() {
        return _fileId;
    }

    @Override
    public void setFileId(int fileId) {
        _fileId = fileId;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setFileId", int.class);

                method.invoke(_bookFileRemoteModel, fileId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFileName() {
        return _fileName;
    }

    @Override
    public void setFileName(String fileName) {
        _fileName = fileName;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setFileName", String.class);

                method.invoke(_bookFileRemoteModel, fileName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFileType() {
        return _fileType;
    }

    @Override
    public void setFileType(String fileType) {
        _fileType = fileType;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setFileType", String.class);

                method.invoke(_bookFileRemoteModel, fileType);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFileLocation() {
        return _fileLocation;
    }

    @Override
    public void setFileLocation(String fileLocation) {
        _fileLocation = fileLocation;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setFileLocation", String.class);

                method.invoke(_bookFileRemoteModel, fileLocation);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_bookFileRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_bookFileRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_bookFileRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_bookFileRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_bookFileRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_bookFileRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getDeleteDate() {
        return _deleteDate;
    }

    @Override
    public void setDeleteDate(Date deleteDate) {
        _deleteDate = deleteDate;

        if (_bookFileRemoteModel != null) {
            try {
                Class<?> clazz = _bookFileRemoteModel.getClass();

                Method method = clazz.getMethod("setDeleteDate", Date.class);

                method.invoke(_bookFileRemoteModel, deleteDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBookFileRemoteModel() {
        return _bookFileRemoteModel;
    }

    public void setBookFileRemoteModel(BaseModel<?> bookFileRemoteModel) {
        _bookFileRemoteModel = bookFileRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _bookFileRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_bookFileRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BookFileLocalServiceUtil.addBookFile(this);
        } else {
            BookFileLocalServiceUtil.updateBookFile(this);
        }
    }

    @Override
    public BookFile toEscapedModel() {
        return (BookFile) ProxyUtil.newProxyInstance(BookFile.class.getClassLoader(),
            new Class[] { BookFile.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BookFileClp clone = new BookFileClp();

        clone.setGusetbookId(getGusetbookId());
        clone.setFileId(getFileId());
        clone.setFileName(getFileName());
        clone.setFileType(getFileType());
        clone.setFileLocation(getFileLocation());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setDeleteDate(getDeleteDate());

        return clone;
    }

    @Override
    public int compareTo(BookFile bookFile) {
        BookFilePK primaryKey = bookFile.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BookFileClp)) {
            return false;
        }

        BookFileClp bookFile = (BookFileClp) obj;

        BookFilePK primaryKey = bookFile.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{gusetbookId=");
        sb.append(getGusetbookId());
        sb.append(", fileId=");
        sb.append(getFileId());
        sb.append(", fileName=");
        sb.append(getFileName());
        sb.append(", fileType=");
        sb.append(getFileType());
        sb.append(", fileLocation=");
        sb.append(getFileLocation());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", deleteDate=");
        sb.append(getDeleteDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.sdr.guide.model.BookFile");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>gusetbookId</column-name><column-value><![CDATA[");
        sb.append(getGusetbookId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileId</column-name><column-value><![CDATA[");
        sb.append(getFileId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileName</column-name><column-value><![CDATA[");
        sb.append(getFileName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileType</column-name><column-value><![CDATA[");
        sb.append(getFileType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fileLocation</column-name><column-value><![CDATA[");
        sb.append(getFileLocation());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deleteDate</column-name><column-value><![CDATA[");
        sb.append(getDeleteDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
