package com.sdr.guide.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.sdr.guide.NoSuchBookFileException;
import com.sdr.guide.model.BookFile;
import com.sdr.guide.model.impl.BookFileImpl;
import com.sdr.guide.model.impl.BookFileModelImpl;
import com.sdr.guide.service.persistence.BookFilePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the book file service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author leegyuseong
 * @see BookFilePersistence
 * @see BookFileUtil
 * @generated
 */
public class BookFilePersistenceImpl extends BasePersistenceImpl<BookFile>
    implements BookFilePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link BookFileUtil} to access the book file persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = BookFileImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(BookFileModelImpl.ENTITY_CACHE_ENABLED,
            BookFileModelImpl.FINDER_CACHE_ENABLED, BookFileImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(BookFileModelImpl.ENTITY_CACHE_ENABLED,
            BookFileModelImpl.FINDER_CACHE_ENABLED, BookFileImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(BookFileModelImpl.ENTITY_CACHE_ENABLED,
            BookFileModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_BOOKFILE = "SELECT bookFile FROM BookFile bookFile";
    private static final String _SQL_COUNT_BOOKFILE = "SELECT COUNT(bookFile) FROM BookFile bookFile";
    private static final String _ORDER_BY_ENTITY_ALIAS = "bookFile.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No BookFile exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(BookFilePersistenceImpl.class);
    private static BookFile _nullBookFile = new BookFileImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<BookFile> toCacheModel() {
                return _nullBookFileCacheModel;
            }
        };

    private static CacheModel<BookFile> _nullBookFileCacheModel = new CacheModel<BookFile>() {
            @Override
            public BookFile toEntityModel() {
                return _nullBookFile;
            }
        };

    public BookFilePersistenceImpl() {
        setModelClass(BookFile.class);
    }

    /**
     * Caches the book file in the entity cache if it is enabled.
     *
     * @param bookFile the book file
     */
    @Override
    public void cacheResult(BookFile bookFile) {
        EntityCacheUtil.putResult(BookFileModelImpl.ENTITY_CACHE_ENABLED,
            BookFileImpl.class, bookFile.getPrimaryKey(), bookFile);

        bookFile.resetOriginalValues();
    }

    /**
     * Caches the book files in the entity cache if it is enabled.
     *
     * @param bookFiles the book files
     */
    @Override
    public void cacheResult(List<BookFile> bookFiles) {
        for (BookFile bookFile : bookFiles) {
            if (EntityCacheUtil.getResult(
                        BookFileModelImpl.ENTITY_CACHE_ENABLED,
                        BookFileImpl.class, bookFile.getPrimaryKey()) == null) {
                cacheResult(bookFile);
            } else {
                bookFile.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all book files.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(BookFileImpl.class.getName());
        }

        EntityCacheUtil.clearCache(BookFileImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the book file.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(BookFile bookFile) {
        EntityCacheUtil.removeResult(BookFileModelImpl.ENTITY_CACHE_ENABLED,
            BookFileImpl.class, bookFile.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<BookFile> bookFiles) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (BookFile bookFile : bookFiles) {
            EntityCacheUtil.removeResult(BookFileModelImpl.ENTITY_CACHE_ENABLED,
                BookFileImpl.class, bookFile.getPrimaryKey());
        }
    }

    /**
     * Creates a new book file with the primary key. Does not add the book file to the database.
     *
     * @param bookFilePK the primary key for the new book file
     * @return the new book file
     */
    @Override
    public BookFile create(BookFilePK bookFilePK) {
        BookFile bookFile = new BookFileImpl();

        bookFile.setNew(true);
        bookFile.setPrimaryKey(bookFilePK);

        return bookFile;
    }

    /**
     * Removes the book file with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param bookFilePK the primary key of the book file
     * @return the book file that was removed
     * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BookFile remove(BookFilePK bookFilePK)
        throws NoSuchBookFileException, SystemException {
        return remove((Serializable) bookFilePK);
    }

    /**
     * Removes the book file with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the book file
     * @return the book file that was removed
     * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BookFile remove(Serializable primaryKey)
        throws NoSuchBookFileException, SystemException {
        Session session = null;

        try {
            session = openSession();

            BookFile bookFile = (BookFile) session.get(BookFileImpl.class,
                    primaryKey);

            if (bookFile == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchBookFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(bookFile);
        } catch (NoSuchBookFileException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected BookFile removeImpl(BookFile bookFile) throws SystemException {
        bookFile = toUnwrappedModel(bookFile);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(bookFile)) {
                bookFile = (BookFile) session.get(BookFileImpl.class,
                        bookFile.getPrimaryKeyObj());
            }

            if (bookFile != null) {
                session.delete(bookFile);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (bookFile != null) {
            clearCache(bookFile);
        }

        return bookFile;
    }

    @Override
    public BookFile updateImpl(com.sdr.guide.model.BookFile bookFile)
        throws SystemException {
        bookFile = toUnwrappedModel(bookFile);

        boolean isNew = bookFile.isNew();

        Session session = null;

        try {
            session = openSession();

            if (bookFile.isNew()) {
                session.save(bookFile);

                bookFile.setNew(false);
            } else {
                session.merge(bookFile);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(BookFileModelImpl.ENTITY_CACHE_ENABLED,
            BookFileImpl.class, bookFile.getPrimaryKey(), bookFile);

        return bookFile;
    }

    protected BookFile toUnwrappedModel(BookFile bookFile) {
        if (bookFile instanceof BookFileImpl) {
            return bookFile;
        }

        BookFileImpl bookFileImpl = new BookFileImpl();

        bookFileImpl.setNew(bookFile.isNew());
        bookFileImpl.setPrimaryKey(bookFile.getPrimaryKey());

        bookFileImpl.setGusetbookId(bookFile.getGusetbookId());
        bookFileImpl.setFileId(bookFile.getFileId());
        bookFileImpl.setFileName(bookFile.getFileName());
        bookFileImpl.setFileType(bookFile.getFileType());
        bookFileImpl.setFileLocation(bookFile.getFileLocation());
        bookFileImpl.setGroupId(bookFile.getGroupId());
        bookFileImpl.setCompanyId(bookFile.getCompanyId());
        bookFileImpl.setUserId(bookFile.getUserId());
        bookFileImpl.setUserName(bookFile.getUserName());
        bookFileImpl.setCreateDate(bookFile.getCreateDate());
        bookFileImpl.setModifiedDate(bookFile.getModifiedDate());
        bookFileImpl.setDeleteDate(bookFile.getDeleteDate());

        return bookFileImpl;
    }

    /**
     * Returns the book file with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the book file
     * @return the book file
     * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BookFile findByPrimaryKey(Serializable primaryKey)
        throws NoSuchBookFileException, SystemException {
        BookFile bookFile = fetchByPrimaryKey(primaryKey);

        if (bookFile == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchBookFileException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return bookFile;
    }

    /**
     * Returns the book file with the primary key or throws a {@link com.sdr.guide.NoSuchBookFileException} if it could not be found.
     *
     * @param bookFilePK the primary key of the book file
     * @return the book file
     * @throws com.sdr.guide.NoSuchBookFileException if a book file with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BookFile findByPrimaryKey(BookFilePK bookFilePK)
        throws NoSuchBookFileException, SystemException {
        return findByPrimaryKey((Serializable) bookFilePK);
    }

    /**
     * Returns the book file with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the book file
     * @return the book file, or <code>null</code> if a book file with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BookFile fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        BookFile bookFile = (BookFile) EntityCacheUtil.getResult(BookFileModelImpl.ENTITY_CACHE_ENABLED,
                BookFileImpl.class, primaryKey);

        if (bookFile == _nullBookFile) {
            return null;
        }

        if (bookFile == null) {
            Session session = null;

            try {
                session = openSession();

                bookFile = (BookFile) session.get(BookFileImpl.class, primaryKey);

                if (bookFile != null) {
                    cacheResult(bookFile);
                } else {
                    EntityCacheUtil.putResult(BookFileModelImpl.ENTITY_CACHE_ENABLED,
                        BookFileImpl.class, primaryKey, _nullBookFile);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(BookFileModelImpl.ENTITY_CACHE_ENABLED,
                    BookFileImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return bookFile;
    }

    /**
     * Returns the book file with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param bookFilePK the primary key of the book file
     * @return the book file, or <code>null</code> if a book file with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public BookFile fetchByPrimaryKey(BookFilePK bookFilePK)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) bookFilePK);
    }

    /**
     * Returns all the book files.
     *
     * @return the book files
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<BookFile> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<BookFile> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<BookFile> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<BookFile> list = (List<BookFile>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_BOOKFILE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_BOOKFILE;

                if (pagination) {
                    sql = sql.concat(BookFileModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<BookFile>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<BookFile>(list);
                } else {
                    list = (List<BookFile>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the book files from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (BookFile bookFile : findAll()) {
            remove(bookFile);
        }
    }

    /**
     * Returns the number of book files.
     *
     * @return the number of book files
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_BOOKFILE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the book file persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.sdr.guide.model.BookFile")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<BookFile>> listenersList = new ArrayList<ModelListener<BookFile>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<BookFile>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(BookFileImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
