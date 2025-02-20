/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common;

/**
 * Interface through which to set properties dynamically on Jackson POJO's, using LambdaMetafactory approach.
 *
 * Based on simple example at:
 * https://github.com/ge0ffrey/ge0ffrey-presentations/blob/master/code/fasterreflection/fasterreflection-framework/src/main/java/be/ge0ffrey/presentations/fasterreflection/framework/BeanPropertyReader.java
 */
public interface DynamicPropertySetter {
    void setProperty(Object pojo, Object value);
}
