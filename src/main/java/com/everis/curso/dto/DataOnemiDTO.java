package com.everis.curso.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DataOnemiDTO {

    private MetadataDTO metadata;
    private List<OnemiDTO> onemi;

    public MetadataDTO getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataDTO metadata) {
        this.metadata = metadata;
    }

    public List<OnemiDTO> getOnemi() {
        return onemi;
    }

    public void setOnemi(List<OnemiDTO> onemi) {
        this.onemi = onemi;
    }
}
