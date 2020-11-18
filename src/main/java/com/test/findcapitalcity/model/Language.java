
package com.test.findcapitalcity.model;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
    "iso639_1",
    "iso639_2",
    "name",
    "nativeName"
})
public class Language {

    @JsonProperty("iso639_1")
    private String iso6391;
    @JsonProperty("iso639_2")
    private String iso6392;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nativeName")
    private String nativeName;

    @JsonProperty("iso639_1")
    public String getIso6391() {
        return iso6391;
    }

    @JsonProperty("iso639_1")
    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }

    @JsonProperty("iso639_2")
    public String getIso6392() {
        return iso6392;
    }

    @JsonProperty("iso639_2")
    public void setIso6392(String iso6392) {
        this.iso6392 = iso6392;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("nativeName")
    public String getNativeName() {
        return nativeName;
    }

    @JsonProperty("nativeName")
    public void setNativeName(String nativeName) {
        this.nativeName = nativeName;
    }

}
