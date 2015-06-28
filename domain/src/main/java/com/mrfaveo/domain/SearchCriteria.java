/**
 * 
 */
package com.mrfaveo.domain;

/**
 * @author dev
 *
 */
public interface SearchCriteria {
	
	public enum SearchType
    {
        UNDEFINED,
        SEARCH_BY_ID,
        SEARCH_BY_INFO
    }
	
	public void setSearchType(SearchType type);
	
	public SearchType getSearchType();
	
    public boolean isWildcardSearch();
    
    public boolean isIgnoreCase();
    
    public void setWildcardSearch(boolean wildcardSearch);
   
    public void setIgnoreCase(boolean ignoreCase);
    
    public void setMaximumMatches(int maximumMatches);
    
    public int getMaximumMatches();
    
    public Info getInfo();
    
    public void setInfo(Info info);
    
    public String getId();
    
    public void setId(String id);


}
