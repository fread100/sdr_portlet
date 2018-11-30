package com.sdr.guide.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.sdr.guide.model.BookFile;

/**
 * The persistence interface for the book file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author leegyuseong
 * @see BookFilePersistenceImpl
 * @see BookFileUtil
 * @generated
 */
public interface BookFilePersistence extends BasePersistence<BookFile> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BookFileUtil} to access the book file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the book file in the entity cache if it is enabled.
    *
    * @param bookFile the book file
    */
    public void cacheResult(com.sdr.guide.model.BookFile bookFile);

    /**
    * Caches the book files in the entity cache if it is enabled.
    *
    * @param bookFiles the book files
    */
    public void cacheResult(
        java.util.List<com.sdr.guide.model.BookFile> bookFiles);

    /**
    * Creates a new book file with the primary key. Does not add the book file to the database.
    *
    * @param bookFilePK the primary key for the new book file
    * @return the new book file
    */
    public com.sdr.guide.model.BookFile create(BookFilePK bookFilePK);

    /**
    * Removes the book file with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file that was removed
    * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sdr.guide.model.BookFile remove(BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sdr.guide.NoSuchBookFileException;

    public com.sdr.guide.model.BookFile updateImpl(
        com.sdr.guide.model.BookFile bookFile)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the book file with the primary key or throws a {@link com.sdr.guide.NoSuchBookFileException} if it could not be found.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file
    * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sdr.guide.model.BookFile findByPrimaryKey(BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.sdr.guide.NoSuchBookFileException;

    /**
    * Returns the book file with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bookFilePK the primary key of the book file
    * @return the book file, or <code>null</code> if a book file with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.sdr.guide.model.BookFile fetchByPrimaryKey(BookFilePK bookFilePK)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the book files.
    *
    * @return the book files
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.sdr.guide.model.BookFile> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sdr.guide.model.BookFile> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.sdr.guide.model.BookFile> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the book files from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of book files.
    *
    * @return the number of book files
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
