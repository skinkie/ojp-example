package com.bliksemlabs;

import java.util.HashMap;
import java.util.Map;
import org.glassfish.jaxb.runtime.marshaller.NamespacePrefixMapper;

/**
 * Implementation of {@link NamespacePrefixMapper} that maps the schema
 * namespaces more to readable names. Used by the jaxb marshaller. Requires
 * setting the property "com.sun.xml.bind.namespacePrefixMapper" to an instance
 * of this class.
 * <p>
 * Requires dependency on JAXB implementation jars
 * </p>
 */

public class NameSpaceMapper extends NamespacePrefixMapper {

    private Map<String, String> namespaceMap = new HashMap<>();

    /**
     * Create mappings.
     */
    public NameSpaceMapper() {
        namespaceMap.put("http://www.vdv.de/ojp", "");
        // namespaceMap.put("http://www.w3.org/2001/XMLSchema", "xs");
        namespaceMap.put("http://www.opengis.net/gml/3.2", "gml");
        namespaceMap.put("http://www.siri.org.uk/siri", "siri");
        namespaceMap.put("http://www.ifopt.org.uk/acsb", "acsb");
        namespaceMap.put("http://www.ifopt.org.uk/ifopt", "ifopt");
        namespaceMap.put("http://datex2.eu/schema/2_0RC1/2_0", "datex2");
    }

    /* (non-Javadoc)
     * Returning null when not found based on spec.
     * @see com.sun.xml.bind.marshaller.NamespacePrefixMapper#getPreferredPrefix(java.lang.String, java.lang.String, boolean)
     */
    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
        return namespaceMap.getOrDefault(namespaceUri, suggestion);
    }
}
