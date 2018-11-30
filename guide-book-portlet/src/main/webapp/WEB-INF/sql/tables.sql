create table test_Book (
	gusetbookId INTEGER not null primary key,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deleteDate DATE null
);

create table test_BookFile (
	gusetbookId INTEGER not null,
	fileId INTEGER not null,
	fileName VARCHAR(75) null,
	fileType VARCHAR(75) null,
	fileLocation VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	deleteDate DATE null,
	primary key (gusetbookId, fileId)
);