package br.com.cti.firstproject.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCharacter(@JsonAlias("name") String nome,
                             @JsonAlias("status") String satus,
                             @JsonAlias("gender") String genero,
                             @JsonAlias("Location") String local){
}
