package io.vipsamleti.moviecatalogservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "movie-catalog")
public class MovieCatalog {
    @Id
    private String id;
    private String movieName;
    private String movieDirector;
    private String movieGenre;
    private double movieDuration;
    private long movieReleasedOn;
    private Casting movieCasting;
}
