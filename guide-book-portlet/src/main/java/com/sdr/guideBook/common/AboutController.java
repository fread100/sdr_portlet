package com.sdr.guideBook.common;

import javax.portlet.*;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.*;
import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.service.LayoutLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.util.portlet.PortletProps;
import com.sdr.guide.model.Book;
import com.sdr.guide.service.BookLocalServiceUtil;
import com.sdr.guide.service.BookServiceUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * The type About controller.
 */
@Controller
@RequestMapping("VIEW")
public class AboutController {

private static Log _log = LogFactoryUtil.getLog(AboutController.class);

	/**
	 * Render string.
	 *
	 * @param request  the request
	 * @param response the response
	 * @param model    the model
	 * @return the string
	 */
	@RenderMapping
	public String render(RenderRequest request, RenderResponse response, Model model) throws Exception {
		_log.debug("#### about render #####");

		String keyword = ParamUtil.getString(request, "keyword");

		_log.debug("### keyword ###" + keyword);

		//new SearchStaticInitalize(request);
		//SearchContext searchContext = SearchStaticInitalize.getSearchContext(CommunityController.class);

		PortletURL leaveItrUrl = response.createRenderURL();
		leaveItrUrl.setParameter("keyword", keyword);

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Book.class,"test_book", PortletClassLoaderUtil.getClassLoader());
		dynamicQuery.addOrder(OrderFactoryUtil.desc("test_book.createDate"));
		dynamicQuery.addOrder(OrderFactoryUtil.desc("test_book.modifiedDate"));


		SearchContainer<Book> searchContainer = new SearchContainer<Book>(request, null, null,
				SearchContainer.DEFAULT_CUR_PARAM, 0, 10, leaveItrUrl, null, "Soory, There are no record to display.");

		/*List<Book> bookList = BookLocalServiceUtil.getBooks(searchContainer.getStart(), searchContainer.getEnd());
		int totalCount = BookLocalServiceUtil.getBooksCount();
		searchContainer.setResults(bookList);
		searchContainer.setTotal(totalCount);*/

		// query limited set

		/*if(!keyword.isEmpty()){
			dynamicQuery.add(PropertyFactoryUtil.forName("test_book.title").like(StringPool.PERCENT + keyword  + StringPool.PERCENT ));
			Criterion criterion = null;
			criterion = RestrictionsFactoryUtil.like("test_book.title", StringPool.PERCENT + keyword+ StringPool.PERCENT);
			criterion = RestrictionsFactoryUtil.or(test_book.criterion, RestrictionsFactoryUtil.like("test_book.content",StringPool.PERCENT + keyword  + StringPool.PERCENT));
			dynamicQuery.add(criterion);
		}*/


		//dynamicQuery.setLimit();
		_log.debug(dynamicQuery.toString());
		_log.debug("####searchContainer.getStart()###" +searchContainer.getStart());
		_log.debug("####searchContainer.getEnd()###" +searchContainer.getEnd());

		List<Book> datasetList = BookLocalServiceUtil.dynamicQuery(dynamicQuery, searchContainer.getStart(), searchContainer.getEnd());
		int datasetCount = (int) BookLocalServiceUtil.dynamicQueryCount(dynamicQuery);
		_log.debug("###datasetList.size() ###" + datasetList.size());


		_log.debug("######dynamicQuery count #####"+datasetCount);
		//model.addAttribute("results", datasetList);
		//model.addAttribute("total", datasetCount);
		//model.addAttribute("iteratorURL",response.createRenderURL());
		searchContainer.setResults(datasetList);
		searchContainer.setTotal(datasetCount);
		String currentURL = PortalUtil.getCurrentURL(request);

		model.addAttribute("currentURL", currentURL);
		model.addAttribute("searchContainer", searchContainer);
		model.addAttribute("keword", keyword);

