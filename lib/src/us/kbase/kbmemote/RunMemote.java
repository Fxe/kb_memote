
package us.kbase.kbmemote;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: RunMemote</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace",
    "model_id",
    "out_model_id",
    "compounds"
})
public class RunMemote {

    @JsonProperty("workspace")
    private String workspace;
    @JsonProperty("model_id")
    private String modelId;
    @JsonProperty("out_model_id")
    private String outModelId;
    @JsonProperty("compounds")
    private List<EachCompound> compounds;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace")
    public String getWorkspace() {
        return workspace;
    }

    @JsonProperty("workspace")
    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public RunMemote withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    @JsonProperty("model_id")
    public String getModelId() {
        return modelId;
    }

    @JsonProperty("model_id")
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public RunMemote withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    @JsonProperty("out_model_id")
    public String getOutModelId() {
        return outModelId;
    }

    @JsonProperty("out_model_id")
    public void setOutModelId(String outModelId) {
        this.outModelId = outModelId;
    }

    public RunMemote withOutModelId(String outModelId) {
        this.outModelId = outModelId;
        return this;
    }

    @JsonProperty("compounds")
    public List<EachCompound> getCompounds() {
        return compounds;
    }

    @JsonProperty("compounds")
    public void setCompounds(List<EachCompound> compounds) {
        this.compounds = compounds;
    }

    public RunMemote withCompounds(List<EachCompound> compounds) {
        this.compounds = compounds;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((("RunMemote"+" [workspace=")+ workspace)+", modelId=")+ modelId)+", outModelId=")+ outModelId)+", compounds=")+ compounds)+", additionalProperties=")+ additionalProperties)+"]");
    }

}