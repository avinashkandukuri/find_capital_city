
package com.test.findcapitalcity.model;

import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "acronym",
    "name",
    "otherAcronyms",
    "otherNames"
})
public class RegionalBloc {

    @JsonProperty("acronym")
    private String acronym;
    @JsonProperty("name")
    private String name;
    @JsonProperty("otherAcronyms")
    private List<Object> otherAcronyms = null;
    @JsonProperty("otherNames")
    private List<Object> otherNames = null;

    @JsonProperty("acronym")
    public String getAcronym() {
        return acronym;
    }

    @JsonProperty("acronym")
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("otherAcronyms")
    public List<Object> getOtherAcronyms() {
        return otherAcronyms;
    }

    @JsonProperty("otherAcronyms")
    public void setOtherAcronyms(List<Object> otherAcronyms) {
        this.otherAcronyms = otherAcronyms;
    }

    @JsonProperty("otherNames")
    public List<Object> getOtherNames() {
        return otherNames;
    }

    @JsonProperty("otherNames")
    public void setOtherNames(List<Object> otherNames) {
        this.otherNames = otherNames;
    }

}
