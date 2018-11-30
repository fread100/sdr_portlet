package com.sdr.guide.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;
import com.liferay.portlet.asset.service.persistence.AssetLinkPersistence;

import com.sdr.guide.model.BookFile;
import com.sdr.guide.service.BookFileLocalService;
import com.sdr.guide.service.persistence.BookFilePK;
import com.sdr.guide.service.persistence.BookFilePersistence;
import com.sdr.guide.service.persistence.BookPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the book file local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.sdr.guide.service.impl.BookFileLocalServiceImpl}.
 * </p>
 *
 * @author leegyuseong
 * @see com.sdr.guide.service.impl.BookFileLocalServiceImpl
 * @see com.sdr.guide.service.BookFileLocalServiceUtil
 * @generated
 */
public abstract class BookFileLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements BookFileLocalService, IdentifiableBean {
    @BeanReference(type = com.sdr.guide.service.BookLocalService.class)
    protected com.sdr.guide.service.BookLocalService bookLocalService;
    @BeanReference(type = com.sdr.guide.service.BookService.class)
    protected com.sdr.guide.service.BookService bookService;
    @BeanReference(type = BookPersistence.class)
    protected BookPersistence bookPersistence;
    @BeanReference(type = com.sdr.guide.service.BookFileLocalService.class)
    protected com.sdr.guide.service.BookFileLocalService bookFileLocalService;
    @BeanReference(type = com.sdr.guide.service.BookFileService.class)
    protected com.sdr.guide.service.BookFileService bookFileService;
    @BeanReference(type = BookFilePersistence.class)
    protected BookFilePersistence bookFilePersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryLocalService.class)
    protected com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryService.class)
    protected com.liferay.portlet.asset.service.AssetEntryService assetEntryService;
    @BeanReference(type = AssetEntryPersistence.class)
    protected AssetEntryPersistence assetEntryPersistence;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetLinkLocalService.class)
    protected com.liferay.portlet.asset.service.AssetLinkLocalService assetLinkLocalService;
    @BeanReference(type = AssetLinkPersistence.class)
    protected AssetLinkPersistence assetLinkPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private BookFileLocalServiceClpInvoker _clpInvoker = new BookFileLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.sdr.guide.service.BookFileLocalServiceUtil} to access the book file local service.
     */

    /**
     * Adds the book file to the database. Also notifies the appropriate model listeners.
     *
     * @param bookFile the book file
     * @return the book file that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public BookFile addBookFile(BookFile bookFile) throws SystemException {
        bookFile.setNew(true);

        return bookFilePersistence.update(bookFile);
    }

    /**
     * Creates a new book file with the primary key. Does not add the book file to the database.
     *
     * @param bookFilePK the primary key for the new book file
     * @return the new book file
     */
    @Override
    public BookFile createBookFile(BookFilePK bookFilePK) {
        return bookFilePersistence.create(bookFilePK);
    }

    /**
     * Deletes the book file with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bookFilePK the primary key of the book file
     * @return the book file that was removed
     * @throws PortalException if a book file with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public BookFile deleteBookFile(BookFilePK bookFilePK)
        throws PortalException, SystemException {
        return bookFilePersistence.remove(bookFilePK);
    }

    /**
     * Deletes the book file from the database. Also notifies the appropriate model listeners.
     *
     * @param bookFile the book file
     * @return the book file that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public BookFile deleteBookFile(BookFile bookFile) throws SystemException {
        return bookFilePersistence.remove(bookFile);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(BookFile.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return bookFilePersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return bookFilePersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return bookFilePersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return bookFilePersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return bookFilePersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public BookFile fetchBookFile(BookFilePK bookFilePK)
        throws SystemException {
        return bookFilePersistence.fetchByPrimaryKey(bookFilePK);
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
    public BookFile getBookFile(BookFilePK bookFilePK)
        throws PortalException, SystemException {
        return bookFilePersistence.findByPrimaryKey(bookFilePK);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return bookFilePersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<BookFile> getBookFiles(int start, int end)
        throws SystemException {
        return bookFilePersistence.findAll(start, end);
    }

    /**
     * Returns the number of book files.
     *
     * @return the number of book files
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getBookFilesCount() throws SystemException {
        return bookFilePersistence.countAll();
    }

    /**
     * Updates the book file in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param bookFile the book file
     * @return the book file that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public BookFile updateBookFile(BookFile bookFile) throws SystemException {
        return bookFilePersistence.update(bookFile);
    }

    /**
     * Returns the book local service.
     *
     * @return the book local service
     */
    public com.sdr.guide.service.BookLocalService getBookLocalService() {
        return bookLocalService;
    }

    /**
     * Sets the book local service.
     *
     * @param bookLocalService the book local service
     */
    public void setBookLocalService(
        com.sdr.guide.service.BookLocalService bookLocalService) {
        this.bookLocalService = bookLocalService;
    }

    /**
     * Returns the book remote service.
     *
     * @return the book remote service
     */
    public com.sdr.guide.service.BookService getBookService() {
        return bookService;
    }

    /**
     * Sets the book remote service.
     *
     * @param bookService the book remote service
     */
    public void setBookService(com.sdr.guide.service.BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * Returns the book persistence.
     *
     * @return the book persistence
     */
    public BookPersistence getBookPersistence() {
        return bookPersistence;
    }

    /**
     * Sets the book persistence.
     *
     * @param bookPersistence the book persistence
     */
    public void setBookPersistence(BookPersistence bookPersistence) {
        this.bookPersistence = bookPersistence;
    }

    /**
     * Returns the book file local service.
     *
     * @return the book file local service
     */
    public com.sdr.guide.service.BookFileLocalService getBookFileLocalService() {
        return bookFileLocalService;
    }

    /**
     * Sets the book file local service.
     *
     * @param bookFileLocalService the book file local service
     */
    public void setBookFileLocalService(
        com.sdr.guide.service.BookFileLocalService bookFileLocalService) {
        this.bookFileLocalService = bookFileLocalService;
    }

    /**
     * Returns the book file remote service.
     *
     * @return the book file remote service
     */
    public com.sdr.guide.service.BookFileService getBookFileService() {
        return bookFileService;
    }

    /**
     * Sets the book file remote service.
     *
     * @param bookFileService the book file remote service
     */
    public void setBookFileService(
        com.sdr.guide.service.BookFileService bookFileService) {
        this.bookFileService = bookFileService;
    }

    /**
     * Returns the book file persistence.
     *
     * @return the book file persistence
     */
    public BookFilePersistence getBookFilePersistence() {
        return bookFilePersistence;
    }

    /**
     * Sets the book file persistence.
     *
     * @param bookFilePersistence the book file persistence
     */
    public void setBookFilePersistence(BookFilePersistence bookFilePersistence) {
        this.bookFilePersistence = bookFilePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    /**
     * Returns the asset entry local service.
     *
     * @return the asset entry local service
     */
    public com.liferay.portlet.asset.service.AssetEntryLocalService getAssetEntryLocalService() {
        return assetEntryLocalService;
    }

    /**
     * Sets the asset entry local service.
     *
     * @param assetEntryLocalService the asset entry local service
     */
    public void setAssetEntryLocalService(
        com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService) {
        this.assetEntryLocalService = assetEntryLocalService;
    }

    /**
     * Returns the asset entry remote service.
     *
     * @return the asset entry remote service
     */
    public com.liferay.portlet.asset.service.AssetEntryService getAssetEntryService() {
        return assetEntryService;
    }

    /**
     * Sets the asset entry remote service.
     *
     * @param assetEntryService the asset entry remote service
     */
    public void setAssetEntryService(
        com.liferay.portlet.asset.service.AssetEntryService assetEntryService) {
        this.assetEntryService = assetEntryService;
    }

    /**
     * Returns the asset entry persistence.
     *
     * @return the asset entry persistence
     */
    public AssetEntryPersistence getAssetEntryPersistence() {
        return assetEntryPersistence;
    }

    /**
     * Sets the asset entry persistence.
     *
     * @param assetEntryPersistence the asset entry persistence
     */
    public void setAssetEntryPersistence(
        AssetEntryPersistence assetEntryPersistence) {
        this.assetEntryPersistence = assetEntryPersistence;
    }

    /**
     * Returns the asset link local service.
     *
     * @return the asset link local service
     */
    public com.liferay.portlet.asset.service.AssetLinkLocalService getAssetLinkLocalService() {
        return assetLinkLocalService;
    }

    /**
     * Sets the asset link local service.
     *
     * @param assetLinkLocalService the asset link local service
     */
    public void setAssetLinkLocalService(
        com.liferay.portlet.asset.service.AssetLinkLocalService assetLinkLocalService) {
        this.assetLinkLocalService = assetLinkLocalService;
    }

    /**
     * Returns the asset link persistence.
     *
     * @return the asset link persistence
     */
    public AssetLinkPersistence getAssetLinkPersistence() {
        return assetLinkPersistence;
    }

    /**
     * Sets the asset link persistence.
     *
     * @param assetLinkPersistence the asset link persistence
     */
    public void setAssetLinkPersistence(
        AssetLinkPersistence assetLinkPersistence) {
        this.assetLinkPersistence = assetLinkPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.sdr.guide.model.BookFile",
            bookFileLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.sdr.guide.model.BookFile");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return BookFile.class;
    }

    protected String getModelClassName() {
        return BookFile.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = bookFilePersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
