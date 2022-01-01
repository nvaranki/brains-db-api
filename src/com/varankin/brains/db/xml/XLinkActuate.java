package com.varankin.brains.db.xml;

/**
 * Варианты параметра @{code xlink:actuate}.
 * 
 * @see <a href="http://www.w3.org/TR/xlink11/">XML Linking Language (XLink) Version 1.1, 5.6.2 actuate Attribute</a>
 *
 * @author &copy; 2021 Николай Варанкин
 */
public enum XLinkActuate 
{ 
    /**
     * {@literal An application should traverse to the ending resource immediately 
     * on loading the starting resource. }
     */
    ON_LOAD, 
    /**
     * {@literal An application should traverse from the starting resource to the 
     * ending resource only on a post-loading event triggered for the purpose of traversal. }
     */
    ON_REQUEST, 
    /**
     * {@literal The behavior of an application traversing to the ending resource is 
     * unconstrained by this specification. The application should look for other markup 
     * present in the link to determine the appropriate behavior. }
     */
    @Deprecated
    OTHER, 
    /**
     * {@literal The behavior of an application traversing to the ending resource is 
     * unconstrained by this specification. No other markup is present to help the 
     * application determine the appropriate behavior. }
     */
    NONE 
}
