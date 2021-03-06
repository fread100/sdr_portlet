package com.sdr.guide.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.sdr.guide.model.Book;

import java.util.List;

/**
 * The persistence utility for the book service. This utility wraps {@link BookPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author leegyuseong
 * @see BookPersistence
 * @see BookPersistenceImpl
 * @generated
 */
public class BookUtil {
    private static BookPersistence _persistence;

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
    public static void clearCache(Book book) {
        getPersistence().clearCache(book);
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
    public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Book> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Book update(Book book) throws SystemException {
        return getPersistence().update(book);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Book update(Book book, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(book, serviceContext);
    }

    /**
    * Caches the book in the entity cache if it is enabled.
    *
    * @param book the book
    */
    public static void cacheResult(com.sdr.guide.model.Book book) {
        getPersistence().cacheResult(book);
    }

    /**
    * Caches the books in the entity cache if it is enabled.
    *
    * @param books the books
    */
    public static void cacheResult(
        java.util.List<com.sdr.guide.model.Book> books) {
        getPersistence().cacheResult(books);
    }

    /**
    * Creates a new book with the primary key. Does not add the book to the database.
    *
    * @param gusetbookId the primary key for the new book
    * @return the new book
    */
    public static com.sdr.guide.model.Book create(int gusetbookId) {
        return getPersistence().create(gusetbookId);
    }

    /**
    * Removes the book with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param gusetbookId the primary key of the book
    * @return the book that was removed
    * @throws com.sdr.guide.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.Book remove(int gusetbookId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sdr.guide.NoSuchBookException {
        return getPersistence().remove(gusetbookId);
    }

    public static com.sdr.guide.model.Book updateImpl(
        com.sdr.guide.model.Book book)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(book);
    }

    /**
    * Returns the book with the primary key or throws a {@link com.sdr.guide.NoSuchBookException} if it could not be found.
    *
    * @param gusetbookId the primary key of the book
    * @return the book
    * @throws com.sdr.guide.NoSuchBookException if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.Book findByPrimaryKey(int gusetbookId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sdr.guide.NoSuchBookException {
        return getPersistence().findByPrimaryKey(gusetbookId);
    }

    /**
    * Returns the book with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param gusetbookId the primary key of the book
    * @return the book, or <code>null</code> if a book with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.sdr.guide.model.Book fetchByPrimaryKey(int gusetbookId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(gusetbookId);
    }

    /**
    * Returns all the books.
    *
    * @return the books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sdr.guide.model.Book> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sdr.guide.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @return the range of books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sdr.guide.model.Book> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the books.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.sdr.guide.model.impl.BookModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of books
    * @param end the upper bound of the range of books (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of books
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.sdr.guide.model.Book> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the books from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of books.
    *
    * @return the number of books
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BookPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BookPersistence) PortletBeanLocatorUtil.locate(com.sdr.guide.service.ClpSerializer.getServletContextName(),
                    BookPersistence.class.getName());

            ReferenceRegistry.registerReference(BookUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BookPersistence persistence) {
    }
}
