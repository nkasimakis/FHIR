/*
 * (C) Copyright IBM Corp. 2020
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.database.utils.model;

import com.ibm.fhir.database.utils.api.IDatabaseTypeAdapter;

/**
 * Small Int Column
 */
public class SmallIntColumn extends ColumnBase {
    /**
     * @param name
     * @param nullable
     * @param defaultValue
     */
    public SmallIntColumn(String name, boolean nullable, String defaultValue) {
        super(name, nullable, defaultValue);
    }

    @Override
    public String getTypeInfo(IDatabaseTypeAdapter adapter) {
        return "SMALLINT";
    }
}