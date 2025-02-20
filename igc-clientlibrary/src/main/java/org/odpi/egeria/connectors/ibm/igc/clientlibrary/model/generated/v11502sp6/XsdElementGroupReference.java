/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.generated.v11502sp6;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.Generated;
import org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * POJO for the {@code xsd_element_group_reference} asset type in IGC, displayed as '{@literal XSD Element Group Reference}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("xsd_element_group_reference")
public class XsdElementGroupReference extends Reference {

    public static String getIgcTypeDisplayName() { return "XSD Element Group Reference"; }

    /**
     * The {@code min_occurs} property, displayed as '{@literal Minimum Occurrence}' in the IGC UI.
     */
    protected Number min_occurs;

    /**
     * The {@code max_occurs} property, displayed as '{@literal Maximum Occurrence}' in the IGC UI.
     */
    protected Number max_occurs;

    /**
     * The {@code xsd_element} property, displayed as '{@literal XSD Element}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList xsd_element;

    /**
     * The {@code xsd_complex_type} property, displayed as '{@literal XSD Complex Type}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link XsdComplexType} objects.
     */
    protected ReferenceList xsd_complex_type;

    /**
     * The {@code xsd_element_group} property, displayed as '{@literal XSD Element Group}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link XsdElementGroup} objects.
     */
    protected ReferenceList xsd_element_group;

    /**
     * The {@code references_xsd_element_group} property, displayed as '{@literal XSD Element Group}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link XsdElementGroup} object.
     */
    protected Reference references_xsd_element_group;


    /** @see #min_occurs */ @JsonProperty("min_occurs")  public Number getMinOccurs() { return this.min_occurs; }
    /** @see #min_occurs */ @JsonProperty("min_occurs")  public void setMinOccurs(Number min_occurs) { this.min_occurs = min_occurs; }

    /** @see #max_occurs */ @JsonProperty("max_occurs")  public Number getMaxOccurs() { return this.max_occurs; }
    /** @see #max_occurs */ @JsonProperty("max_occurs")  public void setMaxOccurs(Number max_occurs) { this.max_occurs = max_occurs; }

    /** @see #xsd_element */ @JsonProperty("xsd_element")  public ReferenceList getXsdElement() { return this.xsd_element; }
    /** @see #xsd_element */ @JsonProperty("xsd_element")  public void setXsdElement(ReferenceList xsd_element) { this.xsd_element = xsd_element; }

    /** @see #xsd_complex_type */ @JsonProperty("xsd_complex_type")  public ReferenceList getXsdComplexType() { return this.xsd_complex_type; }
    /** @see #xsd_complex_type */ @JsonProperty("xsd_complex_type")  public void setXsdComplexType(ReferenceList xsd_complex_type) { this.xsd_complex_type = xsd_complex_type; }

    /** @see #xsd_element_group */ @JsonProperty("xsd_element_group")  public ReferenceList getXsdElementGroup() { return this.xsd_element_group; }
    /** @see #xsd_element_group */ @JsonProperty("xsd_element_group")  public void setXsdElementGroup(ReferenceList xsd_element_group) { this.xsd_element_group = xsd_element_group; }

    /** @see #references_xsd_element_group */ @JsonProperty("references_xsd_element_group")  public Reference getReferencesXsdElementGroup() { return this.references_xsd_element_group; }
    /** @see #references_xsd_element_group */ @JsonProperty("references_xsd_element_group")  public void setReferencesXsdElementGroup(Reference references_xsd_element_group) { this.references_xsd_element_group = references_xsd_element_group; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return false; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "min_occurs",
        "max_occurs"
    );
    private static final List<String> STRING_PROPERTIES = new ArrayList<>();
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "xsd_element",
        "xsd_complex_type",
        "xsd_element_group"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "min_occurs",
        "max_occurs",
        "xsd_element",
        "xsd_complex_type",
        "xsd_element_group",
        "references_xsd_element_group"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isXsdElementGroupReference(Object obj) { return (obj.getClass() == XsdElementGroupReference.class); }

}
