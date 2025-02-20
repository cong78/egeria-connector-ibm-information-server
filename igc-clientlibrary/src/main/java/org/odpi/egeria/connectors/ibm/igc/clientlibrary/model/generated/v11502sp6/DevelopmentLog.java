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
 * POJO for the {@code development_log} asset type in IGC, displayed as '{@literal DevelopmentLog}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("development_log")
public class DevelopmentLog extends Reference {

    public static String getIgcTypeDisplayName() { return "DevelopmentLog"; }

    /**
     * The {@code date} property, displayed as '{@literal Date}' in the IGC UI.
     */
    protected Date date;

    /**
     * The {@code workflow_task} property, displayed as '{@literal Workflow Task}' in the IGC UI.
     */
    protected String workflow_task;

    /**
     * The {@code activity} property, displayed as '{@literal Activity}' in the IGC UI.
     */
    protected String activity;

    /**
     * The {@code new_state} property, displayed as '{@literal New State}' in the IGC UI.
     */
    protected String new_state;

    /**
     * The {@code person} property, displayed as '{@literal Person}' in the IGC UI.
     */
    protected String person;

    /**
     * The {@code comment} property, displayed as '{@literal Comment}' in the IGC UI.
     */
    protected String comment;


    /** @see #date */ @JsonProperty("date")  public Date getDate() { return this.date; }
    /** @see #date */ @JsonProperty("date")  public void setDate(Date date) { this.date = date; }

    /** @see #workflow_task */ @JsonProperty("workflow_task")  public String getWorkflowTask() { return this.workflow_task; }
    /** @see #workflow_task */ @JsonProperty("workflow_task")  public void setWorkflowTask(String workflow_task) { this.workflow_task = workflow_task; }

    /** @see #activity */ @JsonProperty("activity")  public String getActivity() { return this.activity; }
    /** @see #activity */ @JsonProperty("activity")  public void setActivity(String activity) { this.activity = activity; }

    /** @see #new_state */ @JsonProperty("new_state")  public String getNewState() { return this.new_state; }
    /** @see #new_state */ @JsonProperty("new_state")  public void setNewState(String new_state) { this.new_state = new_state; }

    /** @see #person */ @JsonProperty("person")  public String getPerson() { return this.person; }
    /** @see #person */ @JsonProperty("person")  public void setPerson(String person) { this.person = person; }

    /** @see #comment */ @JsonProperty("comment")  public String getComment() { return this.comment; }
    /** @see #comment */ @JsonProperty("comment")  public void setComment(String comment) { this.comment = comment; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return false; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "date",
        "workflow_task",
        "activity",
        "new_state",
        "person",
        "comment"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "workflow_task",
        "activity",
        "new_state",
        "person",
        "comment"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = new ArrayList<>();
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "date",
        "workflow_task",
        "activity",
        "new_state",
        "person",
        "comment"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isDevelopmentLog(Object obj) { return (obj.getClass() == DevelopmentLog.class); }

}