		/*SearchContainer<Book> searchContainer = new SearchContainer<Book>(request, null, null,
				SearchContainer.DEFAULT_CUR_PARAM, 0, 0, response.createRenderURL(), null, "Data Empty");*/
		/*SearchContainer<Book> searchContainer = new SearchContainer<Book>(request, response.createRenderURL(),null, "Data Empty");
		//searchContext.setStart(searchContainer.getStart());
		//searchContext.setEnd(searchContainer.getEnd());


		_log.debug(searchContainer);
		int groupId = 111;

		Book guestbooks  = BookLocalServiceUtil.getBook(groupId);
		model.addAttribute("books", guestbooks);*/
		/*

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Book.class.getName(), request);

		ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		User user = td.getUser();

		long userId = user.getUserId();
		long scopeGroupId = td.getScopeGroupId();

		// 관리자 여부 판단
		//boolean ownerBool = PermissionConstant.checkAdmin(serviceContext, scopeGroupId);

		// 관리자 인경우 전체 목록 / 아니면 본인이 신청한 목록
		List<Book> reqMakeSiteList = null;
		int count = 0;
		long groupId = 111;
		List<book> guestbooks = BookLocalServiceUtil.getBook(groupId);

		*//*if (ownerBool) { // 관리자 전체 목록
			reqMakeSiteList = ReqMakeSiteServiceUtil.getReqMakeSites(searchContainer.getStart(), searchContainer.getEnd());
			count = reqMakeSiteList.size();
			model.addAttribute("owner", true);
		} else { // 본인이 신청한 목록
			reqMakeSiteList = ReqMakeSiteServiceUtil.getList(searchContainer.getStart(), searchContainer.getEnd(), userId);
			count = ReqMakeSiteServiceUtil.getCount(userId);
		}*//*

		reqMakeSiteList = BookServiceUtil.getList(searchContainer.getStart(), searchContainer.getEnd(), userId);

		searchContainer.setResults(reqMakeSiteList);
		searchContainer.setTotal(count);*/
	
