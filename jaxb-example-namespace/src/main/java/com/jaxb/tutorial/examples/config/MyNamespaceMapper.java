package com.jaxb.tutorial.examples.config;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

import java.util.HashMap;
import java.util.Map;

/*
    to customize namespaces prefix you need to extend a class that is defined in the JAXB API called NamespacePrefixMapper
    don't forget to set the prefix property (in the TestExample class)
 */
public class MyNamespaceMapper extends NamespacePrefixMapper {

    private Map<String, String> namespaceMap;

    public static final String LOCATION_PREFIX = "loc";
    public static final String LOCATION_URI = "http://company/book/location";
    public static final String XSI_PREFIX = "xsi";
    public static final String XSI_URI = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String OGM_PREFIX = "ogm";
    public static final String OGM_URI = "http://www.w3.org/1999/XSL/Transform";

    public MyNamespaceMapper() {

        this.namespaceMap = new HashMap<String , String>();
        namespaceMap.put(LOCATION_URI , LOCATION_PREFIX);
        namespaceMap.put(XSI_URI , XSI_PREFIX);
        namespaceMap.put(OGM_URI , OGM_PREFIX);
    }

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        return getNamespacePrefix(namespaceUri,suggestion);
    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[] {LOCATION_URI, OGM_URI, XSI_URI};
    }

    private String getNamespacePrefix(String namespaceUri, String defaultPrefix){

        String prefix = namespaceMap.get(namespaceUri);
        if (prefix == null)
            return defaultPrefix;
        return prefix;
    }
}
