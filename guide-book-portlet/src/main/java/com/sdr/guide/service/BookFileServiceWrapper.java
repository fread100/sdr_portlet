package com.sdr.guide.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BookFileService}.
 *
 * @author leegyuseong
 * @see BookFileService
 * @generated
 */
public class BookFileServiceWrapper implements BookFileService,
    ServiceWrapper<BookFileService> {
    private BookFileService _bookFileService;

    public BookFileServiceWrapper(BookFileService bookFileService) {
        _bookFileService = bookFileService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _bookFileService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _bookFileService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _bookFileService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BookFileService getWrappedBookFileService() {
        return _bookFileService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBookFileService(BookFileService bookFileService) {
        _bookFileService = bookFileService;
    }

    @Override
    public BookFileService getWrappedService() {
        return _bookFileService;
    }

    @Override
    public void setWrappedService(BookFileService bookFileService) {
        _bookFileService = bookFileService;
    }
}
