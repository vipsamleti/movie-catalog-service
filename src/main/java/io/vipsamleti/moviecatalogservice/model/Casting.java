package io.vipsamleti.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Casting {
    private String leadActor;
    private String leadActress;
    private List<String> sideActors;
}
