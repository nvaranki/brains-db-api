package com.varankin.brains.db.xml;

/**
 * Варианты параметра @{code xlink:show}.
 * 
 * @see <a href="http://www.w3.org/TR/xlink11/">XML Linking Language (XLink) Version 1.1, 5.6.1 show Attribute</a>
 *
 * @author &copy; 2021 Николай Варанкин
 */
public enum XLinkShow 
{ 
    /**
     * {@literal An application traversing to the ending resource should load it in a new presentation context.}
     */
    @Deprecated
    NEW, 
    /**
     * {@literal An application traversing to the ending resource should load the resource 
     * in the same presentation context in which the starting resource was loaded. }
     */
    @Deprecated
    REPLACE, 
    /**
     * Раскрыть полное содержимое объекта.
     * 
     * {@literal An application traversing to the ending resource should load its presentation 
     * in place of the presentation of the starting resource. }
     */
    EMBED, 
    /**
     * Показать упрощенное содержимое объекта (символ, марку, и т.п.).
     * 
     * {@literal The behavior of an application traversing to the ending resource 
     * is unconstrained by this specification. The application should look for 
     * other markup present in the link to determine the appropriate behavior. }
     */
    OTHER, 
    /**
     * Показать краткую ссылку на объект.
     * 
     * {@literal The behavior of an application traversing to the ending resource 
     * is unconstrained by this specification. No other markup is present to help 
     * the application determine the appropriate behavior. }
     */
    NONE 
}
