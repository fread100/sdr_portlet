package com.sdr.guide.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sdr.guide.model.BookFile;
import com.sdr.guide.service.BookFileLocalServiceUtil;

/**
 * @author leegyuseong
 * @generated
 */
public abstract class BookFileActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BookFileActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BookFileLocalServiceUtil.getService());
        setClass(BookFile.class);

        setClassLoader(com.sdr.guide.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("primaryKey.gusetbookId");
    }
}
