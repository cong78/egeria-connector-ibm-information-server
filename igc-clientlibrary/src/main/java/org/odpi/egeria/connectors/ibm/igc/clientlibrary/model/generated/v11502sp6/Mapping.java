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
 * POJO for the {@code mapping} asset type in IGC, displayed as '{@literal Mapping}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("mapping")
public class Mapping extends Reference {

    public static String getIgcTypeDisplayName() { return "Mapping"; }

    /**
     * The {@code name} property, displayed as '{@literal Name}' in the IGC UI.
     */
    protected String name;

    /**
     * The {@code description} property, displayed as '{@literal Description}' in the IGC UI.
     */
    protected ArrayList<String> description;

    /**
     * The {@code mapping_specification} property, displayed as '{@literal Mapping Specification}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList mapping_specification;

    /**
     * The {@code source_column_names} property, displayed as '{@literal Source Column Names}' in the IGC UI.
     */
    protected ArrayList<String> source_column_names;

    /**
     * The {@code source_columns} property, displayed as '{@literal Source Columns}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DatabaseColumn} objects.
     */
    protected ReferenceList source_columns;

    /**
     * The {@code source_terms} property, displayed as '{@literal Source Terms}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Term} objects.
     */
    protected ReferenceList source_terms;

    /**
     * The {@code target_column_names} property, displayed as '{@literal Target Column Names}' in the IGC UI.
     */
    protected ArrayList<String> target_column_names;

    /**
     * The {@code target_columns} property, displayed as '{@literal Target Columns}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link DatabaseColumn} objects.
     */
    protected ReferenceList target_columns;

    /**
     * The {@code target_terms} property, displayed as '{@literal Target Terms}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Term} objects.
     */
    protected ReferenceList target_terms;

    /**
     * The {@code status} property, displayed as '{@literal Status}' in the IGC UI.
     */
    protected ArrayList<String> status;

    /**
     * The {@code tags} property, displayed as '{@literal Tags}' in the IGC UI.
     */
    protected String tags;

    /**
     * The {@code rule_description} property, displayed as '{@literal Rule Description}' in the IGC UI.
     */
    protected ArrayList<String> rule_description;

    /**
     * The {@code rule_expression} property, displayed as '{@literal Rule Expression}' in the IGC UI.
     */
    protected ArrayList<String> rule_expression;

    /**
     * The {@code last_update_description} property, displayed as '{@literal Last Update Description}' in the IGC UI.
     */
    protected ArrayList<String> last_update_description;

    /**
     * The {@code created_by} property, displayed as '{@literal Created By}' in the IGC UI.
     */
    protected String created_by;

    /**
     * The {@code created_on} property, displayed as '{@literal Created On}' in the IGC UI.
     */
    protected Date created_on;

    /**
     * The {@code modified_by} property, displayed as '{@literal Modified By}' in the IGC UI.
     */
    protected String modified_by;

    /**
     * The {@code modified_on} property, displayed as '{@literal Modified On}' in the IGC UI.
     */
    protected Date modified_on;


    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #description */ @JsonProperty("description")  public ArrayList<String> getDescription() { return this.description; }
    /** @see #description */ @JsonProperty("description")  public void setDescription(ArrayList<String> description) { this.description = description; }

    /** @see #mapping_specification */ @JsonProperty("mapping_specification")  public ReferenceList getMappingSpecification() { return this.mapping_specification; }
    /** @see #mapping_specification */ @JsonProperty("mapping_specification")  public void setMappingSpecification(ReferenceList mapping_specification) { this.mapping_specification = mapping_specification; }

    /** @see #source_column_names */ @JsonProperty("source_column_names")  public ArrayList<String> getSourceColumnNames() { return this.source_column_names; }
    /** @see #source_column_names */ @JsonProperty("source_column_names")  public void setSourceColumnNames(ArrayList<String> source_column_names) { this.source_column_names = source_column_names; }

    /** @see #source_columns */ @JsonProperty("source_columns")  public ReferenceList getSourceColumns() { return this.source_columns; }
    /** @see #source_columns */ @JsonProperty("source_columns")  public void setSourceColumns(ReferenceList source_columns) { this.source_columns = source_columns; }

    /** @see #source_terms */ @JsonProperty("source_terms")  public ReferenceList getSourceTerms() { return this.source_terms; }
    /** @see #source_terms */ @JsonProperty("source_terms")  public void setSourceTerms(ReferenceList source_terms) { this.source_terms = source_terms; }

    /** @see #target_column_names */ @JsonProperty("target_column_names")  public ArrayList<String> getTargetColumnNames() { return this.target_column_names; }
    /** @see #target_column_names */ @JsonProperty("target_column_names")  public void setTargetColumnNames(ArrayList<String> target_column_names) { this.target_column_names = target_column_names; }

    /** @see #target_columns */ @JsonProperty("target_columns")  public ReferenceList getTargetColumns() { return this.target_columns; }
    /** @see #target_columns */ @JsonProperty("target_columns")  public void setTargetColumns(ReferenceList target_columns) { this.target_columns = target_columns; }

    /** @see #target_terms */ @JsonProperty("target_terms")  public ReferenceList getTargetTerms() { return this.target_terms; }
    /** @see #target_terms */ @JsonProperty("target_terms")  public void setTargetTerms(ReferenceList target_terms) { this.target_terms = target_terms; }

    /** @see #status */ @JsonProperty("status")  public ArrayList<String> getStatus() { return this.status; }
    /** @see #status */ @JsonProperty("status")  public void setStatus(ArrayList<String> status) { this.status = status; }

    /** @see #tags */ @JsonProperty("tags")  public String getTags() { return this.tags; }
    /** @see #tags */ @JsonProperty("tags")  public void setTags(String tags) { this.tags = tags; }

    /** @see #rule_description */ @JsonProperty("rule_description")  public ArrayList<String> getRuleDescription() { return this.rule_description; }
    /** @see #rule_description */ @JsonProperty("rule_description")  public void setRuleDescription(ArrayList<String> rule_description) { this.rule_description = rule_description; }

    /** @see #rule_expression */ @JsonProperty("rule_expression")  public ArrayList<String> getRuleExpression() { return this.rule_expression; }
    /** @see #rule_expression */ @JsonProperty("rule_expression")  public void setRuleExpression(ArrayList<String> rule_expression) { this.rule_expression = rule_expression; }

    /** @see #last_update_description */ @JsonProperty("last_update_description")  public ArrayList<String> getLastUpdateDescription() { return this.last_update_description; }
    /** @see #last_update_description */ @JsonProperty("last_update_description")  public void setLastUpdateDescription(ArrayList<String> last_update_description) { this.last_update_description = last_update_description; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return true; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "name",
        "description",
        "source_column_names",
        "target_column_names",
        "status",
        "tags",
        "rule_description",
        "rule_expression",
        "last_update_description",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "name",
        "description",
        "source_column_names",
        "target_column_names",
        "status",
        "tags",
        "rule_description",
        "rule_expression",
        "last_update_description",
        "created_by",
        "modified_by"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "mapping_specification",
        "source_columns",
        "source_terms",
        "target_columns",
        "target_terms"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "name",
        "description",
        "mapping_specification",
        "source_column_names",
        "source_columns",
        "source_terms",
        "target_column_names",
        "target_columns",
        "target_terms",
        "status",
        "tags",
        "rule_description",
        "rule_expression",
        "last_update_description",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isMapping(Object obj) { return (obj.getClass() == Mapping.class); }

}
