CREATE TABLE
		USR
		(
			USR_ID INT UNSIGNED  NOT NULL AUTO_INCREMENT COMMENT 'user id sequence',
			USR_NM VARCHAR(20) NOT NULL COMMENT 'user login name',
			PASSWORD VARCHAR(20) NOT NULL COMMENT 'encrypted user password',
			USR_TYPE VARCHAR(2) NOT NULL COMMENT 'user type',
			F_NM VARCHAR(50) COMMENT 'First Name',
			L_NM VARCHAR(50) COMMENT 'Last Name',
			GENDER Varchar(1) COMMENT 'M or F',
			TS_CRT TIMESTAMP COMMENT 'created on date',
			TS_MDF TIMESTAMP COMMENT 'last modified date',
			MDTR_ID VARCHAR(10) COMMENT 'last modifier id',
			STATUS VARCHAR(10)  COMMENT 'User Status- Inactive, Active',
			TS_EF TIMESTAMP COMMENT 'Effective date',
			TS_EP TIMESTAMP COMMENT 'Expiry Date',
			PRIMARY KEY (USR_ID)
		);