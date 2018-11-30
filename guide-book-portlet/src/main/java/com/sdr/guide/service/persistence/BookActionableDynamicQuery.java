package com.sdr.guide.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.sdr.guide.model.Book;
import com.sdr.guide.service.BookLocalServiceUtil;

/**
 * @author leegyuseong
 * @generated
 */
public abstract class BookActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BookActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BookLocalServiceUtil.getService());
        setClass(Book.class);

        setClassLoader(com.sdr.guide.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("gusetbookId");
    }
}
