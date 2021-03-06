/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;

/**
 * Salesforce QueryRecords DTO for type Campaign
 */
public class QueryRecordsCampaign extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Campaign> records;

    public List<Campaign> getRecords() {
        return records;
    }

    public void setRecords(List<Campaign> records) {
        this.records = records;
    }
}
