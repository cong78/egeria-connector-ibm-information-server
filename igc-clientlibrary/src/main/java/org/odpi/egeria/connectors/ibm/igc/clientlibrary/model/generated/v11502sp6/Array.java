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
 * POJO for the {@code array} asset type in IGC, displayed as '{@literal Array}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("array")
public class Array extends Reference {

    public static String getIgcTypeDisplayName() { return "Array"; }

    /**
     * The {@code name} property, displayed as '{@literal Name}' in the IGC UI.
     */
    protected String name;

    /**
     * The {@code short_description} property, displayed as '{@literal Short Description}' in the IGC UI.
     */
    protected String short_description;

    /**
     * The {@code long_description} property, displayed as '{@literal Long Description}' in the IGC UI.
     */
    protected String long_description;

    /**
     * The {@code labels} property, displayed as '{@literal Labels}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Label} objects.
     */
    protected ReferenceList labels;

    /**
     * The {@code stewards} property, displayed as '{@literal Stewards}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link AsclSteward} objects.
     */
    protected ReferenceList stewards;

    /**
     * The {@code assigned_to_terms} property, displayed as '{@literal Assigned to Terms}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Term} objects.
     */
    protected ReferenceList assigned_to_terms;

    /**
     * The {@code implements_rules} property, displayed as '{@literal Implements Rules}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationGovernanceRule} objects.
     */
    protected ReferenceList implements_rules;

    /**
     * The {@code governed_by_rules} property, displayed as '{@literal Governed by Rules}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationGovernanceRule} objects.
     */
    protected ReferenceList governed_by_rules;

    /**
     * The {@code next_array} property, displayed as '{@literal Next Array}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Array} object.
     */
    protected Reference next_array;

    /**
     * The {@code lower_bound} property, displayed as '{@literal Lower Bound}' in the IGC UI.
     */
    protected Number lower_bound;

    /**
     * The {@code previous_array} property, displayed as '{@literal Previous Array}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Array} object.
     */
    protected Reference previous_array;

    /**
     * The {@code belonging_to_data_item} property, displayed as '{@literal Belonging to Data Item}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link DataItem} object.
     */
    protected Reference belonging_to_data_item;

    /**
     * The {@code maximum_size} property, displayed as '{@literal Maximum Size}' in the IGC UI.
     */
    protected Number maximum_size;

    /**
     * The {@code minimum_size} property, displayed as '{@literal Minimum Size}' in the IGC UI.
     */
    protected Number minimum_size;


    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #long_description */ @JsonProperty("long_description")  public String getLongDescription() { return this.long_description; }
    /** @see #long_description */ @JsonProperty("long_description")  public void setLongDescription(String long_description) { this.long_description = long_description; }

    /** @see #labels */ @JsonProperty("labels")  public ReferenceList getLabels() { return this.labels; }
    /** @see #labels */ @JsonProperty("labels")  public void setLabels(ReferenceList labels) { this.labels = labels; }

    /** @see #stewards */ @JsonProperty("stewards")  public ReferenceList getStewards() { return this.stewards; }
    /** @see #stewards */ @JsonProperty("stewards")  public void setStewards(ReferenceList stewards) { this.stewards = stewards; }

    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public ReferenceList getAssignedToTerms() { return this.assigned_to_terms; }
    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public void setAssignedToTerms(ReferenceList assigned_to_terms) { this.assigned_to_terms = assigned_to_terms; }

    /** @see #implements_rules */ @JsonProperty("implements_rules")  public ReferenceList getImplementsRules() { return this.implements_rules; }
    /** @see #implements_rules */ @JsonProperty("implements_rules")  public void setImplementsRules(ReferenceList implements_rules) { this.implements_rules = implements_rules; }

    /** @see #governed_by_rules */ @JsonProperty("governed_by_rules")  public ReferenceList getGovernedByRules() { return this.governed_by_rules; }
    /** @see #governed_by_rules */ @JsonProperty("governed_by_rules")  public void setGovernedByRules(ReferenceList governed_by_rules) { this.governed_by_rules = governed_by_rules; }

    /** @see #next_array */ @JsonProperty("next_array")  public Reference getNextArray() { return this.next_array; }
    /** @see #next_array */ @JsonProperty("next_array")  public void setNextArray(Reference next_array) { this.next_array = next_array; }

    /** @see #lower_bound */ @JsonProperty("lower_bound")  public Number getLowerBound() { return this.lower_bound; }
    /** @see #lower_bound */ @JsonProperty("lower_bound")  public void setLowerBound(Number lower_bound) { this.lower_bound = lower_bound; }

    /** @see #previous_array */ @JsonProperty("previous_array")  public Reference getPreviousArray() { return this.previous_array; }
    /** @see #previous_array */ @JsonProperty("previous_array")  public void setPreviousArray(Reference previous_array) { this.previous_array = previous_array; }

    /** @see #belonging_to_data_item */ @JsonProperty("belonging_to_data_item")  public Reference getBelongingToDataItem() { return this.belonging_to_data_item; }
    /** @see #belonging_to_data_item */ @JsonProperty("belonging_to_data_item")  public void setBelongingToDataItem(Reference belonging_to_data_item) { this.belonging_to_data_item = belonging_to_data_item; }

    /** @see #maximum_size */ @JsonProperty("maximum_size")  public Number getMaximumSize() { return this.maximum_size; }
    /** @see #maximum_size */ @JsonProperty("maximum_size")  public void setMaximumSize(Number maximum_size) { this.maximum_size = maximum_size; }

    /** @see #minimum_size */ @JsonProperty("minimum_size")  public Number getMinimumSize() { return this.minimum_size; }
    /** @see #minimum_size */ @JsonProperty("minimum_size")  public void setMinimumSize(Number minimum_size) { this.minimum_size = minimum_size; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return false; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description",
        "lower_bound",
        "maximum_size",
        "minimum_size"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "labels",
        "stewards",
        "assigned_to_terms",
        "implements_rules",
        "governed_by_rules"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description",
        "labels",
        "stewards",
        "assigned_to_terms",
        "implements_rules",
        "governed_by_rules",
        "next_array",
        "lower_bound",
        "previous_array",
        "belonging_to_data_item",
        "maximum_size",
        "minimum_size"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isArray(Object obj) { return (obj.getClass() == Array.class); }

}
