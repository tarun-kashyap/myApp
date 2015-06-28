/**
 * 
 */
package com.mrfaveo.domain;

/**
 * @author dev
 *
 */
public class SearchCriteriaImpl implements SearchCriteria {
	
	private SearchType searchType;
	
	private boolean wildcardSearch;
	
	private boolean ignoreCase;
	
	private int maximumMatches;
	
	private String id;
	
	private Info info;

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#setSearchType(com.mrfaveo.domain.SearchCriteria.SearchType)
	 */
	@Override
	public void setSearchType(SearchType type) {
		this.searchType = type;

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#getSearchType()
	 */
	@Override
	public SearchType getSearchType() {
		return searchType;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#isWildcardSearch()
	 */
	@Override
	public boolean isWildcardSearch() {
		return wildcardSearch;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#isIgnoreCase()
	 */
	@Override
	public boolean isIgnoreCase() {
		return ignoreCase;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#setWildcardSearch(boolean)
	 */
	@Override
	public void setWildcardSearch(boolean wildcardSearch) {
		this.wildcardSearch = wildcardSearch;

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#setIgnoreCase(boolean)
	 */
	@Override
	public void setIgnoreCase(boolean ignoreCase) {
		this.ignoreCase = ignoreCase;
	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#setMaximumMatches(int)
	 */
	@Override
	public void setMaximumMatches(int maximumMatches) {
		this.maximumMatches = maximumMatches;

	}

	/* (non-Javadoc)
	 * @see com.mrfaveo.domain.SearchCriteria#getMaximumMatches()
	 */
	@Override
	public int getMaximumMatches() {
		return maximumMatches;
	}

	@Override
	public Info getInfo() {
		
		return info;
	}

	@Override
	public void setInfo(Info info) {
		this.info = info;
	}

	@Override
	public String getId() {
		
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
		
	}

}
