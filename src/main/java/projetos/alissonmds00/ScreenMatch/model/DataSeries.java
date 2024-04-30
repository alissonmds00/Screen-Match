package projetos.alissonmds00.ScreenMatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSeries(@JsonAlias("Title") String titulo,
                         @JsonAlias("totalSeasons") Integer temporadas,
                         @JsonAlias("imdbRating") String avaliacao) {
}
