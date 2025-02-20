/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.repositoryconnector.mapping.relationships;

import org.odpi.egeria.connectors.ibm.igc.clientlibrary.IGCVersionEnum;

/**
 * Singleton to map the OMRS "AssetSchemaType" relationship between IGC "data_file" and "data_file_record" objects.
 */
public class AssetSchemaTypeMapper_FileRecord extends RelationshipMapping {

    private static class Singleton {
        private static final AssetSchemaTypeMapper_FileRecord INSTANCE = new AssetSchemaTypeMapper_FileRecord();
    }
    public static AssetSchemaTypeMapper_FileRecord getInstance(IGCVersionEnum version) {
        return Singleton.INSTANCE;
    }

    private AssetSchemaTypeMapper_FileRecord() {
        super(
                "data_file",
                "data_file_record",
                "data_file_records",
                "data_file",
                "AssetSchemaType",
                "describesAssets",
                "schema"
        );
    }

}