		return "guideBook/view";
	}
	@RenderMapping(params = "action=detail")
	public String detail(RenderRequest request, RenderResponse response, Model model) throws SystemException, PortalException {
		_log.debug("### book detail render ###");
		int bookId = ParamUtil.getInteger(request, "bookId");
		String viewPage = ParamUtil.getString(request, "viewPage");

		Book book = null;
		if(bookId > 0){
			book = BookLocalServiceUtil.getBook(bookId);
		}
		request.setAttribute("book", book);
		_log.debug("view#########"+viewPage);
		if(viewPage.equals("viewPage")) return "guideBook/detailView";
		else return "guideBook/detail";
	}
	@RenderMapping(params = "action=popup")
	public String popup(RenderRequest request, RenderResponse response, Model model) throws Exception {
		String popup = ParamUtil.getString(request, "popup");
		_log.debug("#######popup#####"+popup);
		if(popup.equals("popupValue")) model.addAttribute("sucessflag", "true");
		return "guideBook/popup";
	}
	@ActionMapping(params = "action=delete")
	public void delete(ActionRequest request, ActionResponse response, Model model) throws SystemException, PortalException, IOException {

		int bookId = ParamUtil.getInteger(request, "bookId");
		String currentURL = ParamUtil.getString(request, "currentURL");

		BookLocalServiceUtil.deleteBook(bookId);
		response.sendRedirect(currentURL);
		_log.debug("### book delete sucess ###"+ bookId + "###");
	}
	@ActionMapping(value = "save")
	public void save(ActionRequest request, ActionResponse response, Model model) throws SystemException, PortalException,IOException {
		//BookLocalServiceUtil.Book(bookId);
		String portletName = "#portlet_guidebookportlet_WAR_guidebookportlet";
		String pageName="/view";
		int bookId = ParamUtil.getInteger(request, "bookId");
		_log.debug("### book create ###"+ bookId + "###");
		String title = ParamUtil.getString(request, "title");
		_log.debug("### book create1 ###"+ title + "###");
		String content = ParamUtil.getString(request, "content");
		_log.debug("### book create2 ###"+ content + "###");
		String userName = ParamUtil.getString(request, "userName");
		_log.debug("### book create3 ###"+ userName + "###");
		Date newDate = new Date();
		String popup = ParamUtil.getString(request,"popup");


		if(bookId > 0){

			//Book book = BookLocalServiceUtil.createBook(bookId);
			Book book = BookLocalServiceUtil.getBook(bookId);

			book.setTitle(title);
			book.setContent(content);
			book.setUserName(userName);
			book.setModifiedDate(newDate);
			_log.debug("### book update ###"+ book + "###");
			if(validate(book, request)){
				BookLocalServiceUtil.updateBook(book);
				_log.debug("##book update sucess##");
				//response.setRenderParameter("action", "view");
			}else{
				_log.debug("##book update fail##");
				response.setRenderParameter("action", "detail");
			}

		}else{
			bookId = (int)CounterLocalServiceUtil.increment(Book.class.getName());
			Book book = BookLocalServiceUtil.createBook(bookId);

			book.setTitle(title);
			book.setContent(content);
			book.setUserName(userName);
			book.setCreateDate(newDate);
			book.setModifiedDate(newDate);
			_log.debug("### book create ###"+ book + "###");
			if(validate(book, request)){
				BookLocalServiceUtil.addBook(book);
				_log.debug("##book create sucess##");
				//response.setRenderParameter("action", "view");
				if(popup.equals("popup")) {
					response.setRenderParameter("action", "popup");
					response.setRenderParameter("popup", "popupValue");
				}
			}else{
				_log.debug("##book create fail##");
				if(popup.equals("popup")) response.setRenderParameter("action", "popup");
				else response.setRenderParameter("action", "detail");

			}
		}
		/*long plid = 0L;
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		plid = LayoutLocalServiceUtil.getFriendlyURLLayout(themeDisplay.getScopeGroupId(), false, pageName).getPlid();
		PortletURL redirectURL = PortletURLFactoryUtil.create(PortalUtil.getHttpServletRequest(request),portletName,plid,    PortletRequest.RENDER_PHASE);
		//_log.debug("### book delete sucess ###"+ bookId + "###");

		response.sendRedirect(redirectURL.toString());*/
	}
	public boolean validate(Book book, ActionRequest request){
		boolean flag = true;
		if(!Validator.isName(book.getUserName())){
			//SessionErrors.add(request,"userName.errorMsg.missing");
			flag = false;
		}
		if(!Validator.isNotNull(book.getUserName())){
			//SessionErrors.add(request,"userName.errorMsg.Null");
			flag = false;
		}
		flag = true;
		return flag;
	}


	//////////////////////////file upload
	@RenderMapping(params = "action=uploadView")
	public String uploadView(RenderRequest request, RenderResponse response, Model model) throws Exception {
		return "guideBook/uploadView";
	}
	@RenderMapping(params = "action=downloadView")
	public String downloadView(RenderRequest request, RenderResponse response, Model model) throws Exception {
		return "guideBook/downloadView";
	}
	private static String ROOT_FOLDER_NAME = PortletProps.get("fileupload.folder.name");
	private static String ROOT_FOLDER_DESCRIPTION = PortletProps.get("fileupload.folder.description");
	private static long PARENT_FOLDER_ID = DLFolderConstants.DEFAULT_PARENT_FOLDER_ID;

	@ActionMapping(value = "uploadDocument")
	public void uploadDocument(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,PortletException, PortalException, SystemException
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		createFolder(actionRequest, themeDisplay);
		fileUpload(themeDisplay, actionRequest);

	}

	@ActionMapping(value = "downloadFiles")
	public void downloadFiles(ActionRequest actionRequest,ActionResponse actionResponse) throws IOException,PortletException, PortalException, SystemException
	{
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);


		Map<String,String> urlMap = getAllFileLink(themeDisplay);
		actionRequest.setAttribute("urlMap", urlMap);
		//actionResponse.setRenderParameter("jspPage","/html/documentupload/download.jsp");
		actionResponse.setRenderParameter("action","downloadView");

		PortletContext context = actionRequest.getPortletSession().getPortletContext();
		String path = context.getRealPath("/images");
		_log.debug("###context####"+context);
		_log.debug("###path####"+path);
	}
	public Folder createFolder(ActionRequest actionRequest, ThemeDisplay themeDisplay)
	{
		boolean folderExist = isFolderExist(themeDisplay);
		Folder folder = null;
		if (!folderExist) {
			long repositoryId = themeDisplay.getScopeGroupId();
			try {
				_log.debug("##############fileTest###############"+ROOT_FOLDER_NAME);
				ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFolder.class.getName(), actionRequest);
				folder = DLAppServiceUtil.addFolder(repositoryId,PARENT_FOLDER_ID, ROOT_FOLDER_NAME,ROOT_FOLDER_DESCRIPTION, serviceContext);
			} catch (PortalException e1) {
				e1.printStackTrace();
			} catch (SystemException e1) {
				e1.printStackTrace();
			}
		}
		return folder;
	}


	public boolean isFolderExist(ThemeDisplay themeDisplay){
		boolean folderExist = false;
		try {
			DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
			folderExist = true;
			System.out.println("Folder is already Exist");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folderExist;
	}

	public Folder getFolder(ThemeDisplay themeDisplay){
		Folder folder = null;
		try {
			folder =DLAppServiceUtil.getFolder(themeDisplay.getScopeGroupId(), PARENT_FOLDER_ID, ROOT_FOLDER_NAME);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return folder;
	}


	public void fileUpload(ThemeDisplay themeDisplay,ActionRequest actionRequest)
	{
		UploadPortletRequest uploadPortletRequest = PortalUtil.getUploadPortletRequest(actionRequest);

		String fileName=uploadPortletRequest.getFileName("uploadedFile");
		File file = uploadPortletRequest.getFile("uploadedFile");
		String mimeType = uploadPortletRequest.getContentType("uploadedFile");
		String title = fileName;
		String description = "This file is added via programatically";
		long repositoryId = themeDisplay.getScopeGroupId();
		System.out.println("Title=>"+title);
		try
		{
			Folder folder = getFolder(themeDisplay);
			ServiceContext serviceContext = ServiceContextFactory.getInstance(DLFileEntry.class.getName(), actionRequest);
			InputStream is = new FileInputStream( file );
			DLAppServiceUtil.addFileEntry(repositoryId, folder.getFolderId(), fileName, mimeType,
					title, description, "", is, file.getTotalSpace(), serviceContext);

		} catch (Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public Map<String, String> getAllFileLink(ThemeDisplay themeDisplay){
		Map<String, String> urlMap = new HashMap<String, String>();//key = file name ,value = url
		long repositoryId = themeDisplay.getScopeGroupId();
		try {

			Folder folder =getFolder(themeDisplay);
			List<FileEntry> fileEntries = DLAppServiceUtil.getFileEntries(repositoryId, folder.getFolderId());
			for (FileEntry file : fileEntries) {
				_log.debug("themeDisplay.getPortalURL()#####"+themeDisplay.getPortalURL());
				_log.debug("themeDisplay.getPathContext()#####"+themeDisplay.getPathContext());
				_log.debug("themeDisplay.getScopeGroupId()#####"+themeDisplay.getScopeGroupId());
				_log.debug("file.getFolderId()#####"+file.getFolderId());
				_log.debug("file.getTitle()#####"+file.getTitle());

				String url = themeDisplay.getPortalURL() + themeDisplay.getPathContext() + "/documents/" + themeDisplay.getScopeGroupId() + "/" +
						file.getFolderId() +  "/" +file.getTitle() ;
				_log.debug("url#####"+url);
				_log.debug("file.getTitle().split#####"+file.getTitle().split("\\.")[0]);

				urlMap.put(file.getTitle().split("\\.")[0], url);// remove jpg or pdf

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return urlMap;

	}




}
