package com.sdr.guide.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sdr.guide.model.BookFile;

import java.util.List;

/**
 * The persistence utility for the book file service. This utility wraps {@link BookFilePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author leegyuseong
 * @see BookFilePersistence
 * @see BookFilePersistenceImpl
 * @generated
 */
public class BookFileUtil {
    private static BookFilePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(BookFile bookFile) {
        getPersistence().clearCache(bookFile);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<BookFile> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BookFile> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BookFile> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BookFile update(BookFile bookFile) throws SystemException {
        return getPersistence().update(bookFile);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BookFile update(BookFile bookFile,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(bookFile, serviceContext);
    }

    /**
    * Caches the book file in the entity cache if it is enabled.
    *
    * @param bookFile the book file
    */
    public static void cacheResult(com.sdr.guide.model.BookFile bookFile) {
        getPersistence().cacheResult(bookFile);
    }

    /**
    * Caches the book files in the entity cache if it is enabled.
    *
    * @param bookFiles the book files
    */
    public static void cacheResult(
        java.util.List<com.sdr.guide.model.BookFile> bookFiles) {
        getPersistence().cacheResult(bookFiles);
    }

    /**
    * Creates a new book file with the primary key. Does not add the book file to the database.
    *
    * @param bookFilePK the primary key for the new book file
    * @return the new book file
    */
    public static com.sdr.guide.model.BookFile create(BookFilePK bookFilePK) {
        return getPersistence().create(bookFilePK);
    }

    /**
    * Removes the book file with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file that was removed
    * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile remove(BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sdr.guide.NoSuchBookFileException {
        return getPersistence().remove(bookFilePK);
    }

    public static com.sdr.guide.model.BookFile updateImpl(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(bookFile);
    }

    /**
    * Returns the book file with the primary key or throws a {@link com.sdr.guide.NoSuchBookFileException} if it could not be found.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file
    * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile findByPrimaryKey(
        BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sdr.guide.NoSuchBookFileException {
        return getPersistence().findByPrimaryKey(bookFilePK);
    }

    /**
    * Returns the book file with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file, or <code>null</code> if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.BookFile fetchByPrimaryKey(
        BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(bookFilePK);
    }

    /**
    * Returns all the book files.
    *
    * @return the book files
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sdr.guide.model.BookFile> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.sdr.guide.model.BookFile> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the book files.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sdr.guide.model.impl.BookFileModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of book files
    * @param end the upper bound of the range of book files (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of book files
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sdr.guide.model.BookFile> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the book files from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of book files.
    *
    * @return the number of book files
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BookFilePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BookFilePersistence) PortletBeanLocatorUtil.locate(com.sdr.guide.service.ClpSerializer.getServletContextName(),
                    BookFilePersistence.class.getName());

            ReferenceRegistry.registerReference(BookFileUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BookFilePersistence persistence) {
    }
}
