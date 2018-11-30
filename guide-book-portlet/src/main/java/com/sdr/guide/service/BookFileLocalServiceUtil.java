package com.sdr.guide.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BookFile. This utility wraps
 * {@link com.sdr.guide.service.impl.BookFileLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author leegyuseong
 * @see BookFileLocalService
 * @see com.sdr.guide.service.base.BookFileLocalServiceBaseImpl
 * @see com.sdr.guide.service.impl.BookFileLocalServiceImpl
 * @generated
 */
public class BookFileLocalServiceUtil {
    private static BookFileLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.sdr.guide.service.impl.BookFileLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the book file to the database. Also notifies the appropriate model listeners.
    *
    * @param bookFile the book file
    * @return the book file that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile addBookFile(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBookFile(bookFile);
    }

    /**
    * Creates a new book file with the primary key. Does not add the book file to the database.
    *
    * @param bookFilePK the primary key for the new book file
    * @return the new book file
    */
    public static com.sdr.guide.model.BookFile createBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK) {
        return getService().createBookFile(bookFilePK);
    }

    /**
    * Deletes the book file with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file that was removed
    * @throws PortalException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile deleteBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBookFile(bookFilePK);
    }

    /**
    * Deletes the book file from the database. Also notifies the appropriate model listeners.
    *
    * @param bookFile the book file
    * @return the book file that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile deleteBookFile(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBookFile(bookFile);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.sdr.guide.model.BookFile fetchBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBookFile(bookFilePK);
    }

    /**
    * Returns the book file with the primary key.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file
    * @throws PortalException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile getBookFile(
        com.sdr.guide.service.persistence.BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBookFile(bookFilePK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<com.sdr.guide.model.BookFile> getBookFiles(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBookFiles(start, end);
    }

    /**
    * Returns the number of book files.
    *
    * @return the number of book files
    * @throws SystemException if a system exception occurred
    */
    public static int getBookFilesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBookFilesCount();
    }

    /**
    * Updates the book file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param bookFile the book file
    * @return the book file that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile updateBookFile(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBookFile(bookFile);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void clearService() {
        _service = null;
    }

    public static BookFileLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BookFileLocalService.class.getName());

            if (invokableLocalService instanceof BookFileLocalService) {
                _service = (BookFileLocalService) invokableLocalService;
            } else {
                _service = new BookFileLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BookFileLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BookFileLocalService service) {
    }
}
