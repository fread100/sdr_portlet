package com.sdr.guide.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookFileLocalService}.
 *
 * @author leegyuseong
 * @see BookFileLocalService
 * @generated
 */
public class BookFileLocalServiceWrapper implements BookFileLocalService,
    ServiceWrapper<BookFileLocalService> {
    private BookFileLocalService _bookFileLocalService;

    public BookFileLocalServiceWrapper(
        BookFileLocalService bookFileLocalService) {
        _bookFileLocalService = bookFileLocalService;
    }

    /**
    * Adds the book file to the database. Also notifies the appropriate model listeners.
    *
    * @param bookFile the book file
    * @return the book file that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sdr.guide.model.BookFile addBookFile(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.addBookFile(bookFile);
    }

    /**
    * Creates a new book file with the primary key. Does not add the book file to the database.
    *
    * @param bookFilePK the primary key for the new book file
    * @return the new book file
    */
    @Override
    public com.sdr.guide.model.BookFile createBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK) {
        return _bookFileLocalService.createBookFile(bookFilePK);
    }

    /**
    * Deletes the book file with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file that was removed
    * @throws PortalException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sdr.guide.model.BookFile deleteBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.deleteBookFile(bookFilePK);
    }

    /**
    * Deletes the book file from the database. Also notifies the appropriate model listeners.
    *
    * @param bookFile the book file
    * @return the book file that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sdr.guide.model.BookFile deleteBookFile(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.deleteBookFile(bookFile);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _bookFileLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sdr.guide.model.impl.BookFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sdr.guide.model.impl.BookFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.sdr.guide.model.BookFile fetchBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.fetchBookFile(bookFilePK);
    }

    /**
    * Returns the book file with the primary key.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file
    * @throws PortalException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sdr.guide.model.BookFile getBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.getBookFile(bookFilePK);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the book files.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sdr.guide.model.impl.BookFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of book files
    * @param end the upper bound of the range of book files (not inclusive)
    * @return the range of book files
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.sdr.guide.model.BookFile> getBookFiles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.getBookFiles(start, end);
    }

    /**
    * Returns the number of book files.
    *
    * @return the number of book files
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBookFilesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.getBookFilesCount();
    }

    /**
    * Updates the book file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bookFile the book file
    * @return the book file that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.sdr.guide.model.BookFile updateBookFile(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _bookFileLocalService.updateBookFile(bookFile);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bookFileLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bookFileLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bookFileLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BookFileLocalService getWrappedBookFileLocalService() {
        return _bookFileLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBookFileLocalService(
        BookFileLocalService bookFileLocalService) {
        _bookFileLocalService = bookFileLocalService;
    }

    @Override
    public BookFileLocalService getWrappedService() {
        return _bookFileLocalService;
    }

    @Override
    public void setWrappedService(BookFileLocalService bookFileLocalService) {
        _bookFileLocalService = bookFileLocalService;
    }
}
