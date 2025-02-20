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
 * POJO for the {@code classification} asset type in IGC, displayed as '{@literal Classification}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("classification")
public class Classification extends Reference {

    public static String getIgcTypeDisplayName() { return "Classification"; }

    /**
     * The {@code data_class} property, displayed as '{@literal Data Class}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link DataClass} object.
     */
    protected Reference data_class;

    /**
     * The {@code classifies_asset} property, displayed as '{@literal Asset}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link MainObject} object.
     */
    protected Reference classifies_asset;

    /**
     * The {@code selected} property, displayed as '{@literal Selected}' in the IGC UI.
     */
    protected Boolean selected;

    /**
     * The {@code detected} property, displayed as '{@literal Detected}' in the IGC UI.
     */
    protected Boolean detected;

    /**
     * The {@code detectedState} property, displayed as '{@literal Type}' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>Candidate (displayed in the UI as 'Candidate')</li>
     *     <li>Inferred (displayed in the UI as 'Inferred')</li>
     * </ul>
     */
    protected String detectedState;

    /**
     * The {@code confidencePercent} property, displayed as '{@literal Confidence (Percent)}' in the IGC UI.
     */
    protected Number confidencePercent;

    /**
     * The {@code threshold} property, displayed as '{@literal Threshold}' in the IGC UI.
     */
    protected Number threshold;

    /**
     * The {@code date} property, displayed as '{@literal Date}' in the IGC UI.
     */
    protected Date date;

    /**
     * The {@code column_analysis} property, displayed as '{@literal Detected from Column Analysis}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link MainObject} objects.
     */
    protected ReferenceList column_analysis;


    /** @see #data_class */ @JsonProperty("data_class")  public Reference getDataClass() { return this.data_class; }
    /** @see #data_class */ @JsonProperty("data_class")  public void setDataClass(Reference data_class) { this.data_class = data_class; }

    /** @see #classifies_asset */ @JsonProperty("classifies_asset")  public Reference getClassifiesAsset() { return this.classifies_asset; }
    /** @see #classifies_asset */ @JsonProperty("classifies_asset")  public void setClassifiesAsset(Reference classifies_asset) { this.classifies_asset = classifies_asset; }

    /** @see #selected */ @JsonProperty("selected")  public Boolean getSelected() { return this.selected; }
    /** @see #selected */ @JsonProperty("selected")  public void setSelected(Boolean selected) { this.selected = selected; }

    /** @see #detected */ @JsonProperty("detected")  public Boolean getDetected() { return this.detected; }
    /** @see #detected */ @JsonProperty("detected")  public void setDetected(Boolean detected) { this.detected = detected; }

    /** @see #detectedState */ @JsonProperty("detectedState")  public String getDetectedstate() { return this.detectedState; }
    /** @see #detectedState */ @JsonProperty("detectedState")  public void setDetectedstate(String detectedState) { this.detectedState = detectedState; }

    /** @see #confidencePercent */ @JsonProperty("confidencePercent")  public Number getConfidencepercent() { return this.confidencePercent; }
    /** @see #confidencePercent */ @JsonProperty("confidencePercent")  public void setConfidencepercent(Number confidencePercent) { this.confidencePercent = confidencePercent; }

    /** @see #threshold */ @JsonProperty("threshold")  public Number getThreshold() { return this.threshold; }
    /** @see #threshold */ @JsonProperty("threshold")  public void setThreshold(Number threshold) { this.threshold = threshold; }

    /** @see #date */ @JsonProperty("date")  public Date getDate() { return this.date; }
    /** @see #date */ @JsonProperty("date")  public void setDate(Date date) { this.date = date; }

    /** @see #column_analysis */ @JsonProperty("column_analysis")  public ReferenceList getColumnAnalysis() { return this.column_analysis; }
    /** @see #column_analysis */ @JsonProperty("column_analysis")  public void setColumnAnalysis(ReferenceList column_analysis) { this.column_analysis = column_analysis; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return false; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "selected",
        "detected",
        "detectedState",
        "confidencePercent",
        "threshold",
        "date"
    );
    private static final List<String> STRING_PROPERTIES = new ArrayList<>();
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "column_analysis"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "data_class",
        "classifies_asset",
        "selected",
        "detected",
        "detectedState",
        "confidencePercent",
        "threshold",
        "date",
        "column_analysis"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isClassification(Object obj) { return (obj.getClass() == Classification.class); }

}
