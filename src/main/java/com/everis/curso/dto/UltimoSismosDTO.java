package com.everis.curso.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UltimoSismosDTO {

    private MetadataDTO metadata;
    private List<SismoDTO> ultimos_sismos_chile;

    public MetadataDTO getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataDTO metadata) {
        this.metadata = metadata;
    }

    public List<SismoDTO> getUltimos_sismos_chile() {
        return ultimos_sismos_chile;
    }

    public void setUltimos_sismos_chile(List<SismoDTO> ultimos_sismos_chile) {
        this.ultimos_sismos_chile = ultimos_sismos_chile;
    }
}
