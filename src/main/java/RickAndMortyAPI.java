import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RickAndMortyAPI {
    private static final String BASE_URL = "https://rickandmortyapi.com/api/";

    public static Response getCharacter(int characterId) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .get("character/" + characterId);
    }
}
