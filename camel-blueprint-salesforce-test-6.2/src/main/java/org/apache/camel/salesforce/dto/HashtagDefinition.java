/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 03 14:23:16 IST 2015
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Salesforce DTO for SObject HashtagDefinition
 */
@XStreamAlias("HashtagDefinition")
public class HashtagDefinition extends AbstractSObjectBase {

    // NameNorm
    private String NameNorm;

    @JsonProperty("NameNorm")
    public String getNameNorm() {
        return this.NameNorm;
    }

    @JsonProperty("NameNorm")
    public void setNameNorm(String NameNorm) {
        this.NameNorm = NameNorm;
    }

    // HashtagCount
    private Integer HashtagCount;

    @JsonProperty("HashtagCount")
    public Integer getHashtagCount() {
        return this.HashtagCount;
    }

    @JsonProperty("HashtagCount")
    public void setHashtagCount(Integer HashtagCount) {
        this.HashtagCount = HashtagCount;
    }

}
