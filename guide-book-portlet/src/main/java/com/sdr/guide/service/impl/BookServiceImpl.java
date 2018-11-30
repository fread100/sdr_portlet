package com.sdr.guide.service.impl;

import com.sdr.guide.service.base.BookServiceBaseImpl;

/**
 * The implementation of the book remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.sdr.guide.service.BookService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author leegyuseong
 * @see com.sdr.guide.service.base.BookServiceBaseImpl
 * @see com.sdr.guide.service.BookServiceUtil
 */
public class BookServiceImpl extends BookServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.sdr.guide.service.BookServiceUtil} to access the book remote service.
     */
}
