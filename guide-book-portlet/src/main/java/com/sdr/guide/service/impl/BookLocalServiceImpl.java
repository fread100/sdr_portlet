package com.sdr.guide.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.sdr.guide.model.Book;
import com.sdr.guide.service.base.BookLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the book local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sdr.guide.service.BookLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author leegyuseong
 * @see com.sdr.guide.service.base.BookLocalServiceBaseImpl
 * @see com.sdr.guide.service.BookLocalServiceUtil
 */
public class BookLocalServiceImpl extends BookLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.sdr.guide.service.BookLocalServiceUtil} to access the book local service.
     */
    public Book getGuestbooks (long groupId) throws SystemException {
        return bookPersistence.fetchByPrimaryKey(groupId);
    }

    public List<Book> getGuestbooks (int start, int end)
            throws SystemException {
        return bookPersistence.findAll(start, end);
    }
}
