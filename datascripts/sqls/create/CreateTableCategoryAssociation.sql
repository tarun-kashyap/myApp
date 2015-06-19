CREATE TABLE
		CATEGORY_ASC
		(
			ID_CGY_CHLD INT UNSIGNED NOT NULL COMMENT 'Category whose relationship is defined',
			ID_CGY_PRNT INT UNSIGNED NOT NULL COMMENT 'Parent of the Category whose relationship is being defined',
			CAT_ID  INT  UNSIGNED NOT NULL REFERENCES CATALOG(CAT_ID),
			PRIMARY KEY (ID_CGY_CHLD, ID_CGY_PRNT, CAT_ID)
		)COMMENT 'Category Associations';